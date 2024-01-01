package RIO.example;
public class Main {
    public static void main(String[] args) {
        int n = 5; // встановлюємо число
        System.out.printf("sumCalculator.calculateSum("+n+')');
        SumCalculator sumCalculator = new SumCalculator();
        try {
            int sum = sumCalculator.sum(n);
            System.out.println("= " + sum);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        SumCalculatorPlus sumCalculatorPlus = new SumCalculatorPlus();
        try {
            int sum1 = sumCalculatorPlus.sum(n);
            System.out.println("= " + sum1);
        }catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}