package com.study.interview.server.service;

import com.study.interview.api.enums.EngineEnum;
import com.study.interview.api.req.InterviewSubmitReq;
import com.study.interview.api.req.StartReq;
import com.study.interview.api.vo.InterviewQuestionVO;
import com.study.interview.api.vo.InterviewResultVO;
import com.study.interview.api.vo.InterviewVO;

import java.util.List;

/**
 * <p>
 * 面试引擎
 * </p>
 *
 * @author lxj
 * @since 2024/05/16
 */
public interface InterviewEngine {

    /**
     * 引擎类型
     */
    EngineEnum engineType();

    /**
     * 通过简历关键字获取面试关键字
     */
    InterviewVO analyse(List<String> KeyWords);

    /**
     * 通过面试关键字获取面试题
     */
    InterviewQuestionVO start(StartReq req);

    /**
     * 提交面试题
     */
    InterviewResultVO submit(InterviewSubmitReq req);

}
