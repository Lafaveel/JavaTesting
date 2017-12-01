/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;
import java.util.*;
import java.lang.*;
import java.io.*;
/**
 *
 * @author Ethan
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int[] data = {4, 2, 5, 45, 13, 23, 78, 1};
        Sorter sor = new Sorter(data);
        sor.printArray();
        sor.quickSortHelper();
        sor.printArray();*/
        int[] array = new int[] {4, 7, 3, 6, 1, 2};
        for(int i = 1; array.length >= i; i++) {
            int key = array[i];
            int j = i - 1;
            while (j > -1 && array[j] > key) {
                array[j+1] = array[j];
                j = j - 1;
            }
            array[j+1] = key;
        }
        for(int s : array) {
            System.out.println(s);
        }
        
    }
    
    
}

class Sorter
{
    int arr[];
    Sorter(int array[])
    {
        arr = array;
    }
    
    private int partition(int arr[], int left, int right) {
        int i = left, j = right;
        int temp = 0;
        int pivot = arr[(left + right)/2];
        
        while(i <= j) {
            while(arr[i] < pivot)
                i++;
            while(arr[j] > pivot)
                j--;
            if(i <= j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return i;
    }
    
    public void quickSort(int arr[], int left, int right) {
        int index = partition(arr, left, right);
        if(left < index - 1)
            quickSort(arr, left, index - 1);
        if(index < right)
            quickSort(arr, index, right);
    }
    
    public void quickSortHelper() {
        quickSort(arr, 0, arr.length-1);
    }
    
    void printArray()
    {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
