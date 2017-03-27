package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.HibernateDAO;
import com.pojo.Employee;

/**
 * Servlet implementation class SetEmpData
 */
@WebServlet("/SetEmpData")
public class SetEmpData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SetEmpData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		Session session=null;
		SessionFactory sf=null;
		try {
			sf=HibernateDAO.getSessionFactory();
			session= sf.openSession();
			Employee e= new Employee();
			session.load(e, "2");
			response.getWriter().append("Served at: ").append(e.getEmpname()).append(e.getEmpid()).append(e.getEmpage());
			session.save(e);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}finally {
			if(sf!=null){
				//sf.close();
			}
			if(session!=null){
				//session.close();
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
