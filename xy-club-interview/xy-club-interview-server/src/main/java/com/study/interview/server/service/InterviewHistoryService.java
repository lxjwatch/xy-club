package com.study.interview.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.study.interview.api.common.PageResult;
import com.study.interview.api.req.InterviewHistoryReq;
import com.study.interview.api.req.InterviewSubmitReq;
import com.study.interview.api.vo.InterviewHistoryVO;
import com.study.interview.api.vo.InterviewResultVO;
import com.study.interview.server.entity.po.InterviewHistory;

/**
 * 面试汇总记录表(InterviewHistory)表服务接口
 *
 * @author makejava
 * @since 2024-05-23 22:56:03
 */
public interface InterviewHistoryService extends IService<InterviewHistory> {

    void logInterview(InterviewSubmitReq req, InterviewResultVO submit);


    PageResult<InterviewHistoryVO> getHistory(InterviewHistoryReq req);

}
