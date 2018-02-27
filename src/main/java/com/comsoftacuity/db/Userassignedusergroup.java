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
@Table(name = "userassignedusergroup")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Userassignedusergroup.findAll", query = "SELECT u FROM Userassignedusergroup u"),
    @NamedQuery(name = "Userassignedusergroup.findByAsignuserid", query = "SELECT u FROM Userassignedusergroup u WHERE u.asignuserid = :asignuserid"),
    @NamedQuery(name = "Userassignedusergroup.findByDatecreated", query = "SELECT u FROM Userassignedusergroup u WHERE u.datecreated = :datecreated"),
    @NamedQuery(name = "Userassignedusergroup.findByEnteredbyId", query = "SELECT u FROM Userassignedusergroup u WHERE u.enteredbyId = :enteredbyId"),
    @NamedQuery(name = "Userassignedusergroup.findByActive", query = "SELECT u FROM Userassignedusergroup u WHERE u.active = :active")})
public class Userassignedusergroup implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "asignuserid")
    private Integer asignuserid;
    @Basic(optional = false)
    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreated;
    @Column(name = "enteredbyId")
    private Integer enteredbyId;
    @Column(name = "active")
    private Short active;
    @JoinColumn(name = "groupid", referencedColumnName = "usergrpid")
    @ManyToOne
    private Userusergroup groupid;
    @JoinColumn(name = "prmissionId", referencedColumnName = "permissionid")
    @ManyToOne
    private Userpermission prmissionId;
    @JoinColumn(name = "userid", referencedColumnName = "userid")
    @ManyToOne
    private Userusersinfo userid;

    public Userassignedusergroup() {
    }

    public Userassignedusergroup(Integer asignuserid) {
        this.asignuserid = asignuserid;
    }

    public Userassignedusergroup(Integer asignuserid, Date datecreated) {
        this.asignuserid = asignuserid;
        this.datecreated = datecreated;
    }

    public Integer getAsignuserid() {
        return asignuserid;
    }

    public void setAsignuserid(Integer asignuserid) {
        this.asignuserid = asignuserid;
    }

    public Date getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }

    public Integer getEnteredbyId() {
        return enteredbyId;
    }

    public void setEnteredbyId(Integer enteredbyId) {
        this.enteredbyId = enteredbyId;
    }

    public Short getActive() {
        return active;
    }

    public void setActive(Short active) {
        this.active = active;
    }

    public Userusergroup getGroupid() {
        return groupid;
    }

    public void setGroupid(Userusergroup groupid) {
        this.groupid = groupid;
    }

    public Userpermission getPrmissionId() {
        return prmissionId;
    }

    public void setPrmissionId(Userpermission prmissionId) {
        this.prmissionId = prmissionId;
    }

    public Userusersinfo getUserid() {
        return userid;
    }

    public void setUserid(Userusersinfo userid) {
        this.userid = userid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (asignuserid != null ? asignuserid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Userassignedusergroup)) {
            return false;
        }
        Userassignedusergroup other = (Userassignedusergroup) object;
        if ((this.asignuserid == null && other.asignuserid != null) || (this.asignuserid != null && !this.asignuserid.equals(other.asignuserid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.comsoftacuity.db.Userassignedusergroup[ asignuserid=" + asignuserid + " ]";
    }
    
}
