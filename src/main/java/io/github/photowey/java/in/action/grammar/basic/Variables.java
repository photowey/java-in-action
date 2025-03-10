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

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.core.annotation.AliasFor;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.math.BigDecimal;
import java.util.Arrays;

/**
 * {@code Variables}.
 * 1.常量
 * |- 1.1.概念
 * |- |- 在代码的运行过程中,值不会发生改变的数据
 * |- |- |- 值不会改变
 * |- 1.2.分类
 * |- |- 1.2.1.整数常量 - 所有整数
 * |- |- 1.2.2.小数常量 - 所有带小数点的数字
 * |- |- 1.2.3.字符常量 - 所有单引号包裹的字符 - '0', 'A', ...
 * |- |- 1.2.4.字符串常量 - 所有双引号包裹的字符串 - "Hello World!"
 * |- |- 1.2.5.布尔常量 - true(真), false(假) - 切记不要用单音号或双引号 -> 将变成字符或字符串
 * |- |- 1.2.6.空常量 - null -> 代表数据或值不存在
 * 2.变量
 * |- 2.1.概念
 * |- |- 在代码的运行过程中,值会随着不同的情况而随时发生改变的数据
 * |- 2.2.类型
 * |- 2.2.1.基本数据类型(4类8种)
 * |- |- 整型 - byte | short | int | long
 * |- |- 浮点型 - float | double
 * |- |- 字符型 - char
 * |- |- 布尔型 - boolean -> true(真), false(假)
 * |- 2.2.2.引用数据类型
 * |- |- 类,接口,数组,枚举,注解,...
 * |- 2.3.作用
 * |- |- 2.3.1.一次接受一个数值
 * |- |- 2.3.2.使用场景: 需要定义一个变量来接受一个值,且后续可能会根据不同的情况对该值进行修改 -> 考虑使用 "变量"
 * |- |— |- 值会改变
 * |- 2.4.定义
 * |- |- 2.4.1.格式
 * |- |- |- 1.数据类型 变量名 = 数值;
 * |- |- |- 2.数据类型 变量名;
 * |- |-     变量名 = 数值;
 * |- |- |- 3.数据类型 变量名1,变量名2,变量名3,...,变量N;
 * |- |-     变量名1 = 数值1;
 * |- |-     变量名2 = 数值2;
 * |- |-                ...;
 * |- |-     变量名N = 数值N;
 * |- |- |- 4.数据类型 变量名1=数值1,变量名2=数值2,变量名3=数值3,...,变量N=数值N;
 * // ----------------------------------------------------------------
 * 赋值:
 * x = y; -> 将数值 y 赋值给变量 x
 * -> 数据类型 变量名1=数值1;
 * -> 读法: (从右至左) - 将数据类型为 [数据类型] 的数据值 [数值1] 赋值给 [数据类型] 类型的变量 [变量名1]
 * // ----------------------------------------------------------------
 * |- 2.5.注意事项
 * 2.5.1.字符串(String) 不是`基本数据类型`是`引用类型`
 * |- |- String 是一个类,在定义的时候可以和基本数据类型 `格式` 一样
 * |- |- |- String x = "Hello world~";
 *
 * @author photowey
 * @version 1.0.0
 * @since 2025/02/16
 */
public class Variables {

    public static void main(String[] args) {
        // 1.常量
        constant();
        // 2.变量
        variable();
    }

    /**
     * 常量
     * 1.分类
     * |- 整数常量 - 所有整数
     * |- 小数常量 - 所有带小数点的数字
     * |- 字符常量 - 所有单引号包裹的字符 - '0', 'A', ...
     * |- 字符串常量 - 所有双引号包裹的字符串 - "Hello World!"
     * |- 布尔常量 - true(真), false(假) - 切记不要用单音号或双引号 -> 将变成字符或字符串
     * |- 空常量 - null -> 代表数据或值不存在
     * 2.关键字
     * |- 用 final 关键字修饰
     */
    public static void constant() {
        // 1.整数常量
        final long longValue = 1001001000110086L;
        final int intValue = 10;

        // 2.小数常量
        final double doubleValue = 10.24D;
        final float floatValue = 3.14F;

        // 3.字符常量
        final char charValue = 'A';

        // 4.字符串常量
        final String stringValue = "Hello World!";

        // 5.布尔常量
        final boolean trueValue = true;
        final boolean falseValue = false;

        // 6.空常量
        final Object objectNullValue = null;
        final String stringNullValue = null;
        final Boolean booleanNullValue = null;
        final Long longNullValue = null;
        final Integer intNullValue = null;
        final Season seasonNullValue = null;
    }

    private static void variable() {
        // 1.基本数据类型
        basicVariable();
        // 2.引用数据类型
        pointerVariable();
    }

    /**
     * 基本数据类型
     * |- 整型 - byte | short | int | long
     * |- |- byte -> 8位 -> 1字节 -> -128 ~ 127
     * |- |- short -> 16位 -> 2字节 -> -32768 ~ 32767
     * |- |- int -> 32位 -> 4字节 -> -2147483648 ~ 2147483647
     * |- |- long -> 64位 -> 8字节 -> -9223372036854775808 ~ 9223372036854775807
     * ----------------------------------------------------------------
     * |- 浮点型 - float | double
     * |- |- float -> 32位 -> 4字节 -> 1.4E-45 ~ 3.4028235E38
     * |- |- double -> 64位 -> 8字节 -> 4.9E-324 ~ 1.7976931348623157E308
     * ----------------------------------------------------------------
     * |- 字符型 - char
     * |- |- char -> 16位 -> 2字节 -> 0 ~ 65535
     * ----------------------------------------------------------------
     * |- 布尔型 - boolean -> true(真), false(假)
     * |- |- true(真), false(假)
     */
    private static void basicVariable() {
        // 1.整型
        // 字节型
        byte byteValue = 127;
        // 短整型
        short shortValue = 32767;
        // 整型(默认)
        int intValue = 2147483647;
        // 长整型
        long longValue = 9223372036854775807L;
        // 2.浮点型
        // 2.1.单精度
        float floatValue = 3.14F;
        // 2.2.双精度(默认)
        double doubleValue = 3.14D;

        // 3.字符型
        char charValue = 'A';

        // 4.布尔型
        // 通常用于条件判断
        boolean booleanValue = true;
    }

