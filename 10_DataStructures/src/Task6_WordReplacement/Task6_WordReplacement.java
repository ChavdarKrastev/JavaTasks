package Task6_WordReplacement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Task6_WordReplacement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String num = sc.nextLine();
        int n = Integer.parseInt(num);

        Map<String, String> wordsMap = new HashMap<>();

        String words;
        String[] splittedWords;
        for (int i = 0; i < n; i++) {
            words = sc.nextLine();
            splittedWords = words.split(" ");
            wordsMap.put(splittedWords[0], splittedWords[1]);
        }

        String[] splittedSentence = str.split(" ");

        changeWords(wordsMap, splittedSentence);

        for (String word : splittedSentence) {
            System.out.print(word + " ");
        }
    }

    private static void changeWords(Map<String, String> map, String[] array) {
        int count = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            for (int i = count; i < array.length; i++) {
                if (array[i].equalsIgnoreCase(pair.getKey())) {
                    array[i] = pair.getValue();
                    count = i + 1;
                }
            }
        }
    }

}
