package exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/bmi/calc")
public class bmiCalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public bmiCalcServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//응답 인코딩 설정 - 거의 무조건 작성한다고 보면 된다.
		response.setCharacterEncoding("UTF-8"); 
		response.setContentType("text/html; charset=UTF-8"); //인코딩을 맞춰주어야 함. (한글 깨짐)
		
		PrintWriter out = response.getWriter(); //PrintWriter : 파일입출력 관련 개체
		String html = "";
		html += "<!DOCTYPE html>";
		html += "<html lang=\"en\">";
		html += "<head>";
		html += "    <meta charset=\"UTF-8\">";
		html += "    <title>BMI 계산</title>";
		html += "</head>";
		html += "<body>";
		html += "    <h2>키와 체중을 입력해주세요.</h2>";
		html += "    <form action=\"./res\">";
		html += "        <input type=\"text\" name=\"h\" placeholder=\"키를 입력해주세요.\">";
		html += "        <input type=\"text\" name=\"w\" placeholder=\"몸무게를 입력해주세요.\">";
		html += "        <button type=\"submit\">BMI 계산</button>";
		html += "    </form>";
		html += "</body>";
		html += "</html>";
		out.println(html);
	}

}
