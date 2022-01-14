package com.example.discosservletsbuena;

import com.example.discosservletsbuena.controlador.GestorConsultas;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "buscaDiscosPorGrupo", value = "/busca-discos-por-grupo")
public class BuscaDiscosPorGrupo extends HttpServlet {
    private String mensaje = "Formulario Para Buscar Autor";
    private GestorConsultas gestor;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html>");
            out.println("<header>");
            out.println("</header>");
            out.println("<body>");
                out.println("<div align=\"left\">");
                    out.println("<h3>" + mensaje + "</h3><br>");
                        out.println("<form action=\"\" RequestParamExample\" method=\"POST\">");
                        out.println("Escriba el nombre del autor:");
                        out.println("<input type=text size=20 name=firstname>");
                        out.println("<input type=submit value=\"BUSCAR\" onclick=\"\">");
                        out.println("<br>");
                        out.println("<a href=\"../discosServletsBuena_war_exploded/\">Volver al Inicio</a>");
                out.println("</div>");
            out.println("</body>");
        out.println("</html>");
    }

    public void destroy() {
    }
}