    /**
     * 引用类型
     * |- 类,接口,数组,枚举,注解,...
     */
    private static void pointerVariable() {
        // 1.类变量
        Season season = new Season(SeasonEnum.SPRING.wrap());

        // 2.接口
        // 2.1.指定实现
        PaymentApp alipayApp = new Alipay();
        // 2.2.匿名实现
        PaymentApp unknownApp = new PaymentApp() {

            @Override
            public String name() {
                return "Unknown";
            }

            @Override
            public boolean payment(BigDecimal amount) {
                return false;
            }
        };

        // 3.数组
        // 3.1.数值数组
        int[] intArray = new int[] {1, 2, 3, 4, 5};
        // 3.2.字符串数组
        String[] stringArray = new String[] {"Hello", "World"};
        // 3.3.对象数组
        Object[] objectArray =
            new Object[] {"HelloWorld", 10086, 3.14F, 8848.88D, 1000010001000110086L};
        // 类数组
        Season[] seasonArray = new Season[] {season};

        // 4.枚举
        SeasonEnum seasonEnum = SeasonEnum.SPRING;
        System.out.println("季节: name(): " + seasonEnum.name());
        System.out.println("季节: value(): " + seasonEnum.value());
        System.out.println("季节: wrap(): " + seasonEnum.wrap());
        System.out.println("季节: values(): " + Arrays.toString(SeasonEnum.values()));

        // 5.注解
        // 5.1.先不要关心为什么这样能获取到注解变量
        Version version = season.getClass().getAnnotation(Version.class);
        try {
            // 触发空指针 - Season 并没有被 @Version 注解修饰
            System.out.println("版本号: " + version.value());
        } catch (Exception ignored) {
            // ignored.
            // 如果不执行 try-catch -> 后面的代码将不会被执行
            // -> 异常将中断执行 -> 可以采用 try-catch 方式恢复(不再 rethrow 的情况)
        }

        PaymentApp wechatPayApp = new WechatPay();
        Version wechatPayAppVersion = wechatPayApp.getClass().getAnnotation(Version.class);
        System.out.println("PaymentApp 版本号: " + wechatPayAppVersion.value());
    }

    // ---------------------------------------------------------------- 类

    /**
     * {@code Season}
     * 季节类
     * ----------------------------------------------------------------
     * 以为下注解暂时不用管
     * |- @Data: 自动生成 getter/setter/toString/equals/hashCode 方法
     * |- @Builder: 自动生成 builder 方法
     * |- @NoArgsConstructor: 自动生成无参构造方法
     * |- @AllArgsConstructor: 自动生成全参构造方法
     */
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Season implements Serializable {

        private static final long serialVersionUID = -8916856688084656566L;

        private String name;
    }

    // ---------------------------------------------------------------- 接口

    /**
     * 定义支付 App
     */
    public interface PaymentApp {

        /**
         * 支付 App 名称
         *
         * @return App 名称
         */
        String name();

        boolean payment(BigDecimal amount);
    }

    /**
     * 支付宝
     */
    @Version("1.0.0")
    public static class Alipay implements PaymentApp {

        @Override
        public String name() {
            return "支付宝";
        }

        @Override
        public boolean payment(BigDecimal amount) {
            return true;
        }
    }

    /**
     * 微信支付
     */
    @Version(value = "1.1.0")
    public static class WechatPay implements PaymentApp {

        @Override
        public String name() {
            return "微信支付";
        }

        @Override
        public boolean payment(BigDecimal amount) {
            return true;
        }
    }

    /**
     * 银联云闪付
     */
    @Version(version = "2.0.0")
    public static class UnionPay implements PaymentApp {

        @Override
        public String name() {
            return "云闪付支付";
        }

        @Override
        public boolean payment(BigDecimal amount) {
            // 抛出异常: 表示暂不支持
            throw new UnsupportedOperationException("Unsupported now");
        }
    }

    // ---------------------------------------------------------------- 枚举

    /**
     * 季节枚举类
     */
    public enum SeasonEnum {

        // 季节枚举: 1: 春, 2:夏, 3:秋, 4:冬

        SPRING("春天", 1),
        SUMMER("夏天", 2),
        AUTUMN("秋天", 3),
        WINTER("冬天", 4);

        private final String name;
        private final int value;

        SeasonEnum(String name, int value) {
            this.name = name;
            this.value = value;
        }

        public String wrap() {
            return name;
        }

        public int value() {
            return value;
        }

        public static SeasonEnum valueOf(int value) {
            for (SeasonEnum season : SeasonEnum.values()) {
                if (season.value() == value) {
                    return season;
                }
            }

            // return null;
            throw new RuntimeException("Invalid Season value.");
        }
    }

    // ---------------------------------------------------------------- 注解

    /**
     * {@code Version} 注解
     */
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Version {

        /**
         * 版本号
         *
         * @return 版本号
         */
        String value() default "1.0.0";

        /**
         * 版本号
         *
         * @return 版本号
         */
        @AliasFor("value")
        String version() default "1.0.0";
    }
}
