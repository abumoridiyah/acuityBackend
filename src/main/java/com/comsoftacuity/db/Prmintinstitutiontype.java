/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comsoftacuity.db;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author JIDEX
 */
@Entity
@Table(name = "prmintinstitutiontype")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Prmintinstitutiontype.findAll", query = "SELECT p FROM Prmintinstitutiontype p"),
    @NamedQuery(name = "Prmintinstitutiontype.findByInstitutiontypeid", query = "SELECT p FROM Prmintinstitutiontype p WHERE p.institutiontypeid = :institutiontypeid"),
    @NamedQuery(name = "Prmintinstitutiontype.findByDescription", query = "SELECT p FROM Prmintinstitutiontype p WHERE p.description = :description"),
    @NamedQuery(name = "Prmintinstitutiontype.findByDatcreated", query = "SELECT p FROM Prmintinstitutiontype p WHERE p.datcreated = :datcreated"),
    @NamedQuery(name = "Prmintinstitutiontype.findByActive", query = "SELECT p FROM Prmintinstitutiontype p WHERE p.active = :active")})
public class Prmintinstitutiontype implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "institutiontypeid")
    private Integer institutiontypeid;
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "datcreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datcreated;
    @Column(name = "active")
    private Short active;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "institutiontypeid")
    private List<Prmintinstitution> prmintinstitutionList;

    public Prmintinstitutiontype() {
    }

    public Prmintinstitutiontype(Integer institutiontypeid) {
        this.institutiontypeid = institutiontypeid;
    }

    public Prmintinstitutiontype(Integer institutiontypeid, Date datcreated) {
        this.institutiontypeid = institutiontypeid;
        this.datcreated = datcreated;
    }

    public Integer getInstitutiontypeid() {
        return institutiontypeid;
    }

    public void setInstitutiontypeid(Integer institutiontypeid) {
        this.institutiontypeid = institutiontypeid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDatcreated() {
        return datcreated;
    }

    public void setDatcreated(Date datcreated) {
        this.datcreated = datcreated;
    }

    public Short getActive() {
        return active;
    }

    public void setActive(Short active) {
        this.active = active;
    }

    @XmlTransient
    public List<Prmintinstitution> getPrmintinstitutionList() {
        return prmintinstitutionList;
    }

    public void setPrmintinstitutionList(List<Prmintinstitution> prmintinstitutionList) {
        this.prmintinstitutionList = prmintinstitutionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (institutiontypeid != null ? institutiontypeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prmintinstitutiontype)) {
            return false;
        }
        Prmintinstitutiontype other = (Prmintinstitutiontype) object;
        if ((this.institutiontypeid == null && other.institutiontypeid != null) || (this.institutiontypeid != null && !this.institutiontypeid.equals(other.institutiontypeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.comsoftacuity.db.Prmintinstitutiontype[ institutiontypeid=" + institutiontypeid + " ]";
    }
    
}
