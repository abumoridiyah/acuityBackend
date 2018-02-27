/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comsoftacuity.db;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author JIDEX
 */
@Entity
@Table(name = "userpermission")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Userpermission.findAll", query = "SELECT u FROM Userpermission u"),
    @NamedQuery(name = "Userpermission.findByPermissionid", query = "SELECT u FROM Userpermission u WHERE u.permissionid = :permissionid"),
    @NamedQuery(name = "Userpermission.findByPermission", query = "SELECT u FROM Userpermission u WHERE u.permission = :permission"),
    @NamedQuery(name = "Userpermission.findByDescription", query = "SELECT u FROM Userpermission u WHERE u.description = :description"),
    @NamedQuery(name = "Userpermission.findByEnteredbyid", query = "SELECT u FROM Userpermission u WHERE u.enteredbyid = :enteredbyid"),
    @NamedQuery(name = "Userpermission.findByActive", query = "SELECT u FROM Userpermission u WHERE u.active = :active"),
    @NamedQuery(name = "Userpermission.findByLstmainid", query = "SELECT u FROM Userpermission u WHERE u.lstmainid = :lstmainid")})
public class Userpermission implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "permissionid")
    private Integer permissionid;
    @Column(name = "permission")
    private String permission;
    @Column(name = "description")
    private String description;
    @Column(name = "enteredbyid")
    private Integer enteredbyid;
    @Column(name = "active")
    private Short active;
    @Column(name = "lstmainid")
    private Integer lstmainid;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "prmissionId")
    private List<Userassignedusergroup> userassignedusergroupList;
    @JoinColumn(name = "moduleid", referencedColumnName = "moduleid")
    @ManyToOne
    private Appmodules moduleid;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "permissionId")
    private List<Userusergrouppermission> userusergrouppermissionList;

    public Userpermission() {
    }

    public Userpermission(Integer permissionid) {
        this.permissionid = permissionid;
    }

    public Integer getPermissionid() {
        return permissionid;
    }

    public void setPermissionid(Integer permissionid) {
        this.permissionid = permissionid;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Integer getLstmainid() {
        return lstmainid;
    }

    public void setLstmainid(Integer lstmainid) {
        this.lstmainid = lstmainid;
    }

    @XmlTransient
    public List<Userassignedusergroup> getUserassignedusergroupList() {
        return userassignedusergroupList;
    }

    public void setUserassignedusergroupList(List<Userassignedusergroup> userassignedusergroupList) {
        this.userassignedusergroupList = userassignedusergroupList;
    }

    public Appmodules getModuleid() {
        return moduleid;
    }

    public void setModuleid(Appmodules moduleid) {
        this.moduleid = moduleid;
    }

    @XmlTransient
    public List<Userusergrouppermission> getUserusergrouppermissionList() {
        return userusergrouppermissionList;
    }

    public void setUserusergrouppermissionList(List<Userusergrouppermission> userusergrouppermissionList) {
        this.userusergrouppermissionList = userusergrouppermissionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (permissionid != null ? permissionid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Userpermission)) {
            return false;
        }
        Userpermission other = (Userpermission) object;
        if ((this.permissionid == null && other.permissionid != null) || (this.permissionid != null && !this.permissionid.equals(other.permissionid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.comsoftacuity.db.Userpermission[ permissionid=" + permissionid + " ]";
    }
    
}
