package org.univ;

public class AscendingOrder {

	public static void main(String[] args) {
int a[]= {10,60,20,20,90,100,45,60};
//System.out.println(a.length);
int temp;
for (int i = 0; i < a.length; i++) {
	for (int j = i+1 ; j < a.length; j++) {
		if (a[i]>a[j]) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		
	}
	System.out.println(a[i]);
}
	}

}
