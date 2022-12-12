package com.ruoyi.meta.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 日程对象 mt_schedule
 *
 * @author rick
 * @date 2022-12-12
 */
public class Schedule extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 日程id
     */
    private Long id;

    /**
     * 日程内容
     */
    @Excel(name = "日程内容")
    private String scheduleContent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getScheduleContent() {
        return scheduleContent;
    }

    public void setScheduleContent(String scheduleContent) {
        this.scheduleContent = scheduleContent;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("scheduleContent", getScheduleContent())
                .append("createTime", getCreateTime())
                .append("updateTime", getUpdateTime())
                .toString();
    }
}
