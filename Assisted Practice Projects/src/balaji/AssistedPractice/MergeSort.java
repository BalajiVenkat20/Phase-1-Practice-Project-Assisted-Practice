package balaji.AssistedPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeSort {

    public static void main(String[] args) {
        int size = 5 ;
      double[] arrayList = new double[size];
      for(int i = 0 ; i < arrayList.length ; ++i){
          arrayList[i] = (Math.random()*1000);
          Scanner scan = new Scanner (System.in);
      }

        mergeSort(arrayList,0,arrayList.length-1);
        print(arrayList);

    }
    public static void print(double []  arrayList){
        for(int i = 0 ; i < arrayList.length; ++i){
            System.out.println(arrayList[i]);
        }
    }
    public  static void mergeSort(double [] arr , int l , int r){
        if(l<r){
            int m = l+(r-l)/2;

            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);

            merge(arr,l , m , r);
        }

    }

    public  static void merge(double[] unsorted, int l , int m , int r){
        int i ,j ,k;
        int arr1 = m - l +1;
        int arr2 = r - m ;
        double [] left = new double[arr1];
        double [] right = new double[arr2];
        for(int f = 0 ; f < arr1 ; ++f){
            left[f] = unsorted[l+f];
        }
        for (int s = 0 ; s < arr2 ; ++s){
           right[s] = unsorted[m+1+s];
        }

        i = j = 0;
        k = l ;

        while(i < arr1 && j < arr2){
            if(left[i] <= right[j]){
                unsorted[k] = left[i];
                ++i;
            }
            else {
                unsorted[k]= right[j];
                ++j;
            }
            ++k;
        }

        while(i<arr1){
            unsorted[k] = left[i];
            ++i;++k;
        }
        while(j<arr2){
            unsorted[k] = right[j];
            ++j;++k;
        }


    }
}

