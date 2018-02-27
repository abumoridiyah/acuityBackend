package com.comsoftacuity.config;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.ext.Provider;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by pitaside on 7/2/2015.
 * <p/>
 * <p/>
 * This class is use
 */

@Provider
@PreMatching
public class CORSConfigurationFilter implements ContainerResponseFilter {


    private final static Logger LOGGER = Logger.getLogger(CORSConfigurationFilter.class.getName());
    @Override
    public void filter(ContainerRequestContext requestContext,
                       ContainerResponseContext responseContext) throws IOException {

        LOGGER.info("**HTTP API*** Filtering REST Request "+ requestContext.getMethod() + " --- " + requestContext.getUriInfo().getPath());
        
        responseContext.getHeaders().add("Access-Control-Allow-Origin", "*");
        responseContext.getHeaders().add("Access-Control-Allow-Headers",
                "origin, content-type, accept, X-HTTP-Method-Override, " + HttpHeaderName.AUTHORIZATION_PROPERTY  + ", "
                        + HttpHeaderName.AUTH_TOKEN);
        responseContext.getHeaders().add("Access-Control-Allow-Credentials", "true");
        responseContext.getHeaders().add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD");
        responseContext.getHeaders().add("Access-Control-Max-Age", "1209600");
        
        
        
    }
}
