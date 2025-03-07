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

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * {@code ControlFlowsTest}.
 *
 * @author photowey
 * @version 1.0.0
 * @since 2025/03/02
 */
class ControlFlowsTest {

    public enum Color {
        RED,
        GREEN,
        BLUE
    }

    private Random random;

    @BeforeEach
    void init() {
        this.random = new SecureRandom();
    }

    @Test
    void testControlFlows() {
        this.tryIf();
        this.trySwitch();

        this.tryFor();

        this.tryWhile();
        this.tryDoWhile();
    }

    private void tryIf() {
        ifCtrl();

        String rvtA = ifElseCtrl1(96);
        System.out.println("ifElseCtrl1(96) 结果为:" + rvtA);
        String rvtB = ifElseCtrl2(88);
        System.out.println("ifElseCtrl2(88) 结果为:" + rvtB);
        // 多判断 -> 首推: Happy Path 风格
        String rvtC = ifElseCtrl3(77);
        System.out.println("ifElseCtrl3(77) 结果为:" + rvtC);
        String rvtD = ifNestedCtrl(66);
        System.out.println("ifNestedCtrl(66) 结果为:" + rvtD);
    }

    // ----------------------------------------------------------------

    private void ifCtrl() {
        if (1 != 2) {
            System.out.println("表达式: 1 != 2 为真");
            return;
        }

        System.out.println("表达式: 1 != 2 为假");
    }

