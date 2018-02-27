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
@Table(name = "lstmain")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lstmain.findAll", query = "SELECT l FROM Lstmain l"),
    @NamedQuery(name = "Lstmain.findByLstmainid", query = "SELECT l FROM Lstmain l WHERE l.lstmainid = :lstmainid"),
    @NamedQuery(name = "Lstmain.findByDescription", query = "SELECT l FROM Lstmain l WHERE l.description = :description"),
    @NamedQuery(name = "Lstmain.findByDatecreated", query = "SELECT l FROM Lstmain l WHERE l.datecreated = :datecreated")})
public class Lstmain implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "lstmainid")
    private Integer lstmainid;
    @Column(name = "description")
    private String description;
    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreated;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "lstmainid")
    private List<Lstsubcategorytree> lstsubcategorytreeList;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "lstmainid")
    private List<Lststores> lststoresList;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "lstmainid")
    private List<Lstsupplytype> lstsupplytypeList;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "lstmainid")
    private List<Lstinventorytype> lstinventorytypeList;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "lstmainid")
    private List<Lstmeasureunit> lstmeasureunitList;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "lstmainid")
    private List<Lstcategoryleveltype> lstcategoryleveltypeList;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "lstmainid")
    private List<Userusergroup> userusergroupList;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "lstmainid")
    private List<Lststockleveltype> lststockleveltypeList;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "lstmainid")
    private List<Lstmeasurepack> lstmeasurepackList;
    @JoinColumn(name = "institutionid", referencedColumnName = "institutionid")
    @ManyToOne
    private Prmintinstitution institutionid;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "lstmainid")
    private List<Lststockoutreceipttype> lststockoutreceipttypeList;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "lstmainid")
    private List<Lststockouttype> lststockouttypeList;

    public Lstmain() {
    }

    public Lstmain(Integer lstmainid) {
        this.lstmainid = lstmainid;
    }

    public Integer getLstmainid() {
        return lstmainid;
    }

    public void setLstmainid(Integer lstmainid) {
        this.lstmainid = lstmainid;
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

    @XmlTransient
    public List<Lstsubcategorytree> getLstsubcategorytreeList() {
        return lstsubcategorytreeList;
    }

    public void setLstsubcategorytreeList(List<Lstsubcategorytree> lstsubcategorytreeList) {
        this.lstsubcategorytreeList = lstsubcategorytreeList;
    }

    @XmlTransient
    public List<Lststores> getLststoresList() {
        return lststoresList;
    }

    public void setLststoresList(List<Lststores> lststoresList) {
        this.lststoresList = lststoresList;
    }

    @XmlTransient
    public List<Lstsupplytype> getLstsupplytypeList() {
        return lstsupplytypeList;
    }

    public void setLstsupplytypeList(List<Lstsupplytype> lstsupplytypeList) {
        this.lstsupplytypeList = lstsupplytypeList;
    }

    @XmlTransient
    public List<Lstinventorytype> getLstinventorytypeList() {
        return lstinventorytypeList;
    }

    public void setLstinventorytypeList(List<Lstinventorytype> lstinventorytypeList) {
        this.lstinventorytypeList = lstinventorytypeList;
    }

    @XmlTransient
    public List<Lstmeasureunit> getLstmeasureunitList() {
        return lstmeasureunitList;
    }

    public void setLstmeasureunitList(List<Lstmeasureunit> lstmeasureunitList) {
        this.lstmeasureunitList = lstmeasureunitList;
    }

    @XmlTransient
    public List<Lstcategoryleveltype> getLstcategoryleveltypeList() {
        return lstcategoryleveltypeList;
    }

    public void setLstcategoryleveltypeList(List<Lstcategoryleveltype> lstcategoryleveltypeList) {
        this.lstcategoryleveltypeList = lstcategoryleveltypeList;
    }

    @XmlTransient
    public List<Userusergroup> getUserusergroupList() {
        return userusergroupList;
    }

    public void setUserusergroupList(List<Userusergroup> userusergroupList) {
        this.userusergroupList = userusergroupList;
    }

    @XmlTransient
    public List<Lststockleveltype> getLststockleveltypeList() {
        return lststockleveltypeList;
    }

    public void setLststockleveltypeList(List<Lststockleveltype> lststockleveltypeList) {
        this.lststockleveltypeList = lststockleveltypeList;
    }

    @XmlTransient
    public List<Lstmeasurepack> getLstmeasurepackList() {
        return lstmeasurepackList;
    }

    public void setLstmeasurepackList(List<Lstmeasurepack> lstmeasurepackList) {
        this.lstmeasurepackList = lstmeasurepackList;
    }

    public Prmintinstitution getInstitutionid() {
        return institutionid;
    }

    public void setInstitutionid(Prmintinstitution institutionid) {
        this.institutionid = institutionid;
    }

    @XmlTransient
    public List<Lststockoutreceipttype> getLststockoutreceipttypeList() {
        return lststockoutreceipttypeList;
    }

    public void setLststockoutreceipttypeList(List<Lststockoutreceipttype> lststockoutreceipttypeList) {
        this.lststockoutreceipttypeList = lststockoutreceipttypeList;
    }

    @XmlTransient
    public List<Lststockouttype> getLststockouttypeList() {
        return lststockouttypeList;
    }

    public void setLststockouttypeList(List<Lststockouttype> lststockouttypeList) {
        this.lststockouttypeList = lststockouttypeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lstmainid != null ? lstmainid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lstmain)) {
            return false;
        }
        Lstmain other = (Lstmain) object;
        if ((this.lstmainid == null && other.lstmainid != null) || (this.lstmainid != null && !this.lstmainid.equals(other.lstmainid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.comsoftacuity.db.Lstmain[ lstmainid=" + lstmainid + " ]";
    }
    
}
