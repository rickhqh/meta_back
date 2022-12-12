package com.ruoyi.meta.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.meta.domain.Schedule;
import com.ruoyi.meta.mapper.ScheduleMapper;
import com.ruoyi.meta.service.IScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 日程Service业务层处理
 *
 * @author rick
 * @date 2022-12-12
 */
@Service
public class ScheduleServiceImpl implements IScheduleService {
    @Autowired
    private ScheduleMapper scheduleMapper;

    /**
     * 查询日程
     *
     * @param id 日程主键
     * @return 日程
     */
    @Override
    public Schedule selectScheduleById(Long id) {
        return scheduleMapper.selectScheduleById(id);
    }

    /**
     * 查询日程列表
     *
     * @param schedule 日程
     * @return 日程
     */
    @Override
    public List<Schedule> selectScheduleList(Schedule schedule) {
        return scheduleMapper.selectScheduleList(schedule);
    }

    /**
     * 新增日程
     *
     * @param schedule 日程
     * @return 结果
     */
    @Override
    public int insertSchedule(Schedule schedule) {
        schedule.setCreateTime(DateUtils.getNowDate());
        return scheduleMapper.insertSchedule(schedule);
    }

    /**
     * 修改日程
     *
     * @param schedule 日程
     * @return 结果
     */
    @Override
    public int updateSchedule(Schedule schedule) {
        schedule.setUpdateTime(DateUtils.getNowDate());
        return scheduleMapper.updateSchedule(schedule);
    }

    /**
     * 批量删除日程
     *
     * @param ids 需要删除的日程主键
     * @return 结果
     */
    @Override
    public int deleteScheduleByIds(Long[] ids) {
        return scheduleMapper.deleteScheduleByIds(ids);
    }

    /**
     * 删除日程信息
     *
     * @param id 日程主键
     * @return 结果
     */
    @Override
    public int deleteScheduleById(Long id) {
        return scheduleMapper.deleteScheduleById(id);
    }
}
