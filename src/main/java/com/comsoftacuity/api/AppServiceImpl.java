/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comsoftacuity.api;

import com.comsoftacuity.crud.AppServiceManager;
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
import com.comsoftacuity.dto.ServiceResult;
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
import com.comsoftacuity.util.EntitymapperUtil;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.core.Response;

/**
 *
 * @author Yusuff Saliu Adediran
 */
@Stateless
public class AppServiceImpl implements AppService {
    @EJB
    AppServiceManager service;
    @Override
    public Response getUseruserinfoList(Integer offset, Integer limit) {
      return Response.ok(EntitymapperUtil.maptoUserusersinfoList(service.getUserusersinfoList(offset, limit))).build();
    }

    @Override
    public Response addUserinfo(Userusersinfodto results) {
        return Response.ok(EntitymapperUtil.maptoUserusersinfodto(service.createUserusersinfo(EntitymapperUtil.maptoUserusersinfo(results)))).build();
    }

    @Override
    public Response updateUserinfo(Userusersinfodto result) {
        return Response.ok(EntitymapperUtil.maptoUserusersinfodto(service.updateUserusersinfo(EntitymapperUtil.maptoUserusersinfo(result)))).build();
    }

    @Override
    public Response getUserinfo(Integer id) {
        return Response.ok(EntitymapperUtil.maptoUserusersinfodto(service.getUserinfo(id))).build();
    }

    @Override
    public Response deleteUserinfo(Integer id) {
        service.deleteUserinfo(id);
        return Response.ok().build();
    }

    @Override
    public Response getUsergrouppermissionList(Integer offset, Integer limit) {
        return Response.ok(EntitymapperUtil.maptoUserusergrouppermissionList(service.getUserusergrouppermissionList(offset, limit))).build();
    }

    @Override
    public Response addUsergrouppermission(Userusergrouppermissiondto result) {
        return Response.ok(EntitymapperUtil.maptoUserusergrouppermissiondto(service.createUserusergrouppermission(EntitymapperUtil.maptoUserusergrouppermission(result)))).build();
    }

    @Override
    public Response updateUsergrouppermission(Userusergrouppermissiondto result) {
        return Response.ok(EntitymapperUtil.maptoUserusergrouppermissiondto(service.updateUserusergrouppermission(EntitymapperUtil.maptoUserusergrouppermission(result)))).build();
    }

    @Override
    public Response getUsergrouppermission(Integer id) {
        return Response.ok(EntitymapperUtil.maptoUserusergrouppermissiondto(service.getUserusergrouppermission(id))).build();
    }

    @Override
    public Response deleteUsergrouppermission(Integer id) {
        service.deleteUsergrouppermission(id);
        return Response.ok().build();
    }

    @Override
    public Response getUsergroupList(Integer offset, Integer limit) {
        return Response.ok(EntitymapperUtil.maptoUserusergroupList(service.getUserusergroupList(offset, limit))).build();
    }

    @Override
    public Response addUsergroup(Userusergroupdto result) {
        return Response.ok(EntitymapperUtil.maptoUserusergroupdto(service.createUserusergroup(EntitymapperUtil.maptoUserusergroup(result)))).build();
    }

    @Override
    public Response updateUsergroup(Userusergroupdto result) {
        return Response.ok(EntitymapperUtil.maptoUserusergroupdto(service.updateUserusergroup(EntitymapperUtil.maptoUserusergroup(result)))).build();
    }

    @Override
    public Response getUsergroup(Integer id) {
        return Response.ok(EntitymapperUtil.maptoUserusergroupdto(service.getUserusergroup(id))).build();
    }

    @Override
    public Response deleteUsergroup(Integer id) {
        service.deleteUserusergroup(id);
        return Response.ok().build();
    }

    @Override
    public Response getUserpermissionList(Integer offset, Integer limit) {
        return Response.ok(EntitymapperUtil.maptoUserpermissionList(service.getUserpermissionList(offset, limit))).build();
    }

    @Override
    public Response addUserpermission(Userpermissiondto result) {
        return Response.ok(EntitymapperUtil.maptoUserpermissiondto(service.createUserpermission(EntitymapperUtil.maptoUserpermission(result)))).build();
    }

    @Override
    public Response updateUserpermission(Userpermissiondto result) {
        return Response.ok(EntitymapperUtil.maptoUserpermissiondto(service.updateUserpermission(EntitymapperUtil.maptoUserpermission(result)))).build();
    }

    @Override
    public Response getUserpermission(Integer id) {
        return Response.ok(EntitymapperUtil.maptoUserpermissiondto(service.getUserpermission(id))).build();
    }

    @Override
    public Response deleteUserpermission(Integer id) {
        service.deleteUserpermission(id);
        return Response.ok().build();
    }

