package order;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/order/pizza/res")
public class PizzaResServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PizzaResServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String pizza = request.getParameter("pizza");
		String toplist = request.getParameter("toplist");
		String sidelist = request.getParameter("sidelist");
		
		PrintWriter out = response.getWriter(); //PrintWriter : 파일입출력 관련 개체
		String html = "";
		html += "<!DOCTYPE html>";
		html += "<html>";
		html += "<head>";
		html += "    <meta charset=\"UTF-8\">";
		html += "    <title>Document</title>";
		html += "    <style>";
		html += "    #pizza { color:red; }";
		html += "    #topping { color:green; }";
		html += "    #side { color:blue; }";
		html += "    #price { text-decoration: underline; }";
		html += "    </style>";
		html += "</head>";
		html += "<body>";
		html += "    <h1>주문 내역</h1>";
		html += "    <h2>피자는 <span id=\"pizza\">" + pizza + "</span>, 토핑은 <span id=\"topping\">" + toplist + "</span>, 사이드는 <span id=\"side\">" + sidelist + "</span> 주문하셨습니다.</h2>";
		html += "    <h2>총합 : <span id=\"price\"></span></h2>";
		html += "</body>";
		html += "</html>";
		out.println(html);
	}

}
