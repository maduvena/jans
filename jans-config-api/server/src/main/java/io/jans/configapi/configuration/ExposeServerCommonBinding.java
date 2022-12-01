/*
 * Janssen Project software is available under the MIT License (2008). See http://opensource.org/licenses/MIT for full text.
 *
 * Copyright (c) 2020, Janssen Project
 */

package io.jans.configapi.configuration;

import org.eclipse.jetty.deploy.App;
import org.eclipse.jetty.deploy.AppLifeCycle;
import org.eclipse.jetty.deploy.graph.Node;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.webapp.WebAppContext;

import org.slf4j.Logger;
import java.util.ArrayList;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.BeforeDestroyed;
import jakarta.enterprise.context.Initialized;
import jakarta.enterprise.event.Observes;
import jakarta.enterprise.inject.Instance;
import jakarta.enterprise.inject.Produces;
import jakarta.enterprise.inject.spi.BeanManager;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.servlet.ServletContext;

import org.jboss.resteasy.spi.ResteasyProviderFactory;
import org.jboss.resteasy.plugins.providers.RegisterBuiltin;
import org.jboss.resteasy.plugins.providers.jackson.ResteasyJackson2Provider;

public class ExposeServerCommonBinding implements AppLifeCycle.Binding
{
    public String[] getBindingTargets()
    { 
        System.out.println("\n\n ExposeServerCommonBinding::getBindingTargets() \n\n");
        return new String[]
        { "deploying" };
    }

    public void processBinding(Node node, App app) throws Exception
    {System.out.println("\n\n ExposeServerCommonBinding::getBindingTargets() - node = "+node+" , app = "+app+" \n\n");
        ContextHandler handler = app.getContextHandler();
        if (handler == null)
        {
            throw new NullPointerException("No Handler created for App: " + app);
        }

        if (handler instanceof WebAppContext)
        {
            WebAppContext webapp = (WebAppContext)handler;
            System.out.println("\n\n webapp.getExtraClasspath() -  "+webapp.getExtraClasspath()+"\n\n");
        }
    }
}
