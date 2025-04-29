package com.study.circle.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.study.circle.api.common.PageResult;
import com.study.circle.api.req.GetShareMomentReq;
import com.study.circle.api.req.RemoveShareMomentReq;
import com.study.circle.api.req.SaveMomentCircleReq;
import com.study.circle.api.vo.ShareMomentVO;
import com.study.circle.server.entity.po.ShareMoment;

/**
 * <p>
 * 动态信息 服务类
 * </p>
 *
 * @author ChickenWing
 * @since 2024/05/16
 */
public interface ShareMomentService extends IService<ShareMoment> {

    Boolean saveMoment(SaveMomentCircleReq req);

    PageResult<ShareMomentVO> getMoments(GetShareMomentReq req);

    Boolean removeMoment(RemoveShareMomentReq req);

    void incrReplyCount(Long id, int count);

}
