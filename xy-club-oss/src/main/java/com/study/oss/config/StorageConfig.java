package com.study.oss.config;

import com.study.oss.adapter.StorageAdapter;
import com.study.oss.adapter.AliStorageAdapter;
import com.study.oss.adapter.MinioStorageAdapter;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class StorageConfig {

    @Value("${storage.service.type}")
    private String storageType;

    @Bean
    @RefreshScope
    public StorageAdapter storageService() {
        if ("minio".equals(storageType)) {
            log.info("使用minio文件存储服务");
            return new MinioStorageAdapter();
        } else if ("aliyun".equals(storageType)) {
            return new AliStorageAdapter();
        } else {
            throw new IllegalArgumentException("未找到对应的文件存储处理器");
        }
    }

}
