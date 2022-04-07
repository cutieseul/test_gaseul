package studentDetail;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.team.command.PCommand;
import com.javalec.team.dao.SelectDetail_dao;
import com.javalec.team.dto.ProductDetail_dto;

public class StudentDetail_Command implements PCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		
		String pCode = request.getParameter("pCode");
		SelectDetail_dao dao = new SelectDetail_dao();
		ProductDetail_dto dto = dao.student(pCode);
		
		request.setAttribute("studentDetail", dto);
		
	}

}
