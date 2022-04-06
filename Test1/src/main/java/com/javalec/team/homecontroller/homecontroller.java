package com.javalec.team.homecontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.team.command.InteriorCategory_Command;
import com.javalec.team.command.OfficeCategory_Command;
import com.javalec.team.command.PCommand;
import com.javalec.team.command.ServiceCenter1vs1_Command;
import com.javalec.team.command.StoolCategory_Command;
import com.javalec.team.command.StudentCategory_Command;

/**
 * Servlet implementation class homecontroller
 */
@WebServlet("*.do")
public class homecontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public homecontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet"); 
		actionDo(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost"); 
		actionDo(request, response);
	}
	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("actionDo");
		request.setCharacterEncoding("utf-8"); //�븳湲�泥섎━瑜� 以섏빞�릺湲곕븣臾몄뿉 �뜥以섏빞�맖
		
		String viewPage = null; // viewPage�뒗 �궗�슜�옄媛� 蹂대뒗 �솕硫댁쓣 �쑜�븿. switch瑜� �넻�빐 �씠以꾨컩�뿉�뒗 viewPage�쓽 醫낅쪟瑜� �젙�쓽�빐二쇰㈃�맖
		PCommand command =null;
		
		String uri = request.getRequestURI(); // uri�뒗 �봽濡쒖젥�듃 �씠由�/~.do
		String conPath = request.getContextPath(); // conPath�뒗 �봽濡쒖젥�듃 �씠由�
		String com = uri.substring(conPath.length()); // com�� ~.do
		
//		System.out.println(uri); 
//		System.out.println(conPath);
//		System.out.println(com);
		
		switch(com) {
		case("/serviceCenter.do"): // /list.do -> �쟾泥� �궡�슜 蹂댁뿬二쇨린
			viewPage = "serviceCenter.jsp";
			break;
		
		case("/serviceCenter1vs1.do"): // 1:1 臾몄쓽濡� 媛�湲�
			command = new ServiceCenter1vs1_Command();
			command.execute(request, response);
			viewPage = "serviceCenter1vs1.jsp";
			break;
			
		case("/serviceCenterWrite.do"): // 
			viewPage = "serviceCenterWrite.jsp";
			break;
		
		case("/studentCategory.do"): // 학생용의자카테고리.do
			command = new StudentCategory_Command();
			command.execute(request, response);
			viewPage = "studentCategory.jsp";
			break;
			
		case("/officeCategory.do"): // 사무용의자카테고리.do
			command = new OfficeCategory_Command();
			command.execute(request, response);
			viewPage = "officeCategory.jsp";
			break;
			
		case("/interiorCategory.do"): // 인테리어용의자카테고리.do
			command = new InteriorCategory_Command();
			command.execute(request, response);
			viewPage = "interiorCategory.jsp";
			break;
			
		case("/stoolCategory.do"): // 스툴&바의자카테고리.do
			command = new StoolCategory_Command();
			command.execute(request, response);
			viewPage = "stoolCategory.jsp";
			break;
			
		
		} // switch(com)
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
	}
}