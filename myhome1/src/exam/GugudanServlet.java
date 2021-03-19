package exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/exam/gugudan")
public class GugudanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GugudanServlet() {
        super();
    }

//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//		//응답 인코딩 설정 - 거의 무조건 작성한다고 보면 된다.
//		response.setCharacterEncoding("UTF-8"); 
//		response.setContentType("text/html; charset=UTF-8"); //인코딩을 맞춰주어야 함. (한글 깨짐)
//		
//		PrintWriter out = response.getWriter(); //PrintWriter : 파일입출력 관련 개체
//		String html = "";
//		html += "<!DOCTYPE html>";
//		html += "<html lang=\"en\">";
//		html += "<head>";
//		html += "    <meta charset=\"UTF-8\">";
//		html += "    <title>구구단</title>";
//		html += "</head>";
//		html += "<body>";
//		
//		for(int i = 1; i < 10; i++) {
//			html += "    <table border='1'>";
//			html += "    <caption>" + i + " 단</caption>";
//			html += "        <tbody>";
//			html += "            <tr>";
//			for(int j = 1; j < 10; j++) {
//				html += "                <td>" + i + " × " + j + " = " + i*j + "</td>";
//			}
//			html += "            </tr>";
//			html += "        </tbody>";
//			html += "    </table>";
//		}
//		
//		html += "</body>";
//		html += "</html>";
//		out.println(html);
//	}
    
    /** 원하는 단수 출력 - exam/get_form2.html */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int dan = Integer.parseInt(request.getParameter("dan"));

		//응답 인코딩 설정 - 거의 무조건 작성한다고 보면 된다.
		response.setCharacterEncoding("UTF-8"); 
		response.setContentType("text/html; charset=UTF-8"); //인코딩을 맞춰주어야 함. (한글 깨짐)
		
		PrintWriter out = response.getWriter(); //PrintWriter : 파일입출력 관련 개체
		String html = "";
		html += "<!DOCTYPE html>";
		html += "<html lang=\"en\">";
		html += "<head>";
		html += "    <meta charset=\"UTF-8\">";
		html += "    <title>구구단</title>";
		html += "</head>";
		html += "<body>";
		
		for(int i = dan; i < dan+1; i++) {
			html += "    <table border='1'>";
			html += "    <caption>" + i + " 단</caption>";
			html += "        <tbody>";
			html += "            <tr>";
			for(int j = 1; j < 10; j++) {
				html += "                <td>" + i + " × " + j + " = " + i*j + "</td>";
			}
			html += "            </tr>";
			html += "        </tbody>";
			html += "    </table>";
		}
		
		html += "</body>";
		html += "</html>";
		out.println(html);
	}

}
