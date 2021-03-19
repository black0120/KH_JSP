package exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/bmi/res")
public class bmiResServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public bmiResServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	double h = Double.parseDouble(request.getParameter("h"))/100;
    	double w = Double.parseDouble(request.getParameter("w"));
    	double bmi = w/(h*h);
    	
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
		html += "    <h2>키 : " + h*100 + ", 체중 : " + w + "</h2>";
		html += "    <h2>[BMI : " + String.format("%.2f", bmi) + "] ";
		if(bmi < 20) {
			html += "저체중 입니다.</h2>";
		} else if(bmi >= 20 && bmi < 25) {
			html += "정상체중 입니다.</h2>";
		} else if(bmi >= 25 && bmi < 30) {
			html += "과체중 입니다.</h2>";
		} else if(bmi >= 30 && bmi < 35) {
			html += "비만 입니다.</h2>";
		} else if(bmi >= 35) {
			html += "고도비만 입니다.</h2>";
		}
		html += "</body>";
		html += "</html>";
		out.println(html);
	}

}
