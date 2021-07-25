package com.roncoo.jui.web.bean.vo;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 网址汇总地址
 * </p>
 *
 * @author wujing
 * @since 2017-11-22
 */
@Data
@Accessors(chain = true)
public class WebSiteUrlVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 创建时间
     */
    private Date gmtCreate;

    public Date getGmtCreate() {
        return this.gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * 修改时间
     */
    private Date gmtModified;

    public Date getGmtModified() {
        return this.gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * 状态
     */
    private String statusId;

    public String getStatusId() {
        return this.statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    /**
     * 排序
     */
    private Integer sort;

    public Integer getSort() {
        return this.sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    private Long siteId;

    public Long getSiteId() {
        return this.siteId;
    }

    public void setSiteId(Long siteId) {
        this.siteId = siteId;
    }

    /**
     * 标题
     */
    private String urlName;

    public String getUrlName() {
        return this.urlName;
    }

    public void setUrlName(String urlName) {
        this.urlName = urlName;
    }

    /**
     * 描述
     */
    private String urlDesc;

    public String getUrlDesc() {
        return this.urlDesc;
    }

    public void setUrlDesc(String urlDesc) {
        this.urlDesc = urlDesc;
    }

    /**
     * 内网
     */
    private String inNet;

    public String getInNet() {
        return this.inNet;
    }

    public void setInNet(String inNet) {
        this.inNet = inNet;
    }

    /**
     * 外网
     */
    private String outNet;

    public String getOutNet() {
        return this.outNet;
    }

    public void setOutNet(String outNet) {
        this.outNet = outNet;
    }



}
