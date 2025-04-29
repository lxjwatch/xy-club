package com.study.subject.infra.basic.service;

import com.study.subject.common.entity.PageResult;
import com.study.subject.infra.basic.entity.SubjectInfoEs;

public interface SubjectEsService {

    boolean insert(SubjectInfoEs subjectInfoEs);

    PageResult<SubjectInfoEs> querySubjectList(SubjectInfoEs subjectInfoEs);

}
