package com.example.discosservletsbuena;

import com.example.discosservletsbuena.controlador.Disco;
import com.example.discosservletsbuena.controlador.GestorConsultas;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "listaGruposCatlogo", value = "/lista-grupos-catalogo")
public class ListaGruposCatalogo extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        GestorConsultas discos = new GestorConsultas();
        String mensaje = "Discos Alex Ursa";

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html>");
            out.println("<header>");
            out.println("</header>");
                out.println("<body>");
                    out.println("<div align=\"left\">");
                    out.println("<h3>" + mensaje + "</h3>");
                        for (String grupo : discos.listaAutores()) {
                            out.println("<ul>");
                                out.print("<li>" + grupo + "</li>");
                            out.println("</ul>");
                        }
                    out.println("<a href=\"../discosServletsBuena_war_exploded/\">Volver al Inicio</a>");
                    out.println("</div>");
                out.println("</body>");
        out.println("</html>");
    }

    public void destroy() {
    }
}