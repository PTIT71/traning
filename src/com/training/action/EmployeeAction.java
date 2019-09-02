package com.training.action;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


public class EmployeeAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		EmployeeCount service = new EmployeeCount();
		 // Retrieve employee count.
	    int employeeCount = service.getEmployeeCount();
	   
	    // Write employee count to HTTP response.
	    PrintWriter out = response.getWriter();
	    out.print("thinh khung");
	   System.out.println("In Action Class..........");
	    // Return null to inform the controller servlet
	    // that the HTTP response has been handled.
	    return null;
	  }


		
	

}
