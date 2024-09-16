import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Main {

    int n = 30;

    @BeforeAll
    public static void lesson12Junit5() {
        System.out.println("Юнит-тест для вычисления факториала числа используя Junit 5.\n");
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

            System.out.println("Факториал числа " + n + " равен:\n");
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

        System.out.println("Факториал числа " + n + " равен:\n");
        System.out.println(result);
    }


}


