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

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * {@code ControlFlow}.
 *
 * @author photowey
 * @version 1.0.0
 * @since 2025/02/16
 */
public class ControlFlows {

    public static void main(String[] args) {
        onIfCtrl();
        onSwitchCtrl();
        onForCtrl();
        onWhileCtrl();
    }

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
    private static void onIfCtrl() {
        ifCtrl();
        String resultA = ifElseCtrl1(96);
        String resultB = ifElseCtrl2(88);
        // 多判断 -> 首推: Happy Path 风格
        String resultC = ifElseCtrl3(77);
        String resultD = ifNestedCtrl(66);
    }

    // ----------------------------------------------------------------

    private static void ifCtrl() {
        if (1 != 2) {
            System.out.println("表达式: 1 != 2 为真");
            return;
        }

        System.out.println("表达式: 1 != 2 为假");
    }

    private static String ifElseCtrl1(int score) {
        checkScore(score);

        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "E";
        }
    }

    private static String ifElseCtrl2(int score) {
        checkScore(score);

        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        }

        return "E";
    }

    private static String ifElseCtrl3(int score) {
        checkScore(score);

        // 采用 Happy Path 风格
        if (score >= 90) {
            return "A";
        }
        if (score >= 80) {
            return "B";
        }
        if (score >= 70) {
            return "C";
        }
        if (score >= 60) {
            return "D";
        }

        return "E";
    }

    private static String ifNestedCtrl(int score) {
        checkScore(score);

        if (score >= 90) {
            if (score >= 95) {
                return "A++";
            }
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        }

        return "E";
    }

    private static void checkScore(int score) {
        if (score > 100 || score < 0) {
            throw new IllegalArgumentException("score must be between 0 and 100");
        }
    }

    // ----------------------------------------------------------------

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
     */
    private static void onSwitchCtrl() {
        // 数值类型
        int status = 1;
        switch (status) {
            case 0:
                System.out.println("status: 0");
                break;
            case 1:
                System.out.println("status: 1");
                break;
            case 2:
                System.out.println("status: 2");
                break;
            default:
                System.out.println("status: default");
                break;
        }

        // 字符串类型
        String color = "RED";
        switch (color) {
            case "RED":
                System.out.println("color: RED");
                break;
            case "GREEN":
                System.out.println("color: GREEN");
                break;
            case "BLUE":
                System.out.println("color: BLUE");
                break;
            default:
                System.out.println("color: default");
                break;
        }

        char ch = 'A';
        switch (ch) {
            case 'A':
                System.out.println("char: RED");
                break;
            case 'D':
                System.out.println("char: GREEN");
                break;
            case 'C':
                System.out.println("char: BLUE");
                break;
            default:
                System.out.println("char: default");
                break;
        }

        // 枚举类型
        Color colorEnum = Color.RED;
        switch (colorEnum) {
            case RED:
                System.out.println("color Enum: RED");
                break;
            case GREEN:
                System.out.println("color Enum: GREEN");
                break;
            case BLUE:
                System.out.println("color Enum: BLUE");
                break;
            default:
                System.out.println("color Enum: default");
                break;
        }
    }

    private static void onForCtrl() {
        // 正向 for-i 循环
        for (int i = 0; i < 10; i++) {
            System.out.println("i: " + i);
        }

        // 反向 for-i 循环
        for (int i = 10; i >= 0; i--) {
            System.out.println("i: " + i);
        }

        List<Integer> list = Arrays.asList(1, 2, 4, 8, 16);

        // 遍历列表
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list_i: " + list.get(i));
        }

        // 增强 for 遍历列表
        for (Integer i : list) {
            System.out.println("list_i: " + i);
        }

        Iterator<Integer> iterator = list.iterator();
        // 遍历迭代器 1
        /*for (Integer i : iterator) {
            System.out.println("list_i: " + i);
        }*/

        // 遍历迭代器 2
        for (Iterator<Integer> it = iterator; it.hasNext(); ) {
            Integer i = it.next();
            System.out.println("list_i: " + i);
        }
    }

    private static void onWhileCtrl() {
        // TODO 待完善
    }

    // ----------------------------------------------------------------

    public enum Color {
        RED,
        GREEN,
        BLUE
    }
}
