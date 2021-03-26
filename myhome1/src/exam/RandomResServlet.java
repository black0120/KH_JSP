package exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/exam/random/res")
public class RandomResServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RandomResServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int mn = Integer.parseInt(request.getParameter("mn"));
		int mx = Integer.parseInt(request.getParameter("mx"));
		int rn = Integer.parseInt(request.getParameter("rn"));

		response.setCharacterEncoding("UTF-8"); 
		response.setContentType("text/html; charset=UTF-8"); //인코딩을 맞춰주어야 함. (한글 깨짐)
		
		PrintWriter out = response.getWriter(); //PrintWriter : 파일입출력 관련 개체
		String html = "";
		html += "<!DOCTYPE html>";
		html += "<html lang=\"en\">";
		html += "<head>";
		html += "    <meta charset=\"UTF-8\">";
		html += "    <title>" + mn + " ~ " + mx + " 범위의 랜덤 번호 생성</title>";
		html += "</head>";
		html += "<body>";
		if(rn <= 20) {
			html += "	<h1 style=\"color:#F85615\">" + rn + "</h1>";
		} else if(20 < rn && rn <= 40) {
			html += "	<h1 style=\"color:#F8156C\">" + rn + "</h1>";
		} else if(40 < rn && rn <= 60) {
			html += "	<h1 style=\"color:#159DF8\">" + rn + "</h1>";
		} else if(60 < rn && rn <= 80) {
			html += "	<h1 style=\"color:#4AF815\">" + rn + "</h1>";
		} else if(80 < rn && rn <= 100) {
			html += "	<h1 style=\"color:#F8E115\">" + rn + "</h1>";
		}
		html += "</body>";
		html += "</html>";
		out.println(html);
	}

}
