import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Main {
    int n = -5;

    @BeforeTest
    public void lesson12Testng() {
        System.out.println("Юнит-тест для вычисления факториала числа используя TestNG.");
    }

    @Test
    public void factorialNegativeNum() {

        if (n < 0) {

            throw new IllegalArgumentException("Для отрицательных чисел нельзя вычислить факториал");

        }
    }


    @Test
    public void factorialEqualZero() {
        if (n == 0) {

            System.out.println("\nФакториал числа " + n + " равен:\n");
            System.out.println("1");

        }
    }

    @Test
    public void factorial() {

        if (n <= 0) {
            return;
        }

        int result = 1;

        for (int i = 1; i <= n; i++) {

            result *= i;

        }

        System.out.println("\nФакториал числа " + n + " равен:\n");
        System.out.println(result);

    }

}



