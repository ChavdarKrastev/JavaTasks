
import java.util.Scanner;
 
public class Task2c_PrintClusterCount {
 
    public static void main(String[] args) {
 
        //Creating the array and setting the number of its elements ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements");
        String str = sc.nextLine();
        int N = Integer.parseInt(str);
 
        int[] arr = new int[N];
 
        //Giving value to the elements
        for (int i = 0; i < N; i++) {
            System.out.println("enter element " + (i + 1));
            String str2 = sc.nextLine();
            int number = Integer.parseInt(str2);
 
            arr[i] = number;
        }
 
        //finding clusters
        int cluster = 0;
 
        for (int h = 0; h < N - 1; h++) {
            if (arr[h] == arr[h + 1]) {
                int count = h + 1;
                while (arr[h] == arr[count]) {
                    count++;
                }
                h = count;
                cluster++;
            }
        }
        System.out.println(cluster);
 
    }
    
}
