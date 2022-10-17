package com.zhihu.ares.domain.dao;

import java.util.Date;

public class BacktraceInstanceDao {
    private Long id;

    private Integer backtraceJobId;

    private String jobName;

    private String instancePeriod;

    private Integer instanceId;

    private Integer instanceStatus;

    private Integer weight;

    private Integer submited;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getBacktraceJobId() {
        return backtraceJobId;
    }

    public void setBacktraceJobId(Integer backtraceJobId) {
        this.backtraceJobId = backtraceJobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    public String getInstancePeriod() {
        return instancePeriod;
    }

    public void setInstancePeriod(String instancePeriod) {
        this.instancePeriod = instancePeriod == null ? null : instancePeriod.trim();
    }

    public Integer getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(Integer instanceId) {
        this.instanceId = instanceId;
    }

    public Integer getInstanceStatus() {
        return instanceStatus;
    }

    public void setInstanceStatus(Integer instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getSubmited() {
        return submited;
    }

    public void setSubmited(Integer submited) {
        this.submited = submited;
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