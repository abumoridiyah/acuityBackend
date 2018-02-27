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
@Table(name = "prmintsuborganisation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Prmintsuborganisation.findAll", query = "SELECT p FROM Prmintsuborganisation p"),
    @NamedQuery(name = "Prmintsuborganisation.findBySuborgid", query = "SELECT p FROM Prmintsuborganisation p WHERE p.suborgid = :suborgid"),
    @NamedQuery(name = "Prmintsuborganisation.findBySuborganisationname", query = "SELECT p FROM Prmintsuborganisation p WHERE p.suborganisationname = :suborganisationname"),
    @NamedQuery(name = "Prmintsuborganisation.findByParentid", query = "SELECT p FROM Prmintsuborganisation p WHERE p.parentid = :parentid"),
    @NamedQuery(name = "Prmintsuborganisation.findByDatecreated", query = "SELECT p FROM Prmintsuborganisation p WHERE p.datecreated = :datecreated"),
    @NamedQuery(name = "Prmintsuborganisation.findByActive", query = "SELECT p FROM Prmintsuborganisation p WHERE p.active = :active")})
public class Prmintsuborganisation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "suborgid")
    private Integer suborgid;
    @Column(name = "suborganisationname")
    private String suborganisationname;
    @Column(name = "parentid")
    private Integer parentid;
    @Basic(optional = false)
    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreated;
    @Column(name = "active")
    private Short active;
    @JoinColumn(name = "suborganisationtypeid", referencedColumnName = "suborgtypeid")
    @ManyToOne
    private Prmintsuborganisationtype suborganisationtypeid;

    public Prmintsuborganisation() {
    }

    public Prmintsuborganisation(Integer suborgid) {
        this.suborgid = suborgid;
    }

    public Prmintsuborganisation(Integer suborgid, Date datecreated) {
        this.suborgid = suborgid;
        this.datecreated = datecreated;
    }

    public Integer getSuborgid() {
        return suborgid;
    }

    public void setSuborgid(Integer suborgid) {
        this.suborgid = suborgid;
    }

    public String getSuborganisationname() {
        return suborganisationname;
    }

    public void setSuborganisationname(String suborganisationname) {
        this.suborganisationname = suborganisationname;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
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

    public Prmintsuborganisationtype getSuborganisationtypeid() {
        return suborganisationtypeid;
    }

    public void setSuborganisationtypeid(Prmintsuborganisationtype suborganisationtypeid) {
        this.suborganisationtypeid = suborganisationtypeid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (suborgid != null ? suborgid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prmintsuborganisation)) {
            return false;
        }
        Prmintsuborganisation other = (Prmintsuborganisation) object;
        if ((this.suborgid == null && other.suborgid != null) || (this.suborgid != null && !this.suborgid.equals(other.suborgid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.comsoftacuity.db.Prmintsuborganisation[ suborgid=" + suborgid + " ]";
    }
    
}
