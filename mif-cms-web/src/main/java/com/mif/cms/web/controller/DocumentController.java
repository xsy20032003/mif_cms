package com.mif.cms.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mif.cms.dao.model.Document;
import com.mif.cms.service.DocumentService;

@Controller
@RequestMapping(value = "/document")
public class DocumentController {

	@Autowired
	private DocumentService service;
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	@ResponseBody
	public Document create(){
		Document document=new Document();
		document.setContent("content test");
		document.setDescription("my description");
		document.setName("document test");
		document.setUser("raul");
		System.out.println("status:"+service.insert(document));
		return document;
	}
	
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Document get(@PathVariable long id){				
		return service.selectById(id);
	}
}
