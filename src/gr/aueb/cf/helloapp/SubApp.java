package gr.aueb.cf.helloapp;

public class SubApp {

    public static void main(String[] args) {
        System.out.println(sub(12, 2));
        System.out.printf("%4d", sub(12, 2));
    }

    public static int sub(int a, int b) {
        return a - b;
    }
}
