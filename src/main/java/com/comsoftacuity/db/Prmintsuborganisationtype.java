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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "prmintsuborganisationtype")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Prmintsuborganisationtype.findAll", query = "SELECT p FROM Prmintsuborganisationtype p"),
    @NamedQuery(name = "Prmintsuborganisationtype.findBySuborgtypeid", query = "SELECT p FROM Prmintsuborganisationtype p WHERE p.suborgtypeid = :suborgtypeid"),
    @NamedQuery(name = "Prmintsuborganisationtype.findBySuborganisationtype", query = "SELECT p FROM Prmintsuborganisationtype p WHERE p.suborganisationtype = :suborganisationtype"),
    @NamedQuery(name = "Prmintsuborganisationtype.findByDatecreated", query = "SELECT p FROM Prmintsuborganisationtype p WHERE p.datecreated = :datecreated"),
    @NamedQuery(name = "Prmintsuborganisationtype.findByActive", query = "SELECT p FROM Prmintsuborganisationtype p WHERE p.active = :active")})
public class Prmintsuborganisationtype implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "suborgtypeid")
    private Integer suborgtypeid;
    @Column(name = "suborganisationtype")
    private String suborganisationtype;
    @Basic(optional = false)
    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreated;
    @Column(name = "active")
    private Short active;
    @JoinColumn(name = "institutionid", referencedColumnName = "institutionid")
    @ManyToOne
    private Prmintinstitution institutionid;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "suborganisationtypeid")
    private List<Prmintsuborganisation> prmintsuborganisationList;

    public Prmintsuborganisationtype() {
    }

    public Prmintsuborganisationtype(Integer suborgtypeid) {
        this.suborgtypeid = suborgtypeid;
    }

    public Prmintsuborganisationtype(Integer suborgtypeid, Date datecreated) {
        this.suborgtypeid = suborgtypeid;
        this.datecreated = datecreated;
    }

    public Integer getSuborgtypeid() {
        return suborgtypeid;
    }

    public void setSuborgtypeid(Integer suborgtypeid) {
        this.suborgtypeid = suborgtypeid;
    }

    public String getSuborganisationtype() {
        return suborganisationtype;
    }

    public void setSuborganisationtype(String suborganisationtype) {
        this.suborganisationtype = suborganisationtype;
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

    public Prmintinstitution getInstitutionid() {
        return institutionid;
    }

    public void setInstitutionid(Prmintinstitution institutionid) {
        this.institutionid = institutionid;
    }

    @XmlTransient
    public List<Prmintsuborganisation> getPrmintsuborganisationList() {
        return prmintsuborganisationList;
    }

    public void setPrmintsuborganisationList(List<Prmintsuborganisation> prmintsuborganisationList) {
        this.prmintsuborganisationList = prmintsuborganisationList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (suborgtypeid != null ? suborgtypeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prmintsuborganisationtype)) {
            return false;
        }
        Prmintsuborganisationtype other = (Prmintsuborganisationtype) object;
        if ((this.suborgtypeid == null && other.suborgtypeid != null) || (this.suborgtypeid != null && !this.suborgtypeid.equals(other.suborgtypeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.comsoftacuity.db.Prmintsuborganisationtype[ suborgtypeid=" + suborgtypeid + " ]";
    }
    
}
