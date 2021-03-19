package home;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetServlet
 */
@WebServlet("/home/getdata")
public class GetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public GetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("servier() 메서드 동작");
//		
//		super.service(request, response);
//	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String x = request.getParameter("x");
		String y = request.getParameter("y");
		String z[] = request.getParameterValues("z");
		
		//응답 인코딩 설정 - 거의 무조건 작성한다고 보면 된다.
		response.setCharacterEncoding("UTF-8"); 
		response.setContentType("text/html; charset=UTF-8"); //인코딩을 맞춰주어야 함. (한글 깨짐)
		
		//url : http://localhost:8080/home1/home/getdata?x=10&y=20&z=30&z=40 로 실행시킴.
		PrintWriter out = response.getWriter();
		String html = "";
		html += "doGet() 메서드 동작";
		html += "<br>파라메터 x값을 추출 하였습니다. -> " + x;
		html += "<br>파라메터 y값을 추출 하였습니다. -> " + y;
		for(int i = 0; i < z.length; i++) {
			html += "<br>파라메터 z["+ i +"]값을 추출 하였습니다. -> " + z[i];
		}
		out.println(html);
	}

}
