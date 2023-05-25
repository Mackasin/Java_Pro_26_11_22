package com.hillel.dzhurynskyi.homework.hm30;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;

public class MainGroupServer {

    public static void main(String[] args) throws Exception {
        ServletContextHandler handler = buildUsingResourceConfig();
        Server server = new Server(9998);
        server.setHandler(handler);
        try {
            server.start();
            server.join();
        } finally {
            server.destroy();
        }
    }

    static ServletContextHandler buildUsingResourceConfig() {
        ServletContextHandler handler = new ServletContextHandler(ServletContextHandler.NO_SESSIONS);
        handler.setContextPath("/");

        ResourceConfig resourceConfig = new ResourceConfig();

        resourceConfig.register(OrderService.class);
        handler.addServlet(new ServletHolder(new ServletContainer(resourceConfig)), "/*");
        return handler;
    }
}