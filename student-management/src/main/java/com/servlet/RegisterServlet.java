package com.servlet;

import java.io.IOException;

import com.conn.DBConnect;
import com.dao.StudentDAO;
import com.entity.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String dob=req.getParameter("dob");
		String address=req.getParameter("address");
		String qualification=req.getParameter("qualification");
		String email=req.getParameter("email");
		
		Student student=new Student(name,dob,address,qualification,email);
		
//		System.out.println(student);
		
		StudentDAO dao=new StudentDAO(DBConnect.getConn());
		
		HttpSession session=req.getSession();
		
		boolean f=dao.addStudent(student);
		
		if(f) {
			
			//session.setAttribute("successMsg", "student details submitted successfully...");
			//resp.sendRedirect("add_student.jsp");
			
			System.out.println("student details submitted successfully..");
			
		}else {
			//session.setAttribute("errorMsg", "something went wrong :-( ");
			//resp.sendRedirect("add_student.jsp");
			System.out.println("something is wrong ");
		}
		
	}
	

}