    @Override
    public Response getUserassignedusergroupList(Integer offset, Integer limit) {
        return Response.ok(EntitymapperUtil.maptoUserassignedusergroupList(service.getUserassignedusergroupList(offset, limit))).build();
    }

    @Override
    public Response addUserassignedusergroup(Userassignedusergroupdto result) {
        return Response.ok(EntitymapperUtil.maptoUserassignedusergroupdto(service.createUserpermission(EntitymapperUtil.maptoUserassignedusergroup(result)))).build();
    }

    @Override
    public Response updateUserassignedusergroup(Userassignedusergroupdto result) {
        return Response.ok(EntitymapperUtil.maptoUserassignedusergroupdto(service.updateUserassignedusergroup(EntitymapperUtil.maptoUserassignedusergroup(result)))).build();
    }

    @Override
    public Response getUserassignedusergroup(Integer id) {
        return Response.ok(EntitymapperUtil.maptoUserassignedusergroupdto(service.getUserassignedusergroup(id))).build();
    }

    @Override
    public Response deleteUserassignedusergroup(Integer id) {
        service.deleteUserassignedusergroup(id);
        return Response.ok().build();
    }

    @Override
    public Response getTrantransfersList(Integer offset, Integer limit) {
        return Response.ok(EntitymapperUtil.maptoTrantransfersList(service.getTrantransfersList(offset, limit))).build();
    }

    @Override
    public Response addTrantransfers(Trantransfersdto result) {
        return Response.ok(EntitymapperUtil.maptoTrantransfersdto(service.createTrantransfers(EntitymapperUtil.maptoTrantransfers(result)))).build();
    }

    @Override
    public Response updateTrantransfers(Trantransfersdto result) {
        return Response.ok(EntitymapperUtil.maptoTrantransfersdto(service.updateTrantransfers(EntitymapperUtil.maptoTrantransfers(result)))).build();
    }

    @Override
    public Response getTrantransfers(Integer id) {
        return Response.ok(EntitymapperUtil.maptoTrantransfersdto(service.getTrantransfers(id))).build();
    }

    @Override
    public Response deleteTrantransfers(Integer id) {
        service.deleteTrantransfers(id);
        return Response.ok().build();
    }

    @Override
    public Response getTranstocktakingList(Integer offset, Integer limit) {
        return Response.ok(EntitymapperUtil.maptoTranstocktakingList(service.getTranstocktakingList(offset, limit))).build();
    }

    @Override
    public Response addTranstocktaking(Transtocktakingdto result) {
        return Response.ok(EntitymapperUtil.maptoTranstocktakingdto(service.createTranstocktaking(EntitymapperUtil.maptoTranstocktaking(result)))).build();
    }

    @Override
    public Response updateTranstocktaking(Transtocktakingdto result) {
        return Response.ok(EntitymapperUtil.maptoTranstocktakingdto(service.updateTranstocktaking(EntitymapperUtil.maptoTranstocktaking(result)))).build();
    }

    @Override
    public Response getTranstocktaking(Integer id) {
        return Response.ok(EntitymapperUtil.maptoTranstocktakingdto(service.getTranstocktaking(id))).build();
    }

    @Override
    public Response deleteTranstocktaking(Integer id) {
        service.deleteTranstocktaking(id);
        return Response.ok().build();
    }

    @Override
    public Response getTranstockoutList(Integer offset, Integer limit) {
        return Response.ok(EntitymapperUtil.maptoTranstockoutList(service.getTranstockoutList(offset, limit))).build();
    }

    @Override
    public Response addTranstockout(Transtockoutdto result) {
        return Response.ok(EntitymapperUtil.maptoTranstockoutdto(service.createTranstockout(EntitymapperUtil.maptoTranstockout(result)))).build();
    }

    @Override
    public Response updateTranstockout(Transtockoutdto result) {
        return Response.ok(EntitymapperUtil.maptoTranstockoutdto(service.updateTranstockout(EntitymapperUtil.maptoTranstockout(result)))).build();
    }

    @Override
    public Response getTranstockout(Integer id) {
        return Response.ok(EntitymapperUtil.maptoTranstockoutdto(service.getTranstockout(id))).build();
    }

    @Override
    public Response deleteTranstockout(Integer id) {
        service.deleteTranstockout(id);
        return Response.ok().build();
    }

    @Override
    public Response getTranstocklevelList(Integer offset, Integer limit) {
        return Response.ok(EntitymapperUtil.maptoTranstocklevelList(service.getTranstocklevelList(offset, limit))).build();
    }

    @Override
    public Response addTranstocklevel(Transtockleveldto result) {
        return Response.ok(EntitymapperUtil.maptoTranstockleveldto(service.createTranstocklevel(EntitymapperUtil.maptoTranstocklevel(result)))).build();
    }

