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
@Table(name = "lstsubcategorytree")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lstsubcategorytree.findAll", query = "SELECT l FROM Lstsubcategorytree l"),
    @NamedQuery(name = "Lstsubcategorytree.findBySubcategorytid", query = "SELECT l FROM Lstsubcategorytree l WHERE l.subcategorytid = :subcategorytid"),
    @NamedQuery(name = "Lstsubcategorytree.findByParentId", query = "SELECT l FROM Lstsubcategorytree l WHERE l.parentId = :parentId"),
    @NamedQuery(name = "Lstsubcategorytree.findByDescription", query = "SELECT l FROM Lstsubcategorytree l WHERE l.description = :description"),
    @NamedQuery(name = "Lstsubcategorytree.findByDatecreated", query = "SELECT l FROM Lstsubcategorytree l WHERE l.datecreated = :datecreated"),
    @NamedQuery(name = "Lstsubcategorytree.findByActive", query = "SELECT l FROM Lstsubcategorytree l WHERE l.active = :active")})
public class Lstsubcategorytree implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "subcategorytid")
    private Integer subcategorytid;
    @Column(name = "parentId")
    private Integer parentId;
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreated;
    @Column(name = "active")
    private Short active;
    @JoinColumn(name = "categoryleveltypeid", referencedColumnName = "categoryleveltypeid")
    @ManyToOne
    private Lstcategoryleveltype categoryleveltypeid;
    @JoinColumn(name = "lstmainid", referencedColumnName = "lstmainid")
    @ManyToOne
    private Lstmain lstmainid;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "subcategorytid")
    private List<Regitems> regitemsList;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "subcategoryId")
    private List<Regdepreciationbycategory> regdepreciationbycategoryList;

    public Lstsubcategorytree() {
    }

    public Lstsubcategorytree(Integer subcategorytid) {
        this.subcategorytid = subcategorytid;
    }

    public Lstsubcategorytree(Integer subcategorytid, Date datecreated) {
        this.subcategorytid = subcategorytid;
        this.datecreated = datecreated;
    }

    public Integer getSubcategorytid() {
        return subcategorytid;
    }

    public void setSubcategorytid(Integer subcategorytid) {
        this.subcategorytid = subcategorytid;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Lstcategoryleveltype getCategoryleveltypeid() {
        return categoryleveltypeid;
    }

    public void setCategoryleveltypeid(Lstcategoryleveltype categoryleveltypeid) {
        this.categoryleveltypeid = categoryleveltypeid;
    }

    public Lstmain getLstmainid() {
        return lstmainid;
    }

    public void setLstmainid(Lstmain lstmainid) {
        this.lstmainid = lstmainid;
    }

    @XmlTransient
    public List<Regitems> getRegitemsList() {
        return regitemsList;
    }

    public void setRegitemsList(List<Regitems> regitemsList) {
        this.regitemsList = regitemsList;
    }

    @XmlTransient
    public List<Regdepreciationbycategory> getRegdepreciationbycategoryList() {
        return regdepreciationbycategoryList;
    }

    public void setRegdepreciationbycategoryList(List<Regdepreciationbycategory> regdepreciationbycategoryList) {
        this.regdepreciationbycategoryList = regdepreciationbycategoryList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subcategorytid != null ? subcategorytid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lstsubcategorytree)) {
            return false;
        }
        Lstsubcategorytree other = (Lstsubcategorytree) object;
        if ((this.subcategorytid == null && other.subcategorytid != null) || (this.subcategorytid != null && !this.subcategorytid.equals(other.subcategorytid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.comsoftacuity.db.Lstsubcategorytree[ subcategorytid=" + subcategorytid + " ]";
    }
    
}
