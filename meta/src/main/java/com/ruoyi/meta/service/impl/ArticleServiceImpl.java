package com.ruoyi.meta.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.meta.domain.Article;
import com.ruoyi.meta.mapper.ArticleMapper;
import com.ruoyi.meta.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 文章Service业务层处理
 *
 * @author rick
 * @date 2022-12-12
 */
@Service
public class ArticleServiceImpl implements IArticleService {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private ArticleMapper articleMapper;

    /**
     * 查询文章
     *
     * @param id 文章主键
     * @return 文章
     */
    @Override
    public Article selectArticleById(Long id) {
        return articleMapper.selectArticleById(id);
    }

    /**
     * 查询文章列表
     *
     * @param article 文章
     * @return 文章
     */
    @Override
    public List<Article> selectArticleList(Article article) {
        return articleMapper.selectArticleList(article);
    }

    /**
     * 新增文章
     *
     * @param article 文章
     * @return 结果
     */
    @Override
    public int insertArticle(Article article) {
        article.setCreateTime(DateUtils.getNowDate());
        article.setUserId(SecurityUtils.getUserId());
        article.setUserName(SecurityUtils.getUsername());
        return articleMapper.insertArticle(article);
    }

    /**
     * 修改文章
     *
     * @param article 文章
     * @return 结果
     */
    @Override
    public int updateArticle(Article article) {
        article.setUpdateTime(DateUtils.getNowDate());
        article.setUserId(SecurityUtils.getUserId());
        article.setUserName(SecurityUtils.getUsername());
        return articleMapper.updateArticle(article);
    }

    /**
     * 批量删除文章
     *
     * @param ids 需要删除的文章主键
     * @return 结果
     */
    @Override
    public int deleteArticleByIds(Long[] ids) {
        return articleMapper.deleteArticleByIds(ids);
    }

    /**
     * 删除文章信息
     *
     * @param id 文章主键
     * @return 结果
     */
    @Override
    public int deleteArticleById(Long id) {

        return articleMapper.deleteArticleById(id);
    }
}
