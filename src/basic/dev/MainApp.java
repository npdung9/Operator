package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		  System.out.println(" Nhap vao a ");
		  int a = sc.nextInt();
		
		  System.out.println(" Nhap vao b ");
		  int b = sc.nextInt();
		
	// Tính tổng, hiệu, tích, thương khi b = 0
		
		if(b==0) {
		
		  System.out.println(" Tong 2 so a va b la " + (a+b));
		  System.out.println(" Hieu 2 so a va b la " + (a-b));
		  System.out.println(" Tich 2 so a va b la " + (a*b));
		  System.out.println(" Thuong khong xac dinh ");
			
	// Tính tổng, hiệu, tích, thương khi b khác 0
		  
		}else {
			
		  System.out.println(" Tong 2 so a va b la " + (a+b));
		  System.out.println(" Hieu 2 so a va b la " + (a-b));
		  System.out.println(" Tich 2 so a va b la " + (a*b));
		  
		  float x = (float)a/ (float)b;
		  System.out.printf(" Thuong 2 so a va b la  %.2f",x);

		}
		
		

	}
}

