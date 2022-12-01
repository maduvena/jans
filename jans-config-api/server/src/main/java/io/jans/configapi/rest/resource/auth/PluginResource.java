/*
 * Janssen Project software is available under the MIT License (2008). See http://opensource.org/licenses/MIT for full text.
 *
 * Copyright (c) 2020, Janssen Project
 */

package io.jans.configapi.rest.resource.auth;

import com.fasterxml.jackson.databind.JsonNode;

import io.jans.configapi.util.ApiConstants;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.jans.exception.ConfigurationException;
import jakarta.inject.Inject;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContainerInitializer;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.Application;
import java.io.InputStream;
import java.util.Collections;
import java.util.Properties;
import org.slf4j.Logger;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.resource.Resource;
import org.eclipse.jetty.webapp.WebAppContext;

@Path(ApiConstants.PLUGIN)
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PluginResource extends ConfigBaseResource {

    @Inject
    Logger log;

    @Context
    private HttpServletRequest servletRequest;
    
    @Context
    ServletConfig servletConfig;

    @Context
    ServletContext servletContext;

    @Operation(summary = "Returns deployed plugin details", description = "Returns deployed plugin details", operationId = "get-plugin-details", tags = {
            "Plugins" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Ok", content = @Content(mediaType = MediaType.APPLICATION_JSON, schema = @Schema(implementation = JsonNode.class), examples = @ExampleObject(name = "Response json example", value = "example/auth/health/health.json"))),
            @ApiResponse(responseCode = "500", description = "InternalServerError") })
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPluginDetails() {
        log.error("PluginResource::getPluginDetails() - servletRequest:{}, servletConfig:{}, servletContext:{}", servletRequest, servletConfig, servletContext);
        log.error("PluginResource::getPluginDetails() - servletRequest.getServletContext().getServerInfo():{}",
                servletRequest.getServletContext().getServerInfo());
        log.error(
                "PluginResource::getPluginDetails() - servletRequest.getServletContext().getClassLoader().getResourceAsStream(/jans-config-api/webapps/jans-config-api.xml):{}",
                servletRequest.getServletContext().getClassLoader()
                        .getResourceAsStream("/jans-config-api/webapps/jans-config-api.xml"));
        log.error(
                "PluginResource::getPluginDetails() - servletRequest.getServletContext().getClassLoader().getResourceAsStream(/webapps/jans-config-api.xml):{}",
                servletRequest.getServletContext().getClassLoader()
                        .getResourceAsStream("/webapps/jans-config-api.xml"));
        log.error(
                "PluginResource::getPluginDetails() - servletRequest.getServletContext().getClassLoader().getResourceAsStream(webapps/jans-config-api.xml):{}",
                servletRequest.getServletContext().getClassLoader()
                        .getResourceAsStream("webapps/jans-config-api.xml"));
        log.error(
                "PluginResource::getPluginDetails() - servletRequest.getServletContext().getClassLoader().getResourceAsStream(/jans-config-api.xml):{}",
                servletRequest.getServletContext().getClassLoader()
                        .getResourceAsStream("/jans-config-api.xml"));
        log.error(
                "PluginResource::getPluginDetails() - servletRequest.getServletContext().getClassLoader().getResourceAsStream(jans-config-api.xml):{}",
                servletRequest.getServletContext().getClassLoader()
                        .getResourceAsStream("jans-config-api.xml"));
        
        log.error("PluginResource::getPluginDetails() - servletConfig.getServletContext().getRealPath(jans-config-api.xml):{} ", servletConfig.getServletContext().getRealPath("jans-config-api.xml"));
        log.error("PluginResource::getPluginDetails() - servletConfig.getServletContext().getClassLoader().getResourceAsStream(/jans-config-api.xml):{} ",servletConfig.getServletContext().getClassLoader().getResourceAsStream("/jans-config-api.xml"));
        log.error("PluginResource::getPluginDetails() - servletContext.getRealPath(jans-config-api.xml):{} ",servletContext.getRealPath("jans-config-api.xml"));
        log.error("PluginResource::getPluginDetails() - servletContext.getContextPath(jans-config-api.xml):{} ",servletContext.getContextPath());
        
                loadFile();

        return Response.ok("OK").build();
    }

    private void loadFile() {
        try {
            ClassLoader loader = Thread.currentThread().getContextClassLoader();
            InputStream inputStream = loader.getResourceAsStream("/jans-config-api/webapps/jans-config-api.xml");
            log.error("PluginResource::loadFile(jans-config-api/webapps/jans-config-api.xml) - inputStream:{}", inputStream);
            
            inputStream = loader.getResourceAsStream("/webapps/jans-config-api.xml");
            log.error("PluginResource::loadFile(/webapps/jans-config-api.xml) - inputStream:{}", inputStream);
            
            inputStream = loader.getResourceAsStream("/jans-config-api.xml");
            log.error("PluginResource::loadFile(/jans-config-api.xml) - inputStream:{}", inputStream);
            
            inputStream = loader.getResourceAsStream("jans-config-api.xml");
            log.error("PluginResource::loadFile(jans-config-api.xml) - inputStream:{}", inputStream);
            
            loadPluginResource();
            
        } catch (Exception e) {
            throw new ConfigurationException(
                    "Failed to load configuration from /jans-config-api/webapps/jans-config-api.xml", e);
        }
    }
    
    private void loadPluginResource() {
        log.error("PluginResource::loadPluginResource - Entry ");
        try {
            ClassLoader loader = Thread.currentThread().getContextClassLoader();
            org.eclipse.jetty.util.resource.Resource resource = Resource.newClassPathResource("/webapp");
            log.error("PluginResource::loadPluginResource - resource =  "+resource);
            //WebAppContext context = new WebAppContext(resource, "jans-config-api.xml");
            //log.error("PluginResource::loadPluginResource - context 1 =  "+context);
            WebAppContext context = WebAppContext.getCurrentWebAppContext();
            log.error("PluginResource::loadPluginResource - context 2 =  "+context);
            
            
            
            
        } catch (Exception e) {
            throw new ConfigurationException(
                    "Failed to load loadPluginResource", e);
        }
    }

}

