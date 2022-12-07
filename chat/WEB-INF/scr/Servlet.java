import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class Servlet extends HttpServlet {
	String nname,
		   etatPlayer;

	public String get_nname() {
		return this.nname;
	}
	public String get_etatPlayer() {
		return this.etatPlayer;
	}

	protected void doGet (HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();
		nname = request.getParameter("playerName");
		// out.println(nname);
		if (request.getParameterValues("playerPosition")[0].equals("client")) {
			// out.println("Client");
			etatPlayer = request.getParameterValues("playerPosition")[0];
			// out.println(etatPlayer);
			response.sendRedirect("http://localhost:8080/chat/WEB-INF/index.jsp");
		} else {
			// out.println("Server");
			etatPlayer = request.getParameterValues("playerPosition")[0];
			// out.println(etatPlayer);
			response.sendRedirect("http://localhost:8080/chat/WEB-INF/index.jsp");
		}
	}
}