package com.ruoyi.meta.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;

/**
 * 日程对象 mt_schedule
 *
 * @author rick
 * @date 2022-12-12
 */
@Data
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
    private String scheduleTime;

}
