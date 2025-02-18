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
package io.github.photowey.java.in.action.service;

import io.github.photowey.java.in.action.AbstractLocalTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * {@code HelloServiceTest}.
 * |- {@link HelloService} 测试类
 *
 * @author photowey
 * @version 1.0.0
 * @since 2025/02/18
 */
@SpringBootTest
class HelloServiceTest extends AbstractLocalTest {

    @Test
    void testSayHello() {
        String hello = this.helloService.sayHello("photowey");
        Assertions.assertEquals("Hello,photowey", hello);

        String dummy = this.helloService.sayHello("");
        Assertions.assertEquals("Hello Dummy~", dummy);
    }
}
