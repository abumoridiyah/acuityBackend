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
@Table(name = "transtockout")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transtockout.findAll", query = "SELECT t FROM Transtockout t"),
    @NamedQuery(name = "Transtockout.findByStockoutid", query = "SELECT t FROM Transtockout t WHERE t.stockoutid = :stockoutid"),
    @NamedQuery(name = "Transtockout.findByItemid", query = "SELECT t FROM Transtockout t WHERE t.itemid = :itemid"),
    @NamedQuery(name = "Transtockout.findByRecipientId", query = "SELECT t FROM Transtockout t WHERE t.recipientId = :recipientId"),
    @NamedQuery(name = "Transtockout.findByRecipientName", query = "SELECT t FROM Transtockout t WHERE t.recipientName = :recipientName"),
    @NamedQuery(name = "Transtockout.findByDocumentNo", query = "SELECT t FROM Transtockout t WHERE t.documentNo = :documentNo"),
    @NamedQuery(name = "Transtockout.findByFromstockinId", query = "SELECT t FROM Transtockout t WHERE t.fromstockinId = :fromstockinId"),
    @NamedQuery(name = "Transtockout.findByRecipienttype", query = "SELECT t FROM Transtockout t WHERE t.recipienttype = :recipienttype"),
    @NamedQuery(name = "Transtockout.findByDateout", query = "SELECT t FROM Transtockout t WHERE t.dateout = :dateout"),
    @NamedQuery(name = "Transtockout.findByReturned", query = "SELECT t FROM Transtockout t WHERE t.returned = :returned"),
    @NamedQuery(name = "Transtockout.findByReturneddate", query = "SELECT t FROM Transtockout t WHERE t.returneddate = :returneddate"),
    @NamedQuery(name = "Transtockout.findByQtyout", query = "SELECT t FROM Transtockout t WHERE t.qtyout = :qtyout"),
    @NamedQuery(name = "Transtockout.findByQtyrqst", query = "SELECT t FROM Transtockout t WHERE t.qtyrqst = :qtyrqst"),
    @NamedQuery(name = "Transtockout.findByFrmstoreid", query = "SELECT t FROM Transtockout t WHERE t.frmstoreid = :frmstoreid"),
    @NamedQuery(name = "Transtockout.findByApprovedby", query = "SELECT t FROM Transtockout t WHERE t.approvedby = :approvedby"),
    @NamedQuery(name = "Transtockout.findByDatecreated", query = "SELECT t FROM Transtockout t WHERE t.datecreated = :datecreated"),
    @NamedQuery(name = "Transtockout.findByEnteredbyid", query = "SELECT t FROM Transtockout t WHERE t.enteredbyid = :enteredbyid"),
    @NamedQuery(name = "Transtockout.findByActive", query = "SELECT t FROM Transtockout t WHERE t.active = :active")})
public class Transtockout implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "stockoutid")
    private Integer stockoutid;
    @Column(name = "itemid")
    private Integer itemid;
    @Column(name = "recipientId")
    private Integer recipientId;
    @Column(name = "RecipientName")
    private String recipientName;
    @Column(name = "DocumentNo")
    private String documentNo;
    @Column(name = "fromstockinId")
    private Integer fromstockinId;
    @Column(name = "recipienttype")
    private String recipienttype;
    @Column(name = "dateout")
    @Temporal(TemporalType.DATE)
    private Date dateout;
    @Column(name = "returned")
    private Boolean returned;
    @Column(name = "returneddate")
    @Temporal(TemporalType.DATE)
    private Date returneddate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "qtyout")
    private BigDecimal qtyout;
    @Column(name = "qtyrqst")
    private BigDecimal qtyrqst;
    @Column(name = "frmstoreid")
    private Integer frmstoreid;
    @Column(name = "approvedby")
    private String approvedby;
    @Basic(optional = false)
    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreated;
    @Column(name = "enteredbyid")
    private Integer enteredbyid;
    @Column(name = "active")
    private Short active;
    @JoinColumn(name = "stockouttypeid", referencedColumnName = "stockouttypeid")
    @ManyToOne
    private Lststockouttype stockouttypeid;
    @JoinColumn(name = "tranlogid", referencedColumnName = "tranlogid")
    @ManyToOne
    private Tranlogs tranlogid;

    public Transtockout() {
    }

    public Transtockout(Integer stockoutid) {
        this.stockoutid = stockoutid;
    }

    public Transtockout(Integer stockoutid, Date datecreated) {
        this.stockoutid = stockoutid;
        this.datecreated = datecreated;
    }

    public Integer getStockoutid() {
        return stockoutid;
    }

    public void setStockoutid(Integer stockoutid) {
        this.stockoutid = stockoutid;
    }

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public Integer getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(Integer recipientId) {
        this.recipientId = recipientId;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getDocumentNo() {
        return documentNo;
    }

    public void setDocumentNo(String documentNo) {
        this.documentNo = documentNo;
    }

    public Integer getFromstockinId() {
        return fromstockinId;
    }

    public void setFromstockinId(Integer fromstockinId) {
        this.fromstockinId = fromstockinId;
    }

    public String getRecipienttype() {
        return recipienttype;
    }

    public void setRecipienttype(String recipienttype) {
        this.recipienttype = recipienttype;
    }

    public Date getDateout() {
        return dateout;
    }

    public void setDateout(Date dateout) {
        this.dateout = dateout;
    }

    public Boolean getReturned() {
        return returned;
    }

    public void setReturned(Boolean returned) {
        this.returned = returned;
    }

    public Date getReturneddate() {
        return returneddate;
    }

    public void setReturneddate(Date returneddate) {
        this.returneddate = returneddate;
    }

    public BigDecimal getQtyout() {
        return qtyout;
    }

    public void setQtyout(BigDecimal qtyout) {
        this.qtyout = qtyout;
    }

    public BigDecimal getQtyrqst() {
        return qtyrqst;
    }

    public void setQtyrqst(BigDecimal qtyrqst) {
        this.qtyrqst = qtyrqst;
    }

    public Integer getFrmstoreid() {
        return frmstoreid;
    }

    public void setFrmstoreid(Integer frmstoreid) {
        this.frmstoreid = frmstoreid;
    }

    public String getApprovedby() {
        return approvedby;
    }

    public void setApprovedby(String approvedby) {
        this.approvedby = approvedby;
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

    public Lststockouttype getStockouttypeid() {
        return stockouttypeid;
    }

    public void setStockouttypeid(Lststockouttype stockouttypeid) {
        this.stockouttypeid = stockouttypeid;
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
        hash += (stockoutid != null ? stockoutid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transtockout)) {
            return false;
        }
        Transtockout other = (Transtockout) object;
        if ((this.stockoutid == null && other.stockoutid != null) || (this.stockoutid != null && !this.stockoutid.equals(other.stockoutid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.comsoftacuity.db.Transtockout[ stockoutid=" + stockoutid + " ]";
    }
    
}
