package com.javalec.team.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.team.dao.SelectCategory_dao;
import com.javalec.team.dto.ProductReview_dto;

public class AllpopulurityView_Command implements PCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String startnum =request.getParameter("startnum");
		String endnum= request.getParameter("endnum");
		
		SelectCategory_dao dao = new SelectCategory_dao();
		ArrayList<ProductReview_dto> dtos = dao.allpopulurityView(startnum, endnum);
		
		String array = "popular";
		request.setAttribute("list", dtos);
		request.setAttribute("array", array);
	}
	
}
