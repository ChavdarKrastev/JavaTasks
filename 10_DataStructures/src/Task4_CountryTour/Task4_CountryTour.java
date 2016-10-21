package Task4_CountryTour;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class Task4_CountryTour {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int cities = Integer.parseInt(str);
        Queue<Integer> distance = new ArrayDeque<>();
        Queue<Integer> food = new ArrayDeque<>();

        for (int i = 0; i < cities; i++) {
            String expression = sc.nextLine();
            String[] split = expression.split(" ");
            distance.add(Integer.parseInt(split[0]));
            food.add(Integer.parseInt(split[1]));
        }

        int tempDistance = 0;
        int tempFood = 0;
        int currentElement = 0;
        int city = 1;

        for (int i = 1; i <= cities; i++) {
            currentElement = distance.poll();
            tempDistance += currentElement;
            distance.add(currentElement);

            currentElement = food.poll();
            tempFood += currentElement;
            food.add(currentElement);

            if (tempDistance > tempFood) {
                if ((tempDistance > tempFood) && (i == cities)) {
                    System.out.println("NO");
                    break;
                }
                city = i + 1;
                i = 0;
                tempDistance = 0;
                tempFood = 0;
            } else if ((tempDistance <= tempFood) && (i == cities)) {
                System.out.println(city);
            }
        }
    }
}
