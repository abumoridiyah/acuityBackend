/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comsoftacuity.db;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JIDEX
 */
@Entity
@Table(name = "lstmeasureunit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lstmeasureunit.findAll", query = "SELECT l FROM Lstmeasureunit l"),
    @NamedQuery(name = "Lstmeasureunit.findByMesureunitid", query = "SELECT l FROM Lstmeasureunit l WHERE l.mesureunitid = :mesureunitid"),
    @NamedQuery(name = "Lstmeasureunit.findByMeasureunit", query = "SELECT l FROM Lstmeasureunit l WHERE l.measureunit = :measureunit"),
    @NamedQuery(name = "Lstmeasureunit.findByDatecreated", query = "SELECT l FROM Lstmeasureunit l WHERE l.datecreated = :datecreated"),
    @NamedQuery(name = "Lstmeasureunit.findByActive", query = "SELECT l FROM Lstmeasureunit l WHERE l.active = :active")})
public class Lstmeasureunit implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "mesureunitid")
    private Integer mesureunitid;
    @Column(name = "measureunit")
    private String measureunit;
    @Basic(optional = false)
    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreated;
    @Column(name = "active")
    private Short active;
    @JoinColumn(name = "lstmainid", referencedColumnName = "lstmainid")
    @ManyToOne
    private Lstmain lstmainid;

    public Lstmeasureunit() {
    }

    public Lstmeasureunit(Integer mesureunitid) {
        this.mesureunitid = mesureunitid;
    }

    public Lstmeasureunit(Integer mesureunitid, Date datecreated) {
        this.mesureunitid = mesureunitid;
        this.datecreated = datecreated;
    }

    public Integer getMesureunitid() {
        return mesureunitid;
    }

    public void setMesureunitid(Integer mesureunitid) {
        this.mesureunitid = mesureunitid;
    }

    public String getMeasureunit() {
        return measureunit;
    }

    public void setMeasureunit(String measureunit) {
        this.measureunit = measureunit;
    }

    public Date getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }

    public Short getActive() {
        return active;
    }

    public void setActive(Short active) {
        this.active = active;
    }

    public Lstmain getLstmainid() {
        return lstmainid;
    }

    public void setLstmainid(Lstmain lstmainid) {
        this.lstmainid = lstmainid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mesureunitid != null ? mesureunitid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lstmeasureunit)) {
            return false;
        }
        Lstmeasureunit other = (Lstmeasureunit) object;
        if ((this.mesureunitid == null && other.mesureunitid != null) || (this.mesureunitid != null && !this.mesureunitid.equals(other.mesureunitid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.comsoftacuity.db.Lstmeasureunit[ mesureunitid=" + mesureunitid + " ]";
    }
    
}
