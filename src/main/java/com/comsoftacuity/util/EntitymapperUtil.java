/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comsoftacuity.util;


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
import com.comsoftacuity.db.Userusersinfo;
import com.comsoftacuity.db.Userusergrouppermission;
import com.comsoftacuity.dto.Appapprulesdto;
import com.comsoftacuity.dto.Applogalertsdto;
import com.comsoftacuity.dto.Appmodulesdto;
import com.comsoftacuity.dto.Lstcategoryleveltypedto;
import com.comsoftacuity.dto.Lstinventorytypedto;
import com.comsoftacuity.dto.Lstmaindto;
import com.comsoftacuity.dto.Lstmeasurepackdto;
import com.comsoftacuity.dto.Lstmeasureunitdto;
import com.comsoftacuity.dto.Lststockleveltypedto;
import com.comsoftacuity.dto.Lststockoutreceipttypedto;
import com.comsoftacuity.dto.Lststockouttypedto;
import com.comsoftacuity.dto.Lststoresdto;
import com.comsoftacuity.dto.Lstsubcategorytreedto;
import com.comsoftacuity.dto.Lstsupplytypedto;

import com.comsoftacuity.dto.Prmintinstitutiondto;
import com.comsoftacuity.dto.Prmintinstitutiontypedto;
import com.comsoftacuity.dto.Prmintsuborganisationdto;
import com.comsoftacuity.dto.Prmintsuborganisationtypedto;
import com.comsoftacuity.dto.Regdepreciationbycategorydto;
import com.comsoftacuity.dto.Regitemsdto;
import com.comsoftacuity.dto.Supplierdto;
import com.comsoftacuity.dto.Trandepreciationdto;
import com.comsoftacuity.dto.Trandisposaldto;
import com.comsoftacuity.dto.Tranlogsdto;
import com.comsoftacuity.dto.Tranmaindto;
import com.comsoftacuity.dto.Transtockindto;
import com.comsoftacuity.dto.Transtockleveldto;
import com.comsoftacuity.dto.Transtockoutdto;
import com.comsoftacuity.dto.Transtocktakingdto;
import com.comsoftacuity.dto.Trantransfersdto;
import com.comsoftacuity.dto.Userassignedusergroupdto;
import com.comsoftacuity.dto.Userpermissiondto;
import com.comsoftacuity.dto.Userusergroupdto;
import com.comsoftacuity.dto.Userusergrouppermissiondto;
import com.comsoftacuity.dto.Userusersinfodto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yusuff Saliu Adediran
 */
public class EntitymapperUtil {
    public static Appapprulesdto maptoAppapprulesdto(Appapprules mapfrom){
        if(mapfrom==null){
            return null;
        }
        Appapprulesdto mapto = new Appapprulesdto();
        mapto.setActive(mapfrom.getActive());
        mapto.setAppruleid(mapfrom.getAppruleid());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setEnteredbyid(mapfrom.getEnteredbyid());
        mapto.setInstitutioncode(mapfrom.getInstitutioncode());
        //mapto.setModuleId(null);
        mapto.setRule(mapfrom.getRule());
        mapto.setStatus(mapfrom.getStatus());
        return mapto;
    }
    
    public static Appapprules maptoAppapprules(Appapprulesdto mapfrom){
        if(mapfrom==null){
            return null;
        }
        Appapprules mapto = new Appapprules();
        mapto.setActive(mapfrom.getActive());
        mapto.setAppruleid(mapfrom.getAppruleid());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setEnteredbyid(mapfrom.getEnteredbyid());
        mapto.setInstitutioncode(mapfrom.getInstitutioncode());
        //mapto.setModuleId(null);
        mapto.setRule(mapfrom.getRule());
        mapto.setStatus(mapfrom.getStatus());
        return mapto;
    }
    public static List<Appapprulesdto> maptoAppapprulesList(List<Appapprules> mapfrom){
        if(mapfrom==null){
            return null;
        }
        List<Appapprulesdto> list = new ArrayList<>();
        for(Appapprules rs:mapfrom){
            list.add(maptoAppapprulesdto(rs));
        }
        return list;
    }
    ////////////////////////////////////////////////////////////////////
    
    public static Applogalertsdto maptoApplogalertsdto(Applogalerts mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Applogalertsdto mapto = new Applogalertsdto();
        mapto.setActive(mapfrom.getActive());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setEnteredbyid(mapfrom.getEnteredbyid());
        mapto.setInstitutionid(maptoPrmintinstitutiondto(mapfrom.getInstitutionid()));
        mapto.setLogalerid(mapfrom.getLogalerid());
        mapto.setLogtypeId(mapfrom.getLogtypeId());
        mapto.setMobileno(mapfrom.getMobileno());
        mapto.setStaffid(mapfrom.getStaffid());
        return mapto;
    }

    public static Applogalerts maptoApplogalerts(Applogalertsdto mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Applogalerts mapto = new Applogalerts();
        mapto.setActive(mapfrom.getActive());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setEnteredbyid(mapfrom.getEnteredbyid());
         mapto.setInstitutionid(maptoPrmintinstitution(mapfrom.getInstitutionid()));
        mapto.setLogalerid(mapfrom.getLogalerid());
        mapto.setLogtypeId(mapfrom.getLogtypeId());
        mapto.setMobileno(mapfrom.getMobileno());
        mapto.setStaffid(mapfrom.getStaffid());
        return mapto;
    }

    public static List<Applogalertsdto> maptoApplogalertsList(List<Applogalerts> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Applogalertsdto> list = new ArrayList<>();
        for (Applogalerts rs : mapfrom) {
            list.add(maptoApplogalertsdto(rs));
        }
        return list;
    }
    //////////////////////////////////////////////////////////////////////////////////

    public static Appmodulesdto maptoAppmodulesdto(Appmodules mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Appmodulesdto mapto = new Appmodulesdto();
        mapto.setActive(mapfrom.getActive());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setEnteredbyid(mapfrom.getEnteredbyid());
         mapto.setInstitutionid(maptoPrmintinstitutiondto(mapfrom.getInstitutionid()));
        mapto.setModuleid(mapfrom.getModuleid());
        mapto.setModuletype(mapfrom.getModuletype());
        mapto.setStatuscode(mapfrom.getStatuscode());

        return mapto;
    }

    public static Appmodules maptoAppmodules(Appmodulesdto mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Appmodules mapto = new Appmodules();
        mapto.setActive(mapfrom.getActive());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setEnteredbyid(mapfrom.getEnteredbyid());
        mapto.setInstitutionid(maptoPrmintinstitution(mapfrom.getInstitutionid()));
        mapto.setModuleid(mapfrom.getModuleid());
        mapto.setModuletype(mapfrom.getModuletype());
        mapto.setStatuscode(mapfrom.getStatuscode());

        return mapto;
    }

    public static List<Appmodulesdto> maptoAppmodulesList(List<Appmodules> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Appmodulesdto> list = new ArrayList<>();
        for (Appmodules rs : mapfrom) {
            list.add(maptoAppmodulesdto(rs));
        }
        return list;
    }

    public static Lstcategoryleveltypedto maptoLstcategoryleveltypedto(Lstcategoryleveltype mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Lstcategoryleveltypedto mapto = new Lstcategoryleveltypedto();
        mapto.setActive(mapfrom.getActive());
        mapto.setCategoryleveltype(mapfrom.getCategoryleveltype());
        mapto.setCategoryleveltypeid(mapfrom.getCategoryleveltypeid());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setLstmainid(maptoLstmaindto(mapfrom.getLstmainid()));
        return mapto;

    }

    public static Lstcategoryleveltype maptoLstcategoryleveltype(Lstcategoryleveltypedto mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Lstcategoryleveltype mapto = new Lstcategoryleveltype();
        mapto.setActive(mapfrom.getActive());
        mapto.setCategoryleveltype(mapfrom.getCategoryleveltype());
        mapto.setCategoryleveltypeid(mapfrom.getCategoryleveltypeid());
        mapto.setDatecreated(mapfrom.getDatecreated());
         mapto.setLstmainid(maptoLstmain(mapfrom.getLstmainid()));
        return mapto;

    }

