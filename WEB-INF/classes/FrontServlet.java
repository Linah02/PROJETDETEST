package etu001982.framework;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
public class FrontServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("ato");
            try {
                PrintWriter out = response.getWriter();
                out.println("null");
            }catch(Exception e){
                e.printStackTrace();
            }
        PrintWriter out = response.getWriter();
        out.println("null");
        processRequest(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("null");
        processRequest(request, response);
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
    PrintWriter out = response.getWriter();
    out.println("null");
    String requestUrl = request.getRequestURL().toString();
       // String host = request.getHeader("Host");
       // PrintWriter out = response.getWriter();
      //  requestUrl = requestUrl.split("//")[1].replace(host, "");
    out.println(requestUrl);
    out.println("requestUrl");
    }
}
