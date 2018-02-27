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
@Table(name = "trandisposal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trandisposal.findAll", query = "SELECT t FROM Trandisposal t"),
    @NamedQuery(name = "Trandisposal.findById", query = "SELECT t FROM Trandisposal t WHERE t.id = :id"),
    @NamedQuery(name = "Trandisposal.findByItemid", query = "SELECT t FROM Trandisposal t WHERE t.itemid = :itemid"),
    @NamedQuery(name = "Trandisposal.findByDateoftran", query = "SELECT t FROM Trandisposal t WHERE t.dateoftran = :dateoftran"),
    @NamedQuery(name = "Trandisposal.findByBatchno", query = "SELECT t FROM Trandisposal t WHERE t.batchno = :batchno"),
    @NamedQuery(name = "Trandisposal.findByQtydisposed", query = "SELECT t FROM Trandisposal t WHERE t.qtydisposed = :qtydisposed"),
    @NamedQuery(name = "Trandisposal.findByStatusatdisposal", query = "SELECT t FROM Trandisposal t WHERE t.statusatdisposal = :statusatdisposal"),
    @NamedQuery(name = "Trandisposal.findByDisposaltypeId", query = "SELECT t FROM Trandisposal t WHERE t.disposaltypeId = :disposaltypeId"),
    @NamedQuery(name = "Trandisposal.findByDisposalstatus", query = "SELECT t FROM Trandisposal t WHERE t.disposalstatus = :disposalstatus"),
    @NamedQuery(name = "Trandisposal.findByEnteredbyId", query = "SELECT t FROM Trandisposal t WHERE t.enteredbyId = :enteredbyId"),
    @NamedQuery(name = "Trandisposal.findByDatecreated", query = "SELECT t FROM Trandisposal t WHERE t.datecreated = :datecreated"),
    @NamedQuery(name = "Trandisposal.findByActive", query = "SELECT t FROM Trandisposal t WHERE t.active = :active")})
public class Trandisposal implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "itemid")
    private Integer itemid;
    @Column(name = "dateoftran")
    @Temporal(TemporalType.DATE)
    private Date dateoftran;
    @Column(name = "batchno")
    private String batchno;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "qtydisposed")
    private BigDecimal qtydisposed;
    @Column(name = "statusatdisposal")
    private String statusatdisposal;
    @Column(name = "disposaltypeId")
    private Integer disposaltypeId;
    @Column(name = "disposalstatus")
    private String disposalstatus;
    @Column(name = "enteredbyId")
    private Integer enteredbyId;
    @Basic(optional = false)
    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreated;
    @Column(name = "active")
    private Short active;
    @JoinColumn(name = "tranlogid", referencedColumnName = "tranlogid")
    @ManyToOne
    private Tranlogs tranlogid;

    public Trandisposal() {
    }

    public Trandisposal(Integer id) {
        this.id = id;
    }

    public Trandisposal(Integer id, Date datecreated) {
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

    public Date getDateoftran() {
        return dateoftran;
    }

    public void setDateoftran(Date dateoftran) {
        this.dateoftran = dateoftran;
    }

    public String getBatchno() {
        return batchno;
    }

    public void setBatchno(String batchno) {
        this.batchno = batchno;
    }

    public BigDecimal getQtydisposed() {
        return qtydisposed;
    }

    public void setQtydisposed(BigDecimal qtydisposed) {
        this.qtydisposed = qtydisposed;
    }

    public String getStatusatdisposal() {
        return statusatdisposal;
    }

    public void setStatusatdisposal(String statusatdisposal) {
        this.statusatdisposal = statusatdisposal;
    }

    public Integer getDisposaltypeId() {
        return disposaltypeId;
    }

    public void setDisposaltypeId(Integer disposaltypeId) {
        this.disposaltypeId = disposaltypeId;
    }

    public String getDisposalstatus() {
        return disposalstatus;
    }

    public void setDisposalstatus(String disposalstatus) {
        this.disposalstatus = disposalstatus;
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
        if (!(object instanceof Trandisposal)) {
            return false;
        }
        Trandisposal other = (Trandisposal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.comsoftacuity.db.Trandisposal[ id=" + id + " ]";
    }
    
}
