package exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/exam/random")
public class RandomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RandomServlet() {
        super();
    }

//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//		//응답 인코딩 설정 - 거의 무조건 작성한다고 보면 된다.
//		response.setCharacterEncoding("UTF-8"); 
//		response.setContentType("text/html; charset=UTF-8"); //인코딩을 맞춰주어야 함. (한글 깨짐)
//		
//		int rand = ((int)(Math.random() * 100)) + 1;
//		
//		PrintWriter out = response.getWriter(); //PrintWriter : 파일입출력 관련 개체
//		String html = "";
//		html += "<!DOCTYPE html>";
//		html += "<html lang=\"en\">";
//		html += "<head>";
//		html += "    <meta charset=\"UTF-8\">";
//		html += "    <title>1 ~ 100 범위의 랜덤 번호 생성</title>";
//		html += "</head>";
//		html += "<body>";
//		if(rand <= 20) {
//			html += "	<h1 style=\"color:#F85615\">" + rand + "</h1>";
//		} else if(20 < rand && rand <= 40) {
//			html += "	<h1 style=\"color:#F8156C\">" + rand + "</h1>";
//		} else if(40 < rand && rand <= 60) {
//			html += "	<h1 style=\"color:#159DF8\">" + rand + "</h1>";
//		} else if(60 < rand && rand <= 80) {
//			html += "	<h1 style=\"color:#4AF815\">" + rand + "</h1>";
//		} else if(80 < rand && rand <= 100) {
//			html += "	<h1 style=\"color:#F8E115\">" + rand + "</h1>";
//		}
//		html += "</body>";
//		html += "</html>";
//		out.println(html);
//	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));

		//응답 인코딩 설정 - 거의 무조건 작성한다고 보면 된다.
		response.setCharacterEncoding("UTF-8"); 
		response.setContentType("text/html; charset=UTF-8"); //인코딩을 맞춰주어야 함. (한글 깨짐)
		
		int rand = (int)(Math.floor(Math.random() * (num2 - num1 + 1)) + num1);
		
		response.sendRedirect("random/res?mn="+num1+"&mx="+num2+"&rn="+rand);
	}

}
