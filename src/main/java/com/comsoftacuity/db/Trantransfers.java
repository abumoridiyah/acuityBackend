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
@Table(name = "trantransfers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trantransfers.findAll", query = "SELECT t FROM Trantransfers t"),
    @NamedQuery(name = "Trantransfers.findById", query = "SELECT t FROM Trantransfers t WHERE t.id = :id"),
    @NamedQuery(name = "Trantransfers.findByItemid", query = "SELECT t FROM Trantransfers t WHERE t.itemid = :itemid"),
    @NamedQuery(name = "Trantransfers.findByFromstoreid", query = "SELECT t FROM Trantransfers t WHERE t.fromstoreid = :fromstoreid"),
    @NamedQuery(name = "Trantransfers.findByTostoreId", query = "SELECT t FROM Trantransfers t WHERE t.tostoreId = :tostoreId"),
    @NamedQuery(name = "Trantransfers.findByQtysent", query = "SELECT t FROM Trantransfers t WHERE t.qtysent = :qtysent"),
    @NamedQuery(name = "Trantransfers.findByQtyrecieved", query = "SELECT t FROM Trantransfers t WHERE t.qtyrecieved = :qtyrecieved"),
    @NamedQuery(name = "Trantransfers.findByBatchno", query = "SELECT t FROM Trantransfers t WHERE t.batchno = :batchno"),
    @NamedQuery(name = "Trantransfers.findByTransferstatus", query = "SELECT t FROM Trantransfers t WHERE t.transferstatus = :transferstatus"),
    @NamedQuery(name = "Trantransfers.findByRemarks", query = "SELECT t FROM Trantransfers t WHERE t.remarks = :remarks"),
    @NamedQuery(name = "Trantransfers.findByEnteredbyid", query = "SELECT t FROM Trantransfers t WHERE t.enteredbyid = :enteredbyid"),
    @NamedQuery(name = "Trantransfers.findByDatecreated", query = "SELECT t FROM Trantransfers t WHERE t.datecreated = :datecreated"),
    @NamedQuery(name = "Trantransfers.findByActive", query = "SELECT t FROM Trantransfers t WHERE t.active = :active")})
public class Trantransfers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "itemid")
    private Integer itemid;
    @Column(name = "fromstoreid")
    private Integer fromstoreid;
    @Column(name = "tostoreId")
    private Integer tostoreId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "qtysent")
    private BigDecimal qtysent;
    @Column(name = "qtyrecieved")
    private BigDecimal qtyrecieved;
    @Column(name = "batchno")
    private String batchno;
    @Column(name = "transferstatus")
    private String transferstatus;
    @Column(name = "remarks")
    private String remarks;
    @Column(name = "enteredbyid")
    private Integer enteredbyid;
    @Basic(optional = false)
    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreated;
    @Column(name = "active")
    private Integer active;
    @JoinColumn(name = "tranlogid", referencedColumnName = "tranlogid")
    @ManyToOne
    private Tranlogs tranlogid;

    public Trantransfers() {
    }

    public Trantransfers(Integer id) {
        this.id = id;
    }

    public Trantransfers(Integer id, Date datecreated) {
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

    public Integer getFromstoreid() {
        return fromstoreid;
    }

    public void setFromstoreid(Integer fromstoreid) {
        this.fromstoreid = fromstoreid;
    }

    public Integer getTostoreId() {
        return tostoreId;
    }

    public void setTostoreId(Integer tostoreId) {
        this.tostoreId = tostoreId;
    }

    public BigDecimal getQtysent() {
        return qtysent;
    }

    public void setQtysent(BigDecimal qtysent) {
        this.qtysent = qtysent;
    }

    public BigDecimal getQtyrecieved() {
        return qtyrecieved;
    }

    public void setQtyrecieved(BigDecimal qtyrecieved) {
        this.qtyrecieved = qtyrecieved;
    }

    public String getBatchno() {
        return batchno;
    }

    public void setBatchno(String batchno) {
        this.batchno = batchno;
    }

    public String getTransferstatus() {
        return transferstatus;
    }

    public void setTransferstatus(String transferstatus) {
        this.transferstatus = transferstatus;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getEnteredbyid() {
        return enteredbyid;
    }

    public void setEnteredbyid(Integer enteredbyid) {
        this.enteredbyid = enteredbyid;
    }

    public Date getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trantransfers)) {
            return false;
        }
        Trantransfers other = (Trantransfers) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.comsoftacuity.db.Trantransfers[ id=" + id + " ]";
    }
    
}
