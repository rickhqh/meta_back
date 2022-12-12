package com.ruoyi.meta.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.meta.domain.Page;
import com.ruoyi.meta.mapper.PageMapper;
import com.ruoyi.meta.service.IPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 页面Service业务层处理
 *
 * @author ruoyi
 * @date 2022-12-12
 */
@Service
public class PageServiceImpl implements IPageService {
    @Autowired
    private PageMapper pageMapper;

    /**
     * 查询页面
     *
     * @param id 页面主键
     * @return 页面
     */
    @Override
    public Page selectPageById(Long id) {
        return pageMapper.selectPageById(id);
    }

    /**
     * 查询页面列表
     *
     * @param page 页面
     * @return 页面
     */
    @Override
    public List<Page> selectPageList(Page page) {
        return pageMapper.selectPageList(page);
    }

    /**
     * 新增页面
     *
     * @param page 页面
     * @return 结果
     */
    @Override
    public int insertPage(Page page) {
        page.setCreateTime(DateUtils.getNowDate());
        return pageMapper.insertPage(page);
    }

    /**
     * 修改页面
     *
     * @param page 页面
     * @return 结果
     */
    @Override
    public int updatePage(Page page) {
        page.setUpdateTime(DateUtils.getNowDate());
        return pageMapper.updatePage(page);
    }

    /**
     * 批量删除页面
     *
     * @param ids 需要删除的页面主键
     * @return 结果
     */
    @Override
    public int deletePageByIds(Long[] ids) {
        return pageMapper.deletePageByIds(ids);
    }

    /**
     * 删除页面信息
     *
     * @param id 页面主键
     * @return 结果
     */
    @Override
    public int deletePageById(Long id) {
        return pageMapper.deletePageById(id);
    }
}
