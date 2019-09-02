package com.training.model;

import org.apache.struts.action.ActionForm;

public class Search extends ActionForm{

	/**
	 * 
	 */
	
	
	private String idCode;
	private String idName;
	public String getIdCode() {
		return idCode;
	}
	public void setIdCode(String idCode) {
		this.idCode = idCode;
	}
	public String getIdName() {
		return idName;
	}
	public void setIdName(String idName) {
		this.idName = idName;
	}

}
