package com.comsoftacuity.config;


import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by peter on 12/17/15.
 */


@Provider
@PreMatching
public class RESTRequestFilter implements ContainerRequestFilter {
	@Context
	HttpServletRequest servletRequest;

	private static final Logger LOGGER = Logger.getLogger(RESTRequestFilter.class.getName());

	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {
		String requestPath = requestContext.getUriInfo().getPath();
		LOGGER.info("Intercepted request with method " + requestContext.getMethod() + "[Path => " + requestPath + "]");
		requestContext.getCookies().forEach((s, cookie) -> LOGGER.info("Cookie value is " + s));

		//let acknowledge any pre-flight browser test
		if(requestContext.getRequest().getMethod().equals("OPTIONS")){
			requestContext.abortWith(Response.status(Response.Status.OK).build());
			return;
		}

		//if the request api is not a login api then we must provide a auth token
		//TODO just allow only reports  api to called without passing auth token, will fixed it using cookie storage
//		if(!requestPath.startsWith("users/login") && !requestPath.startsWith("reports/generate")){
//			String jwtToken  = requestContext.getHeaderString(HttpHeaderName.AUTH_TOKEN);
//			if(jwtToken == null){
//				requestContext.abortWith(Response.status(Response.Status.UNAUTHORIZED)
//						.entity(ResourceMessages.NO_PERMISSION).build());
//			}
//			//let check if the auth-token is valid, if not kick then out
//			if(!JWTokenGeneratorHelper.verifyJwtTokenIsSignedAndValid(jwtToken)){
//				//kick them out of this service
//				requestContext.abortWith(Response.status(Response.Status.UNAUTHORIZED)
//						.entity(ResourceMessages.NO_PERMISSION).build());
//			}
//		}
	}

}
