package com.xxxy.subject.domain.service.impl;

import com.xxxy.subject.domain.convert.SubjectCategoryConverter;
import com.xxxy.subject.domain.entity.SubjectCategoryBO;
import com.xxxy.subject.domain.service.SubjectCategoryDomainService;
import com.xxxy.subject.infra.basic.entity.SubjectCategory;
import com.xxxy.subject.infra.basic.service.SubjectCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class SubjectCategoryDomainServiceImpl implements SubjectCategoryDomainService {

    @Resource
    private SubjectCategoryService subjectCategoryService;


    @Override
    public void add(SubjectCategoryBO subjectCategorybo) {
        //转换BO为Category
        SubjectCategory subjectCategory = SubjectCategoryConverter.INSTANCE
                .convertBoToCategory(subjectCategorybo);
        subjectCategoryService.insert(subjectCategory);

    }
}
