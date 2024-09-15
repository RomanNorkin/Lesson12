import org.testng.Assert;

import org.testng.annotations.Test;

public class Lesson_12_testng {


    public static class factorialTestNg {
        int factorial(int n) {
            return 1;
        }

        factorialTestNg calculator = new factorialTestNg();


        @Test

        public void testFactorialForZero() {

            Assert.assertEquals(calculator.factorial(0), 1);

        }


        @Test

        public void testFactorialForPositiveNumber() {

            Assert.assertEquals(calculator.factorial(5), 120);

        }


        @Test

        public void testFactorialForNegativeNumber() {

            try {

                calculator.factorial(-1);

                Assert.fail("Для отрицательных чисел нельзя вычислить факториал");

            } catch (IllegalArgumentException e) {


            }

        }

    }
}
