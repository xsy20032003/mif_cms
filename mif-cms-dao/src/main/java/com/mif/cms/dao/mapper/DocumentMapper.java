package com.mif.cms.dao.mapper;

import org.apache.ibatis.annotations.Param;

import com.mif.cms.dao.model.Document;

public interface DocumentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Document record);

    int insertSelective(Document record);

    Document selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Document record);

    int updateByPrimaryKey(Document record);

	Document selectById(@Param("id")Long id);
}