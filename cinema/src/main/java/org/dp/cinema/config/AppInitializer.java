package org.dp.cinema.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        Class[] configFiles = {AppConfig.class};
        return configFiles;
    }

    @Override
    protected String[] getServletMappings() {
        String[] mappings = {"/"};
        return mappings;
    }

}
