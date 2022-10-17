package com.zhihu.ares.infra.persistence.sql.mapper;

import com.zhihu.ares.domain.dao.BacktraceJobDao;

public interface BacktraceJobDaoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BacktraceJobDao record);

    int insertSelective(BacktraceJobDao record);

    BacktraceJobDao selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BacktraceJobDao record);

    int updateByPrimaryKey(BacktraceJobDao record);
}