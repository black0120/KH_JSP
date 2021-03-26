package order;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/order/pizza")
public class PizzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PizzaServlet() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String pizza = request.getParameter("pizza");
		String topping[] = request.getParameterValues("topping");
		String side[] = request.getParameterValues("side");
		
		HashMap<String, HashMap<String, String>> pizza_map = new HashMap();
		pizza_map.put("cheese", new HashMap<String, String>() {{put("name", "치즈피자"); put("price", "4000"); }});
		//아래로 전부 다 해쉬맵 처리. -> 나중에 데이터베이스 이용하게되면 굳이 이런 번거로운 작업은 필요없긴 함.
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("./pizza/res");
		dispatcher.forward(request, response);
	}

}
