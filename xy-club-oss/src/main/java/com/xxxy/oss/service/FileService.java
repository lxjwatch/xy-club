package com.xxxy.oss.service;

import com.xxxy.oss.adapter.StorageAdapter;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 文件存储service
 *
 * @author: lxj
 * @date: 2023/10/14
 */
@Service
public class FileService {

    private final StorageAdapter storageAdapter;

    public FileService(StorageAdapter storageAdapter) {
        this.storageAdapter = storageAdapter;
    }

    /**
     * 列出所有桶
     */
    public List<String> getAllBucket() {
        return storageAdapter.getAllBucket();
    }

}

