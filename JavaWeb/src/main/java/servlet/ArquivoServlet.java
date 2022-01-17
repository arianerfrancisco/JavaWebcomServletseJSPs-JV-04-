package servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//http://localhost:8080/JavaWeb/Arquivo
@WebServlet({ "/ArquivoServlet", "/Arquivo" })
public class ArquivoServlet extends HttpServlet {
// enviar uma reposta binario ao cliente, como um arquivo.zip para download
	

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		OutputStream out = null;
		FileInputStream fis = null;
		

		try {
			out = response.getOutputStream();
			response.addHeader("Content-Disposition", "attachment; filename=arquivo.zip"); // sugestao de nome para o download filename=arquivo.zip
			response.setContentType("application/zip");
			fis = new FileInputStream("C:/arquivo.zip");

			byte[] buffer = new byte[1024];
			int b;

			while ((b = fis.read(buffer)) > -1) { // ira carregar somente o necessario no buffer
				out.write(buffer, 0, b);
			}

		} finally {
			if ((fis != null)) {
				fis.close();
			}
			if ((out != null)) {
				out.close();
			}

		}
	}

}
