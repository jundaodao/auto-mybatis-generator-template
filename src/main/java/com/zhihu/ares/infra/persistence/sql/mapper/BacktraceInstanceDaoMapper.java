package com.zhihu.ares.infra.persistence.sql.mapper;

import com.zhihu.ares.domain.dao.BacktraceInstanceDao;

public interface BacktraceInstanceDaoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BacktraceInstanceDao record);

    int insertSelective(BacktraceInstanceDao record);

    BacktraceInstanceDao selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BacktraceInstanceDao record);

    int updateByPrimaryKey(BacktraceInstanceDao record);
}