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

import lombok.extern.slf4j.Slf4j;

/**
 * {@code ControlFlow}.
 * |- 流程控制
 * |- {@code if}
 * |- {@code switch}
 * |- {@code for}
 * |- {@code while}
 *
 * @author photowey
 * @version 1.0.0
 * @since 2025/02/16
 */
@Slf4j
public class ControlFlows {

    public static void main(String[] args) {
        // 语法介绍
        ifCtrl();
        switchCtrl();
        forCtrl();
        whileCtrl();

        // 具体实现见:
        // @see io.github.photowey.java.in.action.grammar.basic.ControlFlowsTest
    }

    // ----------------------------------------------------------------

    /**
     * {@code if} 条件判断
     * <pre>
     * // `条件表达式` 的值必须为布尔值 {@code boolean} true|false
     * |- 单值表达式: true|false
     * |- 复合表达式: 1 != 2 | A <= x && x <= B | ...
     * |- 嵌套表达式: if (determineIsOk(...)) {...}
     * |- |- Objects.isNull(...) | Collections.isEmpty(...) | ...
     * |- |- 表达式是为一个返回 {@code boolean} 值的函数
     *
     * // |- 支持: if-else-if-...-else 多分支
     * // |- 支持: if 内部嵌套 if -> 通常不要超过 3 层
     * if (条件表达式1) {
     *     语句1
     *     语句...
     *     if (条件表达式2) {
     *         语句1
     *     } else if (条件表达式3) {
     *         语句...
     *     } else {
     *         语句...
     *     }
     *     ...
     *     语句N
     * }
     * </pre>
     */
    private static void ifCtrl() {
        // do nothing now.
    }

    /**
     * {@code Switch} 流程控制
     * <pre>
     *     switch (表达式) {
     *         case 常量1:
     *             执行语句 1;
     *             break;
     *         case 常量2:
     *             执行语句 2;
     *             break;
     *         case 常量...:
     *             执行语句 ...;
     *             break;
     *         case 常量N:
     *             执行语句 N;
     *             break;
     *         default:
     *             执行语句 x;
     *             break;
     *     }
     * </pre>
     * NOTES:
     * 1.用变量接收的值和下面 case 后面的常量值匹配,匹配上哪个 case 就执行哪个 case 对应的执行语句
     * |- 如果以上所有 case 都没有匹配上,就走 default 对应的执行 语句n
     * 2.break 关键字
     * |- 代表的是结束 switch 语句
     * 3.匹配的类型
     * byte | short | int | char | 枚举类型 | String 类型
     * 4.穿透性
     * |- 如果没有 break,就会出现 case 的穿透性
     * |- |- 程序就一直往下穿透执行,直到遇到了 break 或者 switch 代码执行完才停止
     * 4.1.case 穿透性特性的使用与避免
     * |- |- 利用穿透性特点:
     * |- |- |- 1.多个 case 均执行的是同样的逻辑,则可以利用穿透的特性,只在最后一个 case 写 break 即可
     * |- |- 避免:
     * |- |- |- 1.应该尽量为每个 case 均添加 break 语句
     */
    private static void switchCtrl() {
        // do nothing now.
    }

    private static void forCtrl() {

    }

    private static void whileCtrl() {

    }

    // ----------------------------------------------------------------

    public enum Color {
        RED,
        GREEN,
        BLUE
    }
}
