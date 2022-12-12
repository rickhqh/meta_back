package com.ruoyi.meta.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 页面对象 mt_page
 *
 * @author ruoyi
 * @date 2022-12-12
 */
public class Page extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 页面id
     */
    private Long id;

    /**
     * 页面名
     */
    @Excel(name = "页面名")
    private String pageName;

    /**
     * 文章id
     */
    @Excel(name = " 文章id")
    private Long articleId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("pageName", getPageName())
                .append("createTime", getCreateTime())
                .append("updateTime", getUpdateTime())
                .append("articleId", getArticleId())
                .toString();
    }
}
