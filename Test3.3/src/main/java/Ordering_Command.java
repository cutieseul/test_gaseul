import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.team.command.PCommand;
import com.javalec.team.dao.InsertCart_dao;
import com.javalec.team.dao.Ordering_dao;

public class Ordering_Command implements PCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		String pCode = request.getParameter("pCode");
		String pName = request.getParameter("pName");
		String cQuantity = request.getParameter("cQuantity");

		Ordering_dao dao = new Ordering_dao();
		dao.orderingIn(pCode, pName, cQuantity);
		
		
	}

}
