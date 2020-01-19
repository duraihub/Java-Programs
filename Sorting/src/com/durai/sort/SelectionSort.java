package com.durai.sort;

public class SelectionSort {

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
	public static void sort(int a[],int n) {
		int temp;
		for(int i=0;i<n-1;i++) {
			int l=i;
			for(int j=i+1;j<n;j++) {
				if(a[j]<a[l]) {
					l=j;
				}
			}
			 temp=a[l];
			 a[l]=a[i];
			 a[i]=temp;
		}
	}
	public static void display(int a[]) {
		for(int s: a) {
			System.out.print(s+" ");
		}
	}

}
