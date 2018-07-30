package com.zdst.bus.domain;

import java.util.Date;

public class CheckDangerExtend {
    private Long id;

    private Long placeID;

    private Integer dangerType;

    private String dangerPhoto;

    private String reason;

    private String remark;

    private Integer status;

    private Integer isLatest;

    private Integer isNewAddItem;

    private Long createUserID;

    private Date createTime;

    private String customRemark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPlaceID() {
        return placeID;
    }

    public void setPlaceID(Long placeID) {
        this.placeID = placeID;
    }

    public Integer getDangerType() {
        return dangerType;
    }

    public void setDangerType(Integer dangerType) {
        this.dangerType = dangerType;
    }

    public String getDangerPhoto() {
        return dangerPhoto;
    }

    public void setDangerPhoto(String dangerPhoto) {
        this.dangerPhoto = dangerPhoto == null ? null : dangerPhoto.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsLatest() {
        return isLatest;
    }

    public void setIsLatest(Integer isLatest) {
        this.isLatest = isLatest;
    }

    public Integer getIsNewAddItem() {
        return isNewAddItem;
    }

    public void setIsNewAddItem(Integer isNewAddItem) {
        this.isNewAddItem = isNewAddItem;
    }

    public Long getCreateUserID() {
        return createUserID;
    }

    public void setCreateUserID(Long createUserID) {
        this.createUserID = createUserID;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCustomRemark() {
        return customRemark;
    }

    public void setCustomRemark(String customRemark) {
        this.customRemark = customRemark == null ? null : customRemark.trim();
    }
}