    public static List<Lstcategoryleveltypedto> maptoLstcategoryleveltypeList(List<Lstcategoryleveltype> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Lstcategoryleveltypedto> list = new ArrayList<>();
        for (Lstcategoryleveltype rs : mapfrom) {
            list.add(maptoLstcategoryleveltypedto(rs));
        }
        return list;
    }

    public static Lstinventorytypedto maptoLstinventorytypedto(Lstinventorytype mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Lstinventorytypedto mapto = new Lstinventorytypedto();
        mapto.setActive(mapfrom.getActive());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setInventorytype(mapfrom.getInventorytype());
        mapto.setInventorytypeid(mapfrom.getInventorytypeid());
        mapto.setLstmainid(maptoLstmaindto(mapfrom.getLstmainid()));
        return mapto;
    }

    public static Lstinventorytype maptoLstinventorytype(Lstinventorytypedto mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Lstinventorytype mapto = new Lstinventorytype();
        mapto.setActive(mapfrom.getActive());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setInventorytype(mapfrom.getInventorytype());
        mapto.setInventorytypeid(mapfrom.getInventorytypeid());
        mapto.setLstmainid(maptoLstmain(mapfrom.getLstmainid()));
        return mapto;
    }

    public static List<Lstinventorytypedto> maptoLstinventorytypeList(List<Lstinventorytype> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Lstinventorytypedto> list = new ArrayList<>();
        for (Lstinventorytype rs : mapfrom) {
            list.add(maptoLstinventorytypedto(rs));
        }
        return list;

    }

    ///////////////////////////////////////////////////////////////////////////////////////////////
    public static Lstmaindto maptoLstmaindto(Lstmain mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Lstmaindto mapto = new Lstmaindto();
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setDescription(mapfrom.getDescription());
        mapto.setInstitutionid(maptoPrmintinstitutiondto(mapfrom.getInstitutionid()));
        mapto.setLstmainid(mapfrom.getLstmainid());
        return mapto;
    }

    public static Lstmain maptoLstmain(Lstmaindto mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Lstmain mapto = new Lstmain();
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setDescription(mapfrom.getDescription());
        mapto.setInstitutionid(maptoPrmintinstitution(mapfrom.getInstitutionid()));
        mapto.setLstmainid(mapfrom.getLstmainid());
        return mapto;
    }

    public static List<Lstmaindto> maptoLstmainList(List<Lstmain> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Lstmaindto> list = new ArrayList<>();
        for (Lstmain rs : mapfrom) {
            list.add(maptoLstmaindto(rs));
        }
        return list;
    }

    public static Lstmeasurepackdto maptoLstmeasurepackdto(Lstmeasurepack mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Lstmeasurepackdto mapto = new Lstmeasurepackdto();
        mapto.setActive(mapfrom.getActive());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setLstmainid(maptoLstmaindto(mapfrom.getLstmainid()));
        mapto.setMeasureid(mapfrom.getMeasureid());
        mapto.setMeasurepack(mapfrom.getMeasurepack());
        return mapto;
    }

    public static Lstmeasurepack maptoLstmeasurepack(Lstmeasurepackdto mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Lstmeasurepack mapto = new Lstmeasurepack();
        mapto.setActive(mapfrom.getActive());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setLstmainid(maptoLstmain(mapfrom.getLstmainid()));
        mapto.setMeasureid(mapfrom.getMeasureid());
        mapto.setMeasurepack(mapfrom.getMeasurepack());
        return mapto;
    }

    public static List<Lstmeasurepackdto> maptoLstmeasurepackList(List<Lstmeasurepack> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Lstmeasurepackdto> list = new ArrayList<>();
        for (Lstmeasurepack rs : mapfrom) {
            list.add(maptoLstmeasurepackdto(rs));
        }
        return list;
    }

    public static Lstmeasureunitdto maptoLstmeasureunitdto(Lstmeasureunit mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Lstmeasureunitdto mapto = new Lstmeasureunitdto();
        mapto.setActive(mapfrom.getActive());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setLstmainid(maptoLstmaindto(mapfrom.getLstmainid()));
        mapto.setMeasureunit(mapfrom.getMeasureunit());
        mapto.setMesureunitid(mapfrom.getMesureunitid());
        return mapto;
    }

    public static Lstmeasureunit maptoLstmeasureunit(Lstmeasureunitdto mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Lstmeasureunit mapto = new Lstmeasureunit();
        mapto.setActive(mapfrom.getActive());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setLstmainid(maptoLstmain(mapfrom.getLstmainid()));
        mapto.setMeasureunit(mapfrom.getMeasureunit());
        mapto.setMesureunitid(mapfrom.getMesureunitid());
        return mapto;
    }

    public static List<Lstmeasureunitdto> maptoLstmeasureunitList(List<Lstmeasureunit> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Lstmeasureunitdto> list = new ArrayList<>();
        for (Lstmeasureunit rs : mapfrom) {
            list.add(maptoLstmeasureunitdto(rs));
        }
        return list;
    }

    public static Lststockleveltypedto maptoLststockleveltypedto(Lststockleveltype mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Lststockleveltypedto mapto = new Lststockleveltypedto();
        mapto.setActive(mapfrom.getActive());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setDescription(mapfrom.getDescription());
        mapto.setLstmainid(maptoLstmaindto(mapfrom.getLstmainid()));
        mapto.setStoretypeid(mapfrom.getStoretypeid());

        return mapto;
    }

    public static Lststockleveltype maptoLststockleveltype(Lststockleveltypedto mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Lststockleveltype mapto = new Lststockleveltype();
        mapto.setActive(mapfrom.getActive());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setDescription(mapfrom.getDescription());
        mapto.setLstmainid(maptoLstmain(mapfrom.getLstmainid()));
        mapto.setStoretypeid(mapfrom.getStoretypeid());

        return mapto;
    }

    public static List<Lststockleveltypedto> maptoLststockleveltypeList(List<Lststockleveltype> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Lststockleveltypedto> list = new ArrayList<>();
        for (Lststockleveltype rs : mapfrom) {
            list.add(maptoLststockleveltypedto(rs));
        }
        return list;
    }

    public static Lststockoutreceipttypedto maptoLststockoutreceipttypedto(Lststockoutreceipttype mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Lststockoutreceipttypedto mapto = new Lststockoutreceipttypedto();
        mapto.setActive(mapfrom.getActive());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setDescription(mapfrom.getDescription());
        mapto.setLstmainid(maptoLstmaindto(mapfrom.getLstmainid()));
        mapto.setStockrecipttypeid(mapfrom.getStockrecipttypeid());
        return mapto;
    }

    public static Lststockoutreceipttype maptoLststockoutreceipttype(Lststockoutreceipttypedto mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Lststockoutreceipttype mapto = new Lststockoutreceipttype();
        mapto.setActive(mapfrom.getActive());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setDescription(mapfrom.getDescription());
        mapto.setLstmainid(maptoLstmain(mapfrom.getLstmainid()));
        mapto.setStockrecipttypeid(mapfrom.getStockrecipttypeid());
        return mapto;
    }

    public static List<Lststockoutreceipttypedto> maptoLststockoutreceipttypeList(List<Lststockoutreceipttype> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Lststockoutreceipttypedto> list = new ArrayList<>();
        for (Lststockoutreceipttype rs : mapfrom) {
            list.add(maptoLststockoutreceipttypedto(rs));
        }
        return list;
    }

    public static Lststockouttypedto maptoLststockouttypedto(Lststockouttype mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Lststockouttypedto mapto = new Lststockouttypedto();
        mapto.setActive(mapfrom.getActive());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setDescription(mapfrom.getDescription());
        mapto.setLstmainid(maptoLstmaindto(mapfrom.getLstmainid()));
        mapto.setStockouttypeid(mapfrom.getStockouttypeid());
        return mapto;
    }

    public static Lststockouttype maptoLststockouttype(Lststockouttypedto mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Lststockouttype mapto = new Lststockouttype();
        mapto.setActive(mapfrom.getActive());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setDescription(mapfrom.getDescription());
        mapto.setLstmainid(maptoLstmain(mapfrom.getLstmainid()));
        mapto.setStockouttypeid(mapfrom.getStockouttypeid());
        return mapto;
    }

