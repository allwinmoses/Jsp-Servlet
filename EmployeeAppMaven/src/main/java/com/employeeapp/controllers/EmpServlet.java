package com.employeeapp.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.employeeapp.model.Employee;

/**
 * Servlet implementation class EmpServlet
 */
@WebServlet("/empServlet")
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpServlet() {
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
		
		Employee employee= new Employee();
		employee.setEmployeeId(employeeId);
		employee.setEmployeeName(employeeName);
		employee.setCity(city);
		employee.setSalary(salary);
		
		request.setAttribute("employee", employee);
		request.setAttribute("message", "Greate Day");
		
		HttpSession session = request.getSession();
		session.setAttribute("message1", "Welcome to EL");
		request.setAttribute("message", "In request scope");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("empexlang.jsp");
		dispatcher.forward(request, response);
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
