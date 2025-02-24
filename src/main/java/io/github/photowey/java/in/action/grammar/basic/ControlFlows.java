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
 * {@code ControlFlow}.
 *
 * @author photowey
 * @version 1.0.0
 * @since 2025/02/16
 */
public class ControlFlows {

    public static void main(String[] args) {
        onIfCtrl();
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
        String resultD = ifNestedCtrl(66);
    }

    private static void ifCtrl() {
        if (1 != 2) {
            System.out.println("表达式: 1 != 2 为真");
            return;
        }

        System.out.println("表达式: 1 != 2 为假");
    }

    private static String ifElseCtrl1(int score) {
        if (score > 100 || score < 0) {
            throw new IllegalArgumentException("score must be between 0 and 100");
        }

        if (score >= 90 && score <= 100) {
            return "A";
        } else if (score >= 80 && score <= 89) {
            return "B";
        } else if (score >= 70 && score <= 79) {
            return "C";
        } else if (score >= 60 && score <= 69) {
            return "D";
        } else {
            return "E";
        }
    }

    private static String ifElseCtrl2(int score) {
        if (score > 100 || score < 0) {
            throw new IllegalArgumentException("score must be between 0 and 100");
        }

        if (score >= 90 && score <= 100) {
            return "A";
        } else if (score >= 80 && score <= 89) {
            return "B";
        } else if (score >= 70 && score <= 79) {
            return "C";
        } else if (score >= 60 && score <= 69) {
            return "D";
        }

        return "E";
    }

    private static String ifNestedCtrl(int score) {
        if (score > 100 || score < 0) {
            throw new IllegalArgumentException("score must be between 0 and 100");
        }

        if (score >= 90 && score <= 100) {
            if (score >= 95) {
                return "A++";
            }
            return "A";
        } else if (score >= 80 && score <= 89) {
            return "B";
        } else if (score >= 70 && score <= 79) {
            return "C";
        } else if (score >= 60 && score <= 69) {
            return "D";
        }

        return "E";
    }
}
