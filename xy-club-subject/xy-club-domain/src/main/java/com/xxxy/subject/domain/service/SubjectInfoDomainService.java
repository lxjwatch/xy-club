package com.xxxy.subject.domain.service;

import com.xxxy.subject.common.entity.PageResult;
import com.xxxy.subject.domain.entity.SubjectInfoBO;

/**
 * 题目领域服务
 * 
 * @author: lxj
 * @date: 2023/10/3
 */
public interface SubjectInfoDomainService {

    /**
     * 新增题目
     */
    void add(SubjectInfoBO subjectInfoBO);

    /**
     * 分页查询
     */
    PageResult<SubjectInfoBO> getSubjectPage(SubjectInfoBO subjectInfoBO);

    /**
     * 查询题目信息
     */
    SubjectInfoBO querySubjectInfo(SubjectInfoBO subjectInfoBO);

}

