package com.xxxy.subject.domain.convert;

import com.xxxy.subject.domain.entity.SubjectAnswerBO;
import com.xxxy.subject.infra.basic.entity.SubjectRadio;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-10T09:12:19+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_362 (Amazon.com Inc.)"
)
public class RadioSubjectConverterImpl implements RadioSubjectConverter {

    @Override
    public SubjectRadio convertBoToEntity(SubjectAnswerBO subjectAnswerBO) {
        if ( subjectAnswerBO == null ) {
            return null;
        }

        SubjectRadio subjectRadio = new SubjectRadio();

        subjectRadio.setOptionType( subjectAnswerBO.getOptionType() );
        subjectRadio.setOptionContent( subjectAnswerBO.getOptionContent() );
        subjectRadio.setIsCorrect( subjectAnswerBO.getIsCorrect() );

        return subjectRadio;
    }

    @Override
    public List<SubjectAnswerBO> convertEntityToBoList(List<SubjectRadio> subjectRadioList) {
        if ( subjectRadioList == null ) {
            return null;
        }

        List<SubjectAnswerBO> list = new ArrayList<SubjectAnswerBO>( subjectRadioList.size() );
        for ( SubjectRadio subjectRadio : subjectRadioList ) {
            list.add( subjectRadioToSubjectAnswerBO( subjectRadio ) );
        }

        return list;
    }

    protected SubjectAnswerBO subjectRadioToSubjectAnswerBO(SubjectRadio subjectRadio) {
        if ( subjectRadio == null ) {
            return null;
        }

        SubjectAnswerBO subjectAnswerBO = new SubjectAnswerBO();

        subjectAnswerBO.setOptionType( subjectRadio.getOptionType() );
        subjectAnswerBO.setOptionContent( subjectRadio.getOptionContent() );
        subjectAnswerBO.setIsCorrect( subjectRadio.getIsCorrect() );

        return subjectAnswerBO;
    }
}
