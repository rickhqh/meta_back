package com.ruoyi.meta.controller;

import com.ruoyi.common.annotation.Anonymous;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.meta.domain.Article;
import com.ruoyi.meta.service.IArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 文章Controller
 *
 * @author rick
 * @date 2022-12-12
 */
@Api(tags = "文章")
@RestController
@RequestMapping("/meta/article")
public class ArticleController extends BaseController {
    @Autowired
    private IArticleService articleService;

    /**
     * 查询文章列表
     */
    @ApiOperation("查询文章列表")
    @Anonymous
    @GetMapping("/list")
    public TableDataInfo list(Article article) {
        startPage();
        List<Article> list = articleService.selectArticleList(article);
        return getDataTable(list);
    }

    /**
     * 导出文章列表
     */

    @Log(title = "文章", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Article article) {
        List<Article> list = articleService.selectArticleList(article);
        ExcelUtil<Article> util = new ExcelUtil<Article>(Article.class);
        util.exportExcel(response, list, "文章数据");
    }

    /**
     * 获取文章详细信息
     */
    @ApiOperation("id获取文章详细信息")
    @Anonymous
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id) {
        System.out.println("id:" + id);
        return success(articleService.selectArticleById(id));
    }

    /**
     * 新增文章
     */
    @ApiOperation("新增文章")
    @Log(title = "文章", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Article article) {

        return toAjax(articleService.insertArticle(article));
    }

    /**
     * 修改文章
     */
    @ApiOperation("修改文章")
    @Log(title = "文章", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Article article) {
        return toAjax(articleService.updateArticle(article));
    }

    /**
     * 删除文章
     */
    @ApiOperation("ids删除文章")
    @Log(title = "文章", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids) {
        return toAjax(articleService.deleteArticleByIds(ids));
    }
}
