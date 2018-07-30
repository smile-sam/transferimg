package com.zdst.bus.domain;

import java.util.Date;

public class CheckRecordByForm {
    private Long id;

    private Long placeID;

    private Integer placeStatus;

    private Long checkUserID;

    private Integer checkType;

    private Date checkTime;

    private Date recheckTime;

    private String signPhoto;

    private Integer dangerNum;

    private Integer dangerType;

    private Integer status;

    private Integer report;

    private Integer isLatest;

    private Long creatUserID;

    private Date createTime;

    private Long recheckID;

    private String scenePhoto;

    private Date localSaveDate;

    private Integer isLeaderCheck;

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

    public Integer getPlaceStatus() {
        return placeStatus;
    }

    public void setPlaceStatus(Integer placeStatus) {
        this.placeStatus = placeStatus;
    }

    public Long getCheckUserID() {
        return checkUserID;
    }

    public void setCheckUserID(Long checkUserID) {
        this.checkUserID = checkUserID;
    }

    public Integer getCheckType() {
        return checkType;
    }

    public void setCheckType(Integer checkType) {
        this.checkType = checkType;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public Date getRecheckTime() {
        return recheckTime;
    }

    public void setRecheckTime(Date recheckTime) {
        this.recheckTime = recheckTime;
    }

    public String getSignPhoto() {
        return signPhoto;
    }

    public void setSignPhoto(String signPhoto) {
        this.signPhoto = signPhoto == null ? null : signPhoto.trim();
    }

    public Integer getDangerNum() {
        return dangerNum;
    }

    public void setDangerNum(Integer dangerNum) {
        this.dangerNum = dangerNum;
    }

    public Integer getDangerType() {
        return dangerType;
    }

    public void setDangerType(Integer dangerType) {
        this.dangerType = dangerType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getReport() {
        return report;
    }

    public void setReport(Integer report) {
        this.report = report;
    }

    public Integer getIsLatest() {
        return isLatest;
    }

    public void setIsLatest(Integer isLatest) {
        this.isLatest = isLatest;
    }

    public Long getCreatUserID() {
        return creatUserID;
    }

    public void setCreatUserID(Long creatUserID) {
        this.creatUserID = creatUserID;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getRecheckID() {
        return recheckID;
    }

    public void setRecheckID(Long recheckID) {
        this.recheckID = recheckID;
    }

    public String getScenePhoto() {
        return scenePhoto;
    }

    public void setScenePhoto(String scenePhoto) {
        this.scenePhoto = scenePhoto == null ? null : scenePhoto.trim();
    }

    public Date getLocalSaveDate() {
        return localSaveDate;
    }

    public void setLocalSaveDate(Date localSaveDate) {
        this.localSaveDate = localSaveDate;
    }

    public Integer getIsLeaderCheck() {
        return isLeaderCheck;
    }

    public void setIsLeaderCheck(Integer isLeaderCheck) {
        this.isLeaderCheck = isLeaderCheck;
    }
}