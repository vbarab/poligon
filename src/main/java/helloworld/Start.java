package helloworld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Start {

    public static void main(String[] args) throws Exception {
        testArrayMinimalSearchLambda.main();
    }

    private static class task1 {
        private static int min(int i, int i1, int i2, int i3) {
            int fminp = min(i, i1);
            int sminp = min(i2, i3);
            int result;
            if (fminp < sminp) result = fminp;
            else result = sminp;
            return result;
        }

        private static int min(int i, int i1) {
            int min = i;
            if (i1 < i) {
                min = i1;
            }
            return min;
        }

        private static void main() {
            System.out.println(task1.min(-20, -10));
            System.out.println(task1.min(-40, -10, -30, 40));
            System.out.println(task1.min(-20, -40, -30, 40));
            System.out.println(task1.min(-20, -10, -40, 40));
            System.out.println(task1.min(-20, -10, -30, -60));
        }
    }

    private static class task2 {

        private static void main() {
            System.out.println(sumDigitsInNumber(546));
        }

        public static int sumDigitsInNumber(int number) {
            String tempString = String.valueOf(number);
            char[] split = tempString.toCharArray();
            int result = 0;
            for (char aSplit : split) {
                result += Character.getNumericValue(aSplit);
            }
            return result;
        }
    }

    private static class task3 {
        public static void main() {
            Person person = new Person();
            System.out.println("Age is: " + person.age);
            person.adjustAge(person.age);
            System.out.println("Adjusted age is: " + person.age);
        }

        public static class Person {
            public int age = 20;

            public void adjustAge(int age) {
                this.age = age + 20;
                System.out.println("Age in adjustAge() is: " + age);
            }
        }
    }

    private static class task4 {
        public static void main() {
            Apple apple = new Apple();
            apple.addPrice(50);
            Apple apple2 = new Apple();
            apple2.addPrice(100);
            System.out.println("Стоимость яблок " + Apple.applesPrice);
        }

        static class Apple {
            static int applesPrice = 0;

            void addPrice(int applesPrice) {
                Apple.applesPrice += applesPrice;
                //напишите тут ваш код
            }
        }
    }

    private static class task5 {
        public static void main() {
            checkInterval(60);
            checkInterval(112);
            checkInterval(10);
        }

        static void checkInterval(int a) {
            if (a >= 50 && a <= 100) {
                System.out.println("Число а содержится в интервале.");
            }
            if (a < 50) {
                System.out.println("Число а не содержится в интервале.");
            }
            if (a > 100) {
                System.out.println("Число а не содержится в интервале.");
            }
            //напишите тут ваш код
        }
    }

    private static class task6 {
        public static void main() throws Exception {
            readCompare();
        }

        public static void readCompare() throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int number = Integer.parseInt(bufferedReader.readLine());
            if (number < 0) {
                number += 1;
                System.out.println(number);
            }
            if (number > 0) {
                number *= 2;
                System.out.println(number);
            }
            if (number == 0) {
                number = 0;
                System.out.println(number);
            }
        }
    }

    private static class task7 {
        private static final int leapYear = 366;
        private static final int sample = 365;

        public static void main() throws Exception {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int input = Integer.parseInt(bufferedReader.readLine());
            firstcheck(input);

        }

        private static void firstcheck(int number) {
            int mod400 = number % 400;
            int mod100 = mod400 % 100;
            int mod4 = mod100 % 4;
            if (mod400 == 0 && mod100 != 0 || mod4 == 0) {
                System.out.println("количество дней в году:\t" + leapYear);
            } else System.out.println("количество дней в году:\t" + sample);
        }
    }

    private static class task8 {
        public static void main() throws Exception {
            //напишите тут ваш код
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            double input = Double.parseDouble(bufferedReader.readLine());
            if (input % 5.0 < 3 && input % 5.0 >= 0) {
                System.out.println("зеленый");
            }
            if (input % 5.0 < 4 && input % 5.0 >= 3) {
                System.out.println("желтый");
            }
            if (input % 5.0 < 5 && input % 5.0 >= 4) {
                System.out.println("красный");
            }

        }
    }

    private static class task9 {
        public static void main() throws Exception {
            //напишите тут ваш код
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(bufferedReader.readLine());
            int b = Integer.parseInt(bufferedReader.readLine());
            int c = Integer.parseInt(bufferedReader.readLine());
            int d = Integer.parseInt(bufferedReader.readLine());
            if (a >= b && a >= c && a >= d) {
                System.out.println(a);
            } else if (b >= a && b >= c && b >= d) {
                System.out.println(b);
            } else if (c >= a && c >= b && c >= d) {
                System.out.println(c);
            } else if (d >= a && d >= b && d >= c) {
                System.out.println(d);
            }
            int[] array = {a, b, c, d};
            Arrays.sort(array);
            System.out.println("minimal: " + array[0]);
            System.out.println("maximal: " + array[array.length - 1]);
        }
    }

    private static class task10 {
        public static void main() throws Exception {
            //напишите тут ваш код
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(bufferedReader.readLine());
            int b = Integer.parseInt(bufferedReader.readLine());
            int c = Integer.parseInt(bufferedReader.readLine());
            Integer[] array = new Integer[]{a, b, c};
            if (array[0].equals(array[1]) && !array[1].equals(array[2])) {
                int temp = Arrays.asList(array).indexOf(c);
                System.out.println(temp);
            } else if (array[1].equals(array[2]) && !array[2].equals(array[0])) {
                int temp = Arrays.asList(array).indexOf(a);
                System.out.println(temp);
            } else if (array[0].equals(array[2]) && !array[0].equals(array[1])) {
                int temp = Arrays.asList(array).indexOf(b);
                System.out.println(temp);
            }

        }
    }

    private static class task11 {
        public static void main() {
            int i = 0;
            while (i < 10) {
                i++;
                System.out.println(i);
            }
        }

    }

    private static class task12 {
        public static void main() {
            int a = 0;
            for (int i = 0; i < 101; i++) {
                a += i;
                System.out.println(a);
            }
        }
    }

    private static class task13 {
        public static void main() {
            //напишите тут ваш код
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print("S");
                }
                System.out.println();
            }

        }
    }

    private static class task14 {
        public static void main() {
            int i = 0;
            int j = 0;
            while (i < 10) {
                i++;
                while (j < 10) {
                    j++;
                    int temp = j * i;
                    System.out.print(temp + "\t");
                }
                j = 0;
                System.out.println();
            }
        }
    }

    private static class task15 {
        public static void main() throws Exception {
            //напишите тут ваш код
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int m = Integer.parseInt(bufferedReader.readLine());
            int n = Integer.parseInt(bufferedReader.readLine());
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("8");
                }
                System.out.println();
            }

        }
    }

    private static class task16 {
        public static void main() {
            //напишите тут ваш код
            for (int i = 1; i < 11; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("8");
                }
                System.out.println();
            }

        }
    }

    private static class task17 {
        public static void main() throws Exception {
            //напишите тут ваш код
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String name = bufferedReader.readLine();
            String y = bufferedReader.readLine();
            String m = bufferedReader.readLine();
            String d = bufferedReader.readLine();
            System.out.println("Меня зовут " + name + ".");
            System.out.println("Я родился" + " " + d + "." + m + "." + y);

        }
    }

    private static class task18 {
        public static void main() throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(bufferedReader.readLine());
            int b = Integer.parseInt(bufferedReader.readLine());
            int c = Integer.parseInt(bufferedReader.readLine());
            System.out.println(a + b + c - Math.min(Math.min(a, b), c) - Math.max(Math.max(a, b), c));
        }
    }

    private static class task19 {
        public static void main() throws Exception {
            //напишите тут ваш код
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            double summ = 0.0;
            double count = 0.0;
            while (true) {
                double temp = Double.parseDouble(bufferedReader.readLine());
                if (temp == -1.0) {
                    System.out.println((summ / (count)));
                    break;
                } else {
                    summ += temp;
                    count++;
                }

            }

        }
    }

    private static class task20 {
        public static class Circle {
            public final Color color;

            public static void main() {
                Circle circle = new Circle();
                circle.color.setDescription("Red");
                System.out.println(circle.color.getDescription());

            }

            public Circle() {
                color = new Color();
            }

            public class Color {
                String description;

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }
            }
        }
    }

    private static class task21 {
        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());
            int c = Integer.parseInt(reader.readLine());
            int d = Integer.parseInt(reader.readLine());
            int e = Integer.parseInt(reader.readLine());
            int minimum = min(a, b, c, d, e);

            System.out.println("Minimum = " + minimum);
        }

        public static int min(int a, int b, int c, int d, int e) throws Exception {
            List<Integer> temp = new ArrayList<>();
            Collections.addAll(temp, a, b, c, d, e);
            //        Calling stream() method on the list to get a stream of values from the list
//        Calling mapToInt(value -> value) on the stream to get an Integer Stream
//        Calling max() method on the stream to get the max value
//        Calling orElseThrow() to throw an exception if no value is received from max()
            return temp
                    .stream()
                    .mapToInt(value -> value)
                    .min().orElseThrow(Exception::new);
        } // using lambda for searching min value in list array of integers
    }

    private static class testArrayMinimalSearchLambda {
        private static void main() throws Exception {
            unlimMinSearch(1, 2, 2, -1, -500, 0);
        }

        private static void unlimMinSearch(int... a) throws Exception {
            List<Integer> temp = new ArrayList<>();
            for (int i : a) {
                temp.add(i);
            }
            Integer min = temp
                    .stream()
                    .mapToInt(value -> value)
                    .min().orElseThrow(Exception::new);
            System.out.println(temp.toString());
            System.out.println("minimal int: " + min);
        }

    }
}

