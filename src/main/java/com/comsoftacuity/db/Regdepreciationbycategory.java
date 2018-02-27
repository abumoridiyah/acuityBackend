/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comsoftacuity.db;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "regdepreciationbycategory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Regdepreciationbycategory.findAll", query = "SELECT r FROM Regdepreciationbycategory r"),
    @NamedQuery(name = "Regdepreciationbycategory.findByDepreciationid", query = "SELECT r FROM Regdepreciationbycategory r WHERE r.depreciationid = :depreciationid"),
    @NamedQuery(name = "Regdepreciationbycategory.findByDepreciationvalue", query = "SELECT r FROM Regdepreciationbycategory r WHERE r.depreciationvalue = :depreciationvalue"),
    @NamedQuery(name = "Regdepreciationbycategory.findByDepreciationPeriod", query = "SELECT r FROM Regdepreciationbycategory r WHERE r.depreciationPeriod = :depreciationPeriod"),
    @NamedQuery(name = "Regdepreciationbycategory.findByDatecreated", query = "SELECT r FROM Regdepreciationbycategory r WHERE r.datecreated = :datecreated"),
    @NamedQuery(name = "Regdepreciationbycategory.findByActive", query = "SELECT r FROM Regdepreciationbycategory r WHERE r.active = :active")})
public class Regdepreciationbycategory implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "depreciationid")
    private Integer depreciationid;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "depreciationvalue")
    private BigDecimal depreciationvalue;
    @Column(name = "depreciationPeriod")
    private String depreciationPeriod;
    @Basic(optional = false)
    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreated;
    @Column(name = "active")
    private Short active;
    @JoinColumn(name = "subcategoryId", referencedColumnName = "subcategorytid")
    @ManyToOne
    private Lstsubcategorytree subcategoryId;

    public Regdepreciationbycategory() {
    }

    public Regdepreciationbycategory(Integer depreciationid) {
        this.depreciationid = depreciationid;
    }

    public Regdepreciationbycategory(Integer depreciationid, Date datecreated) {
        this.depreciationid = depreciationid;
        this.datecreated = datecreated;
    }

    public Integer getDepreciationid() {
        return depreciationid;
    }

    public void setDepreciationid(Integer depreciationid) {
        this.depreciationid = depreciationid;
    }

    public BigDecimal getDepreciationvalue() {
        return depreciationvalue;
    }

    public void setDepreciationvalue(BigDecimal depreciationvalue) {
        this.depreciationvalue = depreciationvalue;
    }

    public String getDepreciationPeriod() {
        return depreciationPeriod;
    }

    public void setDepreciationPeriod(String depreciationPeriod) {
        this.depreciationPeriod = depreciationPeriod;
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

    public Lstsubcategorytree getSubcategoryId() {
        return subcategoryId;
    }

    public void setSubcategoryId(Lstsubcategorytree subcategoryId) {
        this.subcategoryId = subcategoryId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (depreciationid != null ? depreciationid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Regdepreciationbycategory)) {
            return false;
        }
        Regdepreciationbycategory other = (Regdepreciationbycategory) object;
        if ((this.depreciationid == null && other.depreciationid != null) || (this.depreciationid != null && !this.depreciationid.equals(other.depreciationid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.comsoftacuity.db.Regdepreciationbycategory[ depreciationid=" + depreciationid + " ]";
    }
    
}
