<%-- 
    Document   : index
    Created on : 22-nov-2013, 17:52:44
    Author     : erodriguez
--%>

<%@page import="py.edu.ucsa.entities.*" %>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<% List<Torneo> lista =  (List<Torneo>) request.getAttribute("torneo");%>
<% Iterator<Torneo> it = lista.iterator(); %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de torneos</h1>
        <table>
            <thead>
                <tr>
                    <td>id</td>
                    <td>Nombre</td>
                    <td>cant. equipo</td>
                    <td>fecha inicio</td>
                    <td>fecha fin</td>
                </tr>
            </thead>
        
        <%
            while(it.hasNext()){
                Torneo t = it.next();        
          %>
          <tbody>
              <tr>
                  <td><%= t.getId() %></td>
                  <td><%= t.getNombre() %></td>
                  <td><%= t.getNroEquipos() %></td>
                  <td><%= t.getFehcaInicio() %></td>
                  <td><%= t.getFechaFin() %></td>
              </tr>
              <%
                }
              %>                
          </tbody>
        </table>
    </body>
</html>
