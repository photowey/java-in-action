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
 * {@code Casts}.
 * 数据类型转换
 * |- 1.转换的时机
 * |- |- 1.1.等号(=)左右两边类型不一致
 * |- |- 1.2.不同类型的数据做运算
 * |- 2.分类
 * |- |- 2.1.自动类型转换
 * |- |- |- 将取值范围小的数据类型赋值给取值范围大的数据类型 -> 小自动转大
 * |- |- |- 取值范围小的数据类型和取值范围大的数据类型数据做运算 -> 小自动转大
 * |- |- 2.2.强制类型转换
 * |- |- |- 当将取值范围大的数据类型赋值给取值范围小的数据类型 -> 需要强转
 * |- |- |- 数值类型的顺序
 * |- |- |- |- byte,short,char -> int -> long -> float -> double
 * |- 3.注意事项
 * |- |- 3.1.不要随意写成强转的格式,因为会有精度损失问题以及数据溢出现象,除非没有办法
 * |- |- byte,short 定义的时候如果等号右边是整数常量,如果不超出 byte 和 short 的范围,不需要我们自己强转,jvm 自动转型
 * |- |- byte,short 如果等号右边有变量参与,byte 和 short 自动提升为 int,然后结果再次赋值给 byte 或者 short 的变量,需要我们自己手动强转
 * |- |- char 类型数据如果参与运算,会自动提升为 int 型,
 * |- |- -> 如果 char 类型的字符提升为 int 型会去 ASCII 码表范围内去查询字符对应的 int 值,
 * |- |- -> 如果在 ASCII 码表范围内没有对应的 int 值,会去 unicode 码表中找
 *
 * @author photowey
 * @version 1.0.0
 * @since 2025/03/12
 */
public class Casts {

    public static void main(String[] args) {
        // 1.向上转型
        upcasting();
        // 2.向下转型
        downcasting();
    }

    private static void upcasting() {
        // 等号右边: 520 为整数 -> 整数默认类型为: int
        // 等号左边: long 为长整型
        // -> 将取值范围小的数据类型(int)赋值给取值范围大的数据类型(long) -> 小自动转大
        long love = 520;
        System.out.println(love);

        // double = int + double
        // double = double + double
        // int 自动提升为 double -> 自动类型转换
        int age = 18;
        double height = 1.78;

        double sum = height + age;
        System.out.println(sum);
    }

    /**
     * 将取值范围大的数据类型赋值给取值范围小的数据类型
     * |- 格式: 取值范围小的数据类型 变量名 = 取值范围大的数据类型 -> 需要强转
     * 强转
     * |- 取值范围小的数据类型 变量名 = (取值范围小的数据类型)取值范围大的数据类型
     */
    private static void downcasting() {
        // 等号右边: 数据是小数,小数默认类型为 double
        // 等号左边: 变量是 float 型
        // float amount = 2.5;

        // 采用强转语法
        float amount = (float) 2.5;
        System.out.println(amount);

        // 精度损失
        int pi = (int) 3.14;
        System.out.println(pi);

        int j = (int) 10000000000L;
        // 1410065408
        System.out.println(j);

        // byte,short 定义的时候如果等号右边是整数常量
        byte b = 10;
        System.out.println(b);

        // byte,short 如果等号右边有变量参与
        b = (byte) (b + 1);
        System.out.println(b);

        // char 类型数据如果参与运算,会自动提升为 int 型
        char c = '中';
        // 20013
        System.out.println(c + 0);
    }

    public interface Animal {
        String name();
    }

    public static class Cat implements Animal {

        @Override
        public String name() {
            return "加菲猫";
        }
    }

    public static class Dog implements Animal {
        @Override
        public String name() {
            return "旺财";
        }
    }
}
