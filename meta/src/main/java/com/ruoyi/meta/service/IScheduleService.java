package com.ruoyi.meta.service;

import com.ruoyi.meta.domain.Schedule;

import java.util.List;

/**
 * 日程Service接口
 *
 * @author rick
 * @date 2022-12-12
 */
public interface IScheduleService {
    /**
     * 查询日程
     *
     * @param id 日程主键
     * @return 日程
     */
    public Schedule selectScheduleById(Long id);

    /**
     * 查询日程列表
     *
     * @param schedule 日程
     * @return 日程集合
     */
    public List<Schedule> selectScheduleList(Schedule schedule);

    /**
     * 新增日程
     *
     * @param schedule 日程
     * @return 结果
     */
    public int insertSchedule(Schedule schedule);

    /**
     * 修改日程
     *
     * @param schedule 日程
     * @return 结果
     */
    public int updateSchedule(Schedule schedule);

    /**
     * 批量删除日程
     *
     * @param ids 需要删除的日程主键集合
     * @return 结果
     */
    public int deleteScheduleByIds(Long[] ids);

    /**
     * 删除日程信息
     *
     * @param id 日程主键
     * @return 结果
     */
    public int deleteScheduleById(Long id);
}
