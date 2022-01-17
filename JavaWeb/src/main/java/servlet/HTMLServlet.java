package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/HTMLServlet", "/HTML" })
// http://localhost:8080/JavaWeb/HTML
public class HTMLServlet extends HttpServlet {
// envia uma resposta html ao cliente
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = null;
		
		try {
			out = response.getWriter();
			
			response.setContentType("text/html");
			out.print("<HTML>");
			out.print("<HEAD>");
			out.print("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">");
			out.print("</HEAD>");
			out.print("<BODY>");
			out.print("<H1> Título da Página </H1>");
			out.print("<STRONG> Esse é um texto em negrito </STRONG>");
			out.print("</BODY></HTML>");
			
		} finally {
			if (out != null) {
				out.close();
			}
		}
	}

}
