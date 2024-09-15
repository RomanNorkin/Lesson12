public class Lesson_12_junit_5 {

    public static class Factorial {



        public int factorial(int n) {

            if (n < 0) {

                throw new IllegalArgumentException("Для отрицательных чисел нельзя вычислить факториал");

            }

            if (n == 0) {

                return 1;

            }

            int result = 1;

            for (int i = 1; i <= n; i++) {

                result *= i;

            }

            return result;

        }



        public static void main(String[] args) {

            Factorial calculator = new Factorial();

            int number = 5;

            System.out.println("Факториал числа " + number + " равен: " + calculator.factorial(number));

        }

    }

}
