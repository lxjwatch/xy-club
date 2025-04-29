package com.study.interview.server.service;

import com.study.interview.api.req.InterviewReq;
import com.study.interview.api.req.InterviewSubmitReq;
import com.study.interview.api.req.StartReq;
import com.study.interview.api.vo.InterviewQuestionVO;
import com.study.interview.api.vo.InterviewResultVO;
import com.study.interview.api.vo.InterviewVO;

public interface InterviewService {

    InterviewVO analyse(InterviewReq req);

    InterviewQuestionVO start(StartReq req);

    InterviewResultVO submit(InterviewSubmitReq req);
}
