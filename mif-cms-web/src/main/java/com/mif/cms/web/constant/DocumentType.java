package com.mif.cms.web.constant;

public enum DocumentType {
	
	JSON(1,"json"),HTML(2,"html"),JS(3,"js"),CSS(4,"css");
	
	private Integer type;
	
	private String typeName;

	public Integer getType() {
		return type;
	}

	public String getTypeName() {
		return typeName;
	}

	DocumentType(Integer type,String typeName) {
		this.type = type;
		this.typeName = typeName;
	}
	
	public static String getTypeName(Integer type){
		DocumentType[] array = DocumentType.values();
		for (DocumentType documentType : array) {
			if (documentType.getType().equals(type)) {
				return documentType.getTypeName();
			}
		}
		return null;
	}
	
	
}
