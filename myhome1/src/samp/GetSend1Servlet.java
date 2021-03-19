package samp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home/getsend1")
public class GetSend1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GetSend1Servlet() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//응답 인코딩 설정 - 거의 무조건 작성한다고 보면 된다.
		response.setCharacterEncoding("UTF-8"); 
		response.setContentType("text/html; charset=UTF-8"); //인코딩을 맞춰주어야 함. (한글 깨짐)
		
		String name = request.getParameter("name");
				
		PrintWriter out = response.getWriter();
		String html = "";
		html += "Client : " + name;
		html += "<br>Server : 메시지를 잘 받았습니다.";
		out.println(html);
	}

}
