package com.xxxy.oss.config;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.xxxy.oss.adapter.AliStorageAdapter;
import com.xxxy.oss.adapter.MinioStorageAdapter;
import com.xxxy.oss.adapter.StorageAdapter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 文件存储config
 *
 * @author: lxj
 * @date: 2023/10/14
 */
@Configuration
@RefreshScope
public class StorageConfig {

    @Value("${storage.service.type}")
    private String storageType;



    @Bean
    @RefreshScope
    public StorageAdapter storageService() {
        System.out.println(storageType);
        if ("minio".equals(storageType)) {
            return new MinioStorageAdapter();
        } else if ("aliyun".equals(storageType)) {
            return new AliStorageAdapter();
        } else {
            throw new IllegalArgumentException("未找到对应的文件存储处理器");
        }
    }

}
