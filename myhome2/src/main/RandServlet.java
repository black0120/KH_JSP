package main;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/random")
public class RandServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RandServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dp = request.getRequestDispatcher("/WEB-INF/rand.jsp");
		dp.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int min = Integer.parseInt(request.getParameter("min"));
		int max = Integer.parseInt(request.getParameter("max"));
		int rand = 0;
		
//		if(max < min) {
//			RequestDispatcher dp = request.getRequestDispatcher("/WEB-INF/error/range.jsp");
//			request.setAttribute("message", "최소/최대 값 범위 설정이 잘 못 되었습니다.");
//			dp.forward(request, response);
//		}
		
		ArrayList<Integer> randlist = new ArrayList();
		for(int i = 0; i < 6; i++) {
			rand = (int)(Math.floor(Math.random() * (max - min + 1)) + min);
			randlist.add(rand);
		}			
//		try {
//			for(int i = 0; i < 6; i++) {
//				rand = (int)(Math.floor(Math.random() * (max - min + 1)) + min);
//				randlist.add(rand);
//			}			
//		} catch(IllegalArgumentException e) { //되도록이면 Exception e 로 광범위하게 잡지말고 에러가 발생하는 곳에 맞춰서 하도록 한다.
//			RequestDispatcher dp = request.getRequestDispatcher("/WEB-INF/error/range.jsp");
//			request.setAttribute("message", "최소/최대 값 범위 설정이 잘 못 되었습니다.");
//			dp.forward(request, response);
//		}
		
		
		
		request.setAttribute("randlist", randlist);
		RequestDispatcher dp = request.getRequestDispatcher("/WEB-INF/randres.jsp");
		dp.forward(request, response);
	}

}
