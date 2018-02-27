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
@Table(name = "lstcategoryleveltype")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lstcategoryleveltype.findAll", query = "SELECT l FROM Lstcategoryleveltype l"),
    @NamedQuery(name = "Lstcategoryleveltype.findByCategoryleveltypeid", query = "SELECT l FROM Lstcategoryleveltype l WHERE l.categoryleveltypeid = :categoryleveltypeid"),
    @NamedQuery(name = "Lstcategoryleveltype.findByCategoryleveltype", query = "SELECT l FROM Lstcategoryleveltype l WHERE l.categoryleveltype = :categoryleveltype"),
    @NamedQuery(name = "Lstcategoryleveltype.findByDatecreated", query = "SELECT l FROM Lstcategoryleveltype l WHERE l.datecreated = :datecreated"),
    @NamedQuery(name = "Lstcategoryleveltype.findByActive", query = "SELECT l FROM Lstcategoryleveltype l WHERE l.active = :active")})
public class Lstcategoryleveltype implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "categoryleveltypeid")
    private Integer categoryleveltypeid;
    @Column(name = "categoryleveltype")
    private String categoryleveltype;
    @Basic(optional = false)
    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreated;
    @Column(name = "active")
    private Short active;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "categoryleveltypeid")
    private List<Lstsubcategorytree> lstsubcategorytreeList;
    @JoinColumn(name = "lstmainid", referencedColumnName = "lstmainid")
    @ManyToOne
    private Lstmain lstmainid;

    public Lstcategoryleveltype() {
    }

    public Lstcategoryleveltype(Integer categoryleveltypeid) {
        this.categoryleveltypeid = categoryleveltypeid;
    }

    public Lstcategoryleveltype(Integer categoryleveltypeid, Date datecreated) {
        this.categoryleveltypeid = categoryleveltypeid;
        this.datecreated = datecreated;
    }

    public Integer getCategoryleveltypeid() {
        return categoryleveltypeid;
    }

    public void setCategoryleveltypeid(Integer categoryleveltypeid) {
        this.categoryleveltypeid = categoryleveltypeid;
    }

    public String getCategoryleveltype() {
        return categoryleveltype;
    }

    public void setCategoryleveltype(String categoryleveltype) {
        this.categoryleveltype = categoryleveltype;
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
    public List<Lstsubcategorytree> getLstsubcategorytreeList() {
        return lstsubcategorytreeList;
    }

    public void setLstsubcategorytreeList(List<Lstsubcategorytree> lstsubcategorytreeList) {
        this.lstsubcategorytreeList = lstsubcategorytreeList;
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
        hash += (categoryleveltypeid != null ? categoryleveltypeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lstcategoryleveltype)) {
            return false;
        }
        Lstcategoryleveltype other = (Lstcategoryleveltype) object;
        if ((this.categoryleveltypeid == null && other.categoryleveltypeid != null) || (this.categoryleveltypeid != null && !this.categoryleveltypeid.equals(other.categoryleveltypeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.comsoftacuity.db.Lstcategoryleveltype[ categoryleveltypeid=" + categoryleveltypeid + " ]";
    }
    
}
