package com.javalec.team.homecontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.team.command.AllCategory_Command;
import com.javalec.team.command.AllDetail_Command;
import com.javalec.team.command.InsertCart_Command;
import com.javalec.team.command.InteriorCategory_Command;
import com.javalec.team.command.InteriorDetail_Command;
import com.javalec.team.command.OfficeCategory_Command;
import com.javalec.team.command.OfficeDetail_Command;
import com.javalec.team.command.PCommand;
import com.javalec.team.command.ServiceCenter1vs1_Command;
import com.javalec.team.command.StoolCategory_Command;
import com.javalec.team.command.StoolDetail_Command;
import com.javalec.team.command.StudentCategory_Command;
import com.javalec.team.command.StudentDetail_Command;

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
		request.setCharacterEncoding("utf-8"); //??????????????????????????? ????????????????????????????????? ?????????????????????
		
		String viewPage = null; // viewPage?????? ???????????????????????? ????????? ??????????????? ????????????. switch?????? ???????????? ??????????????????????????? viewPage?????? ??????????????? ?????????????????????????????????
		PCommand command =null;
		
		String uri = request.getRequestURI(); // uri?????? ????????????????????? ????????????/~.do
		String conPath = request.getContextPath(); // conPath?????? ????????????????????? ????????????
		String com = uri.substring(conPath.length()); // com?????? ~.do
		
//		System.out.println(uri); 
//		System.out.println(conPath);
//		System.out.println(com);
		
		switch(com) {
		case("/serviceCenter.do"): // /list.do -> ???????????? ???????????? ??????????????????
			viewPage = "serviceCenter.jsp";
			break;
		
		case("/serviceCenter1vs1.do"): // 1:1 
			command = new ServiceCenter1vs1_Command();
			command.execute(request, response);
			viewPage = "serviceCenter1vs1.jsp";
			break;
			
		case("/serviceCenterWrite.do"): // 
			viewPage = "serviceCenterWrite.jsp";
			break;
			
			
			
			
			// allcategory.do
			
		case("/allCategory.do"): 
			command = new AllCategory_Command();
			command.execute(request, response);
			viewPage = "allCategory.jsp";
			break;
			
			
			
		case("/studentCategory.do"): 
			command = new StudentCategory_Command();
			command.execute(request, response);
			viewPage = "studentCategory.jsp";
			break;
			
			
		case("/officeCategory.do"): 
			command = new OfficeCategory_Command();
			command.execute(request, response);
			viewPage = "officeCategory.jsp";
			break;
			
		case("/interiorCategory.do"): 
			command = new InteriorCategory_Command();
			command.execute(request, response);
			viewPage = "interiorCategory.jsp";
			break;
			
		case("/stoolCategory.do"): 
			command = new StoolCategory_Command();
			command.execute(request, response);
			viewPage = "stoolCategory.jsp";
			break;
			//category.do - end
			
			
			
			//DetailPage.do
			
		case("/allDetail.do"): 
			command = new AllDetail_Command();
			command.execute(request, response);
			viewPage = "alldetail.jsp";
			break;
			
		case("/studentDetail.do"): 
			command = new StudentDetail_Command();
			command.execute(request, response);
			viewPage = "studentDetail.jsp";
			break;
			
			
		case("/officeDetail.do"): 
			command = new OfficeDetail_Command();
			command.execute(request, response);
			viewPage = "officeDetail.jsp";
			break;
			
		case("/interiorDetail.do"): 
			command = new InteriorDetail_Command();
			command.execute(request, response);
			viewPage = "interiorDetail.jsp";
			break;
			
		case("/stoolDetail.do"): 
			command = new StoolDetail_Command();
			command.execute(request, response);
			viewPage = "stoolDetail.jsp";
			break;
			//DetailPage.do - end
			
		case("/cartin.do"): 
			command = new InsertCart_Command();
			command.execute(request, response);
			viewPage = "wishlist.do";
			break;
			
		} // switch(com)
		
		
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
	}
}
