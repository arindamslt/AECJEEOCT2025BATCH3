package master.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master.dto.foodDto;

/**
 * Servlet implementation class FoodAddServe
 */
@WebServlet("/FoodAddServe")
public class FoodAddServe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String fid=request.getParameter("fid");
		String fname=request.getParameter("fname");
		double price=Double.parseDouble(request.getParameter("price"));
		foodDto fdto=new foodDto();
		fdto.setFid(fid);
		fdto.setFname(fname);
		fdto.setPrice(price);
		
		
	}

}
