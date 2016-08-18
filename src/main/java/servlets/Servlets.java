package servlets;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class Servlets extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        super.doPost(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        out.println("<!DOCTYPE html>\n" +
//                "<html>\n" +
//                " <head>\n" +
//                "  <meta charset=\"utf-8\">\n" +
//                "  <title>Формы</title>\n" +
//                " </head>\n" +
//                " <body>\n" +
//                "  <form action=\"handler.php\">\n" +
//                "   <p><input name=\"a\"> <input type=\"submit\"></p>\n" +
//                "  </form>\n" +
//                " </body>\n" +
//                "</html>");
//
//    }
        String varTextA = "Hello World!";
        request.setAttribute("textA", varTextA);
        String varTextB = "It JSP.";
        request.setAttribute("textB", varTextB);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
        dispatcher.forward(request, response);
    }
}
