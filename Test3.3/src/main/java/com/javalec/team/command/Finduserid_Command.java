package com.javalec.team.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.team.dao.Find_dao;
import com.javalec.team.dto.Find_dto;

public class Finduserid_Command implements PCommand {

	
	request.setCharacterEncoding("utf-8");

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	String uId = request.getParameter("uId");
	String uEmail = request.getParameter("uEmail");
	
	Find_dao dao = new Find_dao ();
	Find_dto dto = dao.finduserid(uId, uEmail);
	}
}