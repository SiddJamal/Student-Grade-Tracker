package com.StudentController;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

import javax.print.DocFlavor.READER;

import com.StudentModel.StudModel;
import com.StudentPojo.StudPojo;

@WebServlet("/students")
public class StudController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	StudModel studModel=new StudModel();
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		switch (action) {
		
		case "add": {
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("addstud.html");
			requestDispatcher.forward(request, response);
			break;
		}
		
		case "list":{
			ArrayList<StudPojo> list= studModel.selectAll();
			request.setAttribute("list", list);
			
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("studlist.jsp");
			requestDispatcher.forward(request, response);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + action);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		
		switch (action) {
		case "add": {
			String name=request.getParameter("name");
			int rollno=Integer.parseInt(request.getParameter("rollno"));
			String department=request.getParameter("deaprtment");
			int firstSubject=Integer.parseInt(request.getParameter("firstSubject"));
			int secondSubject=Integer.parseInt(request.getParameter("secondSubject"));
			int thirdSubject=Integer.parseInt(request.getParameter("secondSubject"));
			int fourthSubject=Integer.parseInt(request.getParameter("fourthSubject"));
			System.out.println(name + rollno + department);
			
			int res=studModel.insert(new StudPojo(secondSubject, name, rollno, department, firstSubject, firstSubject, thirdSubject, fourthSubject));
			if (res>0) {
				response.sendRedirect("index.html");
			}
			
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + action);
		}
	}

}
