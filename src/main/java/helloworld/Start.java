package helloworld;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Start {

    public static void main(String[] args) throws Exception {
        task34_2.main(args);
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

        static int sumDigitsInNumber(int number) {
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

    private static class task22 {
        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int arrLenght = Integer.parseInt(reader.readLine());
            if (arrLenght > 0) {
                List<Integer> list = new ArrayList();
                for (int i = 0; i < arrLenght; i++) {
                    int temp = Integer.parseInt(reader.readLine());
                    list.add(temp);
                }
                int maximal = list
                        .stream()
                        .mapToInt(value -> value)
                        .max()
                        .orElseThrow(Exception::new);
                System.out.println(maximal);
            } else {
                System.out.println("Число меньше 0");
            }
            //напишите тут ваш код
        }
    }

    private static class task23 {
        public static void main(String[] args) throws Exception {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int sum = 0;
            while (true) {
                String temp = bufferedReader.readLine();
                if (temp.equals("сумма")) {
                    break;
                }
                sum += Integer.parseInt(temp);

                //напишите тут ваш код
            }
            System.out.println(sum);
        }
    }

    private static class task24 {

        public static int even;
        public static int odd;

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int nubmer = Integer.parseInt(bufferedReader.readLine());
            List<Integer> integerList = splitter(nubmer);
            for (Integer item : integerList) {
                if (item % 2 != 0) {
                    odd++;
                }
                if (item % 2 == 0) {
                    even++;
                }
            }
            System.out.println("odd: " + odd + " even: " + even);
        }

        private static List<Integer> splitter(int a) {
            List<Integer> list = new ArrayList();
            while (a > 0) {
                list.add(a % 10);
                a = a / 10;
            }
            return list;
        }
    }

    private static class task25 {
        static class Cat {
            static int count;

            public Cat() {
                count++;
            }
        }

        public static void main(String[] args) {
            List<Cat> catList = new ArrayList<>();
            for (int a = 0; a < 10; a++) {
                catList.add(new Cat());
            }
            System.out.println(Cat.count);

        }
    }

    private static class task26 {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String grandpaName = bufferedReader.readLine();
            String grandmaName = bufferedReader.readLine();
            String papaName = bufferedReader.readLine();
            String mamaName = bufferedReader.readLine();
            String daughterName = bufferedReader.readLine();
            String sonName = bufferedReader.readLine();

            Cat grandpa = new Cat(grandpaName);
            Cat grandma = new Cat(grandmaName);
            Cat papa = new Cat(papaName, grandpa, null);
            Cat mama = new Cat(mamaName, null, grandma);
            Cat son = new Cat(sonName, papa, mama);
            Cat daughter = new Cat(daughterName, papa, mama);

            System.out.println(grandpa.toString());
            System.out.println(grandma.toString());
            System.out.println(papa.toString());
            System.out.println(mama.toString());
            System.out.println(daughter.toString());
            System.out.println(son.toString());
        }

        public static class Cat {
            private String name;
            private Cat parent;
            private Cat father;
            private Cat mother;

            Cat(String name, Cat father, Cat mother) {
                this.father = father;
                this.mother = mother;
                this.name = name;
            }


            Cat(String name) {
                this.name = name;
            }

            Cat(String name, Cat parent) {
                this.name = name;
                this.parent = parent;
            }

            @Override
            public String toString() {
                if (father == null && mother == null)
                    return "The cat's name is " + name + ", no mother, no father ";
                if (father == null)
                    return "The cat's name is " + name + ", mother is " + mother + ", no father";
                if (mother == null)
                    return "The cat's name is " + name + ", no mother" + ", father is " + father;
                else return "The cat's name is " + name + ",mother is " + mother + ", father is " + father;
            }

        }

    }

    private static class task27 {
        public static void main(String[] args) throws Exception {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                list.add(Integer.parseInt(bufferedReader.readLine()));
            }
            Collections.sort(list);
            for (Integer aList : list) {
                System.out.println(aList);
            }

        }
    }

    private static class task28 {
        public static void main(String[] args) throws Exception {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String[] array = new String[10];
            for (int i = 0; i < 8; i++) {
                array[i] = bufferedReader.readLine();
            }
            for (int i = array.length; i >= 1; i--) {
                System.out.println(array[i - 1]);
            }

        }
    }

    private static class task29 {
        public static void main(String[] args) throws Exception {
            //напишите тут ваш код
            int[] array = new int[10];
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(bufferedReader.readLine());
            }
            for (int i = array.length - 1; i > -1; i--) {
                System.out.println(array[i]);
            }
        }
    }

    private static class task30Compare {
        public static void main(String[] args) throws Exception {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<String> arrayList = new ArrayList<>();
          /*  Comparator<String> compareLenght = new Comparator<String>() { //вариант базовый
                @Override
                public int compare(String o1, String o2) {
                    return Integer.compare(o1.length(),o2.length());
                }
            };*/
            //   Comparator<String> compareLenght = (o1, o2) -> Integer.compare(o1.length(),o2.length()); //вариант с лямбдой
            Comparator<String> compareLenght = Comparator.comparingInt(String::length);//вариант compareInt
            for (int i = 0; i < 5; i++) {
                arrayList.add(bufferedReader.readLine());
            }
            arrayList.sort(compareLenght);
            for (int i = 0; i < 5; i++) {
                System.out.println(arrayList.get(i));
            }
        }
    }

    private static class task31CompareMax {
        public static void main(String[] args) throws Exception {
            //напишите тут ваш код
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            // ArrayList<String> arrayList = new ArrayList<>();
            ArrayList<String> strings = new ArrayList<>();
            Comparator<String> compareMax = (o1, o2) -> Integer.compare(o1.length(), o2.length());
            for (int i = 0; i < 5; i++) {
                strings.add(bufferedReader.readLine());
            }
            strings.sort(compareMax);
            Collections.reverse(strings);
            String temp = strings.get(0);
            System.out.println(temp);
            for (String s : strings) {
                if (s.length() == temp.length()) {
                    System.out.println(s);
                }

            }
        }
    }

    private static class task32 {
        public static void main(String[] args) throws Exception {
            //напишите тут ваш код
            List<String> list = new ArrayList<>();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String min = String.valueOf(Math.PI);
            String max = "";
            for (int i = 0; i < 6; i++) {
                list.add(bufferedReader.readLine());
                if (list.get(i).length() < min.length()) {
                    min = list.get(i);
                }
                if (list.get(i).length() > max.length()) {
                    max = list.get(i);
                }
            }
            if (list.indexOf(min) < list.indexOf(max)) {
                System.out.println(min);
            } else System.out.println(max);

        }
    }

    private static class task33 {
        public static void main(String[] args) throws Exception {
            // Считать строки с консоли и объявить ArrayList list тут
            ArrayList<String> list = new ArrayList<>();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            for (int i = 0; i < 4; i++) {
                list.add(i, bufferedReader.readLine());
            }

            ArrayList<String> result = doubleValues(list);
            for (String s : result
                    ) {
                System.out.println(s);

            }
            // Вывести на экран result
        }

        public static ArrayList<String> doubleValues(ArrayList<String> list) {
            //напишите тут ваш код
            for (int i = 0; i < list.size(); i += 2) {
                list.add(i, list.get(i));
            }

            return list;
        }
    }

    private static class task34 {
        public static void main(String[] args) throws Exception {
            ArrayList<String> list = new ArrayList<>();
            list.add("роза"); // 0
            list.add("лоза"); // 1
            list.add("лира"); // 2
            list.add("жопка");
            list.add("клерк");
            list.add("роман");
            list.add("ламинат");
            list = fix(list);

            for (String s : list) {
                System.out.println(s);
            }

        }

        public static ArrayList<String> fix(ArrayList<String> list) {
            for (int i = 0; i < list.size(); i++) {
                if (StringUtils.containsAny(list.get(i), "л")) {
                    if (!StringUtils.containsAny(list.get(i), "р")) {
                        list.add(i, list.get(i));
                    }
                } else if (StringUtils.containsAny(list.get(i), "р") && !StringUtils.containsAny(list.get(i), "л")) {
                    list.remove(list.get(i));
                } else if (StringUtils.containsAny(list.get(i), "р") && StringUtils.containsAny(list.get(i), "л")) {
                    list.add(list.get(i));
                }
            }
            return list;
        }
    }

    //TODO ПОПРАКТИКОАТЬСЯ С ЛЯМБДАМИ
    private static class task34_2 {
        public static void main(String[] args) throws Exception {
            ArrayList<String> list = new ArrayList<>();
            list.add("роза"); // 0
            list.add("лоза"); // 1
            list.add("лира"); // 2
            list.add("каппа");
            list.add("морж");
            list.add("лакомство");
            list = fix(list);

            for (String s : list) {
                System.out.println(s);
            }
        }

        public static ArrayList<String> fix(ArrayList<String> list) {
/*            for (int i =list.size()-1;i>0) {
                if (list.get(i).contains("р")) {
                    if (list.get(i).contains("л")) {

                    } else if (!list.get(i).contains("л")) {
                        list.remove(list.get(i));
                    }
                }
                if (list.get(i).contains("л")) {
                    if (list.get(i).contains("р")) {

                    } else if (!list.get(i).contains("р")) {
                        list.add(list.get(i));
                    }
                }

            }*/
            list.removeIf(s -> (s.contains("р")) && (!s.contains("л")));
            list.addAll(list.stream()
                    .filter(s -> (s.contains("л")) && (!s.contains("р")))
                    .collect(Collectors.toList()));
            //напишите тут ваш код
            return list;
        }
    }

}

