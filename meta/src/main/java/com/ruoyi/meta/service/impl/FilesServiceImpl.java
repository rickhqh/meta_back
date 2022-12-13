package com.ruoyi.meta.service.impl;

import com.ruoyi.meta.domain.Files;
import com.ruoyi.meta.mapper.FilesMapper;
import com.ruoyi.meta.service.IFilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 文件Service业务层处理
 *
 * @author rick
 * @date 2022-12-12
 */
@Service
public class FilesServiceImpl implements IFilesService {
    @Autowired
    private FilesMapper filesMapper;

    /**
     * 查询文件
     *
     * @param id 文件主键
     * @return 文件
     */
    @Override
    public Files selectFilesById(Long id) {
        return filesMapper.selectFilesById(id);
    }

    /**
     * 查询文件列表
     *
     * @param files 文件
     * @return 文件
     */
    @Override
    public List<Files> selectFilesList(Files files) {
        return filesMapper.selectFilesList(files);
    }

    /**
     * 新增文件
     *
     * @param files 文件
     * @return 结果
     */
    @Override
    public int insertFiles(Files files) {
        return filesMapper.insertFiles(files);
    }

    /**
     * 修改文件
     *
     * @param files 文件
     * @return 结果
     */
    @Override
    public int updateFiles(Files files) {
        return filesMapper.updateFiles(files);
    }

    /**
     * 批量删除文件
     *
     * @param ids 需要删除的文件主键
     * @return 结果
     */
    @Override
    public int deleteFilesByIds(Long[] ids) {
        return filesMapper.deleteFilesByIds(ids);
    }

    /**
     * 删除文件信息
     *
     * @param id 文件主键
     * @return 结果
     */
    @Override
    public int deleteFilesById(Long id) {
        return filesMapper.deleteFilesById(id);
    }
}
