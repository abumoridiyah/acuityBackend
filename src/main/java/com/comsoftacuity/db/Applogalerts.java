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
@Table(name = "applogalerts")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Applogalerts.findAll", query = "SELECT a FROM Applogalerts a"),
    @NamedQuery(name = "Applogalerts.findByLogalerid", query = "SELECT a FROM Applogalerts a WHERE a.logalerid = :logalerid"),
    @NamedQuery(name = "Applogalerts.findByStaffid", query = "SELECT a FROM Applogalerts a WHERE a.staffid = :staffid"),
    @NamedQuery(name = "Applogalerts.findByMobileno", query = "SELECT a FROM Applogalerts a WHERE a.mobileno = :mobileno"),
    @NamedQuery(name = "Applogalerts.findByEmail", query = "SELECT a FROM Applogalerts a WHERE a.email = :email"),
    @NamedQuery(name = "Applogalerts.findByLogtypeId", query = "SELECT a FROM Applogalerts a WHERE a.logtypeId = :logtypeId"),
    @NamedQuery(name = "Applogalerts.findByDatecreated", query = "SELECT a FROM Applogalerts a WHERE a.datecreated = :datecreated"),
    @NamedQuery(name = "Applogalerts.findByEnteredbyid", query = "SELECT a FROM Applogalerts a WHERE a.enteredbyid = :enteredbyid"),
    @NamedQuery(name = "Applogalerts.findByActive", query = "SELECT a FROM Applogalerts a WHERE a.active = :active")})
public class Applogalerts implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "logalerid")
    private Integer logalerid;
    @Column(name = "staffid")
    private Integer staffid;
    @Column(name = "mobileno")
    private String mobileno;
    @Column(name = "email")
    private String email;
    @Column(name = "logtypeId")
    private Integer logtypeId;
    @Basic(optional = false)
    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreated;
    @Column(name = "enteredbyid")
    private Short enteredbyid;
    @Column(name = "active")
    private Short active;
    @JoinColumn(name = "institutionid", referencedColumnName = "institutionid")
    @ManyToOne
    private Prmintinstitution institutionid;

    public Applogalerts() {
    }

    public Applogalerts(Integer logalerid) {
        this.logalerid = logalerid;
    }

    public Applogalerts(Integer logalerid, Date datecreated) {
        this.logalerid = logalerid;
        this.datecreated = datecreated;
    }

    public Integer getLogalerid() {
        return logalerid;
    }

    public void setLogalerid(Integer logalerid) {
        this.logalerid = logalerid;
    }

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getLogtypeId() {
        return logtypeId;
    }

    public void setLogtypeId(Integer logtypeId) {
        this.logtypeId = logtypeId;
    }

    public Date getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }

    public Short getEnteredbyid() {
        return enteredbyid;
    }

    public void setEnteredbyid(Short enteredbyid) {
        this.enteredbyid = enteredbyid;
    }

    public Short getActive() {
        return active;
    }

    public void setActive(Short active) {
        this.active = active;
    }

    public Prmintinstitution getInstitutionid() {
        return institutionid;
    }

    public void setInstitutionid(Prmintinstitution institutionid) {
        this.institutionid = institutionid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (logalerid != null ? logalerid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Applogalerts)) {
            return false;
        }
        Applogalerts other = (Applogalerts) object;
        if ((this.logalerid == null && other.logalerid != null) || (this.logalerid != null && !this.logalerid.equals(other.logalerid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.comsoftacuity.db.Applogalerts[ logalerid=" + logalerid + " ]";
    }
    
}
