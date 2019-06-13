package com.jimmyyouhei.recursion;

import java.util.LinkedList;

public interface Recursion {

    static int factorialHeadRecursion(int n){

        if (n == 1){
            return 1;
        }

        return n * factorialHeadRecursion(n-1);

    }

    static int factorialTailRecursion(int n){

        return factorialTailRecursion(n ,1);

    }

    private static int factorialTailRecursion(int n , int result){

        if (n==1){
            return result;
        }

        return factorialTailRecursion(n-1 ,n*result );

    }

    static void printLinkedList (LinkedList<Integer> linkedList){

        LinkedList<Integer> copy = new LinkedList<>();
        copy = (LinkedList<Integer>) linkedList.clone();

        printLinkedList(copy , copy.size());

    }

    private static void printLinkedList (LinkedList<Integer> linkedList , int size){

        if (size == 0){
            return;
        }

        System.out.println(linkedList.peekFirst());
        linkedList.removeFirst();

        printLinkedList(linkedList , linkedList.size());

    }

    static void printLinkedListReverse(LinkedList<Integer> linkedList){
        LinkedList<Integer> copy = new LinkedList<>();
        copy = (LinkedList<Integer>) linkedList.clone();

        printLinkedListReverse(copy,copy.size());

    }

    private static void printLinkedListReverse (LinkedList<Integer> linkedList , int size){

        if (size == 0){
            return;
        }

        System.out.println(linkedList.peekLast());
        linkedList.removeLast();

        printLinkedListReverse(linkedList , linkedList.size());

    }

    static int greatestCommonDivisor (int n , int l){
        int high , low;

        if (n >= l){
            high = n;
            low = l;
        } else{
            high =l;
            low = n;
        }

        int remainder = high % low;

        if (remainder == 0){
            return low;
        } else {
            return greatestCommonDivisor(low,remainder);
        }
    }


    static String decimalToBinary(int n){

        String result = "";

        return new StringBuilder(decimalToBinary(n , result)).reverse().toString();

    }


    private static String decimalToBinary(int n , String result) {
        if (n == 0) {
            return result;
        }else {
            result += n%2;
            return decimalToBinary(n/2 ,result);
        }
    }

    static int powerMethod(int baseNumber , int times){

        if (times == 1){
            return baseNumber;
        }

        return baseNumber* powerMethod(baseNumber , times-1);

    }

    static void printFibonacciSequence (int n){

        String result = "0 ";
        for (int i = 1 ; i<= n ; i++){
            result += fibonacci(i) +" ";
        }

        System.out.println(result);

    }

    private static int fibonacci (int n){
        if (n==0){
            return 0;
        } if (n ==1){
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }


    }

}
