package com.durai.sort;

public class InsertionSort {

	public static void main(String[] args) {
		int [] a= {44,25,57,7,17,34};
		int n=a.length;
		System.out.println("Before sort");
		display(a);
		sort(a,n);
		System.out.println();
		System.out.println("After sort");
		display(a);
	}
	public static void sort(int []a,int n) {
		for(int i=1;i<n;i++) {
			int key=a[i];
			int j=i-1;
			while(j>-1 && a[j]>key) {
				a[j+1]=a[j];
				j--;
				
			}
			a[j+1]=key;
		}
	}
	public static void display(int []a) {
		for(int s : a) {
			System.out.print(s+" ");
		}
	}

}
