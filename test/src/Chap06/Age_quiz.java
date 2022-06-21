package Chap06;

import java.util.Scanner;

public class Age_quiz {
    public static void main(String[] args) throws Exception {
        System.out.println("Start");
        Scanner sc = new Scanner(System.in);
        int left = 20;
        int right = 36;

        // 후보가 하나가 될 때까지 반복
        while (right - left > 1) {
            int mid = left + (right - left) / 2;
            System.out.println("Is the age less than " + mid + "?(yes/no)");
            String input = sc.next();
            if (!input.equals("yes") && !input.equals("no")) {
                System.out.println("answer yes or no");
                continue;
            }
            if (input.equals("yes")) {
                right = mid;
            } else {
                left = mid;
            }
        }
        System.out.println("The age is " + left);
        sc.close();
    }
}
