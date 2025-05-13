package com.study.circle.server.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.study.circle.api.req.RemoveShareCircleReq;
import com.study.circle.api.req.SaveShareCircleReq;
import com.study.circle.api.req.UpdateShareCircleReq;
import com.study.circle.api.vo.ShareCircleVO;
import com.study.circle.server.entity.po.ShareCircle;

import java.util.List;

/**
 * <p>
 * 圈子信息 服务类
 * </p>
 *
 * @author lxj
 * @since 2024/05/16
 */
public interface ShareCircleService extends IService<ShareCircle> {

    List<ShareCircleVO> listResult();

    Boolean saveCircle(SaveShareCircleReq req);

    Boolean updateCircle(UpdateShareCircleReq req);

    Boolean removeCircle(RemoveShareCircleReq req);
}
