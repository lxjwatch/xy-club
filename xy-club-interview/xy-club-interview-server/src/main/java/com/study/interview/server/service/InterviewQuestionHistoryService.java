package com.study.interview.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.study.interview.api.vo.InterviewQuestionHistoryVO;
import com.study.interview.server.entity.po.InterviewQuestionHistory;

import java.util.List;

/**
 * 面试题目记录表(InterviewQuestionHistory)表服务接口
 *
 * @author makejava
 * @since 2024-05-23 22:56:31
 */
public interface InterviewQuestionHistoryService extends IService<InterviewQuestionHistory> {

    List<InterviewQuestionHistoryVO> detail(Long id);

}
