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
@Table(name = "regitems")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Regitems.findAll", query = "SELECT r FROM Regitems r"),
    @NamedQuery(name = "Regitems.findByItemid", query = "SELECT r FROM Regitems r WHERE r.itemid = :itemid"),
    @NamedQuery(name = "Regitems.findByItemcode", query = "SELECT r FROM Regitems r WHERE r.itemcode = :itemcode"),
    @NamedQuery(name = "Regitems.findByItemname", query = "SELECT r FROM Regitems r WHERE r.itemname = :itemname"),
    @NamedQuery(name = "Regitems.findByAliasname", query = "SELECT r FROM Regitems r WHERE r.aliasname = :aliasname"),
    @NamedQuery(name = "Regitems.findByMeasureunitid", query = "SELECT r FROM Regitems r WHERE r.measureunitid = :measureunitid"),
    @NamedQuery(name = "Regitems.findByMeasurepackid", query = "SELECT r FROM Regitems r WHERE r.measurepackid = :measurepackid"),
    @NamedQuery(name = "Regitems.findByBarcode", query = "SELECT r FROM Regitems r WHERE r.barcode = :barcode"),
    @NamedQuery(name = "Regitems.findByRfidnumber", query = "SELECT r FROM Regitems r WHERE r.rfidnumber = :rfidnumber"),
    @NamedQuery(name = "Regitems.findByUsemeasure", query = "SELECT r FROM Regitems r WHERE r.usemeasure = :usemeasure"),
    @NamedQuery(name = "Regitems.findByDatecreated", query = "SELECT r FROM Regitems r WHERE r.datecreated = :datecreated"),
    @NamedQuery(name = "Regitems.findByEnteredbid", query = "SELECT r FROM Regitems r WHERE r.enteredbid = :enteredbid"),
    @NamedQuery(name = "Regitems.findByActive", query = "SELECT r FROM Regitems r WHERE r.active = :active")})
public class Regitems implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "itemid")
    private Integer itemid;
    @Basic(optional = false)
    @Column(name = "itemcode")
    private String itemcode;
    @Column(name = "itemname")
    private String itemname;
    @Column(name = "aliasname")
    private String aliasname;
    @Column(name = "measureunitid")
    private Integer measureunitid;
    @Column(name = "measurepackid")
    private Integer measurepackid;
    @Column(name = "barcode")
    private String barcode;
    @Column(name = "rfidnumber")
    private String rfidnumber;
    @Column(name = "usemeasure")
    private String usemeasure;
    @Basic(optional = false)
    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreated;
    @Column(name = "enteredbid")
    private Integer enteredbid;
    @Column(name = "active")
    private Short active;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "itemid")
    private List<Trandepreciation> trandepreciationList;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "itemid")
    private List<Tranlogs> tranlogsList;
    @JoinColumn(name = "subcategorytid", referencedColumnName = "subcategorytid")
    @ManyToOne
    private Lstsubcategorytree subcategorytid;
    @JoinColumn(name = "institutionid", referencedColumnName = "institutionid")
    @ManyToOne
    private Prmintinstitution institutionid;

    public Regitems() {
    }

    public Regitems(Integer itemid) {
        this.itemid = itemid;
    }

    public Regitems(Integer itemid, String itemcode, Date datecreated) {
        this.itemid = itemid;
        this.itemcode = itemcode;
        this.datecreated = datecreated;
    }

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getAliasname() {
        return aliasname;
    }

    public void setAliasname(String aliasname) {
        this.aliasname = aliasname;
    }

    public Integer getMeasureunitid() {
        return measureunitid;
    }

    public void setMeasureunitid(Integer measureunitid) {
        this.measureunitid = measureunitid;
    }

    public Integer getMeasurepackid() {
        return measurepackid;
    }

    public void setMeasurepackid(Integer measurepackid) {
        this.measurepackid = measurepackid;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getRfidnumber() {
        return rfidnumber;
    }

    public void setRfidnumber(String rfidnumber) {
        this.rfidnumber = rfidnumber;
    }

    public String getUsemeasure() {
        return usemeasure;
    }

    public void setUsemeasure(String usemeasure) {
        this.usemeasure = usemeasure;
    }

    public Date getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }

    public Integer getEnteredbid() {
        return enteredbid;
    }

    public void setEnteredbid(Integer enteredbid) {
        this.enteredbid = enteredbid;
    }

    public Short getActive() {
        return active;
    }

    public void setActive(Short active) {
        this.active = active;
    }

    @XmlTransient
    public List<Trandepreciation> getTrandepreciationList() {
        return trandepreciationList;
    }

    public void setTrandepreciationList(List<Trandepreciation> trandepreciationList) {
        this.trandepreciationList = trandepreciationList;
    }

    @XmlTransient
    public List<Tranlogs> getTranlogsList() {
        return tranlogsList;
    }

    public void setTranlogsList(List<Tranlogs> tranlogsList) {
        this.tranlogsList = tranlogsList;
    }

    public Lstsubcategorytree getSubcategorytid() {
        return subcategorytid;
    }

    public void setSubcategorytid(Lstsubcategorytree subcategorytid) {
        this.subcategorytid = subcategorytid;
    }

    public Prmintinstitution getInstitutionid() {
        return institutionid;
    }

    public void setInstitutionid(Prmintinstitution institutionid) {
        this.institutionid = institutionid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemid != null ? itemid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Regitems)) {
            return false;
        }
        Regitems other = (Regitems) object;
        if ((this.itemid == null && other.itemid != null) || (this.itemid != null && !this.itemid.equals(other.itemid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.comsoftacuity.db.Regitems[ itemid=" + itemid + " ]";
    }
    
}
