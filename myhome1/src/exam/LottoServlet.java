package exam;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/exam/lotto")
public class LottoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LottoServlet() {
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
//		html += "    <title>1 ~ 45 범위의 로또 번호 생성 (중복 없이)</title>";
//		html += "    <style>";
//		html += "    span { display:inline-block; width:26px; height:26px; border-radius:50%; background-color:coral; color:#fff; font-weight:bold; font-size:1rem; text-align:center;}";
//		html += "    </style>";
//		html += "</head>";
//		html += "<body>";
//
//		ArrayList lotto = new ArrayList();
//		while(lotto.size() < 6) {
//			int rand = ((int)(Math.random() * 45)) + 1;
//			if(!lotto.contains(rand)) {
//				lotto.add(rand);
//			}
//		}
//		
//		for(Object x: lotto ) {
//			html += "	<span>" + x + "</span>";
//		}
//		
//		html += "</body>";
//		html += "</html>";
//		out.println(html);
//	}
    
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	int lottoset = Integer.parseInt(request.getParameter("lottoset"));
		
		//응답 인코딩 설정 - 거의 무조건 작성한다고 보면 된다.
		response.setCharacterEncoding("UTF-8"); 
		response.setContentType("text/html; charset=UTF-8"); //인코딩을 맞춰주어야 함. (한글 깨짐)
		
		PrintWriter out = response.getWriter(); //PrintWriter : 파일입출력 관련 개체
		String html = "";
		html += "<!DOCTYPE html>";
		html += "<html lang=\"en\">";
		html += "<head>";
		html += "    <meta charset=\"UTF-8\">";
		html += "    <title>1 ~ 45 범위의 로또 번호 생성 (중복 없이)</title>";
		html += "    <style>";
		html += "    span { display:inline-block; width:26px; height:26px; border-radius:50%; background-color:coral; color:#fff; font-weight:bold; font-size:1rem; text-align:center;}";
		html += "    </style>";
		html += "</head>";
		html += "<body>";

		for(int i = 0; i < lottoset; i++) {
			ArrayList lotto = new ArrayList();
			while(lotto.size() < 6) {
				int rand = ((int)(Math.random() * 45)) + 1;
				if(!lotto.contains(rand)) {
					lotto.add(rand);
				}
			}
			
			for(Object x: lotto ) {
				html += "	<span>" + x + "</span>";
			}
			html += "<br>";
		}
		
		html += "</body>";
		html += "</html>";
		out.println(html);
	}

}
