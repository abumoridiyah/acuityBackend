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
@Table(name = "prmintinstitution")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Prmintinstitution.findAll", query = "SELECT p FROM Prmintinstitution p"),
    @NamedQuery(name = "Prmintinstitution.findByInstitutionid", query = "SELECT p FROM Prmintinstitution p WHERE p.institutionid = :institutionid"),
    @NamedQuery(name = "Prmintinstitution.findByInstitutioncode", query = "SELECT p FROM Prmintinstitution p WHERE p.institutioncode = :institutioncode"),
    @NamedQuery(name = "Prmintinstitution.findByInstitutionname", query = "SELECT p FROM Prmintinstitution p WHERE p.institutionname = :institutionname"),
    @NamedQuery(name = "Prmintinstitution.findByAddress", query = "SELECT p FROM Prmintinstitution p WHERE p.address = :address"),
    @NamedQuery(name = "Prmintinstitution.findByContactdetails", query = "SELECT p FROM Prmintinstitution p WHERE p.contactdetails = :contactdetails"),
    @NamedQuery(name = "Prmintinstitution.findByHavebranches", query = "SELECT p FROM Prmintinstitution p WHERE p.havebranches = :havebranches"),
    @NamedQuery(name = "Prmintinstitution.findByContactmobile", query = "SELECT p FROM Prmintinstitution p WHERE p.contactmobile = :contactmobile"),
    @NamedQuery(name = "Prmintinstitution.findByContactemail", query = "SELECT p FROM Prmintinstitution p WHERE p.contactemail = :contactemail"),
    @NamedQuery(name = "Prmintinstitution.findByLicensemodel", query = "SELECT p FROM Prmintinstitution p WHERE p.licensemodel = :licensemodel"),
    @NamedQuery(name = "Prmintinstitution.findByLicense", query = "SELECT p FROM Prmintinstitution p WHERE p.license = :license"),
    @NamedQuery(name = "Prmintinstitution.findByDatecreated", query = "SELECT p FROM Prmintinstitution p WHERE p.datecreated = :datecreated"),
    @NamedQuery(name = "Prmintinstitution.findByEnteredbyid", query = "SELECT p FROM Prmintinstitution p WHERE p.enteredbyid = :enteredbyid"),
    @NamedQuery(name = "Prmintinstitution.findByActive", query = "SELECT p FROM Prmintinstitution p WHERE p.active = :active")})
public class Prmintinstitution implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "institutionid")
    private Integer institutionid;
    @Column(name = "institutioncode")
    private String institutioncode;
    @Column(name = "institutionname")
    private String institutionname;
    @Column(name = "address")
    private String address;
    @Column(name = "contactdetails")
    private String contactdetails;
    @Column(name = "havebranches")
    private Boolean havebranches;
    @Column(name = "contactmobile")
    private String contactmobile;
    @Column(name = "contactemail")
    private String contactemail;
    @Column(name = "licensemodel")
    private Integer licensemodel;
    @Column(name = "license")
    private String license;
    @Basic(optional = false)
    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreated;
    @Column(name = "enteredbyid")
    private Integer enteredbyid;
    @Column(name = "active")
    private Short active;
    @JoinColumn(name = "institutiontypeid", referencedColumnName = "institutiontypeid")
    @ManyToOne
    private Prmintinstitutiontype institutiontypeid;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "instutionid")
    private List<Trandepreciation> trandepreciationList;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "institutionid")
    private List<Tranlogs> tranlogsList;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "institutionid")
    private List<Applogalerts> applogalertsList;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "institutionid")
    private List<Prmintsuborganisationtype> prmintsuborganisationtypeList;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "institutionid")
    private List<Regitems> regitemsList;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "institutionid")
    private List<Lstmain> lstmainList;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "institutionid")
    private List<Appmodules> appmodulesList;

    public Prmintinstitution() {
    }

    public Prmintinstitution(Integer institutionid) {
        this.institutionid = institutionid;
    }

    public Prmintinstitution(Integer institutionid, Date datecreated) {
        this.institutionid = institutionid;
        this.datecreated = datecreated;
    }

    public Integer getInstitutionid() {
        return institutionid;
    }

    public void setInstitutionid(Integer institutionid) {
        this.institutionid = institutionid;
    }
 public String getInstitutioncode() {
        return institutioncode;
    }

    public void setInstitutioncode(String institutioncode) {
        this.institutioncode = institutioncode;
    }

    public String getInstitutionname() {
        return institutionname;
    }

    public void setInstitutionname(String institutionname) {
        this.institutionname = institutionname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactdetails() {
        return contactdetails;
    }

    public void setContactdetails(String contactdetails) {
        this.contactdetails = contactdetails;
    }

    public Boolean getHavebranches() {
        return havebranches;
    }

    public void setHavebranches(Boolean havebranches) {
        this.havebranches = havebranches;
    }

    public String getContactmobile() {
        return contactmobile;
    }

    public void setContactmobile(String contactmobile) {
        this.contactmobile = contactmobile;
    }

    public String getContactemail() {
        return contactemail;
    }

    public void setContactemail(String contactemail) {
        this.contactemail = contactemail;
    }

    public Integer getLicensemodel() {
        return licensemodel;
    }

    public void setLicensemodel(Integer licensemodel) {
        this.licensemodel = licensemodel;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
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

    public Prmintinstitutiontype getInstitutiontypeid() {
        return institutiontypeid;
    }

    public void setInstitutiontypeid(Prmintinstitutiontype institutiontypeid) {
        this.institutiontypeid = institutiontypeid;
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

    @XmlTransient
    public List<Applogalerts> getApplogalertsList() {
        return applogalertsList;
    }

    public void setApplogalertsList(List<Applogalerts> applogalertsList) {
        this.applogalertsList = applogalertsList;
    }

    @XmlTransient
    public List<Prmintsuborganisationtype> getPrmintsuborganisationtypeList() {
        return prmintsuborganisationtypeList;
    }

    public void setPrmintsuborganisationtypeList(List<Prmintsuborganisationtype> prmintsuborganisationtypeList) {
        this.prmintsuborganisationtypeList = prmintsuborganisationtypeList;
    }

    @XmlTransient
    public List<Regitems> getRegitemsList() {
        return regitemsList;
    }

    public void setRegitemsList(List<Regitems> regitemsList) {
        this.regitemsList = regitemsList;
    }

    @XmlTransient
    public List<Lstmain> getLstmainList() {
        return lstmainList;
    }

    public void setLstmainList(List<Lstmain> lstmainList) {
        this.lstmainList = lstmainList;
    }

    @XmlTransient
    public List<Appmodules> getAppmodulesList() {
        return appmodulesList;
    }

    public void setAppmodulesList(List<Appmodules> appmodulesList) {
        this.appmodulesList = appmodulesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (institutionid != null ? institutionid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prmintinstitution)) {
            return false;
        }
        Prmintinstitution other = (Prmintinstitution) object;
        if ((this.institutionid == null && other.institutionid != null) || (this.institutionid != null && !this.institutionid.equals(other.institutionid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.comsoftacuity.db.Prmintinstitution[ institutionid=" + institutionid + " ]";
    }
    
}
