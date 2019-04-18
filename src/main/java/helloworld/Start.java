package helloworld;

import org.apache.commons.lang3.StringUtils;
import sun.misc.Regexp;

import javax.jws.soap.SOAPBinding;
import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class Start {

    public static void main(String[] args) throws Exception {
        task54.main(args);
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

    //TODO lambda practice

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

    private static class task35 {
        public static void main() throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<String> arr = new ArrayList<>();
            String temp = null;
            for (int i = 1; i > 0; i++) {
                temp = bufferedReader.readLine();
                if (temp.equals("end")) {
                    break;
                } else arr.add(temp);
            }
            for (String s : arr) {
                System.out.println(s);

            }
        }
    }

    //descending sort of int

    private static class task36 {
        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int[] array = new int[5];
            for (int i = 0; i < 5; i++) {
                array[i] = Integer.parseInt(reader.readLine());
            }

            sort(array);

            for (int x : array) {
                System.out.println(x);
            }
        }

        public static void sort(int[] array) {
            int[] arr = new int[5];
            for (int i = 0; i < array.length; i++) {
                arr[i] = -array[i];
            }
            Arrays.sort(arr);
            for (int i = 0; i < array.length; i++) {
                array[i] = -arr[i];
            }
            //вариант 2

   /*         for (int i = 0; i < array.length; i++) {
                array[i] = array[i] * -1;
            }
            Arrays.sort(array);
            for (int i = 0; i < array.length; i++) {
                array[i] = array[i] * -1;
            }*/
        }
    }

    private static class task37 {

        public static void main(String[] args) throws IOException {
            //напишите тут ваш код
            ArrayList<Integer> integerArrayList = new ArrayList<>();
            ArrayList<Integer> counter = new ArrayList<>();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            for (int i = 0; i < 10; i++) {
                integerArrayList.add(Integer.valueOf(bufferedReader.readLine()));
            }
            int count = 1;
           /* for (Integer i : integerArrayList
                    ) {
                System.out.println(i);
            }*/

            for (int i = 1; i < integerArrayList.size(); i++) {
                if (integerArrayList.get(i).equals(integerArrayList.get(i - 1))) {
                    count++;
                } else count = 1;
                counter.add(count);
            }
            System.out.println(Collections.max(counter));
/*            for (Integer i : counter
                    ) {
                System.out.println(i);
            }*/

        }
    }

    private static class task38 {
        public static HashMap<String, Date> createMap() throws ParseException {
            DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
            HashMap<String, Date> map = new HashMap<String, Date>();
            map.put("Stallone", df.parse("JULY 1 1981"));
            map.put("Stallone", df.parse("SEPTEMBER 1 1982"));
            map.put("Stallon", df.parse("JANUARY 1 1983"));
            map.put("Stalle", df.parse("MAY 1 1984"));
            map.put("Stallon", df.parse("JUNE 1 1940"));
            map.put("Stlone", df.parse("JUNE 1 1985"));
            map.put("Staone", df.parse("JUNE 1 1967"));
            map.put("Stalle", df.parse("JUNE 1 1977"));
            map.put("Stone", df.parse("JUNE 1 1923"));
            map.put("Stalne", df.parse("JUNE 1 1933"));
            return map;
        }

        public static void removeAllSummerPeople(HashMap<String, Date> map) {
            map.entrySet().removeIf(dateEntry -> dateEntry.getValue().toString().contains("Jun")
                    || dateEntry.toString().contains("Jul")
                    || dateEntry.toString().contains("Aug"));


        }

        public static void main(String[] args) throws ParseException {
            HashMap hashMap = createMap();
            removeAllSummerPeople(hashMap);
            hashMap.forEach((key, value) -> {
                System.out.println("key: " + key + " value: " + value);
            });

        }
    }

    private static class task39 {
        public static HashMap<String, String> createMap() {
            //напишите тут ваш код
            HashMap<String, String> hashMap = new HashMap<>();
            for (int i = 0; i < 10; i++) {
                hashMap.put(Integer.toString(i), Integer.toString(i) + Integer.toString(i));
            }
            hashMap.put("11", "22");
            hashMap.put("12", "33");
            return hashMap;
        }

        public static void removeTheFirstNameDuplicates(Map<String, String> map) {
            HashMap<String, String> copy = new HashMap(map);
            int count = 0;
            ArrayList<String> arrayList = new ArrayList<>();
            for (Map.Entry entry : map.entrySet()
                    ) {
                for (Map.Entry copyEntry : copy.entrySet()
                        ) {
                    if (copyEntry.getValue().equals(entry.getValue())) {
                        count++;
                    }
                    if (count > 1) {
                        System.out.println("Стираем: " + entry.getValue().toString());
                        arrayList.add(entry.getValue().toString());
                        //    removeItemFromMapByValue(map, entry.getValue().toString());
                        count = 1;
                    }
                }
                count = 0;
            }
            for (String s : arrayList
                    ) {
                map.entrySet().removeIf(stringStringEntry -> stringStringEntry.getValue().equals(s));
            }

        }


        public static void removeItemFromMapByValue(Map<String, String> map, String value) {
            HashMap<String, String> copy = new HashMap<String, String>(map);
            for (Map.Entry<String, String> pair : copy.entrySet()) {
                if (pair.getValue().equals(value))
                    map.remove(pair.getKey());
            }
        }


        public static void main(String[] args) {
            HashMap hashMap = createMap();
            removeTheFirstNameDuplicates(hashMap);
            hashMap.forEach((key, value) -> {
                System.out.println("key: " + key + " Value: " + value);

            });
        }
    }

    private static class task40 {
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
            String[] arr = s.split("\\w+\\s+/g");
            //  Arrays.stream(arr).forEach(s1 -> StringUtils.capitalize(s1));
            //   Arrays.stream(arr).forEach(System.out::println);
            Regexp regexp = new Regexp("\\s +");


        }
    }

    private static class toUpperCase {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String text = bufferedReader.readLine();
            StringBuilder sb = new StringBuilder(text);
            for (int i = 0; i < sb.length(); i++)
                if (i == 0 || sb.charAt(i - 1) == ' ')
                    sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
            System.out.println(sb.toString());
        }
    }

    private static class task41 {
        public static void main(String[] args) throws ParseException {
            System.out.println(isDateOdd("MAY 3 2013"));
        }

        public static boolean isDateOdd(String date) throws ParseException {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
            Date dateEnd = simpleDateFormat.parse(date);
            int year = dateEnd.getYear();
            Date dateStart = new Date(year, 1, 1);
            long diffBetweenDays = dateEnd.getTime() - dateStart.getTime();
            long days = TimeUnit.DAYS.convert(diffBetweenDays, TimeUnit.MILLISECONDS);
            return days % 2 != 0;
        }
    }

    //bubble sort for String
    private static class task42 {
        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String[] array = new String[20];
            for (int i = 0; i < array.length; i++) {
                array[i] = reader.readLine();
            }

            sort(array);

            for (String x : array) {
                System.out.println(x);
            }
        }

        public static void sort(String[] array) {
            String temp;
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++)
                    if (isGreaterThan(array[i], array[j])) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
            }
        }

        public static boolean isGreaterThan(String a, String b) {
            return a.compareTo(b) > 0;
        }
    }

    private static class task43 {
        public static void main(String[] args) {
            int a = 42 / 0;
        }
    }

    private static class task44 {
        public static void main(String[] args) throws InterruptedException {
            readData();
        }

        public static void readData() throws InterruptedException {
            ArrayList<Integer> arrayList = new ArrayList<>();
            while (true) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                try {
                    int temp = Integer.parseInt(bufferedReader.readLine());
                    arrayList.add(temp);
                } catch (NumberFormatException e) {
                    arrayList.forEach(System.out::println);
                    Thread.sleep(200);
                    e.printStackTrace();
                    break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            //напишите тут ваш код
        }
    }

    private static class task45 {
        public static void main(String[] args) throws Exception {
            //напишите тут ваш код
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String consoleInput = bufferedReader.readLine();

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-M-dd", Locale.ENGLISH);
            Date date = simpleDateFormat.parse(consoleInput);
            SimpleDateFormat newDateFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
            System.out.println(newDateFormat.format(date).toUpperCase());
        }
    }

    private static class task46 {
        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<String> list = new ArrayList<>();
            while (true) {
                String s = reader.readLine();
                if (s.isEmpty()) break;
                list.add(s);
            }

            String[] array = list.toArray(new String[0]);
            sort(array);

            for (String x : array) {
                System.out.println(x);
            }
        }

        public static void sort(String[] array) {

            ArrayList<String> stringArrayList = new ArrayList<>();
            ArrayList<Integer> integerArrayList = new ArrayList<>();
            isGreaterThan("a", "b");

            for (int i = 0; i < array.length; i++) {
                if (isNumber(array[i])) {
                    integerArrayList.add(Integer.parseInt(array[i]));

                } else stringArrayList.add(array[i]);
            }
            Collections.sort(stringArrayList);
            Collections.sort(integerArrayList);
            Collections.reverse(integerArrayList);

            for (int i = 0; i < stringArrayList.size(); i++) {
                array[i] = stringArrayList.get(i);
            }
            for (int i = stringArrayList.size(); i < array.length; i++) {
                array[i] = String.valueOf(integerArrayList.get(i - stringArrayList.size()));
            }

            // напишите тут ваш код
        }

        // Метод для сравнения строк: 'а' больше чем 'b'
        public static boolean isGreaterThan(String a, String b) {
            return a.compareTo(b) > 0;
        }


        // Переданная строка - это число?
        public static boolean isNumber(String s) {
            if (s.length() == 0) return false;

            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                char c = chars[i];
                if ((i != 0 && c == '-') // Строка содержит '-'
                        || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                        || (chars.length == 1 && c == '-')) // или одиночный '-'
                {
                    return false;
                }
            }
            return true;
        }
    }

    private static class task47 {
        public static void main(String[] args) {
            int a = 0;
            int b = (byte) a + 46;
            byte c = (byte) (a * b);
            double f = (float) 1234.15;
            long d = (char) (a + f / c + b);
            System.out.println(d);
        }
    }

    private static class task48 {

        public static void main(String[] args) {
            String s = "Я не хочу изучать Java, я хочу большую зарплату";
            char[] array = s.toCharArray();

            ArrayList<Character> arrayList = new ArrayList<>();
            for (char ch : array) {
                arrayList.add(ch);
            }
            System.out.println(s);
            while (arrayList.size() > 8) {
                arrayList.remove(0);
                for (char c : arrayList
                        ) {
                    System.out.print(c);
                }
                System.out.println("");
            }
            //напишите тут ваш код
        }
    }

    private static class task49 {
        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            // Алфавит
            String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
            char[] abcArray = abc.toCharArray();

            ArrayList<Character> alphabet = new ArrayList<Character>();
            for (int i = 0; i < abcArray.length; i++) {
                alphabet.add(abcArray[i]);
            }

            // Ввод строк
            ArrayList<String> list = new ArrayList<String>();
            for (int i = 0; i < 3; i++) {
                String s = reader.readLine();
                list.add(s.toLowerCase());
            }

            Map<Character, Long> map = new HashMap<>();
            for (Character ch : alphabet) {
                map.put(ch, 0L);
            }
            long count = 0;
            for (String str : list) {
                for (char ch : alphabet
                        ) {
                    count = str.chars().filter(charar -> charar == ch).count();
                    long tempconut = map.get(ch);
                    map.put(ch, tempconut + count);
                }
                count = 0;
            }
            Map<Character, Long> newMap = new TreeMap<>(map);
            newMap.entrySet().forEach(characterLongEntry -> System.out.println(characterLongEntry.getKey() + " " + characterLongEntry.getValue()));

        }
    }

    private static class task50 {

    }

    private static class task51 {
        public static void main(String[] args) throws Exception {
            int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

            Pair<Integer, Integer> result = getMinimumAndIndex(data);

            System.out.println("The minimum is " + result.x);
            System.out.println("The index of the minimum element is " + result.y);
        }

        public static Pair<Integer, Integer> getMinimumAndIndex(int[] array) {
            if (array == null || array.length == 0) {
                return new Pair<Integer, Integer>(null, null);
            }
            //  Pair<Integer, Integer> pair = new Pair<Integer, Integer>();
            Pair<Integer, Integer> pair = new Pair<>(0, 0);
            int[] temp = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                temp[i] = array[i];
            }
            Arrays.sort(temp);
            for (int i = 0; i < array.length; i++) {
                if (array[i] == temp[0]) {
                    pair.x = array[i];
                    pair.y = i;
                }
            }
            return pair;
        }


        public static class Pair<X, Y> {
            public X x;
            public Y y;

            public Pair(X x, Y y) {
                this.x = x;
                this.y = y;
            }

        }
    }

    //чтение из файла, запись в String и вывод на экран
    private static class task52 {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String s = bufferedReader.readLine();
            FileInputStream fileInputStream = new FileInputStream(s);
            String output = getFileContent(fileInputStream, "Utf-8");
            System.out.println(output);
            fileInputStream.close();
            bufferedReader.close();
        }

        public static String getFileContent(
                FileInputStream fis,
                String encoding) throws IOException {
            try (BufferedReader br =
                         new BufferedReader(new InputStreamReader(fis, encoding))) {
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = br.readLine()) != null) {
                    sb.append(line);
                    sb.append('\n');
                }
                return sb.toString();
            }
        }

    }

    private static class task53 {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());
            StringBuilder stringBuilder = new StringBuilder();
            while (fileInputStream.available() != 0) {
                stringBuilder.append((char) fileInputStream.read());
            }
            System.out.println(stringBuilder.toString());
            bufferedReader.close();
            fileInputStream.close();
        }

    }

    //запись из массива в файл
    private static class task54 {

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            File file = new File(bufferedReader.readLine());
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            List<String> list = new ArrayList<>();
            String temp;
            while (!(temp = bufferedReader.readLine()).equals("exit")) {
                list.add(temp);
            }
            list.add("exit");
            for (String s : list
                    ) {
                bufferedWriter.write(s);
            }
            bufferedWriter.close();
        }
    }
}



