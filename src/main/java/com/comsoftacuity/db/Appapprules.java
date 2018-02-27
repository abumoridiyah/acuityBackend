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
@Table(name = "appapprules")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Appapprules.findAll", query = "SELECT a FROM Appapprules a"),
    @NamedQuery(name = "Appapprules.findByAppruleid", query = "SELECT a FROM Appapprules a WHERE a.appruleid = :appruleid"),
    @NamedQuery(name = "Appapprules.findByInstitutioncode", query = "SELECT a FROM Appapprules a WHERE a.institutioncode = :institutioncode"),
    @NamedQuery(name = "Appapprules.findByRule", query = "SELECT a FROM Appapprules a WHERE a.rule = :rule"),
    @NamedQuery(name = "Appapprules.findByStatus", query = "SELECT a FROM Appapprules a WHERE a.status = :status"),
    @NamedQuery(name = "Appapprules.findByDatecreated", query = "SELECT a FROM Appapprules a WHERE a.datecreated = :datecreated"),
    @NamedQuery(name = "Appapprules.findByEnteredbyid", query = "SELECT a FROM Appapprules a WHERE a.enteredbyid = :enteredbyid"),
    @NamedQuery(name = "Appapprules.findByActive", query = "SELECT a FROM Appapprules a WHERE a.active = :active")})
public class Appapprules implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "appruleid")
    private Integer appruleid;
    @Column(name = "institutioncode")
    private String institutioncode;
    @Column(name = "rule")
    private String rule;
    @Column(name = "status")
    private Boolean status;
    @Basic(optional = false)
    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreated;
    @Column(name = "enteredbyid")
    private Integer enteredbyid;
    @Column(name = "active")
    private Short active;
    @JoinColumn(name = "moduleId", referencedColumnName = "moduleid")
    @ManyToOne
    private Appmodules moduleId;

    public Appapprules() {
    }

    public Appapprules(Integer appruleid) {
        this.appruleid = appruleid;
    }

    public Appapprules(Integer appruleid, Date datecreated) {
        this.appruleid = appruleid;
        this.datecreated = datecreated;
    }

    public Integer getAppruleid() {
        return appruleid;
    }

    public void setAppruleid(Integer appruleid) {
        this.appruleid = appruleid;
    }

    public String getInstitutioncode() {
        return institutioncode;
    }

    public void setInstitutioncode(String institutioncode) {
        this.institutioncode = institutioncode;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
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

    public Appmodules getModuleId() {
        return moduleId;
    }

    public void setModuleId(Appmodules moduleId) {
        this.moduleId = moduleId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (appruleid != null ? appruleid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Appapprules)) {
            return false;
        }
        Appapprules other = (Appapprules) object;
        if ((this.appruleid == null && other.appruleid != null) || (this.appruleid != null && !this.appruleid.equals(other.appruleid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.comsoftacuity.db.Appapprules[ appruleid=" + appruleid + " ]";
    }
    
}
