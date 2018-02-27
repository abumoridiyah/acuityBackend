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
@Table(name = "transtockin")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transtockin.findAll", query = "SELECT t FROM Transtockin t"),
    @NamedQuery(name = "Transtockin.findById", query = "SELECT t FROM Transtockin t WHERE t.id = :id"),
    @NamedQuery(name = "Transtockin.findByItemid", query = "SELECT t FROM Transtockin t WHERE t.itemid = :itemid"),
    @NamedQuery(name = "Transtockin.findBySupplyreferenceno", query = "SELECT t FROM Transtockin t WHERE t.supplyreferenceno = :supplyreferenceno"),
    @NamedQuery(name = "Transtockin.findByQtysupplied", query = "SELECT t FROM Transtockin t WHERE t.qtysupplied = :qtysupplied"),
    @NamedQuery(name = "Transtockin.findByQtyremaining", query = "SELECT t FROM Transtockin t WHERE t.qtyremaining = :qtyremaining"),
    @NamedQuery(name = "Transtockin.findByDatesupplied", query = "SELECT t FROM Transtockin t WHERE t.datesupplied = :datesupplied"),
    @NamedQuery(name = "Transtockin.findByBatchno", query = "SELECT t FROM Transtockin t WHERE t.batchno = :batchno"),
    @NamedQuery(name = "Transtockin.findByCanexpire", query = "SELECT t FROM Transtockin t WHERE t.canexpire = :canexpire"),
    @NamedQuery(name = "Transtockin.findByExpirationdate", query = "SELECT t FROM Transtockin t WHERE t.expirationdate = :expirationdate"),
    @NamedQuery(name = "Transtockin.findByStockintypeId", query = "SELECT t FROM Transtockin t WHERE t.stockintypeId = :stockintypeId"),
    @NamedQuery(name = "Transtockin.findByEnteredbyId", query = "SELECT t FROM Transtockin t WHERE t.enteredbyId = :enteredbyId"),
    @NamedQuery(name = "Transtockin.findByDatecreated", query = "SELECT t FROM Transtockin t WHERE t.datecreated = :datecreated"),
    @NamedQuery(name = "Transtockin.findByActive", query = "SELECT t FROM Transtockin t WHERE t.active = :active")})
public class Transtockin implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "itemid")
    private Integer itemid;
    @Column(name = "supplyreferenceno")
    private String supplyreferenceno;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "qtysupplied")
    private BigDecimal qtysupplied;
    @Column(name = "qtyremaining")
    private BigDecimal qtyremaining;
    @Column(name = "datesupplied")
    @Temporal(TemporalType.DATE)
    private Date datesupplied;
    @Column(name = "batchno")
    private String batchno;
    @Column(name = "canexpire")
    private Boolean canexpire;
    @Column(name = "expirationdate")
    @Temporal(TemporalType.DATE)
    private Date expirationdate;
    @Column(name = "stockintypeId")
    private Integer stockintypeId;
    @Column(name = "enteredbyId")
    private Integer enteredbyId;
    @Basic(optional = false)
    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreated;
    @Column(name = "active")
    private Short active;
    @JoinColumn(name = "supplytypeid", referencedColumnName = "subpplytypeid")
    @ManyToOne
    private Lstsupplytype supplytypeid;
    @JoinColumn(name = "tranlogid", referencedColumnName = "tranlogid")
    @ManyToOne
    private Tranlogs tranlogid;

    public Transtockin() {
    }

    public Transtockin(Integer id) {
        this.id = id;
    }

    public Transtockin(Integer id, Date datecreated) {
        this.id = id;
        this.datecreated = datecreated;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public String getSupplyreferenceno() {
        return supplyreferenceno;
    }

    public void setSupplyreferenceno(String supplyreferenceno) {
        this.supplyreferenceno = supplyreferenceno;
    }

    public BigDecimal getQtysupplied() {
        return qtysupplied;
    }

    public void setQtysupplied(BigDecimal qtysupplied) {
        this.qtysupplied = qtysupplied;
    }

    public BigDecimal getQtyremaining() {
        return qtyremaining;
    }

    public void setQtyremaining(BigDecimal qtyremaining) {
        this.qtyremaining = qtyremaining;
    }

    public Date getDatesupplied() {
        return datesupplied;
    }

    public void setDatesupplied(Date datesupplied) {
        this.datesupplied = datesupplied;
    }

    public String getBatchno() {
        return batchno;
    }

    public void setBatchno(String batchno) {
        this.batchno = batchno;
    }

    public Boolean getCanexpire() {
        return canexpire;
    }

    public void setCanexpire(Boolean canexpire) {
        this.canexpire = canexpire;
    }

    public Date getExpirationdate() {
        return expirationdate;
    }

    public void setExpirationdate(Date expirationdate) {
        this.expirationdate = expirationdate;
    }

    public Integer getStockintypeId() {
        return stockintypeId;
    }

    public void setStockintypeId(Integer stockintypeId) {
        this.stockintypeId = stockintypeId;
    }

    public Integer getEnteredbyId() {
        return enteredbyId;
    }

    public void setEnteredbyId(Integer enteredbyId) {
        this.enteredbyId = enteredbyId;
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

    public Lstsupplytype getSupplytypeid() {
        return supplytypeid;
    }

    public void setSupplytypeid(Lstsupplytype supplytypeid) {
        this.supplytypeid = supplytypeid;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transtockin)) {
            return false;
        }
        Transtockin other = (Transtockin) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.comsoftacuity.db.Transtockin[ id=" + id + " ]";
    }
    
}
