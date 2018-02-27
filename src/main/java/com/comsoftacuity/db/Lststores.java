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
@Table(name = "lststores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lststores.findAll", query = "SELECT l FROM Lststores l"),
    @NamedQuery(name = "Lststores.findByStoreid", query = "SELECT l FROM Lststores l WHERE l.storeid = :storeid"),
    @NamedQuery(name = "Lststores.findByParentId", query = "SELECT l FROM Lststores l WHERE l.parentId = :parentId"),
    @NamedQuery(name = "Lststores.findByStorelevelname", query = "SELECT l FROM Lststores l WHERE l.storelevelname = :storelevelname"),
    @NamedQuery(name = "Lststores.findByDatecreated", query = "SELECT l FROM Lststores l WHERE l.datecreated = :datecreated"),
    @NamedQuery(name = "Lststores.findByActive", query = "SELECT l FROM Lststores l WHERE l.active = :active")})
public class Lststores implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "storeid")
    private Integer storeid;
    @Column(name = "parentId")
    private Integer parentId;
    @Column(name = "storelevelname")
    private String storelevelname;
    @Basic(optional = false)
    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreated;
    @Column(name = "Active")
    private Short active;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "storeid")
    private List<Tranlogs> tranlogsList;
    @JoinColumn(name = "lstmainid", referencedColumnName = "lstmainid")
    @ManyToOne
    private Lstmain lstmainid;
    @JoinColumn(name = "storetypeid", referencedColumnName = "storetypeid")
    @ManyToOne
    private Lststockleveltype storetypeid;

    public Lststores() {
    }

    public Lststores(Integer storeid) {
        this.storeid = storeid;
    }

    public Lststores(Integer storeid, Date datecreated) {
        this.storeid = storeid;
        this.datecreated = datecreated;
    }

    public Integer getStoreid() {
        return storeid;
    }

    public void setStoreid(Integer storeid) {
        this.storeid = storeid;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getStorelevelname() {
        return storelevelname;
    }

    public void setStorelevelname(String storelevelname) {
        this.storelevelname = storelevelname;
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

    @XmlTransient
    public List<Tranlogs> getTranlogsList() {
        return tranlogsList;
    }

    public void setTranlogsList(List<Tranlogs> tranlogsList) {
        this.tranlogsList = tranlogsList;
    }

    public Lstmain getLstmainid() {
        return lstmainid;
    }

    public void setLstmainid(Lstmain lstmainid) {
        this.lstmainid = lstmainid;
    }

    public Lststockleveltype getStoretypeid() {
        return storetypeid;
    }

    public void setStoretypeid(Lststockleveltype storetypeid) {
        this.storetypeid = storetypeid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (storeid != null ? storeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lststores)) {
            return false;
        }
        Lststores other = (Lststores) object;
        if ((this.storeid == null && other.storeid != null) || (this.storeid != null && !this.storeid.equals(other.storeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.comsoftacuity.db.Lststores[ storeid=" + storeid + " ]";
    }
    
}
