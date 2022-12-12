package com.ruoyi.meta.controller;

import com.ruoyi.common.annotation.Anonymous;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.meta.domain.Page;
import com.ruoyi.meta.service.IPageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 页面Controller
 *
 * @author ruoyi
 * @date 2022-12-12
 */
@Api(tags = "页面")
@RestController
@RequestMapping("/meta/page")
public class PageController extends BaseController {
    @Autowired
    private IPageService pageService;

    /**
     * 查询页面列表
     */
    @ApiOperation("查询页面列表")
    @GetMapping("/list")
    @Anonymous
    public TableDataInfo list(Page page) {
        startPage();
        List<Page> list = pageService.selectPageList(page);
        return getDataTable(list);
    }

    /**
     * 导出页面列表
     */
    @Log(title = "页面", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Page page) {
        List<Page> list = pageService.selectPageList(page);
        ExcelUtil<Page> util = new ExcelUtil<Page>(Page.class);
        util.exportExcel(response, list, "页面数据");
    }

    /**
     * 获取页面详细信息
     */
    @ApiOperation("获取页面详细信息")
    @Anonymous
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id) {
        return success(pageService.selectPageById(id));
    }

    /**
     * 新增页面
     */
    @ApiOperation("新增页面")
    @Log(title = "页面", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Page page) {
        return toAjax(pageService.insertPage(page));
    }

    /**
     * 修改页面
     */
    @ApiOperation("修改页面")
    @Log(title = "页面", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Page page) {
        return toAjax(pageService.updatePage(page));
    }

    /**
     * 删除页面
     */
    @ApiOperation("ids删除页面")
    @Log(title = "页面", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids) {
        return toAjax(pageService.deletePageByIds(ids));
    }
}
