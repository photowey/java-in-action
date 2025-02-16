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
package io.github.photowey.java.in.action.core.event;

import org.springframework.context.ApplicationEvent;

/**
 * {@code ApplicationStartedLocalEvent}.
 * |- 应用程序启动成功后触发的本地事件
 * |- |- 通常用于自定义事件系统中
 * |- 执行时机
 * |- |- 在整个 IOC 事件之后发布
 *
 * @author photowey
 * @version 1.0.0
 * @since 2025/02/16
 */
public class ApplicationStartedLocalEvent extends ApplicationEvent {

    public ApplicationStartedLocalEvent() {
        super(new Object());
    }
}