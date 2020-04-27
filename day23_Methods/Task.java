package day23_Methods;
/*
void method (without parameter)
1. write a method that can print all odd numbers between 1 ~ 100
2. write a method that can print all even numbers between 1 ~ 100

 */
public class Task {
    public static void main(String[] args) {
        evenNumbers();
        oddNumbers();
    }

    public static void evenNumbers() {

        for (int i = 1; i <= 101; i++) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

        public static void oddNumbers() {

            for (int i = 0; i <= 100; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }

    }

