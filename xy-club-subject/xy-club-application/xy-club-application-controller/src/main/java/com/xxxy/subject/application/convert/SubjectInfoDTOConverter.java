package com.xxxy.subject.application.convert;

import com.xxxy.subject.application.dto.SubjectInfoDTO;
import com.xxxy.subject.domain.entity.SubjectInfoBO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SubjectInfoDTOConverter {

    SubjectInfoDTOConverter INSTANCE = Mappers.getMapper(SubjectInfoDTOConverter.class);

    SubjectInfoBO convertDTOToBO(SubjectInfoDTO subjectInfoDTO);

    SubjectInfoDTO convertBOToDTO(SubjectInfoBO subjectInfoBO);

}
