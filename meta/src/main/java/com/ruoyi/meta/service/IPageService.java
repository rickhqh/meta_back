package com.ruoyi.meta.service;

import com.ruoyi.meta.domain.Page;

import java.util.List;

/**
 * 页面Service接口
 *
 * @author ruoyi
 * @date 2022-12-12
 */
public interface IPageService {
    /**
     * 查询页面
     *
     * @param id 页面主键
     * @return 页面
     */
    public Page selectPageById(Long id);

    /**
     * 查询页面列表
     *
     * @param page 页面
     * @return 页面集合
     */
    public List<Page> selectPageList(Page page);

    /**
     * 新增页面
     *
     * @param page 页面
     * @return 结果
     */
    public int insertPage(Page page);

    /**
     * 修改页面
     *
     * @param page 页面
     * @return 结果
     */
    public int updatePage(Page page);

    /**
     * 批量删除页面
     *
     * @param ids 需要删除的页面主键集合
     * @return 结果
     */
    public int deletePageByIds(Long[] ids);

    /**
     * 删除页面信息
     *
     * @param id 页面主键
     * @return 结果
     */
    public int deletePageById(Long id);
}
