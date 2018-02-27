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
@Table(name = "userusersinfo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Userusersinfo.findAll", query = "SELECT u FROM Userusersinfo u"),
    @NamedQuery(name = "Userusersinfo.findByUserid", query = "SELECT u FROM Userusersinfo u WHERE u.userid = :userid"),
    @NamedQuery(name = "Userusersinfo.findByInstitutioncode", query = "SELECT u FROM Userusersinfo u WHERE u.institutioncode = :institutioncode"),
    @NamedQuery(name = "Userusersinfo.findByUsername", query = "SELECT u FROM Userusersinfo u WHERE u.username = :username"),
    @NamedQuery(name = "Userusersinfo.findByPassword", query = "SELECT u FROM Userusersinfo u WHERE u.password = :password"),
    @NamedQuery(name = "Userusersinfo.findByFirstname", query = "SELECT u FROM Userusersinfo u WHERE u.firstname = :firstname"),
    @NamedQuery(name = "Userusersinfo.findByMiddlename", query = "SELECT u FROM Userusersinfo u WHERE u.middlename = :middlename"),
    @NamedQuery(name = "Userusersinfo.findByLastname", query = "SELECT u FROM Userusersinfo u WHERE u.lastname = :lastname"),
    @NamedQuery(name = "Userusersinfo.findByContactmobile", query = "SELECT u FROM Userusersinfo u WHERE u.contactmobile = :contactmobile"),
    @NamedQuery(name = "Userusersinfo.findByContactemail", query = "SELECT u FROM Userusersinfo u WHERE u.contactemail = :contactemail"),
    @NamedQuery(name = "Userusersinfo.findByDatecreated", query = "SELECT u FROM Userusersinfo u WHERE u.datecreated = :datecreated"),
    @NamedQuery(name = "Userusersinfo.findByEnteredbyid", query = "SELECT u FROM Userusersinfo u WHERE u.enteredbyid = :enteredbyid"),
    @NamedQuery(name = "Userusersinfo.findByActive", query = "SELECT u FROM Userusersinfo u WHERE u.active = :active")})
public class Userusersinfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "userid")
    private Integer userid;
    @Column(name = "Institutioncode")
    private String institutioncode;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "middlename")
    private String middlename;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "contactmobile")
    private String contactmobile;
    @Column(name = "contactemail")
    private String contactemail;
    @Basic(optional = false)
    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreated;
    @Column(name = "enteredbyid")
    private Integer enteredbyid;
    @Column(name = "Active")
    private Short active;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "userid")
    private List<Userassignedusergroup> userassignedusergroupList;

    public Userusersinfo() {
    }

    public Userusersinfo(Integer userid) {
        this.userid = userid;
    }

    public Userusersinfo(Integer userid, Date datecreated) {
        this.userid = userid;
        this.datecreated = datecreated;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getInstitutioncode() {
        return institutioncode;
    }

    public void setInstitutioncode(String institutioncode) {
        this.institutioncode = institutioncode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getContactmobile() {
        return contactmobile;
    }

    public void setContactmobile(String contactmobile) {
        this.contactmobile = contactmobile;
    }

    public String getContactemail() {
        return contactemail;
    }

    public void setContactemail(String contactemail) {
        this.contactemail = contactemail;
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
    public List<Userassignedusergroup> getUserassignedusergroupList() {
        return userassignedusergroupList;
    }

    public void setUserassignedusergroupList(List<Userassignedusergroup> userassignedusergroupList) {
        this.userassignedusergroupList = userassignedusergroupList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userid != null ? userid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Userusersinfo)) {
            return false;
        }
        Userusersinfo other = (Userusersinfo) object;
        if ((this.userid == null && other.userid != null) || (this.userid != null && !this.userid.equals(other.userid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.comsoftacuity.db.Userusersinfo[ userid=" + userid + " ]";
    }
    
}
