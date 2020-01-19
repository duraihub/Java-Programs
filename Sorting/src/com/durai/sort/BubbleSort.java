package com.durai.sort;

public class BubbleSort {

	public static void main(String[] args) {
		int [] a= {44,25,57,7,17,34};
		int n=a.length;
		System.out.println("Before sort");
		display(a,n);
		sort(a,n);
		System.out.println();
		System.out.println("After sort");
		display(a,n);
		
	}
	public static void sort(int []a,int n) {
		int temp;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	public static void display(int []a,int n) {
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
