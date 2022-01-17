package servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class AutoInit2Servlet
 */
@WebServlet(
		urlPatterns = { "/AutoInit2Servlet" }, 
		initParams = { 
				@WebInitParam(name = "emailAdmin", value = "email@admin.com")
		})
public class AutoInit2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String adminEmail;

	public void init(ServletConfig config) throws ServletException {
		// é invocado pelo container no momento que esta inicalizando o servlet
				String email = config.getInitParameter("adminEmail");
				this.adminEmail = email;
				System.out.println("Servlet 2 carregado! adminEmail= " + email);
	}

}
