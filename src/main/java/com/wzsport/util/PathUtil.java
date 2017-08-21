package com.wzsport.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by kouga on 2017/8/19.
 */
public class PathUtil {


    /**
     * 获取到classes目录
     *
     * @return path
     */
    public static String getClassPath() {
        String systemName = System.getProperty("os.name");

        //判断当前环境，如果是Windows 要截取路径的第一个 '/'
        if (!StringUtils.isBlank(systemName) && systemName.indexOf("Windows") != -1) {
            return PathUtil.class.getResource("/").getFile().toString().substring(1);
        } else {
            return PathUtil.class.getResource("/").getFile().toString();
        }
    }

    /**
     * 获取到项目的路径
     *
     * @return path
     */
    public static String getProjectPath() {
        return System.getProperty("user.dir");
    }

    /**
     * 获取 root目录
     *
     * @return path
     */
    public static String getRootPath() {
        return getWEB_INF().replace("WEB-INF/", "");
    }

    /**
     * 获取 web-inf目录
     *
     * @return path
     */
    public static String getWEB_INF() {
        return getClassPath().replace("classes/", "");
    }

    /**
     * 文本换行，因为Linux  和 Windows 的换行符不一样
     *
     * @return
     */
    public static String nextLine() {
        String nextLine = System.getProperty("line.separator");
        return nextLine;
    }

    /**
     * 获取images 路径
     *
     * @return
     */
    public static String getImages() {
        return getRootPath() + "images/";
    }


}
