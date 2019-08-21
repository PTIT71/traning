package com.training.model;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.training.utils.constants;

public class User extends ActionForm{
	
	private String userId;
    private String password;
 
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    public ActionErrors validate(ActionMapping mapping,HttpServletRequest request) {
    	
    	ActionErrors errors = new ActionErrors();
        
        if (userId == null || userId.length() == 0) {
        	request.setAttribute("isInvalidUser", constants.RIGHT);
            errors.add("userId", new ActionMessage("userId.not.entered"));
        }
        
        if (password == null || password.length() == 0) {
        	request.setAttribute("isInvalidPassword", constants.RIGHT);
            errors.add("password", new ActionMessage("password.not.entered"));
        }
 
        return errors;
    }
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        userId="";
        password="";
    }

}
