package com.mif.cms.service;

import com.mif.cms.dao.model.Document;

public interface DocumentService {

	int insert(Document record);
	
	Document selectById(Long id);
}
