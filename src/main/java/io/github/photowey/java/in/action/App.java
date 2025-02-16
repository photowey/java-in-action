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
package io.github.photowey.java.in.action;

import io.github.photowey.java.in.action.core.event.ApplicationStartedLocalEvent;
import io.github.photowey.java.in.action.core.printer.AppContext;
import io.github.photowey.java.in.action.core.printer.AppPrinter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.util.StopWatch;

/**
 * {@code App}.
 * |- 应用程序入库类
 *
 * @author photowey
 * @version 1.0.0
 * @since 2025/02/16
 */
@Slf4j
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        StopWatch watch = new StopWatch("setup");
        watch.start();

        ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(App.class)
            .bannerMode(Banner.Mode.CONSOLE)
            .logStartupInfo(true)
            .build(args)
            .run(args);

        AppPrinter.print(applicationContext, AppContext.swaggerAppContext());
        watch.stop();
        publishEvent(applicationContext);

        log.info("Report: java-in-action webapp started, took [{}] ms",
            watch.getTotalTimeMillis()
        );
    }

    // @formatter:off
    public static void holdOn() { }
    // @formatter:on

    private static void publishEvent(ConfigurableApplicationContext applicationContext) {
        applicationContext.publishEvent(new ApplicationStartedLocalEvent());
    }
}