    private String ifElseCtrl1(int score) {
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

    private String ifElseCtrl2(int score) {
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

    private String ifElseCtrl3(int score) {
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

    private String ifNestedCtrl(int score) {
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

    private void checkScore(int score) {
        if (score > 100 || score < 0) {
            throw new IllegalArgumentException("score must be between 0 and 100");
        }
    }

    // ----------------------------------------------------------------

    private void trySwitch() {
        // 数值类型 (byte | short | int | ...)
        int status = 1;
        this.numberSwitch(status);

        // 字符串类型
        this.stringSwitch();

        // 字符类型
        this.charSwitch();

        // 枚举类型
        this.enumSwitch();

        // 穿透
        this.throughSwitch(status);
        this.monthSwitch();
    }

    private void numberSwitch(int status) {
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
    }

    private void stringSwitch() {
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
    }

    private void charSwitch() {
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
    }

    private void enumSwitch() {
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

    private void throughSwitch(int status) {
        switch (status) {
            case 1:
            case 2:
            case 4:
                System.out.println("status: 1|2|4");
                break;
            case 8:
                System.out.println("status: 8");
                break;
            default:
                System.out.println("status: default");
                break;
        }
    }

    private void monthSwitch() {
        int month = this.random.nextInt(12);

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("什么情况,你家有这个月份?");
        }
    }

    private void tryFor() {
        // 1.语法
        this.forGrammars();
        // 2.案例
        this.forExamples();
    }

    private void forGrammars() {
        // 正向 for-i 循环
        for (int i = 0; i < 10; i++) {
            System.out.println("正向: i: " + i);
        }

        // 反向(逆向) for-i 循环
        for (int i = 10; i >= 0; i--) {
            System.out.println("逆向: i: " + i);
        }

        // 死循环
        /*
        for (; ; ) {
            // do something.
        }
        */

        List<Integer> list = java.util.Arrays.asList(1, 2, 4, 8, 16);

        // 遍历列表
        for (int i = 0; i < list.size(); i++) {
            System.out.println("for 遍历列表: list_i: " + list.get(i));
        }

        // 增强 for 遍历列表
        for (Integer i : list) {
            System.out.println("增强 for 遍历: list_i: " + i);
        }

        Iterator<Integer> iterator = list.iterator();
        // 遍历迭代器 1
        for (Iterator<Integer> it = iterator; it.hasNext(); /**/) {
            Integer i = it.next();
            System.out.println("for 遍历: list_i: " + i);
        }
    }

    private void forExamples() {
        // 1.遍历列表
        // 思考: 为什么这儿需要再次 new ArrayList<>(...) ? 而不是直接使用 Arrays.asList(...) ?
        List<String> list = new ArrayList<>(
            java.util.Arrays.asList("1", "2", "4", "8", "16", "32", "64", "128", "256", "512",
                "1024"));

        System.out.println("列表元素:" + list);

        // 1.1.for-i
        for (int i = 0; i < list.size(); i++) {
            System.out.println("for 遍历列表: list_i: " + list.get(i));
        }
        // 1.2.增强 for
        for (String i : list) {
            System.out.println("增强 for 遍历: list_i: " + i);
        }

        // ----------------------------------------------------------------

        // 2.经典错误
        // 2.1.在循环体内直接删除列表元素
        // 正向循环: for-i 循环
        for (int i = 0; i < list.size(); i++) {
            String item = list.get(i);
            if ("8".equals(item)) {
                list.remove(i);
            }
        }
        System.out.println("正向 for-i 循环: 删除 8，剩余列表元素:" + list);

        // 正向循环: 增强 for 循环
        List<String> list2 = new ArrayList<>(
            java.util.Arrays.asList("1", "2", "4", "8", "16", "32", "64", "128", "256", "512",
                "1024"));
        for (String item : list2) {
            if ("64".equals(item)) {
                // Exception in thread "main" java.util.ConcurrentModificationException
                //list2.remove(item);
            }
        }
        // System.out.println("正向增强 for 循环: 删除 64，剩余列表元素:" + list2);

        // 思考?
        // 为什么在正向循环体内删除元素可能会报错?

        // 3.正确遍历:
        // |- 采用逆向循环
        // |- |- 在循环体内删除列表元素
        List<String> list3 = new ArrayList<>(
            java.util.Arrays.asList("1", "2", "4", "8", "16", "32", "64", "128", "256", "512",
                "1024"));
        for (int i = list3.size() - 1; i >= 0; i--) {
            String item = list3.get(i);
            if ("128".equals(item)) {
                list3.remove(i);
            }
        }
        System.out.println("逆向循环: 删除 128，剩余列表元素:" + list3);
    }

    private void tryWhile() {
        // 1.语法
        this.whileGrammars();
        // 2.示例
        this.whileExamples();
    }

    private void whileGrammars() {
        // 1.死循环
        // |- while-true 即可实现死循环
        // |- |- 代码永远退出不了循环一直执行,知道程序停止(比如:进程被杀死)
        // |- |- 死循环还可能造成: 内存溢出, CPU 暴增等情况
        // 1.1.代码中尽量避免直接使用死循环
        // 1.2.在特定场景下我们也可以利用这一特性
        // |- |- 比如: 死循环 + 线程休眠,实现定时任务
        /*
        while (true) {
            // do something.
        }
        */

        // 2.普通循环
        // 2.1.循环表达式
        boolean expression = this.determineWhileConditionExpression();
        int count = 0;
        while (expression) {
            int nexted = this.random.nextInt(100);
            if (0 == nexted % 2) {
                // 2.2.通过 break 关键字跳出循环
                break;
            }
            count++;
            System.out.println("循环次数:" + count);
        }

        // 3.while 遍历迭代器
        List<Integer> list = java.util.Arrays.asList(1, 2, 4, 8, 16);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            System.out.println("while 遍历: list_i: " + i);
        }
    }

    private void whileExamples() {
        // 在循环体中删除元素
        List<String> list = new ArrayList<>(
            Arrays.asList("1", "2", "4", "8", "16", "32", "64", "128", "256", "512", "1024"));

        // list.removeIf("128"::equals);
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if ("128".equals(item)) {
                iterator.remove();
            }
        }

        System.out.println("while 循环: 删除 128，剩余列表元素:" + list);
    }

    private void tryDoWhile() {
        // 1.语法
        this.doWhileGrammar();
        // 2.示例
        this.doWhileExamples();
    }

    private void doWhileGrammar() {
        int times = 0;
        do {
            System.out.println("times: 当前执行的循环次数: [" + times + "]");
            times++;
        }
        while (times <= 10);

        int retryTimes = 11;
        do {
            System.out.println("retryTimes: 当前执行的循环次数: [" + times + "]");
            retryTimes++;
        }
        while (retryTimes <= 10);
    }

    private void doWhileExamples() {
        int retryTimes = 0;
        do {
            try {
                asyncCall(retryTimes);
                break;
            } catch (Exception ignoted) {
                // do something.
            }

            retryTimes++;
        }
        while (retryTimes <= 3);
    }

    private void asyncCall(int retryTimes) {
        System.out.println("asyncCall: 当前执行的循环次数: [" + retryTimes + "]");
        if (this.random.nextBoolean()) {
            throw new RuntimeException("asyncCall failed.");
        }
    }

    private boolean determineWhileConditionExpression() {
        return true;
    }

}
