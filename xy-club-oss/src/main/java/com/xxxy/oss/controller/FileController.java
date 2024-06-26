package com.xxxy.oss.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.xxxy.oss.service.FileService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 文件操作controller
 * 
 * @author: lxj
 * @date: 2023/10/14
 */
@RestController
public class FileController {

    @Resource
    private FileService fileService;





    @RequestMapping("/testGetAllBuckets")
    public String testGetAllBuckets() throws Exception {
        List<String> allBucket = fileService.getAllBucket();
        return allBucket.get(0);
    }
}
