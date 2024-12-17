package com.study.auth.domain.convert;

import com.study.auth.domain.entity.AuthUserBO;
import com.study.auth.infra.basic.entity.AuthUser;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 用户bo转换器
 *
 * @author: ChickenWing
 * @date: 2023/10/8
 */
@Mapper
public interface AuthUserBOConverter {

    AuthUserBOConverter INSTANCE = Mappers.getMapper(AuthUserBOConverter.class);

    AuthUser convertBOToEntity(AuthUserBO authUserBO);

    AuthUserBO convertEntityToBO(AuthUser authUser);

    List<AuthUserBO> convertEntityToBO(List<AuthUser> authUserList);

}
