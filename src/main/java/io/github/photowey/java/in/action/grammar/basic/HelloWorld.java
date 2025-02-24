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
 * {@code HelloWorld}.
 * |- {@code Java} 语言 {@code HelloWorld} 示例
 * |- 学习任何一门语言都是从 {@code HelloWorld} 开始
 * 注意事项:
 * <pre>
 *   1.类名要和 `java` 文件名保持一致
 *   2.程序中的标点符号必须是英文的 -> 写代码的时候一定要注意 **输入法**(否则找 BUG 到哭哟 /(ㄒoㄒ)/~~, 怕不怕?)
 *   3.不要将 `main` 写成 `mian`
 *   4.System 和 String 的首字母 s 要大写
 *   5.每个单词写完来个空格增强代码的可读性
 *   6.括号要一对一对的写
 *   7.代码写完语句用 `;` 代表结束了. 一句话来个分号,证明这是一个单独的语句
 * </pre>
 *
 * @author photowey          // 该文件: 作者(可以有多个)
 * @author photowey_dummty_1
 * @author photowey_dummty_2
 * @author photowey_dummty_...
 * @author photowey_dummty_N
 * @version 1.0.0            // 当前工程: 版本号
 * @since 2025/02/16         // 文件创建时间或版本号 || @since v1.0.0 || @since 1.0.0
 */
public class HelloWorld {

    /**
     * 程序入口
     * |- jvm 执行代码,会从 `main` 方法开始执行
     * |- 通常可以通过 `—D` 进行传参
     * |- |- `-Dspring.profiles.active=dev`
     * |- |- `-Dproject.name=java-in-action`
     * |- |- `$ java -Dproject.name=java-in-action -jar helloworld.jar`
     *
     * @param args 参数列表
     */
    public static void main(String[] args) {
        // 调用: 内部静态方法
        sayHello();
    }

    /**
     * 打印 `Hello World!`
     */
    private static void sayHello() {
        // `System.out.println` 打印语句(输出语句)
        // 会将我们想要输出的内容打印到控制台上

        // 其中: `println` 自动换行
        System.out.println("Hello World!");
        // 其中: `print` 手动换行
        System.out.print("Hello Java!\n");
        // 其中: `printf` 可以通过占位符进行格式化输出
        System.out.printf("Hello %s!\n", "Yuchun");
    }
}