    @Override
    public Response updateTranstocklevel(Transtockleveldto result) {
        return Response.ok(EntitymapperUtil.maptoTranstockleveldto(EntitymapperUtil.maptoTranstocklevel(result))).build();
    }

    @Override
    public Response getTranstocklevel(Integer id) {
        return Response.ok(EntitymapperUtil.maptoTranstockleveldto(service.getTranstocklevel(id))).build();
    }

    @Override
    public Response deleteTranstocklevel(Integer id) {
        service.deleteTranstocklevel(id);
        return Response.ok().build();
    }

    @Override
    public Response getTranstockinList(Integer offset, Integer limit) {
        return Response.ok(EntitymapperUtil.maptoTranstockinList(service.getTranstockinList(offset, limit))).build();
    }

    @Override
    public Response addTranstockin(Transtockindto result) {
        return Response.ok(EntitymapperUtil.maptoTranstockindto(service.createTranstockin(EntitymapperUtil.maptoTranstockin(result)))).build();
    }

    @Override
    public Response updateTranstockin(Transtockindto result) {
        return Response.ok(EntitymapperUtil.maptoTranstockindto(service.updateTranstockin(EntitymapperUtil.maptoTranstockin(result)))).build();
    }

    @Override
    public Response getTranstockin(Integer id) {
        return Response.ok(EntitymapperUtil.maptoTranstockindto(service.getTranstockin(id))).build();
    }

    @Override
    public Response deleteTranstockin(Integer id) {
        service.deleteTranstockin(id);
        return Response.ok().build();
    }

    @Override
    public Response getTranlogsList(Integer offset, Integer limit) {
        return Response.ok(EntitymapperUtil.maptoTranlogsList(service.getTranlogsList(offset, limit))).build();
    }

    @Override
    public Response addTranlogs(Tranlogsdto result) {
        return Response.ok(EntitymapperUtil.maptoTranlogsdto(service.createTralogs(EntitymapperUtil.maptoTranlogs(result)))).build();
    }

    @Override
    public Response updateTranlogs(Tranlogsdto result) {
        return Response.ok(EntitymapperUtil.maptoTranlogsdto(service.updateTranlogs(EntitymapperUtil.maptoTranlogs(result)))).build();
    }

    @Override
    public Response getTranlogs(Integer id) {
        return Response.ok(EntitymapperUtil.maptoTranlogsdto(service.getTranlogs(id))).build();
    }

    @Override
    public Response deleteTranlogs(Integer id) {
        service.deleteTranlogs(id);
        return Response.ok().build();
    }

    @Override
    public Response getTrandisposalList(Integer offset, Integer limit) {
        return Response.ok(EntitymapperUtil.maptoTrandisposalList(service.getTrandisposalList(offset, limit))).build();
    }

    @Override
    public Response addTrandisposal(Trandisposaldto result) {
        return Response.ok(EntitymapperUtil.maptoTrandisposaldto(service.createTrandisposal(EntitymapperUtil.maptoTrandisposal(result)))).build();
    }

    @Override
    public Response updateTrandisposal(Trandisposaldto result) {
        return Response.ok(EntitymapperUtil.maptoTrandisposaldto(service.updateTrandisposal(EntitymapperUtil.maptoTrandisposal(result)))).build();
    }

    @Override
    public Response getTrandisposal(Integer id) {
        return Response.ok(EntitymapperUtil.maptoTrandisposaldto(service.getTrandisposal(id))).build();
    }

    @Override
    public Response deleteTrandisposal(Integer id) {
        service.deleteTrandisposal(id);
        return Response.ok().build();
    }

    @Override
    public Response getTrandepreciationList(Integer offset, Integer limit) {
        return Response.ok(EntitymapperUtil.maptoTrandepreciationList(service.getTrandepreciationList(offset, limit))).build();
    }

    @Override
    public Response addTrandepreciation(Trandepreciationdto result) {
        return Response.ok(EntitymapperUtil.maptoTrandepreciationdto(service.createTrandepreciation(EntitymapperUtil.maptoTrandepreciation(result)))).build();
    }

    @Override
    public Response updateTrandepreciation(Trandepreciationdto result) {
        return Response.ok(EntitymapperUtil.maptoTrandepreciationdto(service.updateTrandepreciation(EntitymapperUtil.maptoTrandepreciation(result)))).build();
    }

    @Override
    public Response getTrandepreciation(Integer id) {
        return Response.ok(EntitymapperUtil.maptoTrandepreciationdto(service.getTrandepreciation(id))).build();
    }

    @Override
    public Response deleteTrandepreciation(Integer id) {
        service.deleteTrandepreciation(id);
        return Response.ok().build();
    }

