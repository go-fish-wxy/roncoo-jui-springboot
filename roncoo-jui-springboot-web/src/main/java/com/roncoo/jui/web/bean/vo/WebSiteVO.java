package com.roncoo.jui.web.bean.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 网址汇总
 * </p>
 *
 * @author wujing
 * @since 2017-11-22
 */
@Data
@Accessors(chain = true)
public class WebSiteVO implements Serializable {

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

	/**
	 * 标题
	 */
	private String title;

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * LOGO
	 */
	private String siteLogo;

	public String getSiteLogo() {
		return this.siteLogo;
	}

	public void setSiteLogo(String siteLogo) {
		this.siteLogo = siteLogo;
	}

	/**
	 * 名字
	 */
	private String siteName;

	public String getSiteName() {
		return this.siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	/**
	 * 描述
	 */
	private String siteDesc;

	public String getSiteDesc() {
		return this.siteDesc;
	}

	public void setSiteDesc(String siteDesc) {
		this.siteDesc = siteDesc;
	}

	/**
	 * URL
	 */
	private String siteUrl;

	public String getSiteUrl() {
		return this.siteUrl;
	}

	public void setSiteUrl(String siteUrl) {
		this.siteUrl = siteUrl;
	}

	private List<WebSiteUrlVO> list;

	public List<WebSiteUrlVO> getList() {
		return this.list;
	}

	public void setList(List<WebSiteUrlVO> list) {
		this.list = list;
	}

}
