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
@Table(name = "trandepreciation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trandepreciation.findAll", query = "SELECT t FROM Trandepreciation t"),
    @NamedQuery(name = "Trandepreciation.findById", query = "SELECT t FROM Trandepreciation t WHERE t.id = :id"),
    @NamedQuery(name = "Trandepreciation.findByMonthid", query = "SELECT t FROM Trandepreciation t WHERE t.monthid = :monthid"),
    @NamedQuery(name = "Trandepreciation.findByYearid", query = "SELECT t FROM Trandepreciation t WHERE t.yearid = :yearid"),
    @NamedQuery(name = "Trandepreciation.findByTrandate", query = "SELECT t FROM Trandepreciation t WHERE t.trandate = :trandate"),
    @NamedQuery(name = "Trandepreciation.findByAmount", query = "SELECT t FROM Trandepreciation t WHERE t.amount = :amount")})
public class Trandepreciation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "monthid")
    private Integer monthid;
    @Column(name = "yearid")
    private Integer yearid;
    @Column(name = "trandate")
    @Temporal(TemporalType.DATE)
    private Date trandate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "amount")
    private BigDecimal amount;
    @JoinColumn(name = "instutionid", referencedColumnName = "institutionid")
    @ManyToOne
    private Prmintinstitution instutionid;
    @JoinColumn(name = "itemid", referencedColumnName = "itemid")
    @ManyToOne
    private Regitems itemid;

    public Trandepreciation() {
    }

    public Trandepreciation(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMonthid() {
        return monthid;
    }

    public void setMonthid(Integer monthid) {
        this.monthid = monthid;
    }

    public Integer getYearid() {
        return yearid;
    }

    public void setYearid(Integer yearid) {
        this.yearid = yearid;
    }

    public Date getTrandate() {
        return trandate;
    }

    public void setTrandate(Date trandate) {
        this.trandate = trandate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Prmintinstitution getInstutionid() {
        return instutionid;
    }

    public void setInstutionid(Prmintinstitution instutionid) {
        this.instutionid = instutionid;
    }

    public Regitems getItemid() {
        return itemid;
    }

    public void setItemid(Regitems itemid) {
        this.itemid = itemid;
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
        if (!(object instanceof Trandepreciation)) {
            return false;
        }
        Trandepreciation other = (Trandepreciation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.comsoftacuity.db.Trandepreciation[ id=" + id + " ]";
    }
    
}
