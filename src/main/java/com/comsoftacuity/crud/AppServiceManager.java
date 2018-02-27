/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comsoftacuity.crud;

import com.comsoftacuity.dao.CrudServiceProvider;
import com.comsoftacuity.db.Appapprules;
import com.comsoftacuity.db.Applogalerts;
import com.comsoftacuity.db.Appmodules;
import com.comsoftacuity.db.Lstcategoryleveltype;
import com.comsoftacuity.db.Lstinventorytype;
import com.comsoftacuity.db.Lstmain;
import com.comsoftacuity.db.Lstmeasurepack;
import com.comsoftacuity.db.Lstmeasureunit;
import com.comsoftacuity.db.Lststockleveltype;
import com.comsoftacuity.db.Lststockoutreceipttype;
import com.comsoftacuity.db.Lststockouttype;
import com.comsoftacuity.db.Lststores;
import com.comsoftacuity.db.Lstsubcategorytree;
import com.comsoftacuity.db.Lstsupplytype;
import com.comsoftacuity.db.Prmintinstitution;
import com.comsoftacuity.db.Prmintinstitutiontype;
import com.comsoftacuity.db.Prmintsuborganisation;
import com.comsoftacuity.db.Prmintsuborganisationtype;
import com.comsoftacuity.db.Regdepreciationbycategory;
import com.comsoftacuity.db.Regitems;
import com.comsoftacuity.db.Supplier;
import com.comsoftacuity.db.Trandepreciation;
import com.comsoftacuity.db.Trandisposal;
import com.comsoftacuity.db.Tranlogs;
import com.comsoftacuity.db.Tranmain;
import com.comsoftacuity.db.Transtockin;
import com.comsoftacuity.db.Transtocklevel;
import com.comsoftacuity.db.Transtockout;
import com.comsoftacuity.db.Transtocktaking;
import com.comsoftacuity.db.Trantransfers;
import com.comsoftacuity.db.Userassignedusergroup;
import com.comsoftacuity.db.Userpermission;
import com.comsoftacuity.db.Userusergroup;
import com.comsoftacuity.db.Userusergrouppermission;
import com.comsoftacuity.db.Userusersinfo;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.Query;

/**
 *
 * @author Yusuff Saliu Adediran
 */
@Stateless
@LocalBean
public class AppServiceManager {
   @EJB
   private CrudServiceProvider dao;
   
   public Userusersinfo createUserusersinfo(Userusersinfo t) {
        return dao.create(t);
    }

    public Userusersinfo updateUserusersinfo(Userusersinfo t) {
        return dao.update(t);
    }

    public Userusersinfo getUserinfo(Integer id) {
        return dao.find(id, Userusersinfo.class);
    }

    public void deleteUserinfo(Integer id) {
        Userusersinfo app = getUserinfo(id);
        if (app != null) {
            dao.delete(app);
        }
    }
    
    public  List<Userusersinfo> getUserusersinfoList(Integer offset, Integer limit){
       Query q =dao.getEntityManager().createQuery("SELECT st FROM Userusersinfo st");
       if (limit > 0) {
                q.setFirstResult(offset);
                q.setMaxResults(limit);
            }
       List<Userusersinfo> results =q.getResultList();
       return results;
   }
////////////////////////////////////////////////////////////////////////////////
   public Userusergrouppermission createUserusergrouppermission(Userusergrouppermission t) {
        return dao.create(t);
    }

    public Userusergrouppermission updateUserusergrouppermission(Userusergrouppermission t) {
        return dao.update(t);
    }

    public Userusergrouppermission getUserusergrouppermission(Integer id) {
        return dao.find(id, Userusergrouppermission.class);
    }

    public void deleteUsergrouppermission(Integer id) {
        Userusergrouppermission app = getUserusergrouppermission(id);
        if (app != null) {
            dao.delete(app);
        }
    }
    
    public  List<Userusergrouppermission> getUserusergrouppermissionList(Integer offset, Integer limit){
       Query q =dao.getEntityManager().createQuery("SELECT st FROM Userusergrouppermission st");
       if (limit > 0) {
                q.setFirstResult(offset);
                q.setMaxResults(limit);
            }
       List<Userusergrouppermission> results =q.getResultList();
       return results;
   }
    ////////////////////////////////////////////////////////////////////////////
    public Userusergroup createUserusergroup(Userusergroup t) {
        return dao.create(t);
    }

