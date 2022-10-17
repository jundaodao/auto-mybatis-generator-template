package com.zhihu.ares.domain.dao;

import java.util.Date;

public class BacktraceJobDao {
    private Long id;

    private String reason;

    private String pauseStartTime;

    private String pauseEndTime;

    private String backtraceStartTime;

    private String backtraceEndTime	;

    private String creator;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getPauseStartTime() {
        return pauseStartTime;
    }

    public void setPauseStartTime(String pauseStartTime) {
        this.pauseStartTime = pauseStartTime == null ? null : pauseStartTime.trim();
    }

    public String getPauseEndTime() {
        return pauseEndTime;
    }

    public void setPauseEndTime(String pauseEndTime) {
        this.pauseEndTime = pauseEndTime == null ? null : pauseEndTime.trim();
    }

    public String getBacktraceStartTime() {
        return backtraceStartTime;
    }

    public void setBacktraceStartTime(String backtraceStartTime) {
        this.backtraceStartTime = backtraceStartTime == null ? null : backtraceStartTime.trim();
    }

    public String getBacktraceEndTime	() {
        return backtraceEndTime	;
    }

    public void setBacktraceEndTime	(String backtraceEndTime	) {
        this.backtraceEndTime	 = backtraceEndTime	 == null ? null : backtraceEndTime	.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}