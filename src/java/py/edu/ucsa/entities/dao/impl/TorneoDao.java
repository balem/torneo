/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.ucsa.entities.dao.impl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import py.edu.ucsa.entities.Torneo;
import py.edu.ucsa.entities.dao.ITorneo;

/**
 *
 * @author erodriguez
 */
public class TorneoDao implements ITorneo {
    //Unidad de persistencia, se obtiene del tag persistence-unit en el xml persistence
    String pu = "TorneoPU"; 
    EntityManagerFactory factory = Persistence.createEntityManagerFactory(pu, System.getProperties());
    EntityManager em = factory.createEntityManager();
    
    @Override
    public void addTorneo(Torneo torneo) {
        em.getTransaction().begin();
        em.persist(torneo);
        em.flush();
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void deleteTorneo(int idTorneo) {
        em.getTransaction().begin();
        Torneo t = em.find(Torneo.class, idTorneo);
        em.remove(t);
        em.close();
    }

    @Override
    public void updateTorneo(Torneo torneo) {
        em.getTransaction().begin();
        em.merge(torneo);
        em.close();
    }

    @Override
    public Torneo getTorneoById(int idTorneo) {
        em.getTransaction().begin();
        return  em.find(Torneo.class, idTorneo);
    }

    @Override
    public List<Torneo> listTorneo() {
        em.getTransaction().begin();
        return em.createQuery("select t from Torneo t").getResultList();
    }
    
}
