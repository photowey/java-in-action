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
package io.github.photowey.java.in.action.example.basic;

/**
 * {@code Comments}.
 * |- {@code Java} 语言的注释
 * |- 单行注释
 * |- 多行注释
 * |- 文档注释
 *
 * @author photowey
 * @version 1.0.0
 * @since 2025/02/17
 */
public class Comments {

    /**
     * 程序入口
     * |- jvm 执行代码,会从 `main` 方法开始执行
     *
     * @param args 参数列表
     */
    public static void main(String[] args) {
        // 单行注释1
        // 单行注释2
        // 单行注释3
        // 单行注释...
        // 单行注释N

        // 行单注释可以在被注释代码的上方令其一行,或直接在行尾注释

        // 在实际开发中: 单行注释通常用在代码的某一行上,表示该行代码是注释,不会被执行
        // 阿里巴巴的编码规范: 要求单行注释使用 // 且不能行尾注释
        System.out.println("Hello World!");

        /*
         多行注释1
         多行注释2
         多行注释3
         多行注释...
         多行注释N

         多行注释: 和单行注释类似,但是可以注释多行,但是不可以嵌套
             |- 嵌套会使最开始的 `/*` 提前闭合而导致最后的 `*\/` 没有对应的 `/*` 匹配,从而无法闭合
             |- 在实际开发中: 多行注释通常会出现在代码的文件头(License) 位置,表示该文件的版权信息,作者信息等

         */
        System.out.println("Hello Java!");

        /**
         * 文档注释
         * |- 文档注释: 通常在是注释类或方法的时候使用,当然在方法内使用的时候也有(比如:当前注释),不过很少,在一些祖传代码中还能见到
         * |- 比如: `main` 方法的注释,以及 `Comments` 类本身的注释
         */
        System.out.println("Hello Yuchun!");
    }
}
