package servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Index extends HttpServlet{
    
    public void doGET(HttpServletRequest req, HttpServletResponse res) {
        String html = "<!DOCTYPE html>\r\n" + //
                        "<html lang=\"pt-br\">\r\n" + //
                        "<head> \r\n" + //
                        " <title>Index</title>\r\n" + //
                        " <meta charset=\"UTF-8\" />\r\n" + //
                        "</head>\r\n" + //
                        "<body>\r\n" + //
                        " <h1>Index</h1>\r\n" + //
                        " <p>Página principal</p>\r\n" + //
                        " <nav>\r\n" + //
                        "  <a href=\"http://fatectq.edu.br\" target=\"_blank\"> Fatec </a>\r\n" + //
                        "  <a href=\"/curso\">Curso</a>\r\n" + //
                        " </nav>\r\n" + //
                        "\r\n" + //
                        "</body>\r\n" + //
                        "</html>";
            try {
                res.getWriter().println(html);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
    }
}
