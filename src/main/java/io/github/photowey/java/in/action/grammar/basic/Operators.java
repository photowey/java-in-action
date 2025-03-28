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
 * {@code Operators}.
 * 运算符
 *
 * @author photowey
 * @version 1.0.0
 * @since 2025/02/16
 */
public class Operators {

    /**
     * 1.进制
     * |- 世界上只有 10 种人
     * 2.进制转换
     * 3....
     *
     * @param args 参数列表
     */
    public static void main(String[] args) {
        // 1.进制 - 了解
        base();
        // 2.进制转换 - 了解
        baseConversion();

        // 3.位运算 - 了解
        bitwiseOperation();
    }

    /**
     * 进制
     * |- 二进制 - 计算机常用
     * |- 0,1
     * |- 八进制
     * |- 0,1,2,3,4,5,6,7
     * |- 十进制 - 现实世界常用
     * |- 0,1,2,3,4,5,6,7,8,9
     * |- 十六进制
     * |- 0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F
     */
    private static void base() {
        // 1.二进制 - 10
        String binary = "1010";
        // 1.八进制 - 10
        String octal = "12";
        // 1.十进制 - 10
        String decimal = "10";
        // 1.十六进制 - 10
        String hexadecimal = "A";
    }

    /**
     * 进制转换
     * 1.二进制 -> 十进制
     * |- 8421 规则
     * |- |- 以 4 位二进制为例 1010 -> 10 - (多位数直接按照地推公式计算即可)
     * |- |- 从右往左
     * |- |- -> 第 1 位对应着(2^(1-1) == 1)
     * |- |- -> 第 2 位对应着(2^(2-1) == 2)
     * |- |- -> 第 3 位对应着(2^(3-1) == 4)
     * |- |- -> 第 4 位对应着(2^(4-1) == 8)
     * |- |- 由此: 得到 8421 规则
     * |- |- -> 将第 N 位二进制对应数值(0 或者 1) 乘以 `2^(N-1) N >=1` 然后求和即可得到十进制值
     * |- |- 示例:
     * |- |- 1010 -> 从右往左 0 1 0 1 -> 0 * 2^(1-1) + 1 * 2^(2-1) + 0 * 2^(3-1) + 1 * 2^(4-1) = 10
     * |- |- -> 0 + 2 + 0 + 8 = 10
     * 2.十进制 -> 二进制
     * |- 辗转相除取余数
     * |- |- 举例 10 -> 1010
     * |- |- 10 / 2 = 5 余数 0
     * |- |- 5 / 2 = 2 余数 1
     * |- |- 2 / 2 = 1 余数 0
     * |- |- 1 / 2 = 0 余数 1
     * -> 通过“回溯” -> 自下而上 -> 1010
     * 3.十进制 -> 八进制
     * |- 思路同二进制
     * 4.八进制 -> 十进制
     * |- 同上
     * 5.十进制 -> 十六进制
     * 6.十六进制 -> 十进制
     * 7.十六进制 -> 二进制
     * 8.二进制 -> 十六进制
     * |- 每 4 位二进制位为 1 组,不足 4 位在其左边补 0
     * |- |- -> 将其计算出来的十进制数值与 16 进制的数值进行映射即可得到十六进制
     * |- 10100010 -> 1010 0010
     * |- |- 1010 -> 10
     * |- |- 0010 -> 2
     * |- |- 10 2
     * |- |- 10 - 十六进制 - A
     * |- |- 2 - 十六进制 - 2
     * |- |- A2
     * 9.二进制 -> 八进制
     * |- 思路同二进制转十六进制
     * |- 每 3 位二进制位为 1 组,不足 3 位在其左边补 0
     * |- 100010 -> 111 010
     * |- |- 111 - 八进制 - 7
     * |- |- 010 - 八进制 - 2
     * |- |- 72
     * 10.八进制 -> 二进制
     * 11.八进制 -> 十六进制
     * 12.十六进制 -> 八进制
     * ...
     */
    private static void baseConversion() {
        // 1.二进制 -> 十进制
        binary2Decimal();
        // 2.十进制 -> 二进制
        decimal2Binary();

        separator();
    }

    // ----------------------------------------------------------------

    // @formatter:off