    public static List<Lststockouttypedto> maptoLststockouttypeList(List<Lststockouttype> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Lststockouttypedto> list = new ArrayList<>();
        for (Lststockouttype rs : mapfrom) {
            list.add(maptoLststockouttypedto(rs));
        }
        return list;

    }

    public static Lststoresdto maptoLststoresdto(Lststores mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Lststoresdto mapto = new Lststoresdto();
        mapto.setActive(mapfrom.getActive());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setLstmainid(maptoLstmaindto(mapfrom.getLstmainid()));
        mapto.setParentId(mapfrom.getParentId());
        mapto.setStoreid(mapfrom.getStoreid());
        mapto.setStorelevelname(mapfrom.getStorelevelname());
        mapto.setStoretypeid(maptoLststockleveltypedto(mapfrom.getStoretypeid()));
        return mapto;
    }

    public static Lststores maptoLststores(Lststoresdto mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Lststores mapto = new Lststores();
        mapto.setActive(mapfrom.getActive());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setLstmainid(maptoLstmain(mapfrom.getLstmainid()));
        mapto.setParentId(mapfrom.getParentId());
        mapto.setStoreid(mapfrom.getStoreid());
        mapto.setStorelevelname(mapfrom.getStorelevelname());
        mapto.setStoretypeid(maptoLststockleveltype(mapfrom.getStoretypeid()));
        return mapto;
    }

    public static List<Lststoresdto> maptoLststoresList(List<Lststores> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Lststoresdto> list = new ArrayList<>();
        for (Lststores rs : mapfrom) {
            list.add(maptoLststoresdto(rs));
        }
        return list;
    }

    public static Lstsubcategorytreedto maptoLstsubcategorytreedto(Lstsubcategorytree mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Lstsubcategorytreedto mapto = new Lstsubcategorytreedto();
        mapto.setActive(mapfrom.getActive());
        mapto.setCategoryleveltypeid(maptoLstcategoryleveltypedto(mapfrom.getCategoryleveltypeid()));
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setDescription(mapfrom.getDescription());
        mapto.setLstmainid(maptoLstmaindto(mapfrom.getLstmainid()));
        mapto.setParentId(mapfrom.getParentId());
        mapto.setSubcategorytid(mapfrom.getSubcategorytid());
        return mapto;
    }

    public static Lstsubcategorytree maptoLstsubcategorytree(Lstsubcategorytreedto mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Lstsubcategorytree mapto = new Lstsubcategorytree();
        mapto.setActive(mapfrom.getActive());
        mapto.setCategoryleveltypeid(maptoLstcategoryleveltype(mapfrom.getCategoryleveltypeid()));
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setDescription(mapfrom.getDescription());
        mapto.setLstmainid(maptoLstmain(mapfrom.getLstmainid()));
        mapto.setParentId(mapfrom.getParentId());
        mapto.setSubcategorytid(mapfrom.getSubcategorytid());
        
        return mapto;
    }

    public static List<Lstsubcategorytreedto> maptoLstsubcategorytreeList(List<Lstsubcategorytree> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Lstsubcategorytreedto> list = new ArrayList<>();
        for (Lstsubcategorytree rs : mapfrom) {
            list.add(maptoLstsubcategorytreedto(rs));
        }
        return list;
    }

    public static Lstsupplytypedto maptoLstsupplytypedto(Lstsupplytype mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Lstsupplytypedto mapto = new Lstsupplytypedto();
        mapto.setActive(mapfrom.getActive());
        mapto.setDateCreated(mapfrom.getDateCreated());
        mapto.setDescription(mapfrom.getDescription());
        mapto.setLstmainid(maptoLstmaindto(mapfrom.getLstmainid()));
        mapto.setSubpplytypeid(mapfrom.getSubpplytypeid());
        mapto.setSupplyid(maptoSupplierdto(mapfrom.getSupplyid()));
        
        return mapto;
    }

    public static Lstsupplytype maptoLstsupplytype(Lstsupplytypedto mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Lstsupplytype mapto = new Lstsupplytype();
        mapto.setActive(mapfrom.getActive());
        mapto.setDateCreated(mapfrom.getDateCreated());
        mapto.setDescription(mapfrom.getDescription());
        mapto.setLstmainid(maptoLstmain(mapfrom.getLstmainid()));
        mapto.setSubpplytypeid(mapfrom.getSubpplytypeid());
        mapto.setSupplyid(maptoSupplier(mapfrom.getSupplyid()));
        return mapto;
    }

    public static List<Lstsupplytypedto> maptoLstsupplytypeList(List<Lstsupplytype> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Lstsupplytypedto> list = new ArrayList<>();
        for (Lstsupplytype rs : mapfrom) {
            list.add(maptoLstsupplytypedto(rs));
        }
        return list;
    }

    public static Prmintinstitutiondto maptoPrmintinstitutiondto(Prmintinstitution mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Prmintinstitutiondto mapto = new Prmintinstitutiondto();
        mapto.setActive(mapfrom.getActive());
        mapto.setAddress(mapfrom.getAddress());
        mapto.setContactdetails(mapfrom.getContactdetails());
        mapto.setContactemail(mapfrom.getContactemail());
        mapto.setContactmobile(mapfrom.getContactmobile());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setEnteredbyid(mapfrom.getEnteredbyid());
        mapto.setHavebranches(mapfrom.getHavebranches());
        mapto.setInstitutioncode(mapfrom.getInstitutioncode());
        mapto.setInstitutionid(mapfrom.getInstitutionid());
        mapto.setInstitutionname(mapfrom.getInstitutionname());
        mapto.setInstitutiontypeid(maptoPrmintinstitutiontypedto(mapfrom.getInstitutiontypeid()));
        mapto.setLicense(mapfrom.getLicense());
        mapto.setLicensemodel(mapfrom.getLicensemodel());
        return mapto;
    }

    public static Prmintinstitution maptoPrmintinstitution(Prmintinstitutiondto mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Prmintinstitution mapto = new Prmintinstitution();
        mapto.setActive(mapfrom.getActive());
        mapto.setAddress(mapfrom.getAddress());
        mapto.setContactdetails(mapfrom.getContactdetails());
        mapto.setContactemail(mapfrom.getContactemail());
        mapto.setContactmobile(mapfrom.getContactmobile());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setEnteredbyid(mapfrom.getEnteredbyid());
        mapto.setHavebranches(mapfrom.getHavebranches());
        mapto.setInstitutioncode(mapfrom.getInstitutioncode());
        mapto.setInstitutionid(mapfrom.getInstitutionid());
        mapto.setInstitutionname(mapfrom.getInstitutionname());
        mapto.setInstitutiontypeid(maptoPrmintinstitutiontype(mapfrom.getInstitutiontypeid()));
        mapto.setLicense(mapfrom.getLicense());
        mapto.setLicensemodel(mapfrom.getLicensemodel());
        return mapto;
    }

    public static List<Prmintinstitutiondto> maptoPrmintinstitutionList(List<Prmintinstitution> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Prmintinstitutiondto> list = new ArrayList<>();
        for (Prmintinstitution rs : mapfrom) {
            list.add(maptoPrmintinstitutiondto(rs));
        }
        return list;
    }

    public static Prmintinstitutiontypedto maptoPrmintinstitutiontypedto(Prmintinstitutiontype mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Prmintinstitutiontypedto mapto = new Prmintinstitutiontypedto();
        mapto.setActive(mapfrom.getActive());
        mapto.setDatcreated(mapfrom.getDatcreated());
        mapto.setDescription(mapfrom.getDescription());
        mapto.setInstitutiontypeid(mapfrom.getInstitutiontypeid());
        return mapto;
    }

    public static Prmintinstitutiontype maptoPrmintinstitutiontype(Prmintinstitutiontypedto mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Prmintinstitutiontype mapto = new Prmintinstitutiontype();
        mapto.setActive(mapfrom.getActive());
        mapto.setDatcreated(mapfrom.getDatcreated());
        mapto.setDescription(mapfrom.getDescription());
        mapto.setInstitutiontypeid(mapfrom.getInstitutiontypeid());
        return mapto;
    }

