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
@Table(name = "lststockleveltype")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lststockleveltype.findAll", query = "SELECT l FROM Lststockleveltype l"),
    @NamedQuery(name = "Lststockleveltype.findByStoretypeid", query = "SELECT l FROM Lststockleveltype l WHERE l.storetypeid = :storetypeid"),
    @NamedQuery(name = "Lststockleveltype.findByDescription", query = "SELECT l FROM Lststockleveltype l WHERE l.description = :description"),
    @NamedQuery(name = "Lststockleveltype.findByDatecreated", query = "SELECT l FROM Lststockleveltype l WHERE l.datecreated = :datecreated"),
    @NamedQuery(name = "Lststockleveltype.findByActive", query = "SELECT l FROM Lststockleveltype l WHERE l.active = :active")})
public class Lststockleveltype implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "storetypeid")
    private Integer storetypeid;
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreated;
    @Column(name = "active")
    private Short active;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "storetypeid")
    private List<Lststores> lststoresList;
    @JoinColumn(name = "lstmainid", referencedColumnName = "lstmainid")
    @ManyToOne
    private Lstmain lstmainid;

    public Lststockleveltype() {
    }

    public Lststockleveltype(Integer storetypeid) {
        this.storetypeid = storetypeid;
    }

    public Lststockleveltype(Integer storetypeid, Date datecreated) {
        this.storetypeid = storetypeid;
        this.datecreated = datecreated;
    }

    public Integer getStoretypeid() {
        return storetypeid;
    }

    public void setStoretypeid(Integer storetypeid) {
        this.storetypeid = storetypeid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
    public List<Lststores> getLststoresList() {
        return lststoresList;
    }

    public void setLststoresList(List<Lststores> lststoresList) {
        this.lststoresList = lststoresList;
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
        hash += (storetypeid != null ? storetypeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lststockleveltype)) {
            return false;
        }
        Lststockleveltype other = (Lststockleveltype) object;
        if ((this.storetypeid == null && other.storetypeid != null) || (this.storetypeid != null && !this.storetypeid.equals(other.storetypeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.comsoftacuity.db.Lststockleveltype[ storetypeid=" + storetypeid + " ]";
    }
    
}
