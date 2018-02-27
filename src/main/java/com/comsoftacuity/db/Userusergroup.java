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
@Table(name = "userusergroup")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Userusergroup.findAll", query = "SELECT u FROM Userusergroup u"),
    @NamedQuery(name = "Userusergroup.findByUsergrpid", query = "SELECT u FROM Userusergroup u WHERE u.usergrpid = :usergrpid"),
    @NamedQuery(name = "Userusergroup.findByGroupname", query = "SELECT u FROM Userusergroup u WHERE u.groupname = :groupname"),
    @NamedQuery(name = "Userusergroup.findByDatecreated", query = "SELECT u FROM Userusergroup u WHERE u.datecreated = :datecreated"),
    @NamedQuery(name = "Userusergroup.findByEnteredbyid", query = "SELECT u FROM Userusergroup u WHERE u.enteredbyid = :enteredbyid"),
    @NamedQuery(name = "Userusergroup.findByActive", query = "SELECT u FROM Userusergroup u WHERE u.active = :active"),
    @NamedQuery(name = "Userusergroup.findByComment", query = "SELECT u FROM Userusergroup u WHERE u.comment = :comment")})
public class Userusergroup implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "usergrpid")
    private Integer usergrpid;
    @Column(name = "groupname")
    private String groupname;
    @Basic(optional = false)
    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreated;
    @Column(name = "enteredbyid")
    private Integer enteredbyid;
    @Column(name = "Active")
    private Short active;
    @Column(name = "comment")
    private String comment;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "groupid")
    private List<Userassignedusergroup> userassignedusergroupList;
    @JoinColumn(name = "lstmainid", referencedColumnName = "lstmainid")
    @ManyToOne
    private Lstmain lstmainid;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "usergrpid")
    private List<Userusergrouppermission> userusergrouppermissionList;

    public Userusergroup() {
    }

    public Userusergroup(Integer usergrpid) {
        this.usergrpid = usergrpid;
    }

    public Userusergroup(Integer usergrpid, Date datecreated) {
        this.usergrpid = usergrpid;
        this.datecreated = datecreated;
    }

    public Integer getUsergrpid() {
        return usergrpid;
    }

    public void setUsergrpid(Integer usergrpid) {
        this.usergrpid = usergrpid;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @XmlTransient
    public List<Userassignedusergroup> getUserassignedusergroupList() {
        return userassignedusergroupList;
    }

    public void setUserassignedusergroupList(List<Userassignedusergroup> userassignedusergroupList) {
        this.userassignedusergroupList = userassignedusergroupList;
    }

    public Lstmain getLstmainid() {
        return lstmainid;
    }

    public void setLstmainid(Lstmain lstmainid) {
        this.lstmainid = lstmainid;
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
        hash += (usergrpid != null ? usergrpid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Userusergroup)) {
            return false;
        }
        Userusergroup other = (Userusergroup) object;
        if ((this.usergrpid == null && other.usergrpid != null) || (this.usergrpid != null && !this.usergrpid.equals(other.usergrpid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.comsoftacuity.db.Userusergroup[ usergrpid=" + usergrpid + " ]";
    }
    
}