    public static List<Prmintinstitutiontypedto> maptoPrmintinstitutiontypeList(List<Prmintinstitutiontype> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Prmintinstitutiontypedto> list = new ArrayList<>();
        for (Prmintinstitutiontype rs : mapfrom) {
            list.add(maptoPrmintinstitutiontypedto(rs));
        }
        return list;
    }

    public static Prmintsuborganisationdto maptoPrmintsuborganisationdto(Prmintsuborganisation mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Prmintsuborganisationdto mapto = new Prmintsuborganisationdto();
        mapto.setActive(mapfrom.getActive());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setParentid(mapfrom.getParentid());
        mapto.setSuborganisationname(mapfrom.getSuborganisationname());
        mapto.setSuborganisationtypeid(maptoPrmintsuborganisationtypedto(mapfrom.getSuborganisationtypeid()));
        mapto.setSuborgid(mapfrom.getSuborgid());
        return mapto;
    }

    public static Prmintsuborganisation maptoPrmintsuborganisation(Prmintsuborganisationdto mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Prmintsuborganisation mapto = new Prmintsuborganisation();
        mapto.setActive(mapfrom.getActive());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setParentid(mapfrom.getParentid());
        mapto.setSuborganisationname(mapfrom.getSuborganisationname());
        mapto.setSuborganisationtypeid(maptoPrmintsuborganisationtype(mapfrom.getSuborganisationtypeid()));
        mapto.setSuborgid(mapfrom.getSuborgid());
        return mapto;
    }

    public static List<Prmintsuborganisationdto> maptoPrmintsuborganisationList(List<Prmintsuborganisation> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Prmintsuborganisationdto> list = new ArrayList<>();
        for (Prmintsuborganisation rs : mapfrom) {
            list.add(maptoPrmintsuborganisationdto(rs));
        }
        return list;
    }
    public static Prmintsuborganisationtypedto maptoPrmintsuborganisationtypedto(Prmintsuborganisationtype mapfrom){
        if(mapfrom==null){
            return null;
        }
    Prmintsuborganisationtypedto mapto = new Prmintsuborganisationtypedto();
    
    mapto.setActive(mapfrom.getActive());
    mapto.setDatecreated(mapfrom.getDatecreated());
    mapto.setInstitutionid(maptoPrmintinstitutiondto(mapfrom.getInstitutionid()));
    mapto.setSuborganisationtype(mapfrom.getSuborganisationtype());
    mapto.setSuborgtypeid(mapfrom.getSuborgtypeid());
    return mapto;
}

public static Prmintsuborganisationtype maptoPrmintsuborganisationtype(Prmintsuborganisationtypedto mapfrom){
    if(mapfrom==null){
        return null;
    }
    Prmintsuborganisationtype mapto = new Prmintsuborganisationtype();
    
    mapto.setActive(mapfrom.getActive());
    mapto.setDatecreated(mapfrom.getDatecreated());
    mapto.setInstitutionid(maptoPrmintinstitution(mapfrom.getInstitutionid()));
    mapto.setSuborganisationtype(mapfrom.getSuborganisationtype());
    mapto.setSuborgtypeid(mapfrom.getSuborgtypeid());
    return mapto;
}
public static List<Prmintsuborganisationtypedto> maptoPrmintsuborganisationtypeList(List<Prmintsuborganisationtype> mapfrom){
    if(mapfrom==null){
    return null;
    }
    List<Prmintsuborganisationtypedto> list = new ArrayList<>();
    for(Prmintsuborganisationtype rs:mapfrom){
        list.add(maptoPrmintsuborganisationtypedto(rs));
    }
    return list;
}

public static Regdepreciationbycategorydto maptoRegdepreciationbycategorydto(Regdepreciationbycategory mapfrom){
    if(mapfrom==null){
        return null;
    }
    Regdepreciationbycategorydto mapto = new Regdepreciationbycategorydto();
    mapto.setActive(mapfrom.getActive());
    mapto.setDatecreated(mapfrom.getDatecreated());
    mapto.setDepreciationPeriod(mapfrom.getDepreciationPeriod());
    mapto.setDepreciationid(mapfrom.getDepreciationid());
    mapto.setDepreciationvalue(mapfrom.getDepreciationvalue());
    mapto.setSubcategoryId(maptoLstsubcategorytreedto(mapfrom.getSubcategoryId()));
    return mapto;
    
}

public static Regdepreciationbycategory maptoRegdepreciationbycategory(Regdepreciationbycategorydto mapfrom){
    if(mapfrom==null){
        return null;
    }
    Regdepreciationbycategory mapto = new Regdepreciationbycategory();
    mapto.setActive(mapfrom.getActive());
    mapto.setDatecreated(mapfrom.getDatecreated());
    mapto.setDepreciationPeriod(mapfrom.getDepreciationPeriod());
    mapto.setDepreciationid(mapfrom.getDepreciationid());
    mapto.setDepreciationvalue(mapfrom.getDepreciationvalue());
    mapto.setSubcategoryId(maptoLstsubcategorytree(mapfrom.getSubcategoryId()));
    return mapto;
    
}
public static List<Regdepreciationbycategorydto> maptoRegdepreciationbycategoryList(List<Regdepreciationbycategory> mapfrom){
    if(mapfrom==null){
        return null;
    }
    List<Regdepreciationbycategorydto> list = new ArrayList<>();
    for(Regdepreciationbycategory rs:mapfrom){
        list.add(maptoRegdepreciationbycategorydto(rs));
    }
    return list;
}

   public static List<Userusersinfodto> maptoUserusersinfoList(List<Userusersinfo> mapfrom){
       if (mapfrom == null){
           return null;
       }
       List<Userusersinfodto> mapto = new ArrayList<>();
       for(Userusersinfo item: mapfrom){
           mapto.add(maptoUserusersinfodto(item));
       }
       return mapto;
   }

   public static Userusersinfo maptoUserusersinfo(Userusersinfodto mapfrom){
       if (mapfrom == null){
           return null;
       }
        Userusersinfo mapto = new Userusersinfo();
        mapto.setActive(mapfrom.getActive());
        mapto.setContactemail(mapfrom.getContactemail());
        mapto.setContactmobile(mapfrom.getContactmobile());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setEnteredbyid(mapfrom.getEnteredbyid());
        mapto.setFirstname(mapfrom.getFirstname());
        mapto.setInstitutioncode(mapfrom.getInstitutioncode());
        mapto.setLastname(mapfrom.getLastname());
        mapto.setMiddlename(mapfrom.getMiddlename());
        mapto.setPassword(mapfrom.getPassword());
        mapto.setUserid(mapfrom.getUserid());
        mapto.setUsername(mapfrom.getUsername());
        return mapto;
   }
   
   public static Userusersinfodto maptoUserusersinfodto(Userusersinfo mapfrom){
       if (mapfrom ==null){
           return null;
       }
        Userusersinfodto mapto = new Userusersinfodto();
        mapto.setActive(mapfrom.getActive());
        mapto.setContactemail(mapfrom.getContactemail());
        mapto.setContactmobile(mapfrom.getContactmobile());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setEnteredbyid(mapfrom.getEnteredbyid());
        mapto.setFirstname(mapfrom.getFirstname());
        mapto.setInstitutioncode(mapfrom.getInstitutioncode());
        mapto.setLastname(mapfrom.getLastname());
        mapto.setMiddlename(mapfrom.getMiddlename());
        mapto.setPassword(mapfrom.getPassword());
        mapto.setUserid(mapfrom.getUserid());
        mapto.setUsername(mapfrom.getUsername());
        return mapto;
   }

