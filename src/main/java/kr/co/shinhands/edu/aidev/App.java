package kr.co.shinhands.edu.aidev;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        sayHello("Hello World!");
    }

    private static void sayHello(String string) {
        for (int i = 0; i < 10; i++) {
            System.out.println(string);
        }
    }
}
