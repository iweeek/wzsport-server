/**
 * 
 */
package com.wzsport.service.impl;

import java.io.File;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import com.wzsport.model.RunningActivityData;
import com.wzsport.service.ExportService;
import com.wzsport.util.PathUtil;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;


/**
 * @author wenky
 *
 */
@Service
public class ExportServiceImpl implements ExportService {

	@Override
	public String createExcelByRunningActivityViews(List<RunningActivityData> lists) {
		String excelName = null;
		Format format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		try{
			//生成excel文件
			WritableWorkbook wwb = null;
			excelName = String.valueOf(Calendar.getInstance().getTimeInMillis()) + ".xls";
			String fileName = PathUtil.FILE_STORAGE_PATH + excelName;
			//fileName = "F://" + excelName;
			File file = new File(fileName);
			System.out.println("fileName：" + fileName);
			if (!file.exists()) {
				file.createNewFile();
			} else {
				file.delete();
				file.createNewFile();
			}
			wwb = Workbook.createWorkbook(file);
			WritableSheet ws1 = wwb.createSheet("Sheet 1", 0);
			String[] titleArr = new String[]{
					"姓名","学号","性别", "班级", "运动时间", 
			};
			
			for (int i = 0;i < titleArr.length;i ++) {
				Label lable = new Label(i,0,titleArr[i]);
				ws1.addCell(lable);
			}
			
			List<String> dataRow;
			int number = 0;
			int col = 0;
			int index = 0;
			for (int i = 0; i < lists.size(); i++) {
				col ++;
				number ++;
				dataRow = new ArrayList();
				dataRow.add(lists.get(i).getStudentName());
				dataRow.add(lists.get(i).getStudentNo());
				boolean isMan = lists.get(i).getIsMan() ? dataRow.add("男") : dataRow.add("女");
				dataRow.add(lists.get(i).getClassName());
				dataRow.add(format.format(lists.get(i).getAcquisitionTime()));
				
				for (int j = 0;j < dataRow.size();j ++) {
					if (number/50000 > index) {
						col = 1;
						index ++;
						ws1 = wwb.createSheet("Sheet " + (index+1), index);
						for (int k = 0;k < titleArr.length;k ++) {
							Label lable = new Label(k,0,titleArr[k]);
							ws1.addCell(lable);
						}
					}
					Label label = new Label(j,col,dataRow.get(j));
					ws1.addCell(label);
				}
			}
			//写进文档
			wwb.write();
			//关闭excel工作簿对象
			wwb.close();
			
		} catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		return excelName;
	}


}