   /////////////////////////////////////////////////////////////////////////////
   
   
   public static List<Userusergrouppermissiondto> maptoUserusergrouppermissionList(List<Userusergrouppermission> mapfrom){
       if (mapfrom == null){
           return null;
       }
       List<Userusergrouppermissiondto> mapto = new ArrayList<>();
       for (Userusergrouppermission item: mapfrom){
           mapto.add(maptoUserusergrouppermissiondto(item));
       }
       return mapto;
   }

 
   public static Userusergrouppermission maptoUserusergrouppermission(Userusergrouppermissiondto mapfrom){
       if (mapfrom == null){
           return null;
       }
       Userusergrouppermission mapto = new Userusergrouppermission();
       mapto.setActive(mapfrom.getActive());
       mapto.setDatecreated(mapfrom.getDatecreated());
       mapto.setEnteredbyid(mapfrom.getEnteredbyid());
       mapto.setGrouppermid(mapfrom.getGrouppermid());
       mapto.setStatus(mapfrom.getStatus());
       mapto.setPermissionId(maptoUserpermission(mapfrom.getPermissionId()));
       mapto.setUsergrpid(maptoUserusergroup(mapfrom.getUsergrpid()));
       return mapto;
   }

   public static Userusergrouppermissiondto maptoUserusergrouppermissiondto(Userusergrouppermission mapfrom){
       if (mapfrom == null){
           return null;
       }
       Userusergrouppermissiondto mapto = new Userusergrouppermissiondto();
       mapto.setActive(mapfrom.getActive());
       mapto.setDatecreated(mapfrom.getDatecreated());
       mapto.setEnteredbyid(mapfrom.getEnteredbyid());
       mapto.setGrouppermid(mapfrom.getGrouppermid());
       mapto.setStatus(mapfrom.getStatus());
       mapto.setPermissionId(maptoUserpermissiondto(mapfrom.getPermissionId()));
       mapto.setUsergrpid(maptoUserusergroupdto(mapfrom.getUsergrpid()));
       return mapto;
       
   }
   /////////////////////////////////////////////////////////////////////////////
   
   
   
   public static List<Userusergroupdto> maptoUserusergroupList(List<Userusergroup> mapfrom){
       if (mapfrom == null){
           return null;
       }
       List<Userusergroupdto> mapto = new ArrayList<>();
       for (Userusergroup item: mapfrom){
           mapto.add(maptoUserusergroupdto(item));
       }
       return mapto;
   }
   
   
  public static Userusergroup maptoUserusergroup(Userusergroupdto mapfrom){
      if (mapfrom == null){
          return null;
      }
      Userusergroup mapto = new Userusergroup();
      mapto.setActive(mapfrom.getActive());
      mapto.setComment(mapfrom.getComment());
      mapto.setDatecreated(mapfrom.getDatecreated());
      mapto.setEnteredbyid(mapfrom.getEnteredbyid());
      mapto.setGroupname(mapfrom.getGroupname());
      mapto.setLstmainid(maptoLstmain(mapfrom.getLstmainid()));
      mapto.setUsergrpid(mapfrom.getUsergrpid());
      return mapto;
  }

   public static Userusergroupdto maptoUserusergroupdto(Userusergroup mapfrom){
       if (mapfrom == null){
           return null;
       }
       Userusergroupdto mapto = new Userusergroupdto();
       mapto.setActive(mapfrom.getActive());
       mapto.setComment(mapfrom.getComment());
       mapto.setDatecreated(mapfrom.getDatecreated());
       mapto.setEnteredbyid(mapfrom.getEnteredbyid());
       mapto.setGroupname(mapfrom.getGroupname());
       mapto.setLstmainid(maptoLstmaindto(mapfrom.getLstmainid()));
       mapto.setUsergrpid(mapfrom.getUsergrpid());
       return mapto;
   }
//////////////////////////////////////////////////////////
   
   
   public static List<Userpermissiondto> maptoUserpermissionList(List<Userpermission> mapfrom){
       if (mapfrom == null){
           return null;
       }
       List<Userpermissiondto> mapto = new ArrayList<>();
       for (Userpermission item: mapfrom){
           mapto.add(maptoUserpermissiondto(item));
       }
       return mapto;
   }
   
  

  public static Userpermission maptoUserpermission(Userpermissiondto mapfrom){
      if (mapfrom == null){
          return null;
      }
      Userpermission mapto = new Userpermission();
      mapto.setActive(mapfrom.getActive());
      mapto.setDescription(mapfrom.getDescription());
      mapto.setEnteredbyid(mapfrom.getEnteredbyid());
      mapto.setLstmainid(mapfrom.getLstmainid());
      mapto.setModuleid(maptoAppmodules(mapfrom.getModuleid()));
      mapto.setPermission(mapfrom.getPermission());
      mapto.setPermissionid(mapfrom.getPermissionid());
      return mapto;
  }

  public static Userpermissiondto maptoUserpermissiondto(Userpermission mapfrom){
      if (mapfrom == null){
          return null;
      }
      Userpermissiondto mapto = new Userpermissiondto();
      mapto.setActive(mapfrom.getActive());
      mapto.setDescription(mapfrom.getDescription());
      mapto.setEnteredbyid(mapfrom.getEnteredbyid());
      mapto.setLstmainid(mapfrom.getLstmainid());
      mapto.setModuleid(maptoAppmodulesdto(mapfrom.getModuleid()));
      mapto.setPermission(mapfrom.getPermission());
      mapto.setPermissionid(mapfrom.getPermissionid());
      return mapto;
  }

   /////////////////////////////////////////////////////////////////////////
    
  public static List<Userassignedusergroupdto> maptoUserassignedusergroupList(List<Userassignedusergroup> mapfrom){
      if (mapfrom == null){
          return null;
      }
      List<Userassignedusergroupdto> mapto = new ArrayList<>();
      for (Userassignedusergroup item: mapfrom){
          mapto.add(maptoUserassignedusergroupdto(item));
      }
      return mapto;
  }
   
   
 
    
 public static Userassignedusergroup maptoUserassignedusergroup(Userassignedusergroupdto mapfrom){
     if (mapfrom == null){
         return null;
     }
     Userassignedusergroup mapto = new Userassignedusergroup();
     mapto.setActive(mapfrom.getActive());
     mapto.setAsignuserid(mapfrom.getAsignuserid());
     mapto.setDatecreated(mapfrom.getDatecreated());
     mapto.setEnteredbyId(mapfrom.getEnteredbyId());
     mapto.setGroupid(maptoUserusergroup(mapfrom.getGroupid()));
     mapto.setPrmissionId(maptoUserpermission(mapfrom.getPrmissionId()));
     mapto.setUserid(maptoUserusersinfo(mapfrom.getUserid()));
     return mapto;
 }
  
public static Userassignedusergroupdto maptoUserassignedusergroupdto(Userassignedusergroup mapfrom){
    if (mapfrom == null){
        return null;
    }
    Userassignedusergroupdto mapto = new Userassignedusergroupdto();
    mapto.setActive(mapfrom.getActive());
    mapto.setAsignuserid(mapfrom.getAsignuserid());
    mapto.setDatecreated(mapfrom.getDatecreated());
    mapto.setEnteredbyId(mapfrom.getEnteredbyId());
    mapto.setGroupid(maptoUserusergroupdto(mapfrom.getGroupid()));
    mapto.setPrmissionId(maptoUserpermissiondto(mapfrom.getPrmissionId()));
    mapto.setUserid(maptoUserusersinfodto(mapfrom.getUserid()));
    return mapto;
}
////////////////////////////////////////////////////////////////////////////////
 
public static List<Trantransfersdto> maptoTrantransfersList(List<Trantransfers> mapfrom){
    if (mapfrom == null){
        return null;
    }
    List<Trantransfersdto> mapto = new ArrayList<>();
    for (Trantransfers item: mapfrom){
        mapto.add(maptoTrantransfersdto(item));
    }
    return mapto;
}
  