    @Override
    public Response getRegitemsList(Integer offset, Integer limit) {
        return Response.ok(EntitymapperUtil.maptoRegitemsList(service.getRegitemsList(offset, limit))).build();
    }

    @Override
    public Response addRegitems(Regitemsdto result) {
        return Response.ok(EntitymapperUtil.maptoRegitemsdto(service.createRegitems(EntitymapperUtil.maptoRegitems(result)))).build();
    }

    @Override
    public Response updateRegitems(Regitemsdto result) {
        return Response.ok(EntitymapperUtil.maptoRegitemsdto(service.updateRegitems(EntitymapperUtil.maptoRegitems(result)))).build();

    }

    @Override
    public Response getRegitems(Integer id) {
        return Response.ok(EntitymapperUtil.maptoRegitemsdto(service.getRegitems(id))).build();
    }

    @Override
    public Response deleteRegitems(Integer id) {
        service.deleteRegitems(id);
        return Response.ok().build();
    }

    @Override
    public Response getTranmainList(Integer offset, Integer limit) {
        return Response.ok(EntitymapperUtil.maptoTranmainList(service.getTranmainList(offset, limit))).build();
    }

    @Override
    public Response addTranmain(Tranmaindto result) {
        return Response.ok(EntitymapperUtil.maptoTranmaindto(service.createTranmain(EntitymapperUtil.maptoTranmain(result)))).build();
    }

    @Override
    public Response updateTranmain(Tranmaindto result) {
        return Response.ok(EntitymapperUtil.maptoTranmaindto(service.updateTranmain(EntitymapperUtil.maptoTranmain(result)))).build();

    }

    @Override
    public Response getTranmain(Integer id) {
        return Response.ok(EntitymapperUtil.maptoTranmaindto(service.getTranmain(id))).build();
    }

