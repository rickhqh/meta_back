package com.ruoyi.meta.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;

/**
 * 文章对象 mt_article
 *
 * @author rick
 * @date 2022-12-12
 */
@Data
public class Article extends BaseEntity {
    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 作者
     */
    @Excel(name = "作者id")
    private Long userId;
    /**
     * 作者
     */
    @Excel(name = "作者")
    private String userName;

    /**
     * 标题
     */
    @Excel(name = "标题")
    private String articleTitle;

    /**
     * 内容
     */
    @Excel(name = "内容")
    private String articleContent;
    /**
     * 状态
     */
    @Excel(name = "状态")
    private String status;
}
