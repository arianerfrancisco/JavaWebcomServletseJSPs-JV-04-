package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MensagemServlet
 */
@WebServlet({ "/MensagemServlet", "/Mensagem" }) // essa anotation dispensa a configuracao do arquivo web.xml em JavaWeb\WebContent\WEB-INF
//no video 4.2 é repassado o procedimento manual
// http://localhost:8080/JavaWeb

public class MensagemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = null;
		try {
			out = response.getWriter();
			out.print("Mensagem enviada pelo Servidor");
		} finally {
			if (out != null) {
				out.close();
			}
			
		}

	}

}
