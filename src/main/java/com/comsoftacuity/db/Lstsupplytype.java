/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comsoftacuity.db;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Abu Moridiyah
 */
@Entity
@Table(name = "lstsupplytype")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lstsupplytype.findAll", query = "SELECT l FROM Lstsupplytype l"),
    @NamedQuery(name = "Lstsupplytype.findBySubpplytypeid", query = "SELECT l FROM Lstsupplytype l WHERE l.subpplytypeid = :subpplytypeid"),
    @NamedQuery(name = "Lstsupplytype.findByDescription", query = "SELECT l FROM Lstsupplytype l WHERE l.description = :description"),
    @NamedQuery(name = "Lstsupplytype.findByDateCreated", query = "SELECT l FROM Lstsupplytype l WHERE l.dateCreated = :dateCreated"),
    @NamedQuery(name = "Lstsupplytype.findByActive", query = "SELECT l FROM Lstsupplytype l WHERE l.active = :active")})
public class Lstsupplytype implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "subpplytypeid")
    private Integer subpplytypeid;
    @Size(max = 30)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateCreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @Column(name = "active")
    private Short active;
    @JoinColumn(name = "supplyid", referencedColumnName = "supplyid")
    @ManyToOne(cascade = CascadeType.ALL)
    private Supplier supplyid;
    @JoinColumn(name = "lstmainid", referencedColumnName = "lstmainid")
    @ManyToOne
    private Lstmain lstmainid;

    public Lstsupplytype() {
    }

    public Lstsupplytype(Integer subpplytypeid) {
        this.subpplytypeid = subpplytypeid;
    }

    public Lstsupplytype(Integer subpplytypeid, Date dateCreated) {
        this.subpplytypeid = subpplytypeid;
        this.dateCreated = dateCreated;
    }

    public Integer getSubpplytypeid() {
        return subpplytypeid;
    }

    public void setSubpplytypeid(Integer subpplytypeid) {
        this.subpplytypeid = subpplytypeid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Short getActive() {
        return active;
    }

    public void setActive(Short active) {
        this.active = active;
    }

    public Supplier getSupplyid() {
        return supplyid;
    }

    public void setSupplyid(Supplier supplyid) {
        this.supplyid = supplyid;
    }

    public Lstmain getLstmainid() {
        return lstmainid;
    }

    public void setLstmainid(Lstmain lstmainid) {
        this.lstmainid = lstmainid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subpplytypeid != null ? subpplytypeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lstsupplytype)) {
            return false;
        }
        Lstsupplytype other = (Lstsupplytype) object;
        if ((this.subpplytypeid == null && other.subpplytypeid != null) || (this.subpplytypeid != null && !this.subpplytypeid.equals(other.subpplytypeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "db.Lstsupplytype[ subpplytypeid=" + subpplytypeid + " ]";
    }
    
}
