public class Main {

    public static void main(String[] args) {
        int a = 6;
        int b = 9;
        int max = (a + b + Math.abs(a - b)) / 2;
        int min = (a + b - Math.abs(a - b)) / 2;
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
