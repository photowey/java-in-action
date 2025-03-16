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
    }

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
}
