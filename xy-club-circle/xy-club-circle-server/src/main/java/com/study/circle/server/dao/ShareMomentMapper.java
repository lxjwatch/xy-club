package com.study.circle.server.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.study.circle.server.entity.po.ShareMoment;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 动态信息 Mapper 接口
 * </p>
 *
 * @author lxj
 * @since 2024/05/16
 */
public interface ShareMomentMapper extends BaseMapper<ShareMoment> {

    void incrReplyCount(@Param("id") Long id, @Param("count") int count);

}
