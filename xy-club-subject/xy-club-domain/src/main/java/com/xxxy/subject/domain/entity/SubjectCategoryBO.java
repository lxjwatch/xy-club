package com.xxxy.subject.domain.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 题目分类(SubjectCategory)实体类
 *
 * @author lxj
 * @since 2024-06-05 11:17:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubjectCategoryBO implements Serializable {
    /**
     * 主键
     */
    @TableId
    private Long id;
    /**
     * 分类名称
     */
    private String categoryName;
    /**
     * 分类类型
     */
    private Integer categoryType;
    /**
     * 图标连接
     */
    private String imageUrl;
    /**
     * 父级id
     */
    private Long parentId;


}

