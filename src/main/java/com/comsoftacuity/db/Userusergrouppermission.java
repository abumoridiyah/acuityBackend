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
@Table(name = "userusergrouppermission")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Userusergrouppermission.findAll", query = "SELECT u FROM Userusergrouppermission u"),
    @NamedQuery(name = "Userusergrouppermission.findByGrouppermid", query = "SELECT u FROM Userusergrouppermission u WHERE u.grouppermid = :grouppermid"),
    @NamedQuery(name = "Userusergrouppermission.findByStatus", query = "SELECT u FROM Userusergrouppermission u WHERE u.status = :status"),
    @NamedQuery(name = "Userusergrouppermission.findByDatecreated", query = "SELECT u FROM Userusergrouppermission u WHERE u.datecreated = :datecreated"),
    @NamedQuery(name = "Userusergrouppermission.findByEnteredbyid", query = "SELECT u FROM Userusergrouppermission u WHERE u.enteredbyid = :enteredbyid"),
    @NamedQuery(name = "Userusergrouppermission.findByActive", query = "SELECT u FROM Userusergrouppermission u WHERE u.active = :active")})
public class Userusergrouppermission implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "grouppermid")
    private Integer grouppermid;
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
    @JoinColumn(name = "usergrpid", referencedColumnName = "usergrpid")
    @ManyToOne
    private Userusergroup usergrpid;
    @JoinColumn(name = "permissionId", referencedColumnName = "permissionid")
    @ManyToOne
    private Userpermission permissionId;

    public Userusergrouppermission() {
    }

    public Userusergrouppermission(Integer grouppermid) {
        this.grouppermid = grouppermid;
    }

    public Userusergrouppermission(Integer grouppermid, Date datecreated) {
        this.grouppermid = grouppermid;
        this.datecreated = datecreated;
    }

    public Integer getGrouppermid() {
        return grouppermid;
    }

    public void setGrouppermid(Integer grouppermid) {
        this.grouppermid = grouppermid;
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

    public Userusergroup getUsergrpid() {
        return usergrpid;
    }

    public void setUsergrpid(Userusergroup usergrpid) {
        this.usergrpid = usergrpid;
    }

    public Userpermission getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Userpermission permissionId) {
        this.permissionId = permissionId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (grouppermid != null ? grouppermid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Userusergrouppermission)) {
            return false;
        }
        Userusergrouppermission other = (Userusergrouppermission) object;
        if ((this.grouppermid == null && other.grouppermid != null) || (this.grouppermid != null && !this.grouppermid.equals(other.grouppermid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.comsoftacuity.db.Userusergrouppermission[ grouppermid=" + grouppermid + " ]";
    }
    
}
