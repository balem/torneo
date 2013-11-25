/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.ucsa.servlets;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import py.edu.ucsa.entities.Torneo;
import py.edu.ucsa.entities.dao.DaoFactory;

/**
 *
 * @author erodriguez
 */
@WebServlet(name = "AbmTorneo", urlPatterns = {"/AbmTorneo"})
public class AbmTorneo extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession(false);
        if(session != null){
            if (request.getParameter("accion").equals("eliminar")) {
                DaoFactory.getTorneoDao().deleteTorneo(Integer.parseInt(request.getParameter("id")));
                List<Torneo> lista = DaoFactory.getTorneoDao().listTorneo();
                session.setAttribute("torneos", lista);
                request.getRequestDispatcher("gtorneo.jsp");
            }else if(request.getParameter("accion").equals("agregar")){
                Torneo torneo = new Torneo();
                torneo.setNombre(request.getParameter("nombre").toString());
                torneo.setNroEquipos(Integer.parseInt(request.getParameter("cant-equipos")));
                torneo.setAnho(Integer.parseInt(request.getParameter("anho")));
                torneo.setFehcaInicio(new Date (request.getParameter("inicio").toString()));
                torneo.setFechaFin(new Date (request.getParameter("fin").toString()));
                DaoFactory.getTorneoDao().addTorneo(torneo);
                List<Torneo> lista = DaoFactory.getTorneoDao().listTorneo();
                session.setAttribute("torneos", lista);
                request.getRequestDispatcher("gtorneo.jsp");
            }else if(request.getParameter("accion").equals("actualizar")){
                Torneo torneo = new Torneo();
                torneo.setNombre(request.getParameter("nombre").toString());
                torneo.setNroEquipos(Integer.parseInt(request.getParameter("cant-equipos")));
                torneo.setAnho(Integer.parseInt(request.getParameter("anho")));
                torneo.setFehcaInicio(new Date (request.getParameter("inicio").toString()));
                torneo.setFechaFin(new Date (request.getParameter("fin").toString()));
                DaoFactory.getTorneoDao().updateTorneo(torneo);
                List<Torneo> lista = DaoFactory.getTorneoDao().listTorneo();
                session.setAttribute("torneos", lista);
                request.getRequestDispatcher("gtorneo.jsp");
            }else if(request.getParameter("accion").equals("borrar")){
                DaoFactory.getTorneoDao().deleteTorneo(Integer.parseInt(request.getParameter("id").toString()));
                List<Torneo> lista = DaoFactory.getTorneoDao().listTorneo();
                session.setAttribute("torneos", lista);
                request.getRequestDispatcher("gtorneo.jsp");
            }
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
