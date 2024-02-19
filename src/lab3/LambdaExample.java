package lab3;

public class LambdaExample {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello, World!");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}