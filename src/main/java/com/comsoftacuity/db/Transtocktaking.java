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
@Table(name = "transtocktaking")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transtocktaking.findAll", query = "SELECT t FROM Transtocktaking t"),
    @NamedQuery(name = "Transtocktaking.findByStktakenid", query = "SELECT t FROM Transtocktaking t WHERE t.stktakenid = :stktakenid"),
    @NamedQuery(name = "Transtocktaking.findByItemid", query = "SELECT t FROM Transtocktaking t WHERE t.itemid = :itemid"),
    @NamedQuery(name = "Transtocktaking.findByStoreId", query = "SELECT t FROM Transtocktaking t WHERE t.storeId = :storeId"),
    @NamedQuery(name = "Transtocktaking.findByDateoftran", query = "SELECT t FROM Transtocktaking t WHERE t.dateoftran = :dateoftran"),
    @NamedQuery(name = "Transtocktaking.findByComputerqty", query = "SELECT t FROM Transtocktaking t WHERE t.computerqty = :computerqty"),
    @NamedQuery(name = "Transtocktaking.findByPhysicalcount", query = "SELECT t FROM Transtocktaking t WHERE t.physicalcount = :physicalcount"),
    @NamedQuery(name = "Transtocktaking.findByDifference", query = "SELECT t FROM Transtocktaking t WHERE t.difference = :difference"),
    @NamedQuery(name = "Transtocktaking.findByRemarks", query = "SELECT t FROM Transtocktaking t WHERE t.remarks = :remarks"),
    @NamedQuery(name = "Transtocktaking.findByDatecreated", query = "SELECT t FROM Transtocktaking t WHERE t.datecreated = :datecreated"),
    @NamedQuery(name = "Transtocktaking.findByActive", query = "SELECT t FROM Transtocktaking t WHERE t.active = :active")})
public class Transtocktaking implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "stktakenid")
    private Integer stktakenid;
    @Column(name = "itemid")
    private Integer itemid;
    @Column(name = "storeId")
    private Integer storeId;
    @Column(name = "dateoftran")
    @Temporal(TemporalType.DATE)
    private Date dateoftran;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "computerqty")
    private BigDecimal computerqty;
    @Column(name = "physicalcount")
    private BigDecimal physicalcount;
    @Column(name = "difference")
    private BigDecimal difference;
    @Column(name = "remarks")
    private String remarks;
    @Basic(optional = false)
    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreated;
    @Column(name = "active")
    private Short active;
    @JoinColumn(name = "tranlogid", referencedColumnName = "tranlogid")
    @ManyToOne
    private Tranlogs tranlogid;

    public Transtocktaking() {
    }

    public Transtocktaking(Integer stktakenid) {
        this.stktakenid = stktakenid;
    }

    public Transtocktaking(Integer stktakenid, Date datecreated) {
        this.stktakenid = stktakenid;
        this.datecreated = datecreated;
    }

    public Integer getStktakenid() {
        return stktakenid;
    }

    public void setStktakenid(Integer stktakenid) {
        this.stktakenid = stktakenid;
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

    public Date getDateoftran() {
        return dateoftran;
    }

    public void setDateoftran(Date dateoftran) {
        this.dateoftran = dateoftran;
    }

    public BigDecimal getComputerqty() {
        return computerqty;
    }

    public void setComputerqty(BigDecimal computerqty) {
        this.computerqty = computerqty;
    }

    public BigDecimal getPhysicalcount() {
        return physicalcount;
    }

    public void setPhysicalcount(BigDecimal physicalcount) {
        this.physicalcount = physicalcount;
    }

    public BigDecimal getDifference() {
        return difference;
    }

    public void setDifference(BigDecimal difference) {
        this.difference = difference;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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

    public Tranlogs getTranlogid() {
        return tranlogid;
    }

    public void setTranlogid(Tranlogs tranlogid) {
        this.tranlogid = tranlogid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stktakenid != null ? stktakenid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transtocktaking)) {
            return false;
        }
        Transtocktaking other = (Transtocktaking) object;
        if ((this.stktakenid == null && other.stktakenid != null) || (this.stktakenid != null && !this.stktakenid.equals(other.stktakenid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.comsoftacuity.db.Transtocktaking[ stktakenid=" + stktakenid + " ]";
    }
    
}
