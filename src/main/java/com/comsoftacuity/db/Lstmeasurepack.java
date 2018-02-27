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
@Table(name = "lstmeasurepack")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lstmeasurepack.findAll", query = "SELECT l FROM Lstmeasurepack l"),
    @NamedQuery(name = "Lstmeasurepack.findByMeasureid", query = "SELECT l FROM Lstmeasurepack l WHERE l.measureid = :measureid"),
    @NamedQuery(name = "Lstmeasurepack.findByMeasurepack", query = "SELECT l FROM Lstmeasurepack l WHERE l.measurepack = :measurepack"),
    @NamedQuery(name = "Lstmeasurepack.findByDatecreated", query = "SELECT l FROM Lstmeasurepack l WHERE l.datecreated = :datecreated"),
    @NamedQuery(name = "Lstmeasurepack.findByActive", query = "SELECT l FROM Lstmeasurepack l WHERE l.active = :active")})
public class Lstmeasurepack implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "measureid")
    private Integer measureid;
    @Basic(optional = false)
    @Column(name = "measurepack")
    private String measurepack;
    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreated;
    @Column(name = "active")
    private Short active;
    @JoinColumn(name = "lstmainid", referencedColumnName = "lstmainid")
    @ManyToOne
    private Lstmain lstmainid;

    public Lstmeasurepack() {
    }

    public Lstmeasurepack(Integer measureid) {
        this.measureid = measureid;
    }

    public Lstmeasurepack(Integer measureid, String measurepack) {
        this.measureid = measureid;
        this.measurepack = measurepack;
    }

    public Integer getMeasureid() {
        return measureid;
    }

    public void setMeasureid(Integer measureid) {
        this.measureid = measureid;
    }

    public String getMeasurepack() {
        return measurepack;
    }

    public void setMeasurepack(String measurepack) {
        this.measurepack = measurepack;
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
        hash += (measureid != null ? measureid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lstmeasurepack)) {
            return false;
        }
        Lstmeasurepack other = (Lstmeasurepack) object;
        if ((this.measureid == null && other.measureid != null) || (this.measureid != null && !this.measureid.equals(other.measureid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.comsoftacuity.db.Lstmeasurepack[ measureid=" + measureid + " ]";
    }
    
}
