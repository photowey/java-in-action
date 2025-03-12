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
package io.github.photowey.java.in.action.grammar.basic;

/**
 * {@code Identifiers}.
 * 标识符
 * |- 标识符是程序中用来唯一标识变量、方法、类、接口、数组等元素的名称
 * |- 语言规范
 * |- |- 1. 标识符只能包含字母、数字、下划线(_)、美元符号($)
 * |- |- 2. 标识符不能以数字开头
 * |- |- 3. 标识符不能是关键字
 * |- 行业规范
 * |- |- 1. 给类取名字: 遵循大驼峰式 -> 每个单词首字母大写
 * |- |- |- HelloWorld
 * |- |- 2. 给方法或变量取名字: 遵循小驼峰式 -> 第一个单词首字母小写,第二个单词首字母大写
 * |- |- |- public void helloWorld() {};
 * |- |- |- String helloWorld = "Hello world";
 *
 * @author photowey
 * @version 1.0.0
 * @since 2025/03/12
 */
public class Identifiers {

    public static void main(String[] args) {
        helloWorld();

        String helloWorld = "Hello world";
        System.out.println(helloWorld);
    }

    private static void helloWorld() {
        System.out.println("Hello world");
    }
}