    public Userusergroup updateUserusergroup(Userusergroup t) {
        return dao.update(t);
    }

    public Userusergroup getUserusergroup(Integer id) {
        return dao.find(id, Userusergroup.class);
    }

    public void deleteUserusergroup(Integer id) {
        Userusergroup app = getUserusergroup(id);
        if (app != null) {
            dao.delete(app);
        }
    }
    
    public  List<Userusergroup> getUserusergroupList(Integer offset, Integer limit){
       Query q =dao.getEntityManager().createQuery("SELECT st FROM Userusergroup st");
       if (limit > 0) {
                q.setFirstResult(offset);
                q.setMaxResults(limit);
            }
       List<Userusergroup> results =q.getResultList();
       return results;
   }
   ////////////////////////////////////////////////////////////////////////////
   public Userpermission createUserpermission(Userpermission t) {
        return dao.create(t);
    }

    public Userpermission updateUserpermission(Userpermission t) {
        return dao.update(t);
    }

    public Userpermission getUserpermission(Integer id) {
        return dao.find(id, Userpermission.class);
    }

    public void deleteUserpermission(Integer id) {
        Userpermission app = getUserpermission(id);
        if (app != null) {
            dao.delete(app);
        }
    }
    
    public  List<Userpermission> getUserpermissionList(Integer offset, Integer limit){
       Query q =dao.getEntityManager().createQuery("SELECT st FROM Userpermission st");
       if (limit > 0) {
                q.setFirstResult(offset);
                q.setMaxResults(limit);
            }
       List<Userpermission> results =q.getResultList();
       return results;
   } 
 ///////////////////////////////////////////////////////////////////////////////
  public Userassignedusergroup createUserpermission(Userassignedusergroup t) {
        return dao.create(t);
    }

    public Userassignedusergroup updateUserassignedusergroup(Userassignedusergroup t) {
        return dao.update(t);
    }

    public Userassignedusergroup getUserassignedusergroup(Integer id) {
        return dao.find(id, Userassignedusergroup.class);
    }

    public void deleteUserassignedusergroup(Integer id) {
        Userassignedusergroup app = getUserassignedusergroup(id);
        if (app != null) {
            dao.delete(app);
        }
    }
    
    public  List<Userassignedusergroup> getUserassignedusergroupList(Integer offset, Integer limit){
       Query q =dao.getEntityManager().createQuery("SELECT st FROM Userassignedusergroup st");
       if (limit > 0) {
                q.setFirstResult(offset);
                q.setMaxResults(limit);
            }
       List<Userassignedusergroup> results =q.getResultList();
       return results;
   } 
////////////////////////////////////////////////////////////////////////////////
     public Trantransfers createTrantransfers(Trantransfers t) {
        return dao.create(t);
    }

    public Trantransfers updateTrantransfers(Trantransfers t) {
        return dao.update(t);
    }

    public Trantransfers getTrantransfers(Integer id) {
        return dao.find(id, Trantransfers.class);
    }

    public void deleteTrantransfers(Integer id) {
        Trantransfers app = getTrantransfers(id);
        if (app != null) {
            dao.delete(app);
        }
    }
    
    public  List<Trantransfers> getTrantransfersList(Integer offset, Integer limit){
       Query q =dao.getEntityManager().createQuery("SELECT st FROM Trantransfers st");
       if (limit > 0) {
                q.setFirstResult(offset);
                q.setMaxResults(limit);
            }
       List<Trantransfers> results =q.getResultList();
       return results;
   }
 ///////////////////////////////////////////////////////////////////////////////
    public Transtocktaking createTranstocktaking(Transtocktaking t) {
        return dao.create(t);
    }

    public Transtocktaking updateTranstocktaking(Transtocktaking t) {
        return dao.update(t);
    }

    public Transtocktaking getTranstocktaking(Integer id) {
        return dao.find(id, Transtocktaking.class);
    }

    public void deleteTranstocktaking(Integer id) {
        Trantransfers app = getTrantransfers(id);
        if (app != null) {
            dao.delete(app);
        }
    }
    
