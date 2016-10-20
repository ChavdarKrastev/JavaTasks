package Task1_UniqueNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1_UniqueNumbers {

    static int N;
    static int num;
    static List<Integer> arrayList = new ArrayList();

    static List<Integer> sortUnique(List<Integer> list) {
        List<Integer> uniqueList = new ArrayList();

        for (int i = 0; i < list.size() - 1; i++) {
            if (!uniqueList.contains(list.get(i))) {
                uniqueList.add(list.get(i));
            }
        }
        return uniqueList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        sc.hasNext();
        
        for (int i = 0; i < N; i++) {
            num = sc.nextInt();
            sc.hasNext();
            arrayList.add(num);
        }

        for (Integer i : sortUnique(arrayList)) {
            System.out.print(i + " ");
        }

    }

}
