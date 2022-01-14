package com.example.discosservletsbuena;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "compraUnDisco", value = "/compra-un-disco")
public class CompraDisco extends HttpServlet {
    private String mensaje;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        mensaje = "Formulario Para Comprar un Disco";

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html>");
            out.println("<header>");
            out.println("</header>");
            out.println("<body>");
                out.println("<div align=\"left\">");
                    out.println("<h3>" + mensaje + "</h3><br>");
                    out.println("<form action=\"\" RequestParamExample\" method=\"POST\">");
                    out.println("Escriba el código del comic:");
                    out.println("<input type=text size=20 name=firstname>");
                    out.println("<input type=submit value=\"COMPRAR\" onclick=\"\">");
                    out.println("<br>");
                    out.println("<a href=\"../discosServletsBuena_war_exploded/\">Volver al Inicio</a>");
                out.println("</div>");
            out.println("</body>");
        out.println("</html>");
    }

    public void destroy() {
    }
}