package com.ruoyi.meta.service;

import com.ruoyi.meta.domain.Files;

import java.util.List;

/**
 * 文件Service接口
 *
 * @author rick
 * @date 2022-12-12
 */
public interface IFilesService {
    /**
     * 查询文件
     *
     * @param id 文件主键
     * @return 文件
     */
    public Files selectFilesById(Long id);

    /**
     * 查询文件列表
     *
     * @param files 文件
     * @return 文件集合
     */
    public List<Files> selectFilesList(Files files);

    /**
     * 新增文件
     *
     * @param files 文件
     * @return 结果
     */
    public int insertFiles(Files files);

    /**
     * 修改文件
     *
     * @param files 文件
     * @return 结果
     */
    public int updateFiles(Files files);

    /**
     * 批量删除文件
     *
     * @param ids 需要删除的文件主键集合
     * @return 结果
     */
    public int deleteFilesByIds(Long[] ids);

    /**
     * 删除文件信息
     *
     * @param id 文件主键
     * @return 结果
     */
    public int deleteFilesById(Long id);
}
