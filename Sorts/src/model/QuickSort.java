package model;

public class QuickSort {
    public static void sort(int[] arr){
        quick(arr,0,arr.length-1);
    }

    private static void quick(int[] a,int l,int r){
        if(l<r){
            int p=partition(a,l,r);
            quick(a,l,p-1); quick(a,p+1,r);
        }
    }

    private static int partition(int[] a,int l,int r){
        int pivot=a[r];
        int i=l-1;
        for(int j=l;j<r;j++){
            if(a[j]<=pivot){
                i++; int t=a[i];a[i]=a[j];a[j]=t;
            }
        }
        int t=a[i+1];a[i+1]=a[r];a[r]=t;
        return i+1;
    }
}
