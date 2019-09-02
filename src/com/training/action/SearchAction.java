package com.training.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;

public class SearchAction extends MappingDispatchAction{
	public ActionForward getABS(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
 
		EmployeeCount service = new EmployeeCount();
		 // Retrieve employee count.
	    int employeeCount = service.getEmployeeCount();
	   
	    // Write employee count to HTTP response.
	    PrintWriter out = response.getWriter();
	    out.print("Excute");
	   System.out.println("In Action Class..........");
	    // Return null to inform the controller servlet
	    // that the HTTP response has been handled.
	    return null;
    }
	
	public ActionForward GetDPT(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
 
		System.out.println(request.getParameter("getdata"));
		EmployeeCount service = new EmployeeCount();
		 // Retrieve employee count.
	    int employeeCount = service.getEmployeeCount();
	   
	    // Write employee count to HTTP response.
	    PrintWriter out = response.getWriter();
	    out.print("Get DPT");
	   System.out.println("In Action Class..........");
	    // Return null to inform the controller servlet
	    // that the HTTP response has been handled.
	    return null;
    }
	
	public ActionForward GetSupplider(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
 
		EmployeeCount service = new EmployeeCount();
		 // Retrieve employee count.
	    int employeeCount = service.getEmployeeCount();
	    System.out.println(request.getParameter("getdata"));
	    // Write employee count to HTTP response.
	    PrintWriter out = response.getWriter();
	    out.print("Get Supplier");
	   System.out.println("In Action Class..........");
	    // Return null to inform the controller servlet
	    // that the HTTP response has been handled.
	    return null;
    }
}