    @Override
    public Response deleteTranmain(Integer id) {
        service.deleteTranmain(id);
        return Response.ok().build();
    }
    ////////////////////////////////////////////////////////////////////////////
    @Override
    public Response getAppappruless(int offset, int limit) {
        try {
            return Response.ok(EntitymapperUtil.maptoAppapprulesList(service.getAppappruless(offset, limit))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response addAppapprules(Appapprulesdto appapprules) {
        try {
            return Response.ok(EntitymapperUtil.maptoAppapprulesdto(service.createAppapprules(EntitymapperUtil.maptoAppapprules(appapprules)))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response updateAppapprules(Appapprulesdto appapprules) {
        try {
            return Response.ok(EntitymapperUtil.maptoAppapprulesdto(service.updateAppapprules(EntitymapperUtil.maptoAppapprules(appapprules)))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response getAppapprules(Integer id) {
        try {
            return Response.ok(EntitymapperUtil.maptoAppapprulesdto(service.getAppapprules(id))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response deleteAppapprules(Integer id) {
        try {
            ServiceResult result = new ServiceResult();
            service.deleteAppapprules(id);
            return Response.ok(result).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response getApplogalertss(int offset, int limit) {
        try {
            return Response.ok(EntitymapperUtil.maptoApplogalertsList(service.getApplogalertss(offset, limit))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response addApplogalerts(Applogalertsdto applogalerts) {
        try {
            return Response.ok(EntitymapperUtil.maptoApplogalertsdto(service.createApplogalerts(EntitymapperUtil.maptoApplogalerts(applogalerts)))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response updateApplogalerts(Applogalertsdto applogalerts) {
        try {
            return Response.ok(EntitymapperUtil.maptoApplogalertsdto(service.updateApplogalerts(EntitymapperUtil.maptoApplogalerts(applogalerts)))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response getApplogalerts(Integer id) {
        try {
            return Response.ok(EntitymapperUtil.maptoApplogalertsdto(service.getApplogalerts(id))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response deleteApplogalerts(Integer id) {
        try {
            service.deleteApplogalerts(id);
            ServiceResult result = new ServiceResult();
            return Response.ok(result).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response getAppmoduless(int offset, int limit) {
        try {
            return Response.ok(EntitymapperUtil.maptoAppmodulesList(service.getAppmoduless(offset, limit))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response addAppmodules(Appmodulesdto appmodules) {
        try {
            return Response.ok(EntitymapperUtil.maptoAppmodulesdto(service.createAppmodules(EntitymapperUtil.maptoAppmodules(appmodules)))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response updateAppmodules(Appmodulesdto appmodules) {
        try {
            return Response.ok(EntitymapperUtil.maptoAppmodulesdto(service.updateAppmodules(EntitymapperUtil.maptoAppmodules(appmodules)))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response getAppmodules(Integer id) {
        try {
            return Response.ok(EntitymapperUtil.maptoAppmodulesdto(service.getAppmodules(id))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response deleteAppmodules(Integer id) {
        try {
            service.deleteAppmodules(id);
            ServiceResult result = new ServiceResult();
            return Response.ok(result).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response getLstcategoryleveltypes(int offset, int limit) {
        try {

            return Response.ok(EntitymapperUtil.maptoLstcategoryleveltypeList(service.getLstcategoryleveltypes(offset, limit))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response addLstcategoryleveltype(Lstcategoryleveltypedto lstcategoryleveltype) {
        try {

            return Response.ok(EntitymapperUtil.maptoLstcategoryleveltypedto(service.createLstcategoryleveltype(EntitymapperUtil.maptoLstcategoryleveltype(lstcategoryleveltype)))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response updateLstcategoryleveltype(Lstcategoryleveltypedto lstcategoryleveltype) {
        try {

            return Response.ok(EntitymapperUtil.maptoLstcategoryleveltypedto(service.updateLstcategoryleveltype(EntitymapperUtil.maptoLstcategoryleveltype(lstcategoryleveltype)))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response getLstcategoryleveltype(Integer id) {
        try {

            return Response.ok(EntitymapperUtil.maptoLstcategoryleveltypedto(service.getLstcategoryleveltype(id))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response deleteLstcategoryleveltype(Integer id) {
        try {
            ServiceResult result = new ServiceResult();
            service.deleteLstcategoryleveltype(id);
            return Response.ok(result).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response getLstinventorytypes(int offset, int limit) {
        try {

            return Response.ok(EntitymapperUtil.maptoLstinventorytypeList(service.getLstinventorytypes(offset, limit))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response addLstinventorytype(Lstinventorytypedto lstinventorytype) {
        try {

            return Response.ok(EntitymapperUtil.maptoLstinventorytypedto(service.createLstinventorytype(EntitymapperUtil.maptoLstinventorytype(lstinventorytype)))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response updateLstinventorytype(Lstinventorytypedto lstinventorytype) {
        try {

            return Response.ok(EntitymapperUtil.maptoLstinventorytypedto(service.updateLstinventorytype(EntitymapperUtil.maptoLstinventorytype(lstinventorytype)))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response getLstinventorytype(Integer id) {
        try {

            return Response.ok(EntitymapperUtil.maptoLstinventorytypedto(service.getLstinventorytype(id))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response deleteLstinventorytype(Integer id) {
        try {
            ServiceResult result = new ServiceResult();
            service.deleteLstinventorytype(id);
            return Response.ok(result).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response getLstmains(int offset, int limit) {
        try {

            return Response.ok(EntitymapperUtil.maptoLstmainList(service.getLstmains(offset, limit))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response addLstmain(Lstmaindto lstmain) {
        try {

            return Response.ok(EntitymapperUtil.maptoLstmaindto(service.createLstmain(EntitymapperUtil.maptoLstmain(lstmain)))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response updateLstmain(Lstmaindto lstmain) {
        try {

            return Response.ok(EntitymapperUtil.maptoLstmaindto(service.updateLstmain(EntitymapperUtil.maptoLstmain(lstmain)))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response getLstmain(Integer id) {
        try {

            return Response.ok(EntitymapperUtil.maptoLstmaindto(service.getLstmain(id))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response deleteLstmain(Integer id) {
        try {
            ServiceResult result = new ServiceResult();
            service.deleteLstmain(id);
            return Response.ok(result).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response getLstmeasurepacks(int offset, int limit) {
        try {

            return Response.ok(EntitymapperUtil.maptoLstmeasurepackList(service.getLstmeasurepacks(offset, limit))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response addLstmeasurepack(Lstmeasurepackdto lstmeasurepack) {
        try {

            return Response.ok(EntitymapperUtil.maptoLstmeasurepackdto(service.createLstmeasurepack(EntitymapperUtil.maptoLstmeasurepack(lstmeasurepack)))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response updateLstmeasurepack(Lstmeasurepackdto lstmeasurepack) {
        try {

            return Response.ok(EntitymapperUtil.maptoLstmeasurepackdto(service.updateLstmeasurepack(EntitymapperUtil.maptoLstmeasurepack(lstmeasurepack)))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response getLstmeasurepack(Integer id) {
        try {

            return Response.ok(EntitymapperUtil.maptoLstmeasurepackdto(service.getLstmeasurepack(id))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response deleteLstmeasurepack(Integer id) {
        try {
            ServiceResult result = new ServiceResult();
            service.deleteLstmeasurepack(id);
            return Response.ok(result).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response getLstmeasureunits(int offset, int limit) {
        try {

            return Response.ok(EntitymapperUtil.maptoLstmeasureunitList(service.getLstmeasureunits(offset, limit))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response addLstmeasureunit(Lstmeasureunitdto lstmeasurepack) {
        try {

            return Response.ok(EntitymapperUtil.maptoLstmeasureunitdto(service.createLstmeasureunit(EntitymapperUtil.maptoLstmeasureunit(lstmeasurepack)))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response updateLstmeasureunit(Lstmeasureunitdto lstmeasurepack) {
        try {

            return Response.ok(EntitymapperUtil.maptoLstmeasureunitdto(service.updateLstmeasureunit(EntitymapperUtil.maptoLstmeasureunit(lstmeasurepack)))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response getLstmeasureunit(Integer id) {
        try {

            return Response.ok(EntitymapperUtil.maptoLstmeasureunitdto(service.getLstmeasureunit(id))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response deleteLstmeasureunit(Integer id) {
        try {
            ServiceResult result = new ServiceResult();
            return Response.ok(result).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response getLststockleveltypes(int offset, int limit) {
        try {

            return Response.ok(EntitymapperUtil.maptoLststockleveltypeList(service.getLststockleveltypes(offset, limit))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response addLststockleveltype(Lststockleveltypedto lstmeasurepack) {
        try {

            return Response.ok(EntitymapperUtil.maptoLststockleveltypedto(service.createLststockleveltype(EntitymapperUtil.maptoLststockleveltype(lstmeasurepack)))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response updateLststockleveltype(Lststockleveltypedto lstmeasurepack) {
        try {

            return Response.ok(EntitymapperUtil.maptoLststockleveltypedto(service.updateLststockleveltype(EntitymapperUtil.maptoLststockleveltype(lstmeasurepack)))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response getLststockleveltype(Integer id) {
        try {

            return Response.ok(EntitymapperUtil.maptoLststockleveltypedto(service.getLststockleveltype(id))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response deleteLststockleveltype(Integer id) {
        try {
            ServiceResult result = new ServiceResult();
            service.deleteLststockleveltype(id);
            return Response.ok(result).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response getLststockoutreceipttypes(int offset, int limit) {
        try {

            return Response.ok(EntitymapperUtil.maptoLststockoutreceipttypeList(service.getLststockoutreceipttypes(offset, limit))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response addLststockoutreceipttype(Lststockoutreceipttypedto lstmeasurepack) {
        try {

            return Response.ok(EntitymapperUtil.maptoLststockoutreceipttypedto(service.createLststockoutreceipttype(EntitymapperUtil.maptoLststockoutreceipttype(lstmeasurepack)))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response updateLststockoutreceipttype(Lststockoutreceipttypedto lstmeasurepack) {
        try {

            return Response.ok(EntitymapperUtil.maptoLststockoutreceipttypedto(service.updateLststockoutreceipttype(EntitymapperUtil.maptoLststockoutreceipttype(lstmeasurepack)))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response getLststockoutreceipttype(Integer id) {
        try {

            return Response.ok(EntitymapperUtil.maptoLststockoutreceipttypedto(service.getLststockoutreceipttype(id))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response deleteLststockoutreceipttype(Integer id) {
        try {
            ServiceResult result = new ServiceResult();
            service.deleteLststockoutreceipttype(id);
            return Response.ok(result).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response getLststockouttypes(int offset, int limit) {
        try {

            return Response.ok(EntitymapperUtil.maptoLststockouttypeList(service.getLststockouttypes(offset, limit))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response addLststockouttype(Lststockouttypedto lstmeasurepack) {
        try {

            return Response.ok(EntitymapperUtil.maptoLststockouttypedto(service.createLststockouttype(EntitymapperUtil.maptoLststockouttype(lstmeasurepack)))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response updateLststockouttype(Lststockouttypedto lstmeasurepack) {
        try {

            return Response.ok(EntitymapperUtil.maptoLststockouttypedto(service.updateLststockouttype(EntitymapperUtil.maptoLststockouttype(lstmeasurepack)))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response getLststockouttype(Integer id) {
        try {

            return Response.ok(EntitymapperUtil.maptoLststockouttypedto(service.getLststockouttype(id))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response deleteLststockouttype(Integer id) {
        try {
            ServiceResult result = new ServiceResult();
            service.deleteLststockouttype(id);
            return Response.ok(result).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response getLststoress(int offset, int limit) {
        try {

            return Response.ok(EntitymapperUtil.maptoLststoresList(service.getLststoress(offset, limit))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response addLststores(Lststoresdto lstmeasurepack) {
        try {

            return Response.ok(EntitymapperUtil.maptoLststoresdto(service.createLststores(EntitymapperUtil.maptoLststores(lstmeasurepack)))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response updateLststores(Lststoresdto lstmeasurepack) {
        try {

            return Response.ok(EntitymapperUtil.maptoLststoresdto(service.updateLststores(EntitymapperUtil.maptoLststores(lstmeasurepack)))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response getLststores(Integer id) {
        try {

            return Response.ok(EntitymapperUtil.maptoLststoresdto(service.getLststores(id))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response deleteLststores(Integer id) {
        try {
            ServiceResult result = new ServiceResult();
            service.deleteLststores(id);
            return Response.ok(result).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response getLstsubcategorytrees(int offset, int limit) {
        try {

            return Response.ok(EntitymapperUtil.maptoLstsubcategorytreeList(service.getLstsubcategorytrees(offset, limit))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response addLstsubcategorytree(Lstsubcategorytreedto lstmeasurepack) {
        try {

            return Response.ok(EntitymapperUtil.maptoLstsubcategorytreedto(service.createLstsubcategorytree(EntitymapperUtil.maptoLstsubcategorytree(lstmeasurepack)))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response updateLstsubcategorytree(Lstsubcategorytreedto lstmeasurepack) {
        try {

            return Response.ok(EntitymapperUtil.maptoLstsubcategorytreedto(service.updateLstsubcategorytree(EntitymapperUtil.maptoLstsubcategorytree(lstmeasurepack)))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response getLstsubcategorytree(Integer id) {
        try {

            return Response.ok(EntitymapperUtil.maptoLstsubcategorytreedto(service.getLstsubcategorytree(id))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response deleteLstsubcategorytree(Integer id) {
        try {
            ServiceResult result = new ServiceResult();
            service.deleteLstsubcategorytree(id);
            return Response.ok(result).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response getLstsupplytypes(int offset, int limit) {
        try {

            return Response.ok(EntitymapperUtil.maptoLstsupplytypeList(service.getLstsupplytypes(offset, limit))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response addLstsupplytype(Lstsupplytypedto lstmeasurepack) {
        try {

            return Response.ok(EntitymapperUtil.maptoLstsupplytypedto(service.createLstsupplytype(EntitymapperUtil.maptoLstsupplytype(lstmeasurepack)))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response updateLstsupplytype(Lstsupplytypedto lstmeasurepack) {
        try {

            return Response.ok(EntitymapperUtil.maptoLstsupplytypedto(service.updateLstsupplytype(EntitymapperUtil.maptoLstsupplytype(lstmeasurepack)))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response getLstsupplytype(Integer id) {
        try {

            return Response.ok(EntitymapperUtil.maptoLstsupplytypedto(service.getLstsupplytype(id))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response deleteLstsupplytype(Integer id) {
        try {
            ServiceResult result = new ServiceResult();
            service.deleteLstsupplytype(id);
            return Response.ok(result).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response getPrmintinstitutions(int offset, int limit) {
        try {

            return Response.ok(EntitymapperUtil.maptoPrmintinstitutionList(service.getPrmintinstitutions(offset, limit))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response addPrmintinstitution(Prmintinstitutiondto lstmeasurepack) {
        try {

            return Response.ok(EntitymapperUtil.maptoPrmintinstitutiondto(service.createPrmintinstitution(EntitymapperUtil.maptoPrmintinstitution(lstmeasurepack)))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response updatePrmintinstitution(Prmintinstitutiondto lstmeasurepack) {
        try {

            return Response.ok(EntitymapperUtil.maptoPrmintinstitutiondto(service.updatePrmintinstitution(EntitymapperUtil.maptoPrmintinstitution(lstmeasurepack)))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response getPrmintinstitution(Integer id) {
        try {

            return Response.ok(EntitymapperUtil.maptoPrmintinstitutiondto(service.getPrmintinstitution(id))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response deletePrmintinstitution(Integer id) {
        try {
            ServiceResult result = new ServiceResult();
            service.deletePrmintinstitution(id);
            return Response.ok(result).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response getPrmintinstitutiontypes(int offset, int limit) {
        try {

            return Response.ok(EntitymapperUtil.maptoPrmintinstitutiontypeList(service.getPrmintinstitutiontypes(offset, limit))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response addPrmintinstitutiontype(Prmintinstitutiontypedto lstmeasurepack) {
        try {

            return Response.ok(EntitymapperUtil.maptoPrmintinstitutiontypedto(service.createPrmintinstitutiontype(EntitymapperUtil.maptoPrmintinstitutiontype(lstmeasurepack)))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response updatePrmintinstitutiontype(Prmintinstitutiontypedto lstmeasurepack) {
        try {

            return Response.ok(EntitymapperUtil.maptoPrmintinstitutiontypedto(service.updatePrmintinstitutiontype(EntitymapperUtil.maptoPrmintinstitutiontype(lstmeasurepack)))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response getPrmintinstitutiontype(Integer id) {
        try {

            return Response.ok(EntitymapperUtil.maptoPrmintinstitutiontypedto(service.getPrmintinstitutiontype(id))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response deletePrmintinstitutiontype(Integer id) {
        try {
            ServiceResult result = new ServiceResult();
            service.deletePrmintinstitutiontype(id);
            return Response.ok(result).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response getPrmintsuborganisations(int offset, int limit) {
        try {

            return Response.ok(EntitymapperUtil.maptoPrmintsuborganisationList(service.getPrmintsuborganisations(offset, limit))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response addPrmintsuborganisation(Prmintsuborganisationdto lstmeasurepack) {
        try {

            return Response.ok(EntitymapperUtil.maptoPrmintsuborganisationdto(service.createPrmintsuborganisation(EntitymapperUtil.maptoPrmintsuborganisation(lstmeasurepack)))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response updatePrmintsuborganisation(Prmintsuborganisationdto lstmeasurepack) {
        try {

            return Response.ok(EntitymapperUtil.maptoPrmintsuborganisationdto(service.updatePrmintsuborganisation(EntitymapperUtil.maptoPrmintsuborganisation(lstmeasurepack)))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response getPrmintsuborganisation(Integer id) {
        try {

            return Response.ok(EntitymapperUtil.maptoPrmintsuborganisationdto(service.getPrmintsuborganisation(id))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response deletePrmintsuborganisation(Integer id) {
        try {
            ServiceResult result = new ServiceResult();
            service.deletePrmintsuborganisation(id);
            return Response.ok(result).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response getPrmintsuborganisationtypes(int offset, int limit) {
        try {

            return Response.ok(EntitymapperUtil.maptoPrmintsuborganisationtypeList(service.getPrmintsuborganisationtypes(offset, limit))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response addPrmintsuborganisationtype(Prmintsuborganisationtypedto lstmeasurepack) {
        try {

            return Response.ok(EntitymapperUtil.maptoPrmintsuborganisationtypedto(service.createPrmintsuborganisationtype(EntitymapperUtil.maptoPrmintsuborganisationtype(lstmeasurepack)))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response updatePrmintsuborganisationtype(Prmintsuborganisationtypedto lstmeasurepack) {
        try {

            return Response.ok(EntitymapperUtil.maptoPrmintsuborganisationtypedto(service.updatePrmintsuborganisationtype(EntitymapperUtil.maptoPrmintsuborganisationtype(lstmeasurepack)))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response getPrmintsuborganisationtype(Integer id) {
        try {

            return Response.ok(EntitymapperUtil.maptoPrmintsuborganisationtypedto(service.getPrmintsuborganisationtype(id))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response deletePrmintsuborganisationtype(Integer id) {
        try {
            ServiceResult result = new ServiceResult();
            service.deletePrmintsuborganisationtype(id);
            return Response.ok(result).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response getRegdepreciationbycategorys(int offset, int limit) {
        try {

            return Response.ok(EntitymapperUtil.maptoRegdepreciationbycategoryList(service.getRegdepreciationbycategorys(offset, limit))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response addRegdepreciationbycategory(Regdepreciationbycategorydto lstmeasurepack) {
        try {

            return Response.ok(EntitymapperUtil.maptoRegdepreciationbycategorydto(service.createRegdepreciationbycategory(EntitymapperUtil.maptoRegdepreciationbycategory(lstmeasurepack)))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response updateRegdepreciationbycategory(Regdepreciationbycategorydto lstmeasurepack) {
        try {

            return Response.ok(EntitymapperUtil.maptoRegdepreciationbycategorydto(service.updateRegdepreciationbycategory(EntitymapperUtil.maptoRegdepreciationbycategory(lstmeasurepack)))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response getRegdepreciationbycategory(Integer id) {
        try {

            return Response.ok(EntitymapperUtil.maptoRegdepreciationbycategorydto(service.getRegdepreciationbycategory(id))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response deleteRegdepreciationbycategory(Integer id) {
        try {
            ServiceResult result = new ServiceResult();
            service.deleteRegdepreciationbycategory(id);
            return Response.ok(result).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response getSupplierList(Integer offset, Integer limit) {
        try {
            return Response.ok(EntitymapperUtil.maptoSupplierList(service.getSuppliers(offset, limit))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response addSupplier(Supplierdto results) {
        try {
            return Response.ok(EntitymapperUtil.maptoSupplierdto(service.createSupplier(EntitymapperUtil.maptoSupplier(results)))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response updateSupplier(Supplierdto result) {
        try {
            return Response.ok(EntitymapperUtil.maptoSupplierdto(service.updateSupplier(EntitymapperUtil.maptoSupplier(result)))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response getSupplier(Integer id) {
         try {
             return Response.ok(EntitymapperUtil.maptoSupplierdto(service.getSupplier(id))).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response deleteSupplier(Integer id) {
        try {
            ServiceResult result = new ServiceResult();
            service.deleteSupplier(id);
            return Response.ok(result).build();
        } catch (RuntimeException ex) {
            return Response.serverError().build();
        }
    }

  
    
}
