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
@Table(name = "lststockouttype")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lststockouttype.findAll", query = "SELECT l FROM Lststockouttype l"),
    @NamedQuery(name = "Lststockouttype.findByStockouttypeid", query = "SELECT l FROM Lststockouttype l WHERE l.stockouttypeid = :stockouttypeid"),
    @NamedQuery(name = "Lststockouttype.findByDescription", query = "SELECT l FROM Lststockouttype l WHERE l.description = :description"),
    @NamedQuery(name = "Lststockouttype.findByDatecreated", query = "SELECT l FROM Lststockouttype l WHERE l.datecreated = :datecreated"),
    @NamedQuery(name = "Lststockouttype.findByActive", query = "SELECT l FROM Lststockouttype l WHERE l.active = :active")})
public class Lststockouttype implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "stockouttypeid")
    private Integer stockouttypeid;
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreated;
    @Column(name = "active")
    private Short active;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "stockouttypeid")
    private List<Transtockout> transtockoutList;
    @JoinColumn(name = "lstmainid", referencedColumnName = "lstmainid")
    @ManyToOne
    private Lstmain lstmainid;

    public Lststockouttype() {
    }

    public Lststockouttype(Integer stockouttypeid) {
        this.stockouttypeid = stockouttypeid;
    }

    public Lststockouttype(Integer stockouttypeid, Date datecreated) {
        this.stockouttypeid = stockouttypeid;
        this.datecreated = datecreated;
    }

    public Integer getStockouttypeid() {
        return stockouttypeid;
    }

    public void setStockouttypeid(Integer stockouttypeid) {
        this.stockouttypeid = stockouttypeid;
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

    @XmlTransient
    public List<Transtockout> getTranstockoutList() {
        return transtockoutList;
    }

    public void setTranstockoutList(List<Transtockout> transtockoutList) {
        this.transtockoutList = transtockoutList;
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
        hash += (stockouttypeid != null ? stockouttypeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lststockouttype)) {
            return false;
        }
        Lststockouttype other = (Lststockouttype) object;
        if ((this.stockouttypeid == null && other.stockouttypeid != null) || (this.stockouttypeid != null && !this.stockouttypeid.equals(other.stockouttypeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.comsoftacuity.db.Lststockouttype[ stockouttypeid=" + stockouttypeid + " ]";
    }
    
}
