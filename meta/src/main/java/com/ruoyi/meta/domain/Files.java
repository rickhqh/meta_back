package com.ruoyi.meta.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 文件对象 mt_file
 *
 * @author rick
 * @date 2022-12-12
 */
public class Files extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;

    /**
     * 文件名称
     */
    @Excel(name = "文件名称")
    private String name;

    /**
     * 文件类型
     */
    @Excel(name = "文件类型")
    private String type;

    /**
     * 文件大小(kb)
     */
    @Excel(name = "文件大小(kb)")
    private Long size;

    /**
     * 下载链接
     */
    @Excel(name = "下载链接")
    private String url;

    /**
     * 文件md5
     */
    @Excel(name = "文件md5")
    private String md5;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("name", getName())
                .append("type", getType())
                .append("size", getSize())
                .append("url", getUrl())
                .append("md5", getMd5())
                .toString();
    }
}
