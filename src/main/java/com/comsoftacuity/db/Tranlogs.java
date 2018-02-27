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
@Table(name = "tranlogs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tranlogs.findAll", query = "SELECT t FROM Tranlogs t"),
    @NamedQuery(name = "Tranlogs.findByTranlogid", query = "SELECT t FROM Tranlogs t WHERE t.tranlogid = :tranlogid"),
    @NamedQuery(name = "Tranlogs.findByQtyin", query = "SELECT t FROM Tranlogs t WHERE t.qtyin = :qtyin"),
    @NamedQuery(name = "Tranlogs.findByQtyout", query = "SELECT t FROM Tranlogs t WHERE t.qtyout = :qtyout"),
    @NamedQuery(name = "Tranlogs.findByEnteredbyid", query = "SELECT t FROM Tranlogs t WHERE t.enteredbyid = :enteredbyid"),
    @NamedQuery(name = "Tranlogs.findByDatecreated", query = "SELECT t FROM Tranlogs t WHERE t.datecreated = :datecreated"),
    @NamedQuery(name = "Tranlogs.findByActive", query = "SELECT t FROM Tranlogs t WHERE t.active = :active")})
public class Tranlogs implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tranlogid")
    private Integer tranlogid;
    @Column(name = "qtyin")
    private Integer qtyin;
    @Column(name = "qtyout")
    private Integer qtyout;
    @Column(name = "enteredbyid")
    private Integer enteredbyid;
    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreated;
    @Column(name = "active")
    private Integer active;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "tranlogid")
    private List<Transtocklevel> transtocklevelList;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "tranlogid")
    private List<Trandisposal> trandisposalList;
    @JoinColumn(name = "institutionid", referencedColumnName = "institutionid")
    @ManyToOne
    private Prmintinstitution institutionid;
    @JoinColumn(name = "itemid", referencedColumnName = "itemid")
    @ManyToOne
    private Regitems itemid;
    @JoinColumn(name = "storeid", referencedColumnName = "storeid")
    @ManyToOne
    private Lststores storeid;
    @JoinColumn(name = "tranmainid", referencedColumnName = "id")
    @ManyToOne
    private Tranmain tranmainid;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "tranlogid")
    private List<Transtockin> transtockinList;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "tranlogid")
    private List<Transtocktaking> transtocktakingList;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "tranlogid")
    private List<Trantransfers> trantransfersList;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "tranlogid")
    private List<Transtockout> transtockoutList;

    public Tranlogs() {
    }

    public Tranlogs(Integer tranlogid) {
        this.tranlogid = tranlogid;
    }

    public Integer getTranlogid() {
        return tranlogid;
    }

    public void setTranlogid(Integer tranlogid) {
        this.tranlogid = tranlogid;
    }

    public Integer getQtyin() {
        return qtyin;
    }

    public void setQtyin(Integer qtyin) {
        this.qtyin = qtyin;
    }

    public Integer getQtyout() {
        return qtyout;
    }

    public void setQtyout(Integer qtyout) {
        this.qtyout = qtyout;
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

    @XmlTransient
    public List<Transtocklevel> getTranstocklevelList() {
        return transtocklevelList;
    }

    public void setTranstocklevelList(List<Transtocklevel> transtocklevelList) {
        this.transtocklevelList = transtocklevelList;
    }

    @XmlTransient
    public List<Trandisposal> getTrandisposalList() {
        return trandisposalList;
    }

    public void setTrandisposalList(List<Trandisposal> trandisposalList) {
        this.trandisposalList = trandisposalList;
    }

    public Prmintinstitution getInstitutionid() {
        return institutionid;
    }

    public void setInstitutionid(Prmintinstitution institutionid) {
        this.institutionid = institutionid;
    }

    public Regitems getItemid() {
        return itemid;
    }

    public void setItemid(Regitems itemid) {
        this.itemid = itemid;
    }

    public Lststores getStoreid() {
        return storeid;
    }

    public void setStoreid(Lststores storeid) {
        this.storeid = storeid;
    }

    public Tranmain getTranmainid() {
        return tranmainid;
    }

    public void setTranmainid(Tranmain tranmainid) {
        this.tranmainid = tranmainid;
    }

    @XmlTransient
    public List<Transtockin> getTranstockinList() {
        return transtockinList;
    }

    public void setTranstockinList(List<Transtockin> transtockinList) {
        this.transtockinList = transtockinList;
    }

    @XmlTransient
    public List<Transtocktaking> getTranstocktakingList() {
        return transtocktakingList;
    }

    public void setTranstocktakingList(List<Transtocktaking> transtocktakingList) {
        this.transtocktakingList = transtocktakingList;
    }

    @XmlTransient
    public List<Trantransfers> getTrantransfersList() {
        return trantransfersList;
    }

    public void setTrantransfersList(List<Trantransfers> trantransfersList) {
        this.trantransfersList = trantransfersList;
    }

    @XmlTransient
    public List<Transtockout> getTranstockoutList() {
        return transtockoutList;
    }

    public void setTranstockoutList(List<Transtockout> transtockoutList) {
        this.transtockoutList = transtockoutList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tranlogid != null ? tranlogid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tranlogs)) {
            return false;
        }
        Tranlogs other = (Tranlogs) object;
        if ((this.tranlogid == null && other.tranlogid != null) || (this.tranlogid != null && !this.tranlogid.equals(other.tranlogid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.comsoftacuity.db.Tranlogs[ tranlogid=" + tranlogid + " ]";
    }
    
}
