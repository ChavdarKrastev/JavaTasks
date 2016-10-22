package Task7_StackMax;

import java.util.Scanner;
import java.util.Stack;

public class Task7_StackMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] splittedStr = str.split(" ");

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> tempStack = new Stack<>();
        int max = 0;
        int temp = 0;

        while (!splittedStr[0].equals("END")) {
            switch (splittedStr[0]) {
                case "PUSH":
                    stack.push(Integer.parseInt(splittedStr[1]));
                    break;
                case "POP":
                    temp = stack.pop();
                    System.out.println(temp);
                    break;
                case "MAX":
                    while (!stack.isEmpty()) {
                        temp = stack.pop();
                        if (temp > max) {
                            max = temp;
                        }
                        tempStack.push(temp);
                    }
                    while (!tempStack.isEmpty()) {
                        stack.push(tempStack.pop());
                    }
                    System.out.println(max);
            }
            str = sc.nextLine();
            splittedStr = str.split(" ");
        }
        while(!stack.isEmpty())
        {
            System.out.print(stack.pop()+ " ");
        }
    }

}
