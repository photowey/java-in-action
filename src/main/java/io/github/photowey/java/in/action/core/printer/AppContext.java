/*
 * Copyright © 2025 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.photowey.java.in.action.core.printer;

import java.io.Serializable;

/**
 * {@code AppContext}.
 *
 * @author photowey
 * @version 1.0.0
 * @since 2025/02/16
 */
public class AppContext implements Serializable {

    private static final long serialVersionUID = 1238866251476668122L;

    private String protocol;

    private String app;
    private String host;
    private String port;
    private String profileActive;

    private String contextPath;
    private String healthContextPath;

    // ----------------------------------------------------------------

    private String swaggerPath;
    private boolean swaggerEnabled;

    public static AppContextBuilder defaultAppContext() {
        return AppContext.builder().swaggerEnabled(false);
    }

    public static AppContextBuilder swaggerAppContext() {
        return swaggerAppContext("doc.html");
    }

    public static AppContextBuilder swaggerAppContext(String swaggerPath) {
        return AppContext.builder()
            .swaggerEnabled(true)
            .swaggerPath(swaggerPath);
    }

    public static AppContextBuilder builder() {
        return new AppContextBuilder();
    }

    public String getProtocol() {
        return this.protocol;
    }

    public String getApp() {
        return this.app;
    }

    public String getHost() {
        return this.host;
    }

    public String getPort() {
        return this.port;
    }

    public String getProfileActive() {
        return this.profileActive;
    }

    public String getContextPath() {
        return this.contextPath;
    }

    public String getHealthContextPath() {
        return this.healthContextPath;
    }

    public String getSwaggerPath() {
        return this.swaggerPath;
    }

    public boolean isSwaggerEnabled() {
        return this.swaggerEnabled;
    }

    public void setProtocol(final String protocol) {
        this.protocol = protocol;
    }

    public void setApp(final String app) {
        this.app = app;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public void setPort(final String port) {
        this.port = port;
    }

    public void setProfileActive(final String profileActive) {
        this.profileActive = profileActive;
    }

    public void setContextPath(final String contextPath) {
        this.contextPath = contextPath;
    }

    public void setHealthContextPath(final String healthContextPath) {
        this.healthContextPath = healthContextPath;
    }

    public void setSwaggerPath(final String swaggerPath) {
        this.swaggerPath = swaggerPath;
    }

    public void setSwaggerEnabled(final boolean swaggerEnabled) {
        this.swaggerEnabled = swaggerEnabled;
    }

    @Override
    public String toString() {
        return "AppContext("
            + "protocol=" + this.getProtocol() + ", "
            + "app=" + this.getApp() + ", "
            + "host=" + this.getHost() + ", "
            + "port=" + this.getPort() + ", "
            + "profileActive=" + this.getProfileActive() + ", "
            + "contextPath=" + this.getContextPath() + ", "
            + "healthContextPath=" + this.getHealthContextPath() + ", "
            + "swaggerPath=" + this.getSwaggerPath() + ", "
            + "swaggerEnabled=" + this.isSwaggerEnabled()
            + ")";
    }

    public AppContext() {
    }

    public AppContext(
        final String protocol, final String app, final String host, final String port,
        final String profileActive, final String contextPath,
        final String healthContextPath, final String swaggerPath,
        final boolean swaggerEnabled) {
        this.protocol = protocol;
        this.app = app;
        this.host = host;
        this.port = port;
        this.profileActive = profileActive;
        this.contextPath = contextPath;
        this.healthContextPath = healthContextPath;
        this.swaggerPath = swaggerPath;
        this.swaggerEnabled = swaggerEnabled;
    }

    public static class AppContextBuilder {
        private String protocol;
        private String app;
        private String host;
        private String port;
        private String profileActive;
        private String contextPath;
        private String healthContextPath;
        private String swaggerPath;
        private boolean swaggerEnabled;

        AppContextBuilder() {
        }

        public AppContextBuilder protocol(final String protocol) {
            this.protocol = protocol;
            return this;
        }

        public AppContextBuilder app(final String app) {
            this.app = app;
            return this;
        }

        public AppContextBuilder host(final String host) {
            this.host = host;
            return this;
        }

        public AppContextBuilder port(final String port) {
            this.port = port;
            return this;
        }

        public AppContextBuilder profileActive(final String profileActive) {
            this.profileActive = profileActive;
            return this;
        }

        public AppContextBuilder contextPath(final String contextPath) {
            this.contextPath = contextPath;
            return this;
        }

        public AppContextBuilder healthContextPath(final String healthContextPath) {
            this.healthContextPath = healthContextPath;
            return this;
        }

        public AppContextBuilder swaggerPath(final String swaggerPath) {
            this.swaggerPath = swaggerPath;
            return this;
        }

        public AppContextBuilder swaggerEnabled(final boolean swaggerEnabled) {
            this.swaggerEnabled = swaggerEnabled;
            return this;
        }

        public AppContext build() {
            return new AppContext(this.protocol, this.app, this.host, this.port, this.profileActive,
                this.contextPath, this.healthContextPath, this.swaggerPath, this.swaggerEnabled);
        }

        @Override
        public String toString() {
            return "AppContext.AppContextBuilder("
                + "protocol=" + this.protocol + ", "
                + "app=" + this.app + ", "
                + "host=" + this.host + ", "
                + "port=" + this.port + ", "
                + "profileActive=" + this.profileActive + ", "
                + "contextPath=" + this.contextPath + ", "
                + "healthContextPath=" + this.healthContextPath + ", "
                + "swaggerPath=" + this.swaggerPath + ", "
                + "swaggerEnabled=" + this.swaggerEnabled
                + ")";
        }
    }
}
