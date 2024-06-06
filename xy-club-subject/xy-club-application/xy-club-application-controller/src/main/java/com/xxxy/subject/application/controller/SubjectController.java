package com.xxxy.subject.application.controller;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Preconditions;
import com.xxxy.subject.application.convert.SubjectCategoryDTOConverter;
import com.xxxy.subject.application.dto.SubjectCategoryDTO;
import com.xxxy.subject.common.entity.Result;
import com.xxxy.subject.domain.entity.SubjectCategoryBO;
import com.xxxy.subject.domain.service.SubjectCategoryDomainService;
import com.xxxy.subject.infra.basic.service.SubjectCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 刷题controller
 * @author lxj
 * @date 2023/10/1
 */
@RestController
@RequestMapping("/subject/category")
@Slf4j
public class SubjectController {
    @Resource
    private SubjectCategoryService subjectCategoryService;

    @Resource
    private SubjectCategoryDomainService subjectCategoryDomainService;
    @PostMapping ("/add")
    public Result<Boolean> test(@RequestBody SubjectCategoryDTO subjectCategoryDTO){
        try {
            if (log.isInfoEnabled()) {
                log.info("SubjectCategoryController.add.dto:{}", JSON.toJSONString(subjectCategoryDTO));
            }
            Preconditions.checkNotNull(subjectCategoryDTO.getCategoryType(), "分类类型不能为空");
            Preconditions.checkArgument(!StringUtils.isBlank(subjectCategoryDTO.getCategoryName()), "分类名称不能为空");
            Preconditions.checkNotNull(subjectCategoryDTO.getParentId(), "分类父级id不能为空");
            SubjectCategoryBO subjectCategoryBO = SubjectCategoryDTOConverter.INSTANCE.convertDtoToCategoryBO(subjectCategoryDTO);
            subjectCategoryDomainService.add(subjectCategoryBO);
            return Result.ok(true);
        } catch (Exception e) {
            log.error("SubjectCategoryController.add.error:{}", e.getMessage(), e);
            return Result.fail("新增分类失败");
        }


    }
}
