package com.roncoo.jui.web.bean.vo;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 后台用户信息
 * </p>
 *
 * @author wujing
 * @since 2017-10-21
 */
@Data
@Accessors(chain = true)
public class SysUserVO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
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
     * 用户状态
     */
    private String userStatus;

    public String getUserStatus() {
        return this.userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * 手机
     */
    private String userPhone;

    public String getUserPhone() {
        return this.userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    /**
     * 邮箱
     */
    private String userEmail;

    public String getUserEmail() {
        return this.userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * 用户姓名
     */
    private String userName;

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 性别
     */
    private String userSex;

    public String getUserSex() {
        return this.userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    /**
     * 真实姓名
     */
    private String userRealname;

    public String getUserRealname() {
        return this.userRealname;
    }

    public void setUserRealname(String userRealname) {
        this.userRealname = userRealname;
    }

    /**
     * 昵称
     */
    private String userNickname;

    public String getUserNickname() {
        return this.userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    /**
     * 密码盐
     */
    private String salt;

    public String getSalt() {
        return this.salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * 用户密码
     */
    private String pwd;

    public String getPwd() {
        return this.pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * 组织全路径ID
     */
    private String orgMergerId;

    public String getOrgMergerId() {
        return this.orgMergerId;
    }

    public void setOrgMergerId(String orgMergerId) {
        this.orgMergerId = orgMergerId;
    }

    /**
     * 组织全路径名称
     */
    private String orgMergerName;

    public String getOrgMergerName() {
        return this.orgMergerName;
    }

    public void setOrgMergerName(String orgMergerName) {
        this.orgMergerName = orgMergerName;
    }

    /**
     * 头像
     */
    private String headImage;

    public String getHeadImage() {
        return this.headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    /**
     * 备注
     */
    private String remark;

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }



}
