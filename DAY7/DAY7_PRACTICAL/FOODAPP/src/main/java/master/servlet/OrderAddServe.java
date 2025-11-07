package master.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master.dao.FoodDao;
import master.dao.OrderDao;
import master.dto.OrderDto;
import master.dto.foodDto;

/**
 * Servlet implementation class OrderAddServe
 */
@WebServlet("/OrderAddServe")
public class OrderAddServe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String fid=request.getParameter("fid");
		String uname=request.getParameter("uname");
		double oqty=Double.parseDouble(request.getParameter("oqty"));
		OrderDto odto=new OrderDto();
		odto.setFid(fid);
		odto.setOqty(oqty);
		odto.setUname(uname);
		OrderDao odao=new OrderDao();
		odao.insertData(odto);
		response.sendRedirect("Billing.jsp");
		
	}

}
