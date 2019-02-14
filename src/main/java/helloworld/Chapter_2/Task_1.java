package helloworld.Chapter_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Task_1 {
    public static void main(String[] args) throws IOException {
        LineReader lineReader = new LineReader();
        DecimalFormat dc = new DecimalFormat();
        List<Double> array = new ArrayList<>();
        List<Integer> lenghtArray = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите количество объектов массива: ");
        int n = Integer.parseInt(bufferedReader.readLine());
        int i = 0;
        while (i != n) {
            double element = lineReader.readDouble();
            array.add(element);
            i++;
        }

        array.sort(Collections.reverseOrder());
        System.out.println("Sorted massive:");
        System.out.println(array);

        for (i = 0; i <= n - 1; i++) {
            String lineTemp = String.valueOf(array.get(i)).replace(".", "");
            lenghtArray.add(lineTemp.length());
        }


        System.out.println(lenghtArray);
        int maxValue = Collections.max(lenghtArray);
        int minValue = Collections.min(lenghtArray);
        System.out.println("Biggest Value: " + Collections.max(array));
        System.out.println("Maximum length: " + maxValue + " ");
        System.out.print("Max value index: " + lenghtArray.indexOf(maxValue) + '\n');
        System.out.println("Самое длинное число: " + array.get(lenghtArray.indexOf(maxValue)));
        System.out.println("Самое короткое число: " + dc.format(array.get(lenghtArray.indexOf(minValue))));


    }

}
