/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comsoftacuity.db;

import java.io.Serializable;
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
@Table(name = "lstinventorytype")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lstinventorytype.findAll", query = "SELECT l FROM Lstinventorytype l"),
    @NamedQuery(name = "Lstinventorytype.findByInventorytypeid", query = "SELECT l FROM Lstinventorytype l WHERE l.inventorytypeid = :inventorytypeid"),
    @NamedQuery(name = "Lstinventorytype.findByInventorytype", query = "SELECT l FROM Lstinventorytype l WHERE l.inventorytype = :inventorytype"),
    @NamedQuery(name = "Lstinventorytype.findByDatecreated", query = "SELECT l FROM Lstinventorytype l WHERE l.datecreated = :datecreated"),
    @NamedQuery(name = "Lstinventorytype.findByActive", query = "SELECT l FROM Lstinventorytype l WHERE l.active = :active")})
public class Lstinventorytype implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "inventorytypeid")
    private Integer inventorytypeid;
    @Basic(optional = false)
    @Column(name = "inventorytype")
    private String inventorytype;
    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreated;
    @Column(name = "active")
    private Short active;
    @JoinColumn(name = "lstmainid", referencedColumnName = "lstmainid")
    @ManyToOne
    private Lstmain lstmainid;

    public Lstinventorytype() {
    }

    public Lstinventorytype(Integer inventorytypeid) {
        this.inventorytypeid = inventorytypeid;
    }

    public Lstinventorytype(Integer inventorytypeid, String inventorytype) {
        this.inventorytypeid = inventorytypeid;
        this.inventorytype = inventorytype;
    }

    public Integer getInventorytypeid() {
        return inventorytypeid;
    }

    public void setInventorytypeid(Integer inventorytypeid) {
        this.inventorytypeid = inventorytypeid;
    }

    public String getInventorytype() {
        return inventorytype;
    }

    public void setInventorytype(String inventorytype) {
        this.inventorytype = inventorytype;
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

    public Lstmain getLstmainid() {
        return lstmainid;
    }

    public void setLstmainid(Lstmain lstmainid) {
        this.lstmainid = lstmainid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inventorytypeid != null ? inventorytypeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lstinventorytype)) {
            return false;
        }
        Lstinventorytype other = (Lstinventorytype) object;
        if ((this.inventorytypeid == null && other.inventorytypeid != null) || (this.inventorytypeid != null && !this.inventorytypeid.equals(other.inventorytypeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.comsoftacuity.db.Lstinventorytype[ inventorytypeid=" + inventorytypeid + " ]";
    }
    
}