    /**
     * 位运算
     * 1.运算符
     * |- & 按位与 -       当两位同时为 1 才返回 1
     * |- | 按位或 -       只要有 1 位为 1 则返回 1
     * |- ~ 按位非 -       将操作数的每个位(包括符号位)全部取反
     * |- ^ 按位异或 -     当两位相同时返回为 0, 不同时返回 1
     * |- << 左移 -        向左移动 N 位, 右侧用 0 填充
     *                    -> 对于数据 x 向左移动 N 位 -> 可以理解位: x * 2^N (假设: 数据左移后没有溢出)
     *                    -> 0011 << 2 -> 1100 -> 8 + 4 + 0 + 0 == 12 == 3 * (2^2)
     * |- >> 右移 -        向右移动 N 位, 对于有符号数,左侧会使用最左边的位(即符号位)的值来填充.
     *                    -> 这意味着如果数是负数,左侧填充 1; 如果是正数,则填充 0
     *                    -> 算术右移
     * |- >>> 无符号右移 - 向右移动 N 位
     *                    -> 逻辑右移
     *                    -> 与算术右移不同的是,它总是用 0 填充左侧,不论原数据的符号如何
     */
    // @formatter:on
    private static void bitwiseOperation() {
        /*
            知识点:
            1.我们要知道计算机在存储数据的时候都是存储的数据的补码,计算也是用的数据的补码
            但是我们最终看到的结果是原码换算出来的

            2.正数二进制最高位为 0; 负数二进制最高位为 1

            3.原码 反码 补码
            3.1.如果是正数 - 原码 反码 补码 一致
            |- 0000 0000 0000 0000 0000 0000 0000 0101 -> 因为是正数, 二进制最高位为 0
            3.2.如果是负数 - 原码 反码 补码 不一致
            -> 反码是原码的基础上最高位不变,剩下的 0 和 1 互换
            -> 补码是在反码的基础上 + 1
            比如: -9
               原码: 1000 0000 0000 0000 0000 0000 0000 1001 - 负数: 高位为 1
               反码: 1111 1111 1111 1111 1111 1111 1111 0110 - 高位不变,其余取反
               补码: 1111 1111 1111 1111 1111 1111 1111 0111 - 反码 + 1

           正数的补码就是其二进制形式。
           -> 负数的补码是通过以下步骤得到的
                - 先写出该负数绝对值的二进制表示
                - 对每一位取反(即求反码) - 包括符号位
                - 在反码的基础上 + 1
        */

        // 1.按位与
        bitwiseAnd();

        // 2.按位或
        bitwiseOr();

        // 3.按位非
        bitwiseNot();

        // 4.按位异或
        bitwiseXor();

        // 5.左移
        leftShift();

        // 6.右移
        rightShift();

        // 7.无符号右移
        unsignedRightShift();
    }

    /**
     * 按位与
     */
    private static void bitwiseAnd() {
        // 概念: 当两位同时为 1 才返回 1
        // 10 = 8 + 2
        // 0000 1010
        int x = 10;
        // 5 = 4 + 1
        // 0000 0101
        int y = 5;
        // ----------------------------------------------------------------
        //   0000 1010
        // & 0000 0101
        // ---------------- 完美错过对方
        //   0000 0000
        int z = x & y;
        System.out.println("按位与: 10 & 5 = " + z);
        // ----------------------------------------------------------------
        // 5 = 4 + 1
        // 0000 0101
        int x5 = 5;
        // 20 = 16 + 4
        // 0001 0100
        int x20 = 20;
        //   0000 0101
        // & 0001 0100
        // ---------------- (4 + 1) 与 (16 + 4) 有相同数 4 -> 0100
        //   0000 0100
        int x5_20 = x5 & x20;

        System.out.println("按位与: 5 & 20 = " + x5_20);

        separator();
    }

    private static void bitwiseOr() {
        // 概念: 只要有 1 位为 1 则返回 1
        // 10 = 8 + 2
        // 5 = 4 + 1
        int x = 10;
        int y = 5;
        // ----------------------------------------------------------------
        //   0000 1010
        // | 0000 0101
        // ---------------- 低 4 位完美互补
        //   0000 1111 - 8 + 4 + 2 + 1 = 5
        int z = x | y;
        System.out.println("按位或: 10 | 5 = " + z);
    }

