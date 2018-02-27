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
@Table(name = "tranmain")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tranmain.findAll", query = "SELECT t FROM Tranmain t"),
    @NamedQuery(name = "Tranmain.findById", query = "SELECT t FROM Tranmain t WHERE t.id = :id"),
    @NamedQuery(name = "Tranmain.findByTranreference", query = "SELECT t FROM Tranmain t WHERE t.tranreference = :tranreference"),
    @NamedQuery(name = "Tranmain.findByStoreid", query = "SELECT t FROM Tranmain t WHERE t.storeid = :storeid"),
    @NamedQuery(name = "Tranmain.findByCreateduserid", query = "SELECT t FROM Tranmain t WHERE t.createduserid = :createduserid"),
    @NamedQuery(name = "Tranmain.findByRecievedbyId", query = "SELECT t FROM Tranmain t WHERE t.recievedbyId = :recievedbyId"),
    @NamedQuery(name = "Tranmain.findBySupplierId", query = "SELECT t FROM Tranmain t WHERE t.supplierId = :supplierId"),
    @NamedQuery(name = "Tranmain.findBySuppliername", query = "SELECT t FROM Tranmain t WHERE t.suppliername = :suppliername"),
    @NamedQuery(name = "Tranmain.findByStocktakingby", query = "SELECT t FROM Tranmain t WHERE t.stocktakingby = :stocktakingby"),
    @NamedQuery(name = "Tranmain.findByCarriedby", query = "SELECT t FROM Tranmain t WHERE t.carriedby = :carriedby"),
    @NamedQuery(name = "Tranmain.findByApprovedby", query = "SELECT t FROM Tranmain t WHERE t.approvedby = :approvedby"),
    @NamedQuery(name = "Tranmain.findByTrandate", query = "SELECT t FROM Tranmain t WHERE t.trandate = :trandate"),
    @NamedQuery(name = "Tranmain.findByTrantype", query = "SELECT t FROM Tranmain t WHERE t.trantype = :trantype")})
public class Tranmain implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "tranreference")
    private String tranreference;
    @Column(name = "storeid")
    private Integer storeid;
    @Column(name = "createduserid")
    private Integer createduserid;
    @Column(name = "recievedbyId")
    private Integer recievedbyId;
    @Column(name = "supplierId")
    private Integer supplierId;
    @Column(name = "suppliername")
    private String suppliername;
    @Column(name = "stocktakingby")
    private String stocktakingby;
    @Column(name = "carriedby")
    private String carriedby;
    @Column(name = "approvedby")
    private String approvedby;
    @Column(name = "trandate")
    @Temporal(TemporalType.DATE)
    private Date trandate;
    @Column(name = "trantype")
    private String trantype;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "tranmainid")
    private List<Tranlogs> tranlogsList;

    public Tranmain() {
    }

    public Tranmain(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTranreference() {
        return tranreference;
    }

    public void setTranreference(String tranreference) {
        this.tranreference = tranreference;
    }

    public Integer getStoreid() {
        return storeid;
    }

    public void setStoreid(Integer storeid) {
        this.storeid = storeid;
    }

    public Integer getCreateduserid() {
        return createduserid;
    }

    public void setCreateduserid(Integer createduserid) {
        this.createduserid = createduserid;
    }

    public Integer getRecievedbyId() {
        return recievedbyId;
    }

    public void setRecievedbyId(Integer recievedbyId) {
        this.recievedbyId = recievedbyId;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
    }

    public String getStocktakingby() {
        return stocktakingby;
    }

    public void setStocktakingby(String stocktakingby) {
        this.stocktakingby = stocktakingby;
    }

    public String getCarriedby() {
        return carriedby;
    }

    public void setCarriedby(String carriedby) {
        this.carriedby = carriedby;
    }

    public String getApprovedby() {
        return approvedby;
    }

    public void setApprovedby(String approvedby) {
        this.approvedby = approvedby;
    }

    public Date getTrandate() {
        return trandate;
    }

    public void setTrandate(Date trandate) {
        this.trandate = trandate;
    }

    public String getTrantype() {
        return trantype;
    }

    public void setTrantype(String trantype) {
        this.trantype = trantype;
    }

    @XmlTransient
    public List<Tranlogs> getTranlogsList() {
        return tranlogsList;
    }

    public void setTranlogsList(List<Tranlogs> tranlogsList) {
        this.tranlogsList = tranlogsList;
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
        if (!(object instanceof Tranmain)) {
            return false;
        }
        Tranmain other = (Tranmain) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.comsoftacuity.db.Tranmain[ id=" + id + " ]";
    }
    
}
