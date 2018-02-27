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
@Table(name = "transtocklevel")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transtocklevel.findAll", query = "SELECT t FROM Transtocklevel t"),
    @NamedQuery(name = "Transtocklevel.findByStockid", query = "SELECT t FROM Transtocklevel t WHERE t.stockid = :stockid"),
    @NamedQuery(name = "Transtocklevel.findByItemid", query = "SELECT t FROM Transtocklevel t WHERE t.itemid = :itemid"),
    @NamedQuery(name = "Transtocklevel.findByStoreId", query = "SELECT t FROM Transtocklevel t WHERE t.storeId = :storeId"),
    @NamedQuery(name = "Transtocklevel.findByQtylevel", query = "SELECT t FROM Transtocklevel t WHERE t.qtylevel = :qtylevel"),
    @NamedQuery(name = "Transtocklevel.findByDatecreated", query = "SELECT t FROM Transtocklevel t WHERE t.datecreated = :datecreated"),
    @NamedQuery(name = "Transtocklevel.findByEnteredbyId", query = "SELECT t FROM Transtocklevel t WHERE t.enteredbyId = :enteredbyId")})
public class Transtocklevel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "stockid")
    private Integer stockid;
    @Column(name = "itemid")
    private Integer itemid;
    @Column(name = "storeId")
    private Integer storeId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "qtylevel")
    private BigDecimal qtylevel;
    @Basic(optional = false)
    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreated;
    @Column(name = "enteredbyId")
    private Integer enteredbyId;
    @JoinColumn(name = "tranlogid", referencedColumnName = "tranlogid")
    @ManyToOne
    private Tranlogs tranlogid;

    public Transtocklevel() {
    }

    public Transtocklevel(Integer stockid) {
        this.stockid = stockid;
    }

    public Transtocklevel(Integer stockid, Date datecreated) {
        this.stockid = stockid;
        this.datecreated = datecreated;
    }

    public Integer getStockid() {
        return stockid;
    }

    public void setStockid(Integer stockid) {
        this.stockid = stockid;
    }

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public BigDecimal getQtylevel() {
        return qtylevel;
    }

    public void setQtylevel(BigDecimal qtylevel) {
        this.qtylevel = qtylevel;
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

    public Tranlogs getTranlogid() {
        return tranlogid;
    }

    public void setTranlogid(Tranlogs tranlogid) {
        this.tranlogid = tranlogid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stockid != null ? stockid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transtocklevel)) {
            return false;
        }
        Transtocklevel other = (Transtocklevel) object;
        if ((this.stockid == null && other.stockid != null) || (this.stockid != null && !this.stockid.equals(other.stockid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.comsoftacuity.db.Transtocklevel[ stockid=" + stockid + " ]";
    }
    
}
