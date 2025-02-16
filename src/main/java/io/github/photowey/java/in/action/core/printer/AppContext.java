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

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * {@code AppContext}.
 *
 * @author photowey
 * @version 1.0.0
 * @since 2025/02/16
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
}
