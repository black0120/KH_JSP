package home;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home/fwdone1")
public class FwdoneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public FwdoneServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/** 이미 ForwardServlet에서 인코딩 설정을 다 했기때문에 여기서는 할 필요가 없다. response를 넘겨주었기 때문에. (response를 넘겨준다 = 작업한 모든 내용을 전달한다. 인코딩까지 모두 다 포함.) 
		 * response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");*/
		
		PrintWriter out = response.getWriter();
		out.println("처리가 완료되었습니다.");
	}

}
