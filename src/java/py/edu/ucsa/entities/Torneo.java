/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.ucsa.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author erodriguez
 */
@Entity
public class Torneo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="anho")
    private int anho;
    @Column(name="nroequipos")
    private int nroEquipos;
    @Column(name="fechaini")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fehcaInicio;
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="fechafin")
    private Date fechaFin;
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Date getFehcaInicio() {
        return fehcaInicio;
    }

    public void setFehcaInicio(Date fehcaInicio) {
        this.fehcaInicio = fehcaInicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroEquipos() {
        return nroEquipos;
    }

    public void setNroEquipos(int nroEquipos) {
        this.nroEquipos = nroEquipos;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Torneo)) {
            return false;
        }
        Torneo other = (Torneo) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "py.edu.ucsa.entities.Torneos[ id=" + id + " ]";
    }
    
}