    private static void bitwiseNot() {
        // 概念: 将操作数的每个位(包括符号位)全部取反
        // ~0 == 1
        // ~1 == 0

        System.out.println("按位非: ~0 = " + ~0);
        System.out.println("按位非: ~1 = " + ~1);

        // 5 = 4 + 1
        // 0000 0101
        // ----------------------------------------------------------------
        // 0 000 0000 ... 0000 0101
        // 1 111 1111 ... 1111 1010
        int x5 = 5;
        System.out.println("按位非: ~5 = " + ~x5);
        // ----------------------------------------------------------------
        // 20 = 16 + 4
        // 0 000 0000 ... 0001 0100

        // 计算 -20 补码
        // 反码: 1 111 1111 ... 1110 1011
        // 补码: 反码 + 1 == 1 111 1111 ... 1110 1011 + 1 == 1 111 1111 ... 1110 1100
        // ----------------------------------------------------------------
        // 计算: ~(-20)
        // 再取反: 1 111 1111 ... 1110 1100 -> 0 000 0000 ... 0001 0011
        // 转化为十进制: 0 + ... + 16 + 0 + 0 + 3 + 1 = 19

        // 公式: ~x = -(x + 1)
        // ~(5) = -(5 + 1) = -6
        // -> ~(-20) = -(-20 + 1) = -(-19) = 19 == |x| - 1 = 20 - 1 == 19

        int x20 = -20;
        System.out.println("按位非: ~(-20) = " + ~x20);
    }

    private static void bitwiseXor() {
        // 当两位相同时返回为 0, 不同时返回 1

        // 5 = 4 + 1
        // 0000 0000 ... 0000 0101
        int x5 = 5;
        // 20 = 16 + 4
        // 0 000 0000 ... 0001 0100
        int x20 = 20;
        // ----------------------------------------------------------------
        //   0000 0101
        // ^ 0001 0100
        // ----------------
        //   0001 0001 - 17
        int x5_20 = x5 ^ x20;
        System.out.println("按位异或: x5 ^ x20 = " + x5_20);
    }

    private static void leftShift() {
        // 向左移动 N 位, 右侧用 0 填充

        // 0000 0101
        int x5 = 5;
        int m3 = 3;

        //    000|0000 0101
        // 000|001 0 1|000 = 32 + 8 == 40 == 5 * (2^3) == 5 * 8 = 40
        int x5_3 = x5 << m3;

        System.out.println("5 向左移动 3 位: 5 << 3 = " + x5_3);
    }

    private static void rightShift() {
        // 向右移动 N 位, 对于有符号数,左侧会使用最左边的位(即符号位)的值来填充
        // 这意味着如果数是负数,左侧填充 1; 如果是正数,则填充 0

        // 正数情况
        int x40 = 40;
        int m3 = 3;

        // 0010 1000
        // 0xxx ... 000|00101 = 4 + 1 == 5 == 40 / (2^3) == 40 / 8 == 5
        // 高位补 0
        int x40_3 = x40 >> m3;
        System.out.println("40 向右移动 3 位: 40 >> 3 = " + x40_3);

        // ----------------------------------------------------------------

        // 负数情况
        // 有符号右移动
        // 1111 1111 1111 1111 1111 1111 1111 0111
        int x_9 = -9;
        int m4 = 4;

        // 1xxx | 1111 1111 1111 1111 1111 1111 1111 || 0111
        // 高位补 1
        // -1
        int x_9_4 = x_9 >> m4;

        System.out.println("-9 向右移动 4 位: -9 >> 4 = " + x_9_4);
    }

    private static void unsignedRightShift() {
        // 无符号右移
        // // 1111 1111 1111 1111 1111 1111 1111 0111
        int x9_ = -9;
        int m4_ = 4;
        // 0xxx | 1111 1111 1111 1111 1111 1111 1111 || 0111
        // 0000|1111111111111111111111111111 == (2^28 -1)
        // 268435455
        int x_9_4_ = x9_ >>> m4_;
        System.out.println("-9 向右移动(无符号) 4 位: -9 >>> 4 = " + x_9_4_);
        System.out.println(268435455 == ((1 << 28) - 1));
    }

    // ----------------------------------------------------------------

    private static void decimal2Binary() {
        int decimal = 10;
        int binary = 0;
        int index = 0;

        while (decimal > 0) {
            int remainder = decimal % 2;
            binary += (int) (remainder * Math.pow(10, index));
            decimal /= 2;
            index++;
        }

        System.out.println("十进制 -> 二进制: " + binary);
    }

    private static void binary2Decimal() {
        int binary = 1010;
        int decimal = 0;
        int index = 0;

        while (binary > 0) {
            int remainder = binary % 10;
            decimal += (int) (remainder * Math.pow(2, index));
            binary /= 10;
            index++;
        }

        System.out.println("二进制 -> 十进制: " + decimal);
    }

    private static void separator() {
        System.out.println("----------------------------------------------------------------");
    }
}
