package com.example.discosservletsbuena;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "busquedaAutor", value = "/busqueda-autor")
public class busquedaAutor extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html>");
            out.println("<body>");

                out.println("<h1> Hola </h1>");

            out.println("</body>");
        out.println("</html>");
    }

    public void destroy() {
    }
}