    public  List<Transtocktaking> getTranstocktakingList(Integer offset, Integer limit){
       Query q =dao.getEntityManager().createQuery("SELECT st FROM Transtocktaking st");
       if (limit > 0) {
                q.setFirstResult(offset);
                q.setMaxResults(limit);
            }
       List<Transtocktaking> results =q.getResultList();
       return results;
   }
 ///////////////////////////////////////////////////////////////////////////////
   public Transtockout createTranstockout(Transtockout t) {
        return dao.create(t);
    }

    public Transtockout updateTranstockout(Transtockout t) {
        return dao.update(t);
    }

    public Transtockout getTranstockout(Integer id) {
        return dao.find(id, Transtockout.class);
    }

    public void deleteTranstockout(Integer id) {
        Transtockout app = getTranstockout(id);
        if (app != null) {
            dao.delete(app);
        }
    }
    
    public  List<Transtockout> getTranstockoutList(Integer offset, Integer limit){
       Query q =dao.getEntityManager().createQuery("SELECT st FROM Transtockout st");
       if (limit > 0) {
                q.setFirstResult(offset);
                q.setMaxResults(limit);
            }
       List<Transtockout> results =q.getResultList();
       return results;
   }
////////////////////////////////////////////////////////////////////////////////
    public Transtocklevel createTranstocklevel(Transtocklevel t) {
        return dao.create(t);
    }

    public Transtocklevel updateTranstocklevel(Transtocklevel t) {
        return dao.update(t);
    }

    public Transtocklevel getTranstocklevel(Integer id) {
        return dao.find(id, Transtocklevel.class);
    }

    public void deleteTranstocklevel(Integer id) {
        Transtocklevel app = getTranstocklevel(id);
        if (app != null) {
            dao.delete(app);
        }
    }
    
    public  List<Transtocklevel> getTranstocklevelList(Integer offset, Integer limit){
       Query q =dao.getEntityManager().createQuery("SELECT st FROM Transtocklevel st");
       if (limit > 0) {
                q.setFirstResult(offset);
                q.setMaxResults(limit);
            }
       List<Transtocklevel> results =q.getResultList();
       return results;
   }
////////////////////////////////////////////////////////////////////////////////
 public Transtockin createTranstockin(Transtockin t) {
        return dao.create(t);
    }

    public Transtockin updateTranstockin(Transtockin t) {
        return dao.update(t);
    }

    public Transtockin getTranstockin(Integer id) {
        return dao.find(id, Transtockin.class);
    }

    public void deleteTranstockin(Integer id) {
        Transtockin app = getTranstockin(id);
        if (app != null) {
            dao.delete(app);
        }
    }
    
    public  List<Transtockin> getTranstockinList(Integer offset, Integer limit){
       Query q =dao.getEntityManager().createQuery("SELECT st FROM Transtockin st");
       if (limit > 0) {
                q.setFirstResult(offset);
                q.setMaxResults(limit);
            }
       List<Transtockin> results =q.getResultList();
       return results;
   }
////////////////////////////////////////////////////////////////////////////////
 public Tranmain createTranmain(Tranmain t) {
        return dao.create(t);
    }

    public Tranmain updateTranmain(Tranmain t) {
        return dao.update(t);
    }

    public Tranmain getTranmain(Integer id) {
        return dao.find(id, Tranmain.class);
    }

    public void deleteTranmain(Integer id) {
        Tranmain app = getTranmain(id);
        if (app != null) {
            dao.delete(app);
        }
    }
    
    public  List<Tranmain> getTranmainList(Integer offset, Integer limit){
       Query q =dao.getEntityManager().createQuery("SELECT st FROM Tranmain st");
       if (limit > 0) {
                q.setFirstResult(offset);
                q.setMaxResults(limit);
            }
       List<Tranmain> results =q.getResultList();
       return results;
   }
////////////////////////////////////////////////////////////////////////////////
    public Tranlogs createTralogs(Tranlogs t) {
        return dao.create(t);
    }

    public Tranlogs updateTranlogs(Tranlogs t) {
        return dao.update(t);
    }

    public Tranlogs getTranlogs(Integer id) {
        return dao.find(id, Tranlogs.class);
    }

