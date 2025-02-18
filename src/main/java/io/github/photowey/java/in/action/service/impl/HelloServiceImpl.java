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
package io.github.photowey.java.in.action.service.impl;

import io.github.photowey.java.in.action.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * {@code HelloServiceImpl}.
 * |- {@link HelloService} 实现类
 *
 * @author photowey
 * @version 1.0.0
 * @since 2025/02/18
 */
@Slf4j
@Service
public class HelloServiceImpl implements HelloService {

    /**
     * Say hello.
     *
     * @param name 人名
     * @return 问候语
     */
    @Override
    public String sayHello(String name) {
        // 单行注释
        // 如果: 人名有值 -> 返回: Hello, 人名
        if (StringUtils.hasText(name)) {
            return "Hello," + name;
        }

        // 如果: 人名没有值 -> 返回: Hello, Dummy~
        return "Hello Dummy~";
    }
}
