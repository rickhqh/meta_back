package com.ruoyi.meta.controller;

import com.ruoyi.common.annotation.Anonymous;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.meta.domain.Schedule;
import com.ruoyi.meta.service.IScheduleService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 日程Controller
 *
 * @author rick
 * @date 2022-12-12
 */
@ApiOperation("日程")
@RestController
@RequestMapping("/meta/schedule/")
public class ScheduleController extends BaseController {
    @Autowired
    private IScheduleService scheduleService;

    /**
     * 查询日程列表
     */
    @ApiOperation("查询日程列表")
    @GetMapping("/list")
    @Anonymous
    public TableDataInfo list(Schedule schedule) {
        startPage();
        List<Schedule> list = scheduleService.selectScheduleList(schedule);
        return getDataTable(list);
    }

    /**
     * 导出日程列表
     */

    @Log(title = "日程", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Schedule schedule) {
        List<Schedule> list = scheduleService.selectScheduleList(schedule);
        ExcelUtil<Schedule> util = new ExcelUtil<Schedule>(Schedule.class);
        util.exportExcel(response, list, "日程数据");
    }

    /**
     * 获取日程详细信息
     */
    @ApiOperation("获取日程详细信息")
    @GetMapping(value = "/{id}")
    @Anonymous
    public AjaxResult getInfo(@PathVariable("id") Long id) {
        return success(scheduleService.selectScheduleById(id));
    }

    /**
     * 新增日程
     */
    @ApiOperation("新增日程")
    @Log(title = "日程", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Schedule schedule) {
        return toAjax(scheduleService.insertSchedule(schedule));
    }

    /**
     * 修改日程
     */
    @ApiOperation("修改日程")
    @Log(title = "日程", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Schedule schedule) {
        return toAjax(scheduleService.updateSchedule(schedule));
    }

    /**
     * 删除日程
     */
    @ApiOperation("ids删除日程")
    @Log(title = "日程", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids) {
        return toAjax(scheduleService.deleteScheduleByIds(ids));
    }
}
