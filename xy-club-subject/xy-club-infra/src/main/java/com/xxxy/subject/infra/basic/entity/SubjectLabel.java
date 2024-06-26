package com.xxxy.subject.infra.basic.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * 题目标签表(SubjectLabel)实体类
 *
 * @author lxj
 * @since 2023-10-03 21:50:30
 */
@Data
public class SubjectLabel implements Serializable {
    private static final long serialVersionUID = 687023315859726820L;
    /**
     * 主键
     */
    private Long id;
    /**
     * 标签分类
     */
    private String labelName;
    /**
     * 分类id
     */
    private Long categoryId;
    /**
     * 排序
     */
    private Integer sortNum;
    /**
     * 创建人
     */
    private String createdBy;
    /**
     * 创建时间
     */
    private Date createdTime;
    /**
     * 更新人
     */
    private String updateBy;
    
    private Integer isDeleted;
    /**
     * 更新时间
     */
    private Date updateTime;


}