 public static Trantransfers maptoTrantransfers(Trantransfersdto mapfrom){
     if (mapfrom == null){
         return null;
     }
     Trantransfers mapto = new Trantransfers();
     mapto.setActive(mapfrom.getActive());
     mapto.setBatchno(mapfrom.getBatchno());
     mapto.setDatecreated(mapfrom.getDatecreated());
     mapto.setEnteredbyid(mapfrom.getEnteredbyid());
     mapto.setFromstoreid(mapfrom.getFromstoreid());
     mapto.setId(mapfrom.getId());
     mapto.setItemid(mapfrom.getItemid());
     mapto.setQtyrecieved(mapfrom.getQtyrecieved());
     mapto.setQtysent(mapfrom.getQtysent());
     mapto.setRemarks(mapfrom.getRemarks());
     mapto.setTostoreId(mapfrom.getTostoreId());
     mapto.setTranlogid(maptoTranlogs(mapfrom.getTranlogid()));
     mapto.setTransferstatus(mapfrom.getTransferstatus());
     return mapto;
 }
 
 public static Trantransfersdto maptoTrantransfersdto(Trantransfers mapfrom){
     if (mapfrom == null){
         return null;
     }
     Trantransfersdto mapto = new Trantransfersdto();
      mapto.setActive(mapfrom.getActive());
     mapto.setBatchno(mapfrom.getBatchno());
     mapto.setDatecreated(mapfrom.getDatecreated());
     mapto.setEnteredbyid(mapfrom.getEnteredbyid());
     mapto.setFromstoreid(mapfrom.getFromstoreid());
     mapto.setId(mapfrom.getId());
     mapto.setItemid(mapfrom.getItemid());
     mapto.setQtyrecieved(mapfrom.getQtyrecieved());
     mapto.setQtysent(mapfrom.getQtysent());
     mapto.setRemarks(mapfrom.getRemarks());
     mapto.setTostoreId(mapfrom.getTostoreId());
     mapto.setTranlogid(maptoTranlogsdto(mapfrom.getTranlogid()));
     mapto.setTransferstatus(mapfrom.getTransferstatus());
     return mapto;
 }
 /////////////////////////////////////////////////////////////////////////////// 
 
public static List<Transtocktakingdto> maptoTranstocktakingList(List<Transtocktaking> mapfrom){
    if (mapfrom == null){
        return null;
    }
    List<Transtocktakingdto> mapto = new ArrayList<>();
    for (Transtocktaking item :mapfrom){
        mapto.add(maptoTranstocktakingdto(item));
    }
    return mapto;
}
 
  
public static Transtocktaking maptoTranstocktaking(Transtocktakingdto mapfrom){
    if (mapfrom == null){
        return null;
    }
    Transtocktaking mapto = new Transtocktaking();
    mapto.setActive(mapfrom.getActive());
     mapto.setComputerqty(mapfrom.getComputerqty());
     mapto.setDatecreated(mapfrom.getDatecreated());
     mapto.setDateoftran(mapfrom.getDateoftran());
     mapto.setDifference(mapfrom.getDifference());
     mapto.setItemid(mapfrom.getItemid());
     mapto.setPhysicalcount(mapfrom.getPhysicalcount());
     mapto.setRemarks(mapfrom.getRemarks());
     mapto.setStktakenid(mapfrom.getStktakenid());
     mapto.setTranlogid(maptoTranlogs(mapfrom.getTranlogid()));
     return mapto;
}
  
public static Transtocktakingdto maptoTranstocktakingdto(Transtocktaking mapfrom){
    if (mapfrom == null){
        return null;
    }
    Transtocktakingdto mapto = new Transtocktakingdto();
     mapto.setActive(mapfrom.getActive());
     mapto.setComputerqty(mapfrom.getComputerqty());
     mapto.setDatecreated(mapfrom.getDatecreated());
     mapto.setDateoftran(mapfrom.getDateoftran());
     mapto.setDifference(mapfrom.getDifference());
     mapto.setItemid(mapfrom.getItemid());
     mapto.setPhysicalcount(mapfrom.getPhysicalcount());
     mapto.setRemarks(mapfrom.getRemarks());
     mapto.setStktakenid(mapfrom.getStktakenid());
     mapto.setTranlogid(maptoTranlogsdto(mapfrom.getTranlogid()));
     return mapto;
}
 /////////////////////////////////////////////////////////////////////////////// 


public static List<Transtockoutdto> maptoTranstockoutList(List<Transtockout> mapfrom){
    if (mapfrom == null){
        return null;
    }
    List<Transtockoutdto> mapto = new ArrayList<>();
    for (Transtockout item: mapfrom){
        mapto.add(maptoTranstockoutdto(item));
    }
    return mapto;
}
   
 
   
 public static Transtockoutdto maptoTranstockoutdto(Transtockout mapfrom){
     if (mapfrom == null){
         return null;
     }
     Transtockoutdto mapto = new Transtockoutdto();
     mapto.setActive(mapfrom.getActive());
     mapto.setApprovedby(mapfrom.getApprovedby());
     mapto.setDatecreated(mapfrom.getDatecreated());
     mapto.setDateout(mapfrom.getDateout());
     mapto.setDocumentNo(mapfrom.getDocumentNo());
     mapto.setEnteredbyid(mapfrom.getEnteredbyid());
     mapto.setFrmstoreid(mapfrom.getFrmstoreid());
     mapto.setFromstockinId(mapfrom.getFromstockinId());
     mapto.setItemid(mapfrom.getItemid());
     mapto.setQtyout(mapfrom.getQtyout());
     mapto.setQtyrqst(mapfrom.getQtyrqst());
     mapto.setRecipientId(mapfrom.getRecipientId());
     mapto.setRecipientName(mapfrom.getRecipientName());
     mapto.setRecipienttype(mapfrom.getRecipienttype());
     mapto.setReturned(mapfrom.getReturned());
     mapto.setReturneddate(mapfrom.getReturneddate());
     mapto.setStockoutid(mapfrom.getStockoutid());
     return mapto;
 }
 
 public static Transtockout maptoTranstockout(Transtockoutdto mapfrom){
     if (mapfrom == null){
         return null;
     }
     Transtockout mapto = new Transtockout();
     mapto.setActive(mapfrom.getActive());
     mapto.setApprovedby(mapfrom.getApprovedby());
     mapto.setDatecreated(mapfrom.getDatecreated());
     mapto.setDateout(mapfrom.getDateout());
     mapto.setDocumentNo(mapfrom.getDocumentNo());
     mapto.setEnteredbyid(mapfrom.getEnteredbyid());
     mapto.setFrmstoreid(mapfrom.getFrmstoreid());
     mapto.setFromstockinId(mapfrom.getFromstockinId());
     mapto.setItemid(mapfrom.getItemid());
     mapto.setQtyout(mapfrom.getQtyout());
     mapto.setQtyrqst(mapfrom.getQtyrqst());
     mapto.setRecipientId(mapfrom.getRecipientId());
     mapto.setRecipientName(mapfrom.getRecipientName());
     mapto.setRecipienttype(mapfrom.getRecipienttype());
     mapto.setReturned(mapfrom.getReturned());
     mapto.setReturneddate(mapfrom.getReturneddate());
     mapto.setStockoutid(mapfrom.getStockoutid());
     return mapto;
 }
  //////////////////////////////////////////////////////////////////////////////
 public static List<Transtockleveldto> maptoTranstocklevelList(List<Transtocklevel> mapfrom){
     if (mapfrom == null){
         return null;
     }
    List<Transtockleveldto> mapto = new ArrayList<>();
    for (Transtocklevel item: mapfrom){
        mapto.add(maptoTranstockleveldto(item));
    }
    return mapto;
 }
 
