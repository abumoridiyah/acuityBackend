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
@Table(name = "appmodules")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Appmodules.findAll", query = "SELECT a FROM Appmodules a"),
    @NamedQuery(name = "Appmodules.findByModuleid", query = "SELECT a FROM Appmodules a WHERE a.moduleid = :moduleid"),
    @NamedQuery(name = "Appmodules.findByModuletype", query = "SELECT a FROM Appmodules a WHERE a.moduletype = :moduletype"),
    @NamedQuery(name = "Appmodules.findByStatuscode", query = "SELECT a FROM Appmodules a WHERE a.statuscode = :statuscode"),
    @NamedQuery(name = "Appmodules.findByDatecreated", query = "SELECT a FROM Appmodules a WHERE a.datecreated = :datecreated"),
    @NamedQuery(name = "Appmodules.findByEnteredbyid", query = "SELECT a FROM Appmodules a WHERE a.enteredbyid = :enteredbyid"),
    @NamedQuery(name = "Appmodules.findByActive", query = "SELECT a FROM Appmodules a WHERE a.active = :active")})
public class Appmodules implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "moduleid")
    private Integer moduleid;
    @Column(name = "moduletype")
    private String moduletype;
    @Column(name = "statuscode")
    private String statuscode;
    @Basic(optional = false)
    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreated;
    @Column(name = "enteredbyid")
    private Integer enteredbyid;
    @Column(name = "active")
    private Short active;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "moduleid")
    private List<Userpermission> userpermissionList;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "moduleId")
    private List<Appapprules> appapprulesList;
    @JoinColumn(name = "institutionid", referencedColumnName = "institutionid")
    @ManyToOne
    private Prmintinstitution institutionid;

    public Appmodules() {
    }

    public Appmodules(Integer moduleid) {
        this.moduleid = moduleid;
    }

    public Appmodules(Integer moduleid, Date datecreated) {
        this.moduleid = moduleid;
        this.datecreated = datecreated;
    }

    public Integer getModuleid() {
        return moduleid;
    }

    public void setModuleid(Integer moduleid) {
        this.moduleid = moduleid;
    }

    public String getModuletype() {
        return moduletype;
    }

    public void setModuletype(String moduletype) {
        this.moduletype = moduletype;
    }

    public String getStatuscode() {
        return statuscode;
    }

    public void setStatuscode(String statuscode) {
        this.statuscode = statuscode;
    }

    public Date getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }

    public Integer getEnteredbyid() {
        return enteredbyid;
    }

    public void setEnteredbyid(Integer enteredbyid) {
        this.enteredbyid = enteredbyid;
    }

    public Short getActive() {
        return active;
    }

    public void setActive(Short active) {
        this.active = active;
    }

    @XmlTransient
    public List<Userpermission> getUserpermissionList() {
        return userpermissionList;
    }

    public void setUserpermissionList(List<Userpermission> userpermissionList) {
        this.userpermissionList = userpermissionList;
    }

    @XmlTransient
    public List<Appapprules> getAppapprulesList() {
        return appapprulesList;
    }

    public void setAppapprulesList(List<Appapprules> appapprulesList) {
        this.appapprulesList = appapprulesList;
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
        hash += (moduleid != null ? moduleid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Appmodules)) {
            return false;
        }
        Appmodules other = (Appmodules) object;
        if ((this.moduleid == null && other.moduleid != null) || (this.moduleid != null && !this.moduleid.equals(other.moduleid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.comsoftacuity.db.Appmodules[ moduleid=" + moduleid + " ]";
    }
    
}
