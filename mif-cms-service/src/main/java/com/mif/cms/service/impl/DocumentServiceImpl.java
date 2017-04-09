package com.mif.cms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mif.cms.dao.mapper.DocumentMapper;
import com.mif.cms.dao.model.Document;
import com.mif.cms.service.DocumentService;

@Service
public class DocumentServiceImpl implements DocumentService {

	@Autowired
	private DocumentMapper documentMapper;

	public int insert(Document record) {
		return documentMapper.insertSelective(record);
	}

	public Document selectById(Long id) {
		return documentMapper.selectById(id);
	}

}
