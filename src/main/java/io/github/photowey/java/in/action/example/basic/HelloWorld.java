package io.github.photowey.java.in.action.example.basic;

/**
 * {@code HelloWorld}.
 *
 * @author photowey
 * @version 1.0.0
 * @since 2025/02/16
 */
public class HelloWorld {

    /**
     * 程序入口
     * |- 通常可以通过 `—D` 进行传参
     * |- |- `-Dspring.profiles.active=dev`
     * |- |- `-Dproject.name=java-in-action`
     *
     * @param args 参数列表
     */
    public static void main(String[] args) {
        sayHello();
    }

    private static void sayHello() {
        System.out.println("Hello World!");
    }
}
