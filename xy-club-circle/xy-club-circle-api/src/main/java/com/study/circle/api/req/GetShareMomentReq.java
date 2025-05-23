package com.study.circle.api.req;

import com.study.circle.api.common.PageInfo;
import lombok.Data;

import java.io.Serializable;

@Data
public class GetShareMomentReq implements Serializable {

    /**
     * 圈子ID
     */
    private Long circleId;

    /**
     * 分页信息
     */
    private PageInfo pageInfo;

}