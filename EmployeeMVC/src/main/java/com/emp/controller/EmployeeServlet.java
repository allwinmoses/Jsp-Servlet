package com.emp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.empapp.model.Employee;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/employeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String employeeName = request.getParameter("employeeName");
		String city = request.getParameter("city");
	
		String sal = request.getParameter("salary");
		double salary=Double.parseDouble(sal);
		Integer employeeId = Integer.parseInt("employeeId");
		String course =request.getParameter("course");
		
		Employee employee = new Employee();
		employee.setEmployeeId(employeeId);
		employee.setEmployeeName(employeeName);
		employee.setCity(city);
		employee.setSalary(salary);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
		
		dispatcher.include(request, response);
		
		response.sendRedirect("success.jsp");
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