 public static Transtockleveldto maptoTranstockleveldto(Transtocklevel mapfrom){
     if (mapfrom == null){
         return null;
     }
     Transtockleveldto mapto = new Transtockleveldto();
     mapto.setDatecreated(mapfrom.getDatecreated());
     mapto.setEnteredbyId(mapfrom.getEnteredbyId());
     mapto.setItemid(mapfrom.getItemid());
     mapto.setQtylevel(mapfrom.getQtylevel());
     mapto.setStockid(mapfrom.getStockid());
     mapto.setStoreId(mapfrom.getStoreId());
     mapto.setTranlogid(maptoTranlogsdto(mapfrom.getTranlogid()));
     return mapto;
 }
 public static Transtocklevel maptoTranstocklevel(Transtockleveldto mapfrom){
     if (mapfrom == null){
         return null;
     }
     Transtocklevel mapto = new Transtocklevel();
     mapto.setDatecreated(mapfrom.getDatecreated());
     mapto.setEnteredbyId(mapfrom.getEnteredbyId());
     mapto.setItemid(mapfrom.getItemid());
     mapto.setQtylevel(mapfrom.getQtylevel());
     mapto.setStockid(mapfrom.getStockid());
     mapto.setStoreId(mapfrom.getStoreId());
     mapto.setTranlogid(maptoTranlogs(mapfrom.getTranlogid()));
     return mapto;
 }
////////////////////////////////////////////////////////////////////////////////
 public static List<Transtockindto> maptoTranstockinList(List<Transtockin> mapfrom){
     if (mapfrom == null){
         return null;
     }
     List<Transtockindto> mapto = new ArrayList<>();
     for (Transtockin item: mapfrom){
        mapto.add(maptoTranstockindto(item));
     }
     return mapto;
 }
public static Transtockin maptoTranstockin(Transtockindto mapfrom){
    if (mapfrom == null){
        return null;
    }
    Transtockin mapto = new Transtockin();
    mapto.setActive(mapfrom.getActive());
    mapto.setBatchno(mapfrom.getBatchno());
    mapto.setCanexpire(mapfrom.getCanexpire());
    mapto.setDatecreated(mapfrom.getDatecreated());
    mapto.setDatesupplied(mapfrom.getDatesupplied());
    mapto.setEnteredbyId(mapfrom.getEnteredbyId());
    mapto.setExpirationdate(mapfrom.getExpirationdate());
    mapto.setId(mapfrom.getId());
    mapto.setItemid(mapfrom.getItemid());
    mapto.setQtyremaining(mapfrom.getQtyremaining());
    mapto.setQtysupplied(mapfrom.getQtysupplied());
    mapto.setStockintypeId(mapfrom.getStockintypeId());
    mapto.setSupplyreferenceno(mapfrom.getSupplyreferenceno());
    mapto.setSupplytypeid(maptoLstsupplytype(mapfrom.getSupplytypeid()));
    mapto.setTranlogid(maptoTranlogs(mapfrom.getTranlogid()));
    return mapto;
}
 
public static Transtockindto maptoTranstockindto(Transtockin mapfrom){
    if (mapfrom == null){
        return null;
    }
    Transtockindto mapto = new Transtockindto();
     mapto.setActive(mapfrom.getActive());
    mapto.setBatchno(mapfrom.getBatchno());
    mapto.setCanexpire(mapfrom.getCanexpire());
    mapto.setDatecreated(mapfrom.getDatecreated());
    mapto.setDatesupplied(mapfrom.getDatesupplied());
    mapto.setEnteredbyId(mapfrom.getEnteredbyId());
    mapto.setExpirationdate(mapfrom.getExpirationdate());
    mapto.setId(mapfrom.getId());
    mapto.setItemid(mapfrom.getItemid());
    mapto.setQtyremaining(mapfrom.getQtyremaining());
    mapto.setQtysupplied(mapfrom.getQtysupplied());
    mapto.setStockintypeId(mapfrom.getStockintypeId());
    mapto.setSupplyreferenceno(mapfrom.getSupplyreferenceno());
    mapto.setSupplytypeid(maptoLstsupplytypedto(mapfrom.getSupplytypeid()));
    mapto.setTranlogid(maptoTranlogsdto(mapfrom.getTranlogid()));
    return mapto;
}
/////////////////////////////////////////////////////////////////////////////////
public static List<Tranmaindto> maptoTranmainList(List<Tranmain> mapfrom){
    if (mapfrom == null){
        return null;
    }
    List<Tranmaindto> mapto = new ArrayList<>();
    for (Tranmain item: mapfrom){
        mapto.add(maptoTranmaindto(item));
    }
    return mapto;
}
public static Tranmain maptoTranmain(Tranmaindto mapfrom){
    if (mapfrom == null){
        return null;
    }
    Tranmain mapto = new Tranmain();
    mapto.setApprovedby(mapfrom.getApprovedby());
    mapto.setCarriedby(mapfrom.getCarriedby());
    mapto.setCreateduserid(mapfrom.getCreateduserid());
    mapto.setId(mapfrom.getId());
    mapto.setRecievedbyId(mapfrom.getRecievedbyId());
    mapto.setStocktakingby(mapfrom.getStocktakingby());
    mapto.setStoreid(mapfrom.getStoreid());
    mapto.setSupplierId(mapfrom.getSupplierId());
    mapto.setSuppliername(mapfrom.getSuppliername());
    mapto.setTrandate(mapfrom.getTrandate());
    mapto.setTranreference(mapfrom.getTranreference());
    mapto.setTrantype(mapfrom.getTrantype());
    return mapto;
}
public static Tranmaindto maptoTranmaindto(Tranmain mapfrom){
    if (mapfrom == null){
        return null;
    }
    Tranmaindto mapto = new Tranmaindto();
    mapto.setApprovedby(mapfrom.getApprovedby());
    mapto.setCarriedby(mapfrom.getCarriedby());
    mapto.setCreateduserid(mapfrom.getCreateduserid());
    mapto.setId(mapfrom.getId());
    mapto.setRecievedbyId(mapfrom.getRecievedbyId());
    mapto.setStocktakingby(mapfrom.getStocktakingby());
    mapto.setStoreid(mapfrom.getStoreid());
    mapto.setSupplierId(mapfrom.getSupplierId());
    mapto.setSuppliername(mapfrom.getSuppliername());
    mapto.setTrandate(mapfrom.getTrandate());
    mapto.setTranreference(mapfrom.getTranreference());
    mapto.setTrantype(mapfrom.getTrantype());
    return mapto;
}
 ////////////////////////////////////////////////////////////////////////////////
public static List<Tranlogsdto> maptoTranlogsList(List<Tranlogs> mapfrom){
    if (mapfrom == null){
        return null;
    }
    List<Tranlogsdto> mapto = new ArrayList<>();
    for (Tranlogs item: mapfrom){
        mapto.add(maptoTranlogsdto(item));
    }
    return mapto;
}
public static Tranlogs maptoTranlogs(Tranlogsdto mapfrom){
    if (mapfrom == null){
        return null;
    }
    Tranlogs mapto = new Tranlogs();
    mapto.setActive(mapfrom.getActive());
    mapto.setDatecreated(mapfrom.getDatecreated());
    mapto.setEnteredbyid(mapfrom.getEnteredbyid());
    mapto.setInstitutionid(maptoPrmintinstitution(mapfrom.getInstitutionid()));
    mapto.setItemid(maptoRegitems(mapfrom.getItemid()));
    
    mapto.setQtyin(mapfrom.getQtyin());
    mapto.setQtyout(mapfrom.getQtyout());
    mapto.setStoreid(maptoLststores(mapfrom.getStoreid()));
    mapto.setTranlogid(mapfrom.getTranlogid());
    mapto.setTranmainid(maptoTranmain(mapfrom.getTranmainid()));
    
    return mapto;
}
public static Tranlogsdto maptoTranlogsdto(Tranlogs mapfrom){
    if (mapfrom == null){
        return null;
    }
    Tranlogsdto mapto = new Tranlogsdto();
    mapto.setActive(mapfrom.getActive());
    mapto.setDatecreated(mapfrom.getDatecreated());
    mapto.setEnteredbyid(mapfrom.getEnteredbyid());
    mapto.setInstitutionid(maptoPrmintinstitutiondto(mapfrom.getInstitutionid()));
    mapto.setItemid(maptoRegitemsdto(mapfrom.getItemid()));
    
    mapto.setQtyin(mapfrom.getQtyin());
    mapto.setQtyout(mapfrom.getQtyout());
    mapto.setStoreid(maptoLststoresdto(mapfrom.getStoreid()));
    mapto.setTranlogid(mapfrom.getTranlogid());
    mapto.setTranmainid(maptoTranmaindto(mapfrom.getTranmainid()));
    return mapto;
}
////////////////////////////////////////////////////////////////////////////////
public static List<Trandisposaldto> maptoTrandisposalList(List<Trandisposal> mapfrom){
   if (mapfrom == null){
       return null;
   }
   List<Trandisposaldto> mapto = new ArrayList<>();
   for (Trandisposal item: mapfrom){
       mapto.add(maptoTrandisposaldto(item));
   }
   return mapto;
}
public static Trandisposal maptoTrandisposal(Trandisposaldto mapfrom){
    if (mapfrom == null){
        return null;
    }
    Trandisposal mapto = new Trandisposal();
    mapto.setActive(mapfrom.getActive());
    mapto.setBatchno(mapfrom.getBatchno());
    mapto.setDatecreated(mapfrom.getDatecreated());
    mapto.setDateoftran(mapfrom.getDateoftran());
    mapto.setDisposalstatus(mapfrom.getDisposalstatus());
    mapto.setDisposaltypeId(mapfrom.getDisposaltypeId());
    mapto.setEnteredbyId(mapfrom.getEnteredbyId());
    mapto.setId(mapfrom.getId());
    mapto.setItemid(mapfrom.getItemid());
    mapto.setQtydisposed(mapfrom.getQtydisposed());
    mapto.setStatusatdisposal(mapfrom.getStatusatdisposal());
    mapto.setTranlogid(maptoTranlogs(mapfrom.getTranlogid()));
    
    return mapto;
}
public static Trandisposaldto maptoTrandisposaldto(Trandisposal mapfrom){
    if (mapfrom == null){
        return null;
    }
    Trandisposaldto mapto = new Trandisposaldto();
    mapto.setActive(mapfrom.getActive());
    mapto.setBatchno(mapfrom.getBatchno());
    mapto.setDatecreated(mapfrom.getDatecreated());
    mapto.setDateoftran(mapfrom.getDateoftran());
    mapto.setDisposalstatus(mapfrom.getDisposalstatus());
    mapto.setDisposaltypeId(mapfrom.getDisposaltypeId());
    mapto.setEnteredbyId(mapfrom.getEnteredbyId());
    mapto.setId(mapfrom.getId());
    mapto.setItemid(mapfrom.getItemid());
    mapto.setQtydisposed(mapfrom.getQtydisposed());
    mapto.setStatusatdisposal(mapfrom.getStatusatdisposal());
     mapto.setTranlogid(maptoTranlogsdto(mapfrom.getTranlogid()));
    return mapto;
}
////////////////////////////////////////////////////////////////////////////////
public static List<Trandepreciationdto> maptoTrandepreciationList(List<Trandepreciation> mapfrom){
    if (mapfrom == null){
        return null;
    }
    List<Trandepreciationdto> mapto = new ArrayList<>();
    for(Trandepreciation item: mapfrom){
        mapto.add(maptoTrandepreciationdto(item));
    }
    return mapto;
}
public static Trandepreciation maptoTrandepreciation(Trandepreciationdto mapfrom){
    if (mapfrom == null){
        return null;
    }
    Trandepreciation mapto = new Trandepreciation();
    mapto.setAmount(mapfrom.getAmount());
    mapto.setId(mapfrom.getId());
    mapto.setInstutionid(maptoPrmintinstitution(mapfrom.getInstutionid()));
    mapto.setItemid(maptoRegitems(mapfrom.getItemid()));
    mapto.setMonthid(mapfrom.getMonthid());
    mapto.setTrandate(mapfrom.getTrandate());
    mapto.setYearid(mapfrom.getYearid());
    return mapto;
}
public static Trandepreciationdto maptoTrandepreciationdto(Trandepreciation mapfrom){
    if (mapfrom == null){
        return null;
    }
    Trandepreciationdto mapto = new Trandepreciationdto();
    mapto.setAmount(mapfrom.getAmount());
    mapto.setId(mapfrom.getId());
    mapto.setInstutionid(maptoPrmintinstitutiondto(mapfrom.getInstutionid()));
    mapto.setItemid(maptoRegitemsdto(mapfrom.getItemid()));
    mapto.setMonthid(mapfrom.getMonthid());
    mapto.setTrandate(mapfrom.getTrandate());
    mapto.setYearid(mapfrom.getYearid());
    return mapto;
}
////////////////////////////////////////////////////////////////////////////////
public static List<Regitemsdto> maptoRegitemsList(List<Regitems> mapfrom){
  if (mapfrom == null){
      return null;
  }
  List<Regitemsdto> mapto = new ArrayList<>();
    for (Regitems item: mapfrom){
        mapto.add(maptoRegitemsdto(item));
    }
  return mapto;
}
public static Regitems maptoRegitems(Regitemsdto mapfrom){
    if (mapfrom == null){
        return null;
    }
    Regitems mapto = new Regitems();
    mapto.setActive(mapfrom.getActive());
    mapto.setAliasname(mapfrom.getAliasname());
    mapto.setBarcode(mapfrom.getBarcode());
    mapto.setDatecreated(mapfrom.getDatecreated());
    mapto.setEnteredbid(mapfrom.getEnteredbid());
    mapto.setInstitutionid(maptoPrmintinstitution(mapfrom.getInstitutionid()));
    mapto.setItemcode(mapfrom.getItemcode());
    mapto.setItemid(mapfrom.getItemid());
    mapto.setItemname(mapfrom.getItemname());
    mapto.setMeasurepackid(mapfrom.getMeasurepackid());
    mapto.setMeasureunitid(mapfrom.getMeasureunitid());
    mapto.setRfidnumber(mapfrom.getRfidnumber());
    mapto.setSubcategorytid(maptoLstsubcategorytree(mapfrom.getSubcategorytid()));
    mapto.setUsemeasure(mapfrom.getUsemeasure());
    return mapto;
}
public static Regitemsdto maptoRegitemsdto(Regitems mapfrom){
   if (mapfrom == null){
       return null;
   }
   Regitemsdto mapto = new Regitemsdto();
    mapto.setActive(mapfrom.getActive());
    mapto.setAliasname(mapfrom.getAliasname());
    mapto.setBarcode(mapfrom.getBarcode());
    mapto.setDatecreated(mapfrom.getDatecreated());
    mapto.setEnteredbid(mapfrom.getEnteredbid());
    mapto.setInstitutionid(maptoPrmintinstitutiondto(mapfrom.getInstitutionid()));
    mapto.setItemcode(mapfrom.getItemcode());
    mapto.setItemid(mapfrom.getItemid());
    mapto.setItemname(mapfrom.getItemname());
    mapto.setMeasurepackid(mapfrom.getMeasurepackid());
    mapto.setMeasureunitid(mapfrom.getMeasureunitid());
    mapto.setRfidnumber(mapfrom.getRfidnumber());
    mapto.setSubcategorytid(maptoLstsubcategorytreedto(mapfrom.getSubcategorytid()));
    mapto.setUsemeasure(mapfrom.getUsemeasure());
    return mapto;
}
///////////////////////////////////////////////////////////////////////////////
public static List<Supplierdto> maptoSupplierList(List<Supplier> mapfrom){
  if (mapfrom == null){
      return null;
  }
  List<Supplierdto> mapto = new ArrayList<>();
    for (Supplier item: mapfrom){
        mapto.add(maptoSupplierdto(item));
    }
  return mapto;
}
public static Supplier maptoSupplier(Supplierdto mapfrom){
    if (mapfrom == null){
        return null;
    }
    Supplier mapto = new Supplier();
    mapto.setContact(mapfrom.getContact());
    mapto.setEmail(mapfrom.getEmail());
    mapto.setSupplyid(mapfrom.getSupplyid());
    mapto.setPhone(mapfrom.getPhone());
     mapto.setName(mapfrom.getName());
    return mapto;
}
public static Supplierdto maptoSupplierdto(Supplier mapfrom){
   if (mapfrom == null){
       return null;
   }
   Supplierdto mapto = new Supplierdto();
    mapto.setContact(mapfrom.getContact());
    mapto.setEmail(mapfrom.getEmail());
    mapto.setSupplyid(mapfrom.getSupplyid());
    mapto.setPhone(mapfrom.getPhone());
    mapto.setName(mapfrom.getName());
    return mapto;
}
}