    public void deleteTranlogs(Integer id) {
        Tranmain app = getTranmain(id);
        if (app != null) {
            dao.delete(app);
        }
    }
    
    public  List<Tranlogs> getTranlogsList(Integer offset, Integer limit){
       Query q =dao.getEntityManager().createQuery("SELECT st FROM Tranlogs st");
       if (limit > 0) {
                q.setFirstResult(offset);
                q.setMaxResults(limit);
            }
       List<Tranlogs> results =q.getResultList();
       return results;
   }
////////////////////////////////////////////////////////////////////////////////
  public Trandisposal createTrandisposal(Trandisposal t) {
        return dao.create(t);
    }

    public Trandisposal updateTrandisposal(Trandisposal t) {
        return dao.update(t);
    }

    public Trandisposal getTrandisposal(Integer id) {
        return dao.find(id, Trandisposal.class);
    }

    public void deleteTrandisposal(Integer id) {
        Trandisposal app = getTrandisposal(id);
        if (app != null) {
            dao.delete(app);
        }
    }
    
    public  List<Trandisposal> getTrandisposalList(Integer offset, Integer limit){
       Query q =dao.getEntityManager().createQuery("SELECT st FROM Trandisposal st");
       if (limit > 0) {
                q.setFirstResult(offset);
                q.setMaxResults(limit);
            }
       List<Trandisposal> results =q.getResultList();
       return results;
   }
////////////////////////////////////////////////////////////////////////////////
    public Trandepreciation createTrandepreciation(Trandepreciation t) {
        return dao.create(t);
    }

    public Trandepreciation updateTrandepreciation(Trandepreciation t) {
        return dao.update(t);
    }

    public Trandepreciation getTrandepreciation(Integer id) {
        return dao.find(id, Trandepreciation.class);
    }

    public void deleteTrandepreciation(Integer id) {
        Trandepreciation app = getTrandepreciation(id);
        if (app != null) {
            dao.delete(app);
        }
    }
    
    public  List<Trandepreciation> getTrandepreciationList(Integer offset, Integer limit){
       Query q =dao.getEntityManager().createQuery("SELECT st FROM Trandepreciation st");
       if (limit > 0) {
                q.setFirstResult(offset);
                q.setMaxResults(limit);
            }
       List<Trandepreciation> results =q.getResultList();
       return results;
   }
////////////////////////////////////////////////////////////////////////////////
    public Regitems createRegitems(Regitems t) {
        return dao.create(t);
    }

    public Regitems updateRegitems(Regitems t) {
        return dao.update(t);
    }

    public Regitems getRegitems(Integer id) {
        return dao.find(id, Regitems.class);
    }

    public void deleteRegitems(Integer id) {
        Regitems app = getRegitems(id);
        if (app != null) {
            dao.delete(app);
        }
    }
    
    public  List<Regitems> getRegitemsList(Integer offset, Integer limit){
       Query q =dao.getEntityManager().createQuery("SELECT st FROM Regitems st");
       if (limit > 0) {
                q.setFirstResult(offset);
                q.setMaxResults(limit);
            }
       List<Regitems> results =q.getResultList();
       return results;
   }
    ///////////////////////////////////////////////////////////////////////////
    public Appapprules createAppapprules(Appapprules t) {
        return dao.create(t);
    }

    public Appapprules updateAppapprules(Appapprules t) {
        return dao.update(t);
    }

    public Appapprules getAppapprules(Integer id) {
        return dao.find(id, Appapprules.class);
    }

    public void deleteAppapprules(Integer id) {
        Appapprules app = getAppapprules(id);
        if (app != null) {
            dao.delete(app);
        }
    }

