/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.ucsa.entities.dao;

import py.edu.ucsa.entities.dao.impl.TorneoDaoImpl;

/**
 *
 * @author erodriguez
 */

public class DaoFactory {
    public static TorneoDao getTorneoDao(){
        return new TorneoDaoImpl();
    }
}
