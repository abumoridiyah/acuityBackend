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
@Table(name = "lststockoutreceipttype")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lststockoutreceipttype.findAll", query = "SELECT l FROM Lststockoutreceipttype l"),
    @NamedQuery(name = "Lststockoutreceipttype.findByStockrecipttypeid", query = "SELECT l FROM Lststockoutreceipttype l WHERE l.stockrecipttypeid = :stockrecipttypeid"),
    @NamedQuery(name = "Lststockoutreceipttype.findByDescription", query = "SELECT l FROM Lststockoutreceipttype l WHERE l.description = :description"),
    @NamedQuery(name = "Lststockoutreceipttype.findByDatecreated", query = "SELECT l FROM Lststockoutreceipttype l WHERE l.datecreated = :datecreated"),
    @NamedQuery(name = "Lststockoutreceipttype.findByActive", query = "SELECT l FROM Lststockoutreceipttype l WHERE l.active = :active")})
public class Lststockoutreceipttype implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "stockrecipttypeid")
    private Integer stockrecipttypeid;
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreated;
    @Column(name = "active")
    private Short active;
    @JoinColumn(name = "lstmainid", referencedColumnName = "lstmainid")
    @ManyToOne
    private Lstmain lstmainid;

    public Lststockoutreceipttype() {
    }

    public Lststockoutreceipttype(Integer stockrecipttypeid) {
        this.stockrecipttypeid = stockrecipttypeid;
    }

    public Lststockoutreceipttype(Integer stockrecipttypeid, Date datecreated) {
        this.stockrecipttypeid = stockrecipttypeid;
        this.datecreated = datecreated;
    }

    public Integer getStockrecipttypeid() {
        return stockrecipttypeid;
    }

    public void setStockrecipttypeid(Integer stockrecipttypeid) {
        this.stockrecipttypeid = stockrecipttypeid;
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

    public Lstmain getLstmainid() {
        return lstmainid;
    }

    public void setLstmainid(Lstmain lstmainid) {
        this.lstmainid = lstmainid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stockrecipttypeid != null ? stockrecipttypeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lststockoutreceipttype)) {
            return false;
        }
        Lststockoutreceipttype other = (Lststockoutreceipttype) object;
        if ((this.stockrecipttypeid == null && other.stockrecipttypeid != null) || (this.stockrecipttypeid != null && !this.stockrecipttypeid.equals(other.stockrecipttypeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.comsoftacuity.db.Lststockoutreceipttype[ stockrecipttypeid=" + stockrecipttypeid + " ]";
    }
    
}
