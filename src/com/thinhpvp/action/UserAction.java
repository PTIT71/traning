package com.thinhpvp.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.actions.MappingDispatchAction;

import com.thinhpvp.model.User;

public class UserAction extends MappingDispatchAction{
	
	public ActionForward addUser(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		 User user = (User)form;
		 user.setName("Phan Van Phuoc Thinh");
		 user.setAge(10);
		 
		 request.setAttribute("username", user);
		 
		 return mapping.findForward("addUser");
	}
	
	public ActionForward updateUser(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		 User user = (User)form;
		 user.setName("Phan Van Phuoc Thinh");
		 user.setAge(10);
		 
		 return mapping.findForward("updateUser");
	}
	
	public ActionForward deleteUser(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		 User user = (User)form;
		 user.setName("Phan Van Phuoc Thinh");
		 user.setAge(10);
		 
		 return mapping.findForward("deleteUser");
	}
	

}
