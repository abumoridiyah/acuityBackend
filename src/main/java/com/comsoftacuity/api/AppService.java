/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comsoftacuity.api;

import static com.comsoftacuity.commons.ApiPaths.ID;
import static com.comsoftacuity.commons.ApiPaths.LIMIT;
import static com.comsoftacuity.commons.ApiPaths.OFFSET;
import static com.comsoftacuity.commons.ApiPaths.PARAMTYPE;
import static com.comsoftacuity.commons.ApiPaths.PATH_ID;
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
import javax.ejb.Local;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Yusuff Saliu Adediran
 */
@Local
@Path("/inventory")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface AppService {
  @GET
  @Path("/list/userusersinfo")
  Response getUseruserinfoList(@DefaultValue("0")@QueryParam(OFFSET)Integer offset, @DefaultValue("20")@QueryParam(LIMIT)Integer limit);
  
  @POST
  @Path("/add/userusesrinfo")
  Response addUserinfo(Userusersinfodto results);

  @PUT
  @Path("/update/userusesrinfo")
  Response updateUserinfo(Userusersinfodto result);

  @GET
  @Path("/userusersinfo" + PATH_ID)
  Response getUserinfo(@PathParam(ID) Integer id);

  @DELETE
  @Path("/userusersinfo" + PATH_ID)
  Response deleteUserinfo(@PathParam(ID) Integer id);
  //////////////////////////////////////////////////////////////////////////////
  @GET
  @Path("/list/userusergrouppermission")
  Response getUsergrouppermissionList(@DefaultValue("0")@QueryParam(OFFSET)Integer offset, @DefaultValue("20")@QueryParam(LIMIT)Integer limit);
  
  @POST
  @Path("/add/userusergrouppermission")
  Response addUsergrouppermission(Userusergrouppermissiondto result);
  
  @PUT
  @Path("/update/userusergrouppermission")
  Response updateUsergrouppermission(Userusergrouppermissiondto result);
  
  @GET
  @Path("/userusergrouppermission" + PATH_ID)
  Response getUsergrouppermission(@PathParam(ID) Integer id);
  
  @DELETE
  @Path("/userusergrouppermission" + PATH_ID)
  Response deleteUsergrouppermission(@PathParam(ID) Integer id);
  /////////////////////////////////////////////////////////////////////////////
  @GET
  @Path("/list/userusergroup")
  Response getUsergroupList(@DefaultValue("0")@QueryParam(OFFSET)Integer offset, @DefaultValue("20")@QueryParam(LIMIT)Integer limit);
  
  @POST
  @Path("/add/userusergroup")
  Response addUsergroup(Userusergroupdto result);
  
  @PUT
  @Path("/update/userusergroup")
  Response updateUsergroup(Userusergroupdto result);
  
  @GET
  @Path("/userusergroup"+ PATH_ID)
  Response getUsergroup(@PathParam(ID) Integer id);
  
  @DELETE
  @Path("/userusergroup"+ PATH_ID)
  Response deleteUsergroup(@PathParam(ID) Integer id);
  ////////////////////////////////////////////////////////////////////////////
  @GET
  @Path("/list/userpermission")
  Response getUserpermissionList(@DefaultValue("0")@QueryParam(OFFSET)Integer offset, @DefaultValue("20")@QueryParam(LIMIT)Integer limit);
  
  @POST
  @Path("/add/userpermission")
  Response addUserpermission(Userpermissiondto result);
  
  @PUT
  @Path("/update/userpermission")
  Response updateUserpermission(Userpermissiondto result);
  
  @GET
  @Path("/userpermission"+ PATH_ID)
  Response getUserpermission(@PathParam(ID) Integer id);
  
  @DELETE
  @Path("/userpermission"+ PATH_ID)
  Response deleteUserpermission(@PathParam(ID) Integer id);
  /////////////////////////////////////////////////////////////////////////////
  @GET
  @Path("/list/userassignedusergroup")
  Response getUserassignedusergroupList(@DefaultValue("0")@QueryParam(OFFSET)Integer offset, @DefaultValue("20")@QueryParam(LIMIT)Integer limit);
  
  @POST
  @Path("/add/userassignedusergroup")
  Response addUserassignedusergroup(Userassignedusergroupdto result);
  
  @PUT
  @Path("/update/userassignedusergroup")
  Response updateUserassignedusergroup(Userassignedusergroupdto result);
  
  @GET
  @Path("/userassignedusergroup"+ PATH_ID)
  Response getUserassignedusergroup(@PathParam(ID) Integer id);
  
  @DELETE
  @Path("/userassignedusergroup"+ PATH_ID)
  Response deleteUserassignedusergroup(@PathParam(ID) Integer id);
  //////////////////////////////////////////////////////////////////////////
  
  @GET
  @Path("/list/trantransfers")
  Response getTrantransfersList(@DefaultValue("0")@QueryParam(OFFSET)Integer offset, @DefaultValue("20")@QueryParam(LIMIT)Integer limit);
  
  @POST
  @Path("/add/trantransfers")
  Response addTrantransfers(Trantransfersdto result);
  
  @PUT
  @Path("/update/trantransfers")
  Response updateTrantransfers(Trantransfersdto result);
  
  @GET
  @Path("/trantransfers"+ PATH_ID)
  Response getTrantransfers(@PathParam(ID) Integer id);
  
  @DELETE
  @Path("/trantransfers"+ PATH_ID)
  Response deleteTrantransfers(@PathParam(ID) Integer id);
  /////////////////////////////////////////////////////////////////////////////
  @GET
  @Path("/list/transtocktaking")
  Response getTranstocktakingList(@DefaultValue("0")@QueryParam(OFFSET)Integer offset, @DefaultValue("20")@QueryParam(LIMIT)Integer limit);
  
  @POST
  @Path("/add/transtocktaking")
  Response addTranstocktaking(Transtocktakingdto result);
  
  @PUT
  @Path("/update/transtocktaking")
  Response updateTranstocktaking(Transtocktakingdto result);
  
  @GET
  @Path("/transtocktaking"+ PATH_ID)
  Response getTranstocktaking(@PathParam(ID) Integer id);
  
  @DELETE
  @Path("/transtocktaking"+ PATH_ID)
  Response deleteTranstocktaking(@PathParam(ID) Integer id);
  //////////////////////////////////////////////////////////////////////////////
  @GET
  @Path("/list/transtockout")
  Response getTranstockoutList(@DefaultValue("0")@QueryParam(OFFSET)Integer offset, @DefaultValue("20")@QueryParam(LIMIT)Integer limit);
  
  @POST
  @Path("/add/transtockout")
  Response addTranstockout(Transtockoutdto result);
  
  @PUT
  @Path("/update/transtockout")
  Response updateTranstockout(Transtockoutdto result);
  
  @GET
  @Path("/transtockout"+ PATH_ID)
  Response getTranstockout(@PathParam(ID) Integer id);
  
  @DELETE
  @Path("/transtockout"+ PATH_ID)
  Response deleteTranstockout(@PathParam(ID) Integer id);
  /////////////////////////////////////////////////////////////////////////////
  @GET
  @Path("/list/transtocklevel")
  Response getTranstocklevelList(@DefaultValue("0")@QueryParam(OFFSET)Integer offset, @DefaultValue("20")@QueryParam(LIMIT)Integer limit);
  
  @POST
  @Path("/add/transtocklevel")
  Response addTranstocklevel(Transtockleveldto result);
  
  @PUT
  @Path("/update/transtocklevel")
  Response updateTranstocklevel(Transtockleveldto result);
  
  @GET
  @Path("/transtocklevel"+ PATH_ID)
  Response getTranstocklevel(@PathParam(ID) Integer id);
  
  @DELETE
  @Path("/transtocklevel"+ PATH_ID)
  Response deleteTranstocklevel(@PathParam(ID) Integer id);
  /////////////////////////////////////////////////////////////////////////////
  @GET
  @Path("/list/transtockin")
  Response getTranstockinList(@DefaultValue("0")@QueryParam(OFFSET)Integer offset, @DefaultValue("20")@QueryParam(LIMIT)Integer limit);
  
  @POST
  @Path("/add/transtockin")
  Response addTranstockin(Transtockindto result);
  
  @PUT
  @Path("/update/transtockin")
  Response updateTranstockin(Transtockindto result);
  
  @GET
  @Path("/transtockin"+ PATH_ID)
  Response getTranstockin(@PathParam(ID) Integer id);
  
  @DELETE
  @Path("/transtockin"+ PATH_ID)
  Response deleteTranstockin(@PathParam(ID) Integer id);
  /////////////////////////////////////////////////////////////////////////////
  @GET
  @Path("/list/tranlogs")
  Response getTranlogsList(@DefaultValue("0")@QueryParam(OFFSET)Integer offset, @DefaultValue("20")@QueryParam(LIMIT)Integer limit);
  
  @POST
  @Path("/add/tranlogs")
  Response addTranlogs(Tranlogsdto result);
  
  @PUT
  @Path("/update/tranlogs")
  Response updateTranlogs(Tranlogsdto result);
  
  @GET
  @Path("/tranlogs"+ PATH_ID)
  Response getTranlogs(@PathParam(ID) Integer id);
  
  @DELETE
  @Path("/tranlogs"+ PATH_ID)
  Response deleteTranlogs(@PathParam(ID) Integer id);
  //////////////////////////////////////////////////////////////////////////////
  @GET
  @Path("/list/trandisposal")
  Response getTrandisposalList(@DefaultValue("0")@QueryParam(OFFSET)Integer offset, @DefaultValue("20")@QueryParam(LIMIT)Integer limit);
  
  @POST
  @Path("/add/trandisposal")
  Response addTrandisposal(Trandisposaldto result);
  
  @PUT
  @Path("/update/trandisposal")
  Response updateTrandisposal(Trandisposaldto result);
  
  @GET
  @Path("/trandisposal"+ PATH_ID)
  Response getTrandisposal(@PathParam(ID) Integer id);
  
  @DELETE
  @Path("/trandisposal"+ PATH_ID)
  Response deleteTrandisposal(@PathParam(ID) Integer id);
  ///////////////////////////////////////////////////////////////////////////////
  @GET
  @Path("/list/trandepreciation")
  Response getTrandepreciationList(@DefaultValue("0")@QueryParam(OFFSET)Integer offset, @DefaultValue("20")@QueryParam(LIMIT)Integer limit);
  
  @POST
  @Path("/add/trandepreciation")
  Response addTrandepreciation(Trandepreciationdto result);
  
  @PUT
  @Path("/update/trandepreciation")
  Response updateTrandepreciation(Trandepreciationdto result);
  
  @GET
  @Path("/trandepreciation"+ PATH_ID)
  Response getTrandepreciation(@PathParam(ID) Integer id);
  
  @DELETE
  @Path("/trandepreciation"+ PATH_ID)
  Response deleteTrandepreciation(@PathParam(ID) Integer id);
  //////////////////////////////////////////////////////////////////////////////
  @GET
  @Path("/list/regitems")
  Response getRegitemsList(@DefaultValue("0")@QueryParam(OFFSET)Integer offset, @DefaultValue("20")@QueryParam(LIMIT)Integer limit);
  
  @POST
  @Path("/add/regitems")
  Response addRegitems(Regitemsdto result);
  
  @PUT
  @Path("/update/regitems")
  Response updateRegitems(Regitemsdto result);
  
  @GET
  @Path("/regitems"+ PATH_ID)
  Response getRegitems(@PathParam(ID) Integer id);
  
  @DELETE
  @Path("/regitems"+ PATH_ID)
  Response deleteRegitems(@PathParam(ID) Integer id);
  //////////////////////////////////////////////////////////////////////////////
  @GET
  @Path("/list/tranmain")
  Response getTranmainList(@DefaultValue("0")@QueryParam(OFFSET)Integer offset, @DefaultValue("20")@QueryParam(LIMIT)Integer limit);
  
  @POST
  @Path("/add/tranmain")
  Response addTranmain(Tranmaindto result);
  
  @PUT
  @Path("/update/tranmain")
  Response updateTranmain(Tranmaindto result);
  
  @GET
  @Path("/tranmain"+ PATH_ID)
  Response getTranmain(@PathParam(ID) Integer id);
  
  @DELETE
  @Path("/tranmain"+ PATH_ID)
  Response deleteTranmain(@PathParam(ID) Integer id);
  //////////////////////////////////////////////////////////////////////////////
  @GET
    @Path("/list/appapprules")
    Response getAppappruless(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit);

    @POST
    @Path("/add/appapprules")
    Response addAppapprules(Appapprulesdto appapprules);

    @PUT
    @Path("/update/appapprules")
    Response updateAppapprules(Appapprulesdto appapprules);

    @GET
    @Path("/appapprules" + PATH_ID)
    Response getAppapprules(@PathParam(ID) Integer id);

    @DELETE
    @Path("/appapprules" + PATH_ID)
    Response deleteAppapprules(@PathParam(ID) Integer id);

    /////////////////////////////////////////////////////////////////////
    @GET
    @Path("/list/applogalerts")
    Response getApplogalertss(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit);

    @POST
    @Path("/add/applogalerts")
    Response addApplogalerts(Applogalertsdto applogalerts);

    @PUT
    @Path("/update/applogalerts")
    Response updateApplogalerts(Applogalertsdto applogalerts);

    @GET
    @Path("/applogalerts" + PATH_ID)
    Response getApplogalerts(@PathParam(ID) Integer id);

    @DELETE
    @Path("/applogalerts" + PATH_ID)
    Response deleteApplogalerts(@PathParam(ID) Integer id);

    ////////////////////////////////////////////////////////////////////////////////////////////
    @GET
    @Path("/list/appmodules")
    Response getAppmoduless(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit);

    @POST
    @Path("/add/appmodules")
    Response addAppmodules(Appmodulesdto appmodules);

    @PUT
    @Path("/update/appmodules")
    Response updateAppmodules(Appmodulesdto appmodules);

    @GET
    @Path("/appmodules" + PATH_ID)
    Response getAppmodules(@PathParam(ID) Integer id);

    @DELETE
    @Path("/appmodules" + PATH_ID)
    Response deleteAppmodules(@PathParam(ID) Integer id);

    ////////////////////////////////////////////////////////////////////////////////////////////
    @GET
    @Path("/list/lstcategoryleveltype")
    Response getLstcategoryleveltypes(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit);

    @POST
    @Path("/add/lstcategoryleveltype")
    Response addLstcategoryleveltype(Lstcategoryleveltypedto lstcategoryleveltype);

    @PUT
    @Path("/update/lstcategoryleveltype")
    Response updateLstcategoryleveltype(Lstcategoryleveltypedto lstcategoryleveltype);

    @GET
    @Path("/lstcategoryleveltype" + PATH_ID)
    Response getLstcategoryleveltype(@PathParam(ID) Integer id);

    @DELETE
    @Path("/lstcategoryleveltype" + PATH_ID)
    Response deleteLstcategoryleveltype(@PathParam(ID) Integer id);

    ////////////////////////////////////////////////////////////////////////////////////////////
    @GET
    @Path("/list/lstinventorytype")
    Response getLstinventorytypes(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit);

    @POST
    @Path("/add/lstinventorytype")
    Response addLstinventorytype(Lstinventorytypedto lstinventorytype);

    @PUT
    @Path("/update/lstinventorytype")
    Response updateLstinventorytype(Lstinventorytypedto lstinventorytype);

    @GET
    @Path("/lstinventorytype" + PATH_ID)
    Response getLstinventorytype(@PathParam(ID) Integer id);

    @DELETE
    @Path("/lstinventorytype" + PATH_ID)
    Response deleteLstinventorytype(@PathParam(ID) Integer id);

    ////////////////////////////////////////////////////////////////////////////////////////////
    @GET
    @Path("/list/lstmain")
    Response getLstmains(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit);

    @POST
    @Path("/add/lstmain")
    Response addLstmain(Lstmaindto lstmain);

    @PUT
    @Path("/update/lstmain")
    Response updateLstmain(Lstmaindto lstmain);

    @GET
    @Path("/lstmain" + PATH_ID)
    Response getLstmain(@PathParam(ID) Integer id);

    @DELETE
    @Path("/lstmain" + PATH_ID)
    Response deleteLstmain(@PathParam(ID) Integer id);

    ////////////////////////////////////////////////////////////////////////////////////////////
    @GET
    @Path("/list/lstmeasurepack")
    Response getLstmeasurepacks(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit);

    @POST
    @Path("/add/lstmeasurepack")
    Response addLstmeasurepack(Lstmeasurepackdto lstmeasurepack);

    @PUT
    @Path("/update/lstmeasurepack")
    Response updateLstmeasurepack(Lstmeasurepackdto lstmeasurepack);

    @GET
    @Path("/lstmeasurepack" + PATH_ID)
    Response getLstmeasurepack(@PathParam(ID) Integer id);

    @DELETE
    @Path("/lstmeasurepack" + PATH_ID)
    Response deleteLstmeasurepack(@PathParam(ID) Integer id);

    ////////////////////////////////////////////////////////////////////////////////////////////
    @GET
    @Path("/list/lstmeasureunit")
    Response getLstmeasureunits(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit);

    @POST
    @Path("/add/lstmeasureunit")
    Response addLstmeasureunit(Lstmeasureunitdto lstmeasurepack);

    @PUT
    @Path("/update/lstmeasureunit")
    Response updateLstmeasureunit(Lstmeasureunitdto lstmeasurepack);

    @GET
    @Path("/lstmeasureunit" + PATH_ID)
    Response getLstmeasureunit(@PathParam(ID) Integer id);

    @DELETE
    @Path("/lstmeasureunit" + PATH_ID)
    Response deleteLstmeasureunit(@PathParam(ID) Integer id);

    ////////////////////////////////////////////////////////////////////////////////////////////
    @GET
    @Path("/list/lststockleveltype")
    Response getLststockleveltypes(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit);

    @POST
    @Path("/add/lststockleveltype")
    Response addLststockleveltype(Lststockleveltypedto lstmeasurepack);

    @PUT
    @Path("/update/lststockleveltype")
    Response updateLststockleveltype(Lststockleveltypedto lstmeasurepack);

    @GET
    @Path("/lststockleveltype" + PATH_ID)
    Response getLststockleveltype(@PathParam(ID) Integer id);

    @DELETE
    @Path("/lststockleveltype" + PATH_ID)
    Response deleteLststockleveltype(@PathParam(ID) Integer id);

    ////////////////////////////////////////////////////////////////////////////////////////////
    @GET
    @Path("/list/lststockoutreceipttype")
    Response getLststockoutreceipttypes(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit);

    @POST
    @Path("/add/lststockoutreceipttype")
    Response addLststockoutreceipttype(Lststockoutreceipttypedto lstmeasurepack);

    @PUT
    @Path("/update/lststockoutreceipttype")
    Response updateLststockoutreceipttype(Lststockoutreceipttypedto lstmeasurepack);

    @GET
    @Path("/lststockoutreceipttype" + PATH_ID)
    Response getLststockoutreceipttype(@PathParam(ID) Integer id);

    @DELETE
    @Path("/lststockoutreceipttype" + PATH_ID)
    Response deleteLststockoutreceipttype(@PathParam(ID) Integer id);

    ////////////////////////////////////////////////////////////////////////////////////////////
    @GET
    @Path("/list/lststockouttype")
    Response getLststockouttypes(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit);

    @POST
    @Path("/add/lststockouttype")
    Response addLststockouttype(Lststockouttypedto lstmeasurepack);

    @PUT
    @Path("/update/lststockouttype")
    Response updateLststockouttype(Lststockouttypedto lstmeasurepack);

    @GET
    @Path("/lststockouttype" + PATH_ID)
    Response getLststockouttype(@PathParam(ID) Integer id);

    @DELETE
    @Path("/lststockouttype" + PATH_ID)
    Response deleteLststockouttype(@PathParam(ID) Integer id);

    ////////////////////////////////////////////////////////////////////////////////////////////
    @GET
    @Path("/list/lststores")
    Response getLststoress(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit);

    @POST
    @Path("/add/lststores")
    Response addLststores(Lststoresdto lstmeasurepack);

    @PUT
    @Path("/update/lststores")
    Response updateLststores(Lststoresdto lstmeasurepack);

    @GET
    @Path("/lststores" + PATH_ID)
    Response getLststores(@PathParam(ID) Integer id);

    @DELETE
    @Path("/lststores" + PATH_ID)
    Response deleteLststores(@PathParam(ID) Integer id);

    ////////////////////////////////////////////////////////////////////////////////////////////
    @GET
    @Path("/list/lstsubcategorytree")
    Response getLstsubcategorytrees(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit);

    @POST
    @Path("/add/lstsubcategorytree")
    Response addLstsubcategorytree(Lstsubcategorytreedto lstmeasurepack);

    @PUT
    @Path("/update/lstsubcategorytree")
    Response updateLstsubcategorytree(Lstsubcategorytreedto lstmeasurepack);

    @GET
    @Path("/lstsubcategorytree" + PATH_ID)
    Response getLstsubcategorytree(@PathParam(ID) Integer id);

    @DELETE
    @Path("/lstsubcategorytree" + PATH_ID)
    Response deleteLstsubcategorytree(@PathParam(ID) Integer id);

    ////////////////////////////////////////////////////////////////////////////////////////////
    @GET
    @Path("/list/lstsupplytype")
    Response getLstsupplytypes(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit);

    @POST
    @Path("/add/lstsupplytype")
    Response addLstsupplytype(Lstsupplytypedto lstmeasurepack);

    @PUT
    @Path("/update/lstsupplytype")
    Response updateLstsupplytype(Lstsupplytypedto lstmeasurepack);

    @GET
    @Path("/lstsupplytype" + PATH_ID)
    Response getLstsupplytype(@PathParam(ID) Integer id);

    @DELETE
    @Path("/lstsupplytype" + PATH_ID)
    Response deleteLstsupplytype(@PathParam(ID) Integer id);

    ////////////////////////////////////////////////////////////////////////////////////////////
    @GET
    @Path("/list/prmintinstitution")
    Response getPrmintinstitutions(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit);

    @POST
    @Path("/add/prmintinstitution")
    Response addPrmintinstitution(Prmintinstitutiondto lstmeasurepack);

    @PUT
    @Path("/update/prmintinstitution")
    Response updatePrmintinstitution(Prmintinstitutiondto lstmeasurepack);

    @GET
    @Path("/prmintinstitution" + PATH_ID)
    Response getPrmintinstitution(@PathParam(ID) Integer id);

    @DELETE
    @Path("/prmintinstitution" + PATH_ID)
    Response deletePrmintinstitution(@PathParam(ID) Integer id);

    ////////////////////////////////////////////////////////////////////////////////////////////
    @GET
    @Path("/list/prmintinstitutiontype")
    Response getPrmintinstitutiontypes(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit);

    @POST
    @Path("/add/prmintinstitutiontype")
    Response addPrmintinstitutiontype(Prmintinstitutiontypedto lstmeasurepack);

    @PUT
    @Path("/update/prmintinstitutiontype")
    Response updatePrmintinstitutiontype(Prmintinstitutiontypedto lstmeasurepack);

    @GET
    @Path("/prmintinstitutiontype" + PATH_ID)
    Response getPrmintinstitutiontype(@PathParam(ID) Integer id);

    @DELETE
    @Path("/prmintinstitutiontype" + PATH_ID)
    Response deletePrmintinstitutiontype(@PathParam(ID) Integer id);

    ////////////////////////////////////////////////////////////////////////////////////////////
    @GET
    @Path("/list/prmintsuborganisation")
    Response getPrmintsuborganisations(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit);

    @POST
    @Path("/add/prmintsuborganisation")
    Response addPrmintsuborganisation(Prmintsuborganisationdto lstmeasurepack);

    @PUT
    @Path("/update/prmintsuborganisation")
    Response updatePrmintsuborganisation(Prmintsuborganisationdto lstmeasurepack);

    @GET
    @Path("/prmintsuborganisation" + PATH_ID)
    Response getPrmintsuborganisation(@PathParam(ID) Integer id);

    @DELETE
    @Path("/prmintsuborganisation" + PATH_ID)
    Response deletePrmintsuborganisation(@PathParam(ID) Integer id);

    ////////////////////////////////////////////////////////////////////////////////////////////
    @GET
    @Path("/list/prmintsuborganisationtype")
    Response getPrmintsuborganisationtypes(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit);

    @POST
    @Path("/add/prmintsuborganisationtype")
    Response addPrmintsuborganisationtype(Prmintsuborganisationtypedto lstmeasurepack);

    @PUT
    @Path("/update/prmintsuborganisationtype")
    Response updatePrmintsuborganisationtype(Prmintsuborganisationtypedto lstmeasurepack);

    @GET
    @Path("/prmintsuborganisationtype" + PATH_ID)
    Response getPrmintsuborganisationtype(@PathParam(ID) Integer id);

    @DELETE
    @Path("/prmintsuborganisationtype" + PATH_ID)
    Response deletePrmintsuborganisationtype(@PathParam(ID) Integer id);

    ////////////////////////////////////////////////////////////////////////////////////////////
    @GET
    @Path("/list/regdepreciationbycategory")
    Response getRegdepreciationbycategorys(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit);

    @POST
    @Path("/add/regdepreciationbycategory")
    Response addRegdepreciationbycategory(Regdepreciationbycategorydto lstmeasurepack);

    @PUT
    @Path("/update/regdepreciationbycategory")
    Response updateRegdepreciationbycategory(Regdepreciationbycategorydto lstmeasurepack);

    @GET
    @Path("/regdepreciationbycategory" + PATH_ID)
    Response getRegdepreciationbycategory(@PathParam(ID) Integer id);

    @DELETE
    @Path("/regdepreciationbycategory" + PATH_ID)
    Response deleteRegdepreciationbycategory(@PathParam(ID) Integer id);

    ////////////////////////////////////////////////////////////////////////////////////////////
    @GET
  @Path("/list/supplier")
  Response getSupplierList(@DefaultValue("0")@QueryParam(OFFSET)Integer offset, @DefaultValue("20")@QueryParam(LIMIT)Integer limit);
  
  @POST
  @Path("/add/supplier")
  Response addSupplier(Supplierdto results);

  @PUT
  @Path("/update/supplier")
  Response updateSupplier(Supplierdto result);

  @GET
  @Path("/supplier" + PATH_ID)
  Response getSupplier(@PathParam(ID) Integer id);
 
  @DELETE
  @Path("/supplier" + PATH_ID)
  Response deleteSupplier(@PathParam(ID) Integer id);
  
}
