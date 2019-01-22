package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[6];
        Scanner read = new Scanner(System.in);
        for(int n=0; n<array.length;n++){
            array[n] = read.nextInt();
            read.nextLine();
        }
        read.close();
        System.out.println("old");
        show_array(array);
        insertion_sort(array);
        System.out.println("new");
        show_array(array);

    }
    public static void shell_sort(int[] array){
        for(int gap = array.length/2;gap>0;gap/=2){
            for(int i = gap; i<array.length;i+=1){
                int newElement = array[i];
                int j =i;
                while(j>=gap&& array[j-gap]>newElement){
                    array[j] = array[j-gap];
                    j-=gap;
                }
                array[j]= newElement;

            }
        }
        return;
    }



    public static void insertion_sort(int[] array){
        for(int n=0; n< array.length;n++){
            int tmp = array[n];
            int i =0;
            for(i=n; i>0 && array[i-1] > tmp;i--){
                array[i] = array[i-1];
            }
            array[i] = tmp;

        }
    }



    public static void bubble_sort(int[] array){
        for(int last_element = array.length - 1; last_element > 0; last_element --){
            for(int i = 1; i<= last_element;i++){
                if(array[i]< array[i-1]){
                    swap(array,i,i-1);
                }
            }
        }


    }
    public static void selection_sort(int[] array){
        for(int last_element = array.length - 1; last_element > 0; last_element --){
            int largest = 0;
            for(int i =1; i<= last_element;i++){
                if(array[i] > array[largest]){
                    largest = i;
                }
            }
            swap(array,last_element,largest);
        }


    }
    public static void show_array(int[] array){
        for(int n=0; n<array.length;n++){
            System.out.println(array[n]);
        }
    }
    public static void swap(int[] array,int i,int j){
        if(i==j) return;


        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
        return;
    }


}
