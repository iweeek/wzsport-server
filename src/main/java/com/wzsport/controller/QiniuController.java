package com.wzsport.controller;

import com.wzsport.model.AreaActivityData;
import com.wzsport.service.impl.QiniuService;
import com.wzsport.util.ResponseBody;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Created by kouga on 2017/8/18.
 */

@Api(tags = "对接七牛的SDK")
@RestController
@RequestMapping(value = "qiniu", produces = "application/json;charset=UTF-8")
public class QiniuController {

    private static final Logger logger = LoggerFactory.getLogger(QiniuController.class);

    private QiniuService qiniuService = new QiniuService(System.getProperty("qiniu.accessKey"), System.getProperty("qiniu.secretKey"));

    /**
     * The res body.
     */
    @SuppressWarnings("rawtypes")
    private ResponseBody resBody;

    private int status;

    @ApiOperation(value = "七牛上传文件", notes = "七牛上传文件")
    @RequestMapping(value = "/upload", method = RequestMethod.PUT)
    public ResponseEntity<?> upload(@ApiParam("图片") @RequestParam MultipartFile multipartFile) throws IOException {
        String fileName = multipartFile.getOriginalFilename();
        File file = new File("/Users/kouga/Development/java/chaige/wzsport-server/src/main/webapp/WEB-INF/image/" + fileName);

        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdir();
        }

        if (!file.exists()) {
            file.createNewFile();
        }

        multipartFile.transferTo(file);

        resBody = new ResponseBody<AreaActivityData>();
        status = 200;

        return ResponseEntity.status(status).body(resBody);

    }
}
