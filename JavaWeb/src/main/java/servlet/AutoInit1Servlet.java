package servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns = { "/AutoInit1Servlet" }, initParams = {
@WebInitParam(name = "adminEmail", value = "admin@sistema.com") })
//http://localhost:8080/JavaWeb/AutoInit2Servlet
public class AutoInit1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String adminEmail;

	public void init(ServletConfig config) throws ServletException {
		// é invocado pelo container no momento que esta inicalizando o servlet
		String email = config.getInitParameter("adminEmail");
		this.adminEmail = email;
		System.out.println("Servlet 1 carregado! adminEmail= " + email);

	}
}
