package com.javalec.team.homecontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.team.command.Adduser_Command;
import com.javalec.team.command.AllCategoryPage_Command;
import com.javalec.team.command.AllCategory_Command;
import com.javalec.team.command.AllDetail_Command;
import com.javalec.team.command.AllascendView_Command;
import com.javalec.team.command.AlldescendView_Command;
import com.javalec.team.command.AllpopulurityView_Command;
import com.javalec.team.command.Click_Command;
import com.javalec.team.command.Finduserid_Command;
import com.javalec.team.command.Finduserpw_Command;
import com.javalec.team.command.InsertCart_Command;
import com.javalec.team.command.InteriorCategory_Command;
import com.javalec.team.command.InteriorDetail_Command;
import com.javalec.team.command.Login_Command;
import com.javalec.team.command.MPchange_Command;
import com.javalec.team.command.MPdelete_Command;
import com.javalec.team.command.MPinformation_Command;
import com.javalec.team.command.OfficeCategory_Command;
import com.javalec.team.command.OfficeDetail_Command;
import com.javalec.team.command.OrderpageCategory_Command;
import com.javalec.team.command.PCommand;
import com.javalec.team.command.ReviewWritepage_Command;
import com.javalec.team.command.RightPayment_Command;
import com.javalec.team.command.ServiceCenter1vs1Detail_Command;
import com.javalec.team.command.ServiceCenter1vs1_Command;
import com.javalec.team.command.ServiceCenterWrite_Command;
import com.javalec.team.command.StoolCategory_Command;
import com.javalec.team.command.StoolDetail_Command;
import com.javalec.team.command.StudentCategory_Command;
import com.javalec.team.command.StudentDetail_Command;
import com.javalec.team.command.Wishlist_Command;

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
		case("/mainpage.do"): 
			command = new Login_Command();
			command.execute(request, response);
			viewPage = "infocheck.jsp";
			break;
			
		//濡쒓렇�씤(�쁺吏꾪삎) �떆�옉	
		case("/login.do"): 
			viewPage = "login.jsp";
			break;	
			
		case("/idchk.do"): 
			command = new Login_Command();
			command.execute(request, response);
			viewPage = "idchk.jsp";
			break;
			
		case("/adduser.do"): 
			viewPage = "adduser.jsp";
			break;
		
		case("/addfinish.do"): 
			command = new Adduser_Command();
			command.execute(request, response);
			viewPage = "beforelogin.jsp";
			break;
		
		case("/finduser.do"): 
			viewPage = "finduser.jsp";
			break;
			
		case("/finduserid.do"): 
			command = new Finduserid_Command();
			command.execute(request, response);
			viewPage = "fidchk.jsp";
			break;
			
		case("/finduserpw.do"): 
			command = new Finduserpw_Command();
			command.execute(request, response);
			viewPage = "fpwchk.jsp";
			break;	
		
		//濡쒓렇�씤(�쁺吏꾪삎) �걹
			
		//怨좉컼�꽱�꽣 �떆�옉(�듅誘�)
		case("/serviceCenter.do"): //�쟾泥� �궡�슜 蹂댁뿬二쇨린
			viewPage = "serviceCenter.jsp";
			break;
		
		case("/serviceCenter1vs1.do"): //1:1 臾몄쓽濡� 媛�湲�
			command = new ServiceCenter1vs1_Command();
			command.execute(request, response);
			viewPage = "serviceCenter1vs1.jsp";
			break;
			
		case("/serviceCenter1vs1Detail.do")://臾몄쓽 �궡�슜 蹂대윭媛��뒗 �긽�꽭�솕硫닿�湲�
			command = new ServiceCenter1vs1Detail_Command();
			command.execute(request, response);
			viewPage = "serviceCenter1vs1Detail.jsp";
			break;
			
		case("/serviceCenterWrite.do"): //湲��옉�꽦�븯�윭 媛�湲�
			viewPage = "serviceCenterWrite.jsp";
			break;
			
		case("/serviceCenterWriteFinish.do")://Write.jsp�뿉�꽌 �뤌�쑝濡� 蹂대궡湲�
			command = new ServiceCenterWrite_Command();
			command.execute(request, response);
			viewPage = "serviceCenter1vs1.do";
			break;
		//怨좉컼�꽱�꽣 �걹
			
		//留덉씠�럹�씠吏�(�닔�뿰�늻�굹) �떆�옉	
		case ("/mpInformation.do"): //�굹�쓽�젙蹂� 蹂댁뿬二쇨린
			command = new MPinformation_Command(); 
			command.execute(request, response);
			viewPage ="mypageInformation.jsp";
			break;
			
		case("/mpchange.do"): //�궡�젙蹂� �닔�젙
			command = new MPchange_Command();
			command.execute(request, response);
			viewPage="mpInformation.do";
			break;
			
		case("/mpdelete.do"): //�깉�눜
			command = new MPdelete_Command();
			command.execute(request, response);
			viewPage = "mainpage.jsp"; //do濡� �빐�꽌 �떎�떆 耳��씠�뒪1�뿉 �뱾�뼱媛��룄濡�!! jsp �븘�떂!!!!!
			break;
			
		case ("/orderpageCategory.do"): //�굹�쓽二쇰Ц�젙蹂�
			command = new OrderpageCategory_Command(); 
			command.execute(request, response);
			viewPage ="orderpageCategory.jsp";
			break;
		
		case ("/reviewWritepage.do"): //由щ럭�벐�뒗�럹�씠吏� �씠�룞
			viewPage="reviewWritepage.jsp";
			break;
	
		case("/reviewWrite.do")://由щ럭�뵒鍮꾩뿉 ���옣
			command = new ReviewWritepage_Command();
			command.execute(request, response);
			viewPage = "mainpage.jsp"; //do濡� �빐�꽌 �떎�떆 耳��씠�뒪1�뿉 �뱾�뼱媛��룄濡�!! jsp �븘�떂!!!!!
			break;
		//留덉씠�럹�씠吏�(�닔�뿰�늻�굹) �걹
		
		//�젣�뭹(媛��뒳)�떆�옉
		// allcategory.do
		
				case("/allCategory.do"): 
					command = new AllCategory_Command();
					command.execute(request, response);
					viewPage = "allCategory.jsp";
					break;
					
				case("/allCategoryPage.do"): 
					command = new AllCategoryPage_Command();
					command.execute(request, response);
					viewPage = "allCategory.jsp";
					break;
					
				case("/populurityView.do"): 
					command = new AllpopulurityView_Command();
					command.execute(request, response);
					viewPage = "allCategory.jsp";
					break;
					
				case("/ascendView.do"): 
					command = new AllascendView_Command();
					command.execute(request, response);
					viewPage = "allCategory.jsp";
					break;
					
				case("/descendView.do"): 
					command = new AlldescendView_Command();
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
					
					
					
					//DetailPage.do - start
				case("/allDetail.do"): 
					//click
					command = new Click_Command();
					command.execute(request, response);
					
					command = new AllDetail_Command();
					command.execute(request, response);
					viewPage = "alldetail.jsp";
					break;
					
				case("/studentDetail.do"): 
					//click
					command = new Click_Command();
					command.execute(request, response);
				
					command = new StudentDetail_Command();
					command.execute(request, response);
					viewPage = "studentDetail.jsp";
					break;
					
				case("/officeDetail.do"): 
					//click
					command = new Click_Command();
					command.execute(request, response);
				
					command = new OfficeDetail_Command();
					command.execute(request, response);
					viewPage = "officeDetail.jsp";
					break;
					
				case("/interiorDetail.do"): 
					//click
					command = new Click_Command();
					command.execute(request, response);
				
					command = new InteriorDetail_Command();
					command.execute(request, response);
					viewPage = "interiorDetail.jsp";
					break;
					
				case("/stoolDetail.do"): 
					//click
					command = new Click_Command();
					command.execute(request, response);
				
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
		//�젣�뭹(媛��뒳)�걹
		
		//�옣諛붽뎄�땲(���븷�늻�굹) �떆�옉
				case("/wishlist.do")://�쟾泥� �궡�슜 蹂댁뿬二쇨린
					command = new Wishlist_Command();
					command.execute(request, response);
					viewPage = "wishlist.jsp";
					break;									
				
				case("/delete.do")://�옣諛붽뎄�땲�궘�젣
		//			command = new Delete_Command();
		//			command.execute(request, response);
					viewPage = "wishlist.do";
					break;
				case("/payment.do")://寃곗젣
		//			command = new Payment_Command();
		//			command.execute(request, response);
					viewPage = "payment.jsp";
					break;
				case("/paymentrevise.do")://寃곗젣�뿉�꽌 臾쇳뭹 �닔�젙�븯湲�
		//			command = new Paymentrevise_Command();
		//			command.execute(request, response);
					viewPage = "payment.jsp";
					break;
				//�옣諛붽뎄�땲(���븷�늻�굹) �걹
					
				
				case("/naver_login.do"):
					viewPage = "naver_login.jsp";
					break;
				case("/savelogin.do"):
					viewPage = "mainpage.do";
					break;
					
				
				//detail page -> rightPayment
				case("/rightPayment.do")://寃곗젣�뿉�꽌 臾쇳뭹 �닔�젙�븯湲�
					command = new RightPayment_Command();
					command.execute(request, response);
					viewPage = "payment.jsp";
					break;
					
		} // switch(com)

		

		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
	}
}
