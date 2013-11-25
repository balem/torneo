/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.ucsa.entities.dao;

import java.util.List;
import py.edu.ucsa.entities.Torneo;

/**
 *
 * @author erodriguez
 */
public interface TorneoDao {
    public void addTorneo(Torneo torneo);
    public void deleteTorneo(int idTorneo);
    public void updateTorneo(Torneo torneo);
    public Torneo getTorneoById(int idTorneo);
    public List<Torneo> listTorneo();
}
