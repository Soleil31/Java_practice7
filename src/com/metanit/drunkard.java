package com.metanit;
import java.util.ArrayList;
import java.util.Scanner;
public class drunkard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a1 length: ");
        int size1 = input.nextInt();
        int a1[] = new int[size1];
        System.out.println("enter numbers: ");
        for (int i = 0; i < size1; i++) {
            a1[i] = input.nextInt();
        }
        System.out.println("enter a2 length: ");
        int size2 = input.nextInt();
        int a2[] = new int[size2];
        System.out.println("enter numbers: ");
        for (int i = 0; i < size2; i++) {
            a2[i] = input.nextInt();
        }
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr1.add(a1[i]);
            arr2.add(a2[i]);
        }
        int count = 0;
        boolean result = false;
        for (int i = 0; i < 106; i++) {
            count++;
            if (arr1.get(0) > arr2.get(0) || ((arr1.get(0) == 0) && (arr2.get(0) == 9))) {
                arr1.add(arr1.get(0));
                arr1.add(arr2.get(0));
            } else if (arr1.get(0) < arr2.get(0) || ((arr1.get(0) == 9) && (arr2.get(0) == 0))) {
                arr2.add(arr2.get(0));
                arr2.add(arr1.get(0));
            }
            arr1.remove(0);
            arr2.remove(0);
            if (arr1.size() == 0) {
                System.out.println("second " + count);
                result = true;
                break;
            } else if (arr2.size() == 0) {
                System.out.println("first " + count);
                result = true;
                break;
            }
        }
        if (!result) System.out.println("so bad!");
    }
}