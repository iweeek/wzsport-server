package com.wzsport.service;

/**
 * Created by kouga on 2017/8/17.
 */
public interface CloudStorageService {

    void uploadImage(String localFilePath, String key);

    String generageUrl(String fileName);

    void setBucket(String bucket);
}
