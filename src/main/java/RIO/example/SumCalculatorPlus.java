package RIO.example;

public class SumCalculatorPlus {
    private int n;

    public int sum(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n має бути більше за 0");
        }
        // формула для обчислення суми арифметичної погресії числа п
        return (n * (n + 1));
    }

}