    public List<Appapprules> getAppappruless(int offset, int limit) {
        Query q = dao.getEntityManager().createQuery("SELECT a FROM Appapprules a");
        if (limit > 0) {
            q.setFirstResult(offset);
            q.setMaxResults(limit);
        }
        List<Appapprules> result = q.getResultList();
        return result;
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////

    public Applogalerts createApplogalerts(Applogalerts t) {
        return dao.create(t);
    }

    public Applogalerts updateApplogalerts(Applogalerts t) {
        return dao.update(t);
    }

    public Applogalerts getApplogalerts(Integer id) {
        return dao.find(id, Applogalerts.class);
    }

    public void deleteApplogalerts(Integer id) {
        Applogalerts app = getApplogalerts(id);
        if (app != null) {
            dao.delete(app);
        }
    }

    public List<Applogalerts> getApplogalertss(int offset, int limit) {
        Query q = dao.getEntityManager().createQuery("SELECT a FROM Applogalerts a");
        if (limit > 0) {
            q.setFirstResult(offset);
            q.setMaxResults(limit);
        }
        List<Applogalerts> result = q.getResultList();
        return result;
    }

    //////////////////////////////////////////////////////////////////////////////////////
    public Appmodules createAppmodules(Appmodules t) {
        return dao.create(t);
    }

    public Appmodules updateAppmodules(Appmodules t) {
        return dao.update(t);
    }

    public Appmodules getAppmodules(Integer id) {
        return dao.find(id, Appmodules.class);
    }

    public void deleteAppmodules(Integer id) {
        Appmodules app = getAppmodules(id);
        if (app != null) {
            dao.delete(app);
        }
    }

    public List<Appmodules> getAppmoduless(int offset, int limit) {
        Query q = dao.getEntityManager().createQuery("SELECT a FROM Appmodules a");
        if (limit > 0) {
            q.setFirstResult(offset);
            q.setMaxResults(limit);
        }
        List<Appmodules> result = q.getResultList();
        return result;
    }

    ////////////////////////////////////////////////////////////////////////
    public Lstcategoryleveltype createLstcategoryleveltype(Lstcategoryleveltype t) {
        return dao.create(t);
    }

    public Lstcategoryleveltype updateLstcategoryleveltype(Lstcategoryleveltype t) {
        return dao.update(t);
    }

    public Lstcategoryleveltype getLstcategoryleveltype(Integer id) {
        return dao.find(id, Lstcategoryleveltype.class);
    }

    public void deleteLstcategoryleveltype(Integer id) {
        Lstcategoryleveltype app = getLstcategoryleveltype(id);
        if (app != null) {
            dao.delete(app);
        }
    }

    public List<Lstcategoryleveltype> getLstcategoryleveltypes(int offset, int limit) {
        Query q = dao.getEntityManager().createQuery("SELECT a FROM Lstcategoryleveltype a");
        if (limit > 0) {
            q.setFirstResult(offset);
            q.setMaxResults(limit);
        }
        List<Lstcategoryleveltype> result = q.getResultList();
        return result;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////
    public Lstinventorytype createLstinventorytype(Lstinventorytype t) {
        return dao.create(t);
    }

    public Lstinventorytype updateLstinventorytype(Lstinventorytype t) {
        return dao.update(t);
    }

    public Lstinventorytype getLstinventorytype(Integer id) {
        return dao.find(id, Lstinventorytype.class);
    }

    public void deleteLstinventorytype(Integer id) {
        Lstinventorytype app = getLstinventorytype(id);
        if (app != null) {
            dao.delete(app);
        }
    }

    public List<Lstinventorytype> getLstinventorytypes(int offset, int limit) {
        Query q = dao.getEntityManager().createQuery("SELECT a FROM Lstinventorytype a");
        if (limit > 0) {
            q.setFirstResult(offset);
            q.setMaxResults(limit);
        }
        List<Lstinventorytype> result = q.getResultList();
        return result;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////
    public Lstmain createLstmain(Lstmain t) {
        return dao.create(t);
    }

    public Lstmain updateLstmain(Lstmain t) {
        return dao.update(t);
    }

    public Lstmain getLstmain(Integer id) {
        return dao.find(id, Lstmain.class);
    }

    public void deleteLstmain(Integer id) {
        Lstmain app = getLstmain(id);
        if (app != null) {
            dao.delete(app);
        }
    }

    public List<Lstmain> getLstmains(int offset, int limit) {
        Query q = dao.getEntityManager().createQuery("SELECT a FROM Lstmain a");
        if (limit > 0) {
            q.setFirstResult(offset);
            q.setMaxResults(limit);
        }
        List<Lstmain> result = q.getResultList();
        return result;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////
    public Lstmeasurepack createLstmeasurepack(Lstmeasurepack t) {
        return dao.create(t);
    }

    public Lstmeasurepack updateLstmeasurepack(Lstmeasurepack t) {
        return dao.update(t);
    }

    public Lstmeasurepack getLstmeasurepack(Integer id) {
        return dao.find(id, Lstmeasurepack.class);
    }

    public void deleteLstmeasurepack(Integer id) {
        Lstmeasurepack app = getLstmeasurepack(id);
        if (app != null) {
            dao.delete(app);
        }
    }

    public List<Lstmeasurepack> getLstmeasurepacks(int offset, int limit) {
        Query q = dao.getEntityManager().createQuery("SELECT a FROM Lstmeasurepack a");
        if (limit > 0) {
            q.setFirstResult(offset);
            q.setMaxResults(limit);
        }
        List<Lstmeasurepack> result = q.getResultList();
        return result;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////
    public Lstmeasureunit createLstmeasureunit(Lstmeasureunit t) {
        return dao.create(t);
    }

    public Lstmeasureunit updateLstmeasureunit(Lstmeasureunit t) {
        return dao.update(t);
    }

    public Lstmeasureunit getLstmeasureunit(Integer id) {
        return dao.find(id, Lstmeasureunit.class);
    }

    public void deleteLstmeasureunit(Integer id) {
        Lstmeasureunit app = getLstmeasureunit(id);
        if (app != null) {
            dao.delete(app);
        }
    }

    public List<Lstmeasureunit> getLstmeasureunits(int offset, int limit) {
        Query q = dao.getEntityManager().createQuery("SELECT a FROM Lstmeasureunit a");
        if (limit > 0) {
            q.setFirstResult(offset);
            q.setMaxResults(limit);
        }
        List<Lstmeasureunit> result = q.getResultList();
        return result;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////
    public Lststockleveltype createLststockleveltype(Lststockleveltype t) {
        return dao.create(t);
    }

    public Lststockleveltype updateLststockleveltype(Lststockleveltype t) {
        return dao.update(t);
    }

    public Lststockleveltype getLststockleveltype(Integer id) {
        return dao.find(id, Lststockleveltype.class);
    }

    public void deleteLststockleveltype(Integer id) {
        Lststockleveltype app = getLststockleveltype(id);
        if (app != null) {
            dao.delete(app);
        }
    }

    public List<Lststockleveltype> getLststockleveltypes(int offset, int limit) {
        Query q = dao.getEntityManager().createQuery("SELECT a FROM Lststockleveltype a");
        if (limit > 0) {
            q.setFirstResult(offset);
            q.setMaxResults(limit);
        }
        List<Lststockleveltype> result = q.getResultList();
        return result;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////
    public Lststockoutreceipttype createLststockoutreceipttype(Lststockoutreceipttype t) {
        return dao.create(t);
    }

    public Lststockoutreceipttype updateLststockoutreceipttype(Lststockoutreceipttype t) {
        return dao.update(t);
    }

    public Lststockoutreceipttype getLststockoutreceipttype(Integer id) {
        return dao.find(id, Lststockoutreceipttype.class);
    }

    public void deleteLststockoutreceipttype(Integer id) {
        Lststockoutreceipttype app = getLststockoutreceipttype(id);
        if (app != null) {
            dao.delete(app);
        }
    }

    public List<Lststockoutreceipttype> getLststockoutreceipttypes(int offset, int limit) {
        Query q = dao.getEntityManager().createQuery("SELECT a FROM Lststockoutreceipttype a");
        if (limit > 0) {
            q.setFirstResult(offset);
            q.setMaxResults(limit);
        }
        List<Lststockoutreceipttype> result = q.getResultList();
        return result;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////
    public Lststockouttype createLststockouttype(Lststockouttype t) {
        return dao.create(t);
    }

    public Lststockouttype updateLststockouttype(Lststockouttype t) {
        return dao.update(t);
    }

    public Lststockouttype getLststockouttype(Integer id) {
        return dao.find(id, Lststockouttype.class);
    }

    public void deleteLststockouttype(Integer id) {
        Lststockouttype app = getLststockouttype(id);
        if (app != null) {
            dao.delete(app);
        }
    }

    public List<Lststockouttype> getLststockouttypes(int offset, int limit) {
        Query q = dao.getEntityManager().createQuery("SELECT a FROM Lststockouttype a");
        if (limit > 0) {
            q.setFirstResult(offset);
            q.setMaxResults(limit);
        }
        List<Lststockouttype> result = q.getResultList();
        return result;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////
    public Lststores createLststores(Lststores t) {
        return dao.create(t);
    }

    public Lststores updateLststores(Lststores t) {
        return dao.update(t);
    }

    public Lststores getLststores(Integer id) {
        return dao.find(id, Lststores.class);
    }

    public void deleteLststores(Integer id) {
        Lststores app = getLststores(id);
        if (app != null) {
            dao.delete(app);
        }
    }

    public List<Lststores> getLststoress(int offset, int limit) {
        Query q = dao.getEntityManager().createQuery("SELECT a FROM Lststores a");
        if (limit > 0) {
            q.setFirstResult(offset);
            q.setMaxResults(limit);
        }
        List<Lststores> result = q.getResultList();
        return result;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////
    public Lstsubcategorytree createLstsubcategorytree(Lstsubcategorytree t) {
        return dao.create(t);
    }

    public Lstsubcategorytree updateLstsubcategorytree(Lstsubcategorytree t) {
        return dao.update(t);
    }

    public Lstsubcategorytree getLstsubcategorytree(Integer id) {
        return dao.find(id, Lstsubcategorytree.class);
    }

    public void deleteLstsubcategorytree(Integer id) {
        Lstsubcategorytree app = getLstsubcategorytree(id);
        if (app != null) {
            dao.delete(app);
        }
    }

    public List<Lstsubcategorytree> getLstsubcategorytrees(int offset, int limit) {
        Query q = dao.getEntityManager().createQuery("SELECT a FROM Lstsubcategorytree a");
        if (limit > 0) {
            q.setFirstResult(offset);
            q.setMaxResults(limit);
        }
        List<Lstsubcategorytree> result = q.getResultList();
        return result;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////
    public Lstsupplytype createLstsupplytype(Lstsupplytype t) {
        return dao.create(t);
    }

    public Lstsupplytype updateLstsupplytype(Lstsupplytype t) {
        return dao.update(t);
    }

    public Lstsupplytype getLstsupplytype(Integer id) {
        return dao.find(id, Lstsupplytype.class);
    }

    public void deleteLstsupplytype(Integer id) {
        Lstsupplytype app = getLstsupplytype(id);
        if (app != null) {
            dao.delete(app);
        }
    }

    public List<Lstsupplytype> getLstsupplytypes(int offset, int limit) {
        Query q = dao.getEntityManager().createQuery("SELECT a FROM Lstsupplytype a");
        if (limit > 0) {
            q.setFirstResult(offset);
            q.setMaxResults(limit);
        }
        List<Lstsupplytype> result = q.getResultList();
        return result;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////
    public Prmintinstitution createPrmintinstitution(Prmintinstitution t) {
        return dao.create(t);
    }

    public Prmintinstitution updatePrmintinstitution(Prmintinstitution t) {
        return dao.update(t);
    }

    public Prmintinstitution getPrmintinstitution(Integer id) {
        return dao.find(id, Prmintinstitution.class);
    }

    public void deletePrmintinstitution(Integer id) {
        Prmintinstitution app = getPrmintinstitution(id);
        if (app != null) {
            dao.delete(app);
        }
    }

    public List<Prmintinstitution> getPrmintinstitutions(int offset, int limit) {
        Query q = dao.getEntityManager().createQuery("SELECT a FROM Prmintinstitution a");
        if (limit > 0) {
            q.setFirstResult(offset);
            q.setMaxResults(limit);
        }
        List<Prmintinstitution> result = q.getResultList();
        return result;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////
    public Prmintinstitutiontype createPrmintinstitutiontype(Prmintinstitutiontype t) {
        return dao.create(t);
    }

    public Prmintinstitutiontype updatePrmintinstitutiontype(Prmintinstitutiontype t) {
        return dao.update(t);
    }

    public Prmintinstitutiontype getPrmintinstitutiontype(Integer id) {
        return dao.find(id, Prmintinstitutiontype.class);
    }

    public void deletePrmintinstitutiontype(Integer id) {
        Prmintinstitutiontype app = getPrmintinstitutiontype(id);
        if (app != null) {
            dao.delete(app);
        }
    }

    public List<Prmintinstitutiontype> getPrmintinstitutiontypes(int offset, int limit) {
        Query q = dao.getEntityManager().createQuery("SELECT a FROM Prmintinstitutiontype a");
        if (limit > 0) {
            q.setFirstResult(offset);
            q.setMaxResults(limit);
        }
        List<Prmintinstitutiontype> result = q.getResultList();
        return result;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////
    public Prmintsuborganisation createPrmintsuborganisation(Prmintsuborganisation t) {
        return dao.create(t);
    }

    public Prmintsuborganisation updatePrmintsuborganisation(Prmintsuborganisation t) {
        return dao.update(t);
    }

    public Prmintsuborganisation getPrmintsuborganisation(Integer id) {
        return dao.find(id, Prmintsuborganisation.class);
    }

    public void deletePrmintsuborganisation(Integer id) {
        Prmintsuborganisation app = getPrmintsuborganisation(id);
        if (app != null) {
            dao.delete(app);
        }
    }

    public List<Prmintsuborganisation> getPrmintsuborganisations(int offset, int limit) {
        Query q = dao.getEntityManager().createQuery("SELECT a FROM Prmintsuborganisation a");
        if (limit > 0) {
            q.setFirstResult(offset);
            q.setMaxResults(limit);
        }
        List<Prmintsuborganisation> result = q.getResultList();
        return result;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////
    public Prmintsuborganisationtype createPrmintsuborganisationtype(Prmintsuborganisationtype t) {
        return dao.create(t);
    }

    public Prmintsuborganisationtype updatePrmintsuborganisationtype(Prmintsuborganisationtype t) {
        return dao.update(t);
    }

    public Prmintsuborganisationtype getPrmintsuborganisationtype(Integer id) {
        return dao.find(id, Prmintsuborganisationtype.class);
    }

    public void deletePrmintsuborganisationtype(Integer id) {
        Prmintsuborganisationtype app = getPrmintsuborganisationtype(id);
        if (app != null) {
            dao.delete(app);
        }
    }

    public List<Prmintsuborganisationtype> getPrmintsuborganisationtypes(int offset, int limit) {
        Query q = dao.getEntityManager().createQuery("SELECT a FROM Prmintsuborganisationtype a");
        if (limit > 0) {
            q.setFirstResult(offset);
            q.setMaxResults(limit);
        }
        List<Prmintsuborganisationtype> result = q.getResultList();
        return result;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////
    public Regdepreciationbycategory createRegdepreciationbycategory(Regdepreciationbycategory t) {
        return dao.create(t);
    }

    public Regdepreciationbycategory updateRegdepreciationbycategory(Regdepreciationbycategory t) {
        return dao.update(t);
    }

    public Regdepreciationbycategory getRegdepreciationbycategory(Integer id) {
        return dao.find(id, Regdepreciationbycategory.class);
    }

    public void deleteRegdepreciationbycategory(Integer id) {
        Regdepreciationbycategory app = getRegdepreciationbycategory(id);
        if (app != null) {
            dao.delete(app);
        }
    }

    public List<Regdepreciationbycategory> getRegdepreciationbycategorys(int offset, int limit) {
        Query q = dao.getEntityManager().createQuery("SELECT a FROM Regdepreciationbycategory a");
        if (limit > 0) {
            q.setFirstResult(offset);
            q.setMaxResults(limit);
        }
        List<Regdepreciationbycategory> result = q.getResultList();
        return result;
    }
      ////////////////////////////////////////////////////////////////////////////////////////////

   public Supplier createSupplier(Supplier t) {
        return dao.create(t);
    }

    public Supplier updateSupplier(Supplier t) {
        return dao.update(t);
    }

    public Supplier getSupplier(Integer id) {
        return dao.find(id, Supplier.class);
    }

    public void deleteSupplier(Integer id) {
        Supplier app = getSupplier(id);
        if (app != null) {
            dao.delete(app);
        }
    }

    public List<Supplier> getSuppliers(int offset, int limit) {
        Query q = dao.getEntityManager().createQuery("SELECT a FROM Supplier a");
        if (limit > 0) {
            q.setFirstResult(offset);
            q.setMaxResults(limit);
        }
        List<Supplier> result = q.getResultList();
        return result;
    }
}
