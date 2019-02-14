package helloworld.Chapter_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class LineReader {
    private final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private double arrayElement;

    public double readDouble() {
        Pattern pattern = Pattern.compile("\\d*\\.?\\d+"); //REGEX
        Matcher matcher;
        boolean flag = false;
        DecimalFormat dc = new DecimalFormat();
        dc.setMaximumFractionDigits(50);
        String tempString = null;
        while (!flag) {
            try {
                System.out.println("Введите число:");
                tempString = bufferedReader.readLine().replaceAll(",", ".");
            } catch (IOException e) {
                e.printStackTrace();
            }
            assert tempString != null;
            matcher = pattern.matcher(tempString);
            if (matcher.lookingAt()) {
                try {
                    arrayElement = Double.parseDouble(tempString);
                    System.out.println("Вы ввели: " + dc.format(arrayElement));
                    flag = true;
                } catch (NumberFormatException e) {
                    System.out.println("неверный формат данных");

                }

            }
            if (!matcher.lookingAt()) {
                tempString = null;
                System.out.println("неверный формат данных");
            }
        }
        return arrayElement;
    }
}