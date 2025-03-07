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

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * {@code App}.
 * |- 应用程序入口类
 *
 * @author photowey
 * @version 1.0.0
 * @since 2025/02/16
 */
@Slf4j
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        long love = 520;
        try {
            life(love);
        } catch (Exception e) {
            handle(args);
        } finally {
            love++;
        }
    }

    private static void life(long love) {
        // 生活,总有很多未知和意外~
        long x = love / 0L;
        // 也总有,不如人意的地方!
        throw new UnsupportedOperationException("Unreachable here.");
    }

    private static void handle(String[] args) {
        // 一起面对~
        TogetherApplication.run(args);
    }

    // @formatter:off
    public static void holdOn() { }
    // @formatter:on
}
