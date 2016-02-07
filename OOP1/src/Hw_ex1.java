import java.io.*;
import javax.swing.JOptionPane;
import java.util.*;
public class Hw_ex1 {

	public static void main(String[] args){
		Scanner gold = new Scanner(System.in);
		int people1,people2,people3,people4,people5,people6,people7,people8,people9,sum;
		
// คนที่ 1 ==========================================================================================================================================================		
		System.out.printf("Enter People number [ 1 ] : ");
		people1 = gold.nextInt();
		while(people1 >= 100)
		{
			System.out.println("!!! >>> Error score <<< !!! ");
			System.out.printf("Agin Enter People number [ 1 ] : ");
			people1 = gold.nextInt();
			System.out.println();
		}
		
// คนที่ 2 ==========================================================================================================================================================
		System.out.printf("Enter People number [ 2 ] : ");
		people2 = gold.nextInt();

		while(people2 >= 100 || people2 == people1)
		{
			System.out.println("!!! >>> Error score <<< !!! ");
			System.out.printf("Agin Enter People number [ 2 ] : ");
			people2 = gold.nextInt();
			System.out.println();
		}
		
// คนที่ 3 ==========================================================================================================================================================		
		System.out.printf("Enter People number [ 3 ] : ");
		people3 = gold.nextInt();
		while(people3 >= 100 || people3 == people2 || people3 == people1)
		{
			System.out.println("!!! >>> Error score <<< !!! ");
			System.out.printf("Agin Enter People number [ 3 ] : ");
			people3 = gold.nextInt();
			System.out.println();
		}
		
// คนที่ 4 ===========================================================================================================================================================		
		System.out.printf("Enter People number [ 4 ] : ");
		people4 = gold.nextInt();
		while(people4 >= 100 || people4 == people3 || people4 == people2 || people4 == people1)
		{
			System.out.println("!!! >>> Error score <<< !!! ");
			System.out.printf("Agin Enter People number [ 4 ] : ");
			people4 = gold.nextInt();
			System.out.println();
		}
		
// คนที่ 5 ===========================================================================================================================================================		
		System.out.printf("Enter People number [ 5 ] : ");
		people5 = gold.nextInt();
		while(people5 >= 100 || people5 == people4 || people5 == people3 || people5 == people2 || people5 == people1)
		{
			System.out.println("!!! >>> Error score <<< !!! ");
			System.out.printf("Agin Enter People number [ 5 ] : ");
			people5 = gold.nextInt();
			System.out.println();
		}
		
// คนที่ 6 ===========================================================================================================================================================
		System.out.printf("Enter People number [ 6 ] : ");
		people6 = gold.nextInt();	
		while(people6 >= 100 || people6 == people5 || people6 == people4 || people6 == people3 || people6 == people2 || people6 == people1)
		{
			System.out.println("!!! >>> Error score <<< !!! ");
			System.out.printf("Agin Enter People number [ 6 ] : ");
			people6 = gold.nextInt();
			System.out.println();
		}
		
// คนที่ 7 ===========================================================================================================================================================
		System.out.printf("Enter People number [ 7 ] : ");
		people7 = gold.nextInt();
	while(people7 >= 100 || people7 == people6 || people7 == people5 || people7 == people4 || people7 == people3 || people7 == people2 || people7 == people1)
		{
			System.out.println("!!! >>> Error score <<< !!! ");
			System.out.printf("Agin Enter People number [ 7 ] : ");
			people7 = gold.nextInt();
			System.out.println();
		}
	
// คนที่ 8 ===========================================================================================================================================================	
		System.out.printf("Enter People number [ 8 ]: ");
		people8 = gold.nextInt();
		while(people8 >= 100 || people8 == people7 || people8 == people6 || people8 == people5 || people8 == people4 || people8 == people3 || people8 == people2 || people8 == people1)
		{
			System.out.println("!!! >>> Error score <<< !!! ");
			System.out.printf("Agin  Enter People number [ 8 ] : ");
			people8 = gold.nextInt();
			System.out.println();
		}
// คนที่ 9 ============================================================================================================================================================		
		System.out.printf("Enter People number [ 9 ] : ");
		people9 = gold.nextInt();
		while(people9 >= 100 || people9 == people8 || people9 == people7 || people9 == people6 || people9 == people5 || people9 == people4 || people9 == people3 || people9 == people2 || people9 == people1)
		{
			System.out.println("!!! >>> Error score <<< !!! ");
			System.out.printf("Agin Enter People number [ 9 ] : ");
			people9 = gold.nextInt();
			System.out.println();
		}
// ผลรวมทั้งหมด  ============================================================================================================================================================
		
				sum = people1 + people2 + people3 + people4 + people5 + people6 + people7 + people8 + people9 ;	
				if((sum - people1 - people2) == 100){
					System.out.println("Sum = "+people3+" "+people4+" "+people5+" "+people6+" "+people7+" "+people8+" "+people9);
					
				}else if((sum - people1 - people3) == 100){
					System.out.println("Sum = "+people2+" "+people4+" "+people5+" "+people6+" "+people7+" "+people8+" "+people9);
					
				}else if((sum - people1 - people4) == 100){
					System.out.println("Sum = "+people2+" "+people3+" "+people5+" "+people6+" "+people7+" "+people8+" "+people9);
					
				}else if((sum - people1 - people5) == 100){
					System.out.println("Sum = "+people2+" "+people3+" "+people4+" "+people6+" "+people7+" "+people8+" "+people9);
					
				}else if((sum - people1 - people6) == 100){
					System.out.println("Sum = "+people2+" "+people3+" "+people4+" "+people5+" "+people7+" "+people8+" "+people9);
					
				}else if((sum - people1 - people7) == 100){
					System.out.println("Sum = "+people2+" "+people3+" "+people4+" "+people5+" "+people6+" "+people8+" "+people9);
					
				}else if((sum - people1 - people8) == 100){
					System.out.println("Sum = "+people2+" "+people3+" "+people4+" "+people5+" "+people6+" "+people7+" "+people9);
					
				}else if((sum - people1 - people9) == 100){
					System.out.println("Sum = "+people2+" "+people3+" "+people4+" "+people5+" "+people6+" "+people7+" "+people8);
					
				}else if((sum - people2 - people3) == 100){
					System.out.println("Sum = "+people1+" "+people4+" "+people5+" "+people6+" "+people7+" "+people8+" "+people9);
					
				}else if((sum - people2 - people4) == 100){
					System.out.println("Sum = "+people1+" "+people3+" "+people5+" "+people6+" "+people7+" "+people8+" "+people9);
					
				}else if((sum - people2 - people5) == 100){
					System.out.println("Sum = "+people1+" "+people3+" "+people4+" "+people6+" "+people7+" "+people8+" "+people9);
					
				}else if((sum - people2 - people6) == 100){
					System.out.println("Sum = "+people1+" "+people3+" "+people4+" "+people5+" "+people7+" "+people8+" "+people9);
					
				}else if((sum - people2 - people7) == 100){
					System.out.println("Sum = "+people1+" "+people3+" "+people4+" "+people5+" "+people6+" "+people8+" "+people9);
					
				}else if((sum - people2 - people8) == 100){
					System.out.println("Sum = "+people1+" "+people3+" "+people4+" "+people5+" "+people6+" "+people7+" "+people9);
					
				}else if((sum - people2 - people9) == 100){
					System.out.println("Sum = "+people1+" "+people3+" "+people4+" "+people5+" "+people6+" "+people7+" "+people8);
					
				}else if((sum - people3 - people4) == 100){
					System.out.println("Sum = "+people1+" "+people2+" "+people5+" "+people6+" "+people7+" "+people8+" "+people9);
					
				}else if((sum - people3 - people5) == 100){
					System.out.println("Sum = "+people1+" "+people2+" "+people4+" "+people6+" "+people7+" "+people8+" "+people9);
					
				}else if((sum - people3 - people6) == 100){
					System.out.println("Sum = "+people1+" "+people2+" "+people4+" "+people5+" "+people7+" "+people8+" "+people9);
					
				}else if((sum - people3 - people7) == 100){
					System.out.println("Sum = "+people1+" "+people2+" "+people4+" "+people5+" "+people6+" "+people8+" "+people9);
					
				}else if((sum - people3 - people8) == 100){
					System.out.println("Sum = "+people1+" "+people2+" "+people4+" "+people5+" "+people6+" "+people7+" "+people9);
					
				}else if((sum - people3 - people9) == 100){
					System.out.println("Sum = "+people1+" "+people2+" "+people4+" "+people5+" "+people6+" "+people7+" "+people8);
					
				}else if((sum - people4 - people5) == 100){
					System.out.println("Sum = "+people1+" "+people2+" "+people3+" "+people6+" "+people7+" "+people8+" "+people9);
					
				}else if((sum - people4 - people6) == 100){
					System.out.println("Sum = "+people1+" "+people2+" "+people3+" "+people5+" "+people7+" "+people8+" "+people9);
					
				}else if((sum - people4 - people7) == 100){
					System.out.println("Sum = "+people1+" "+people2+" "+people3+" "+people5+" "+people6+" "+people8+" "+people9);
					
				}else if((sum - people4 - people8) == 100){
					System.out.println("Sum = "+people1+" "+people2+" "+people3+" "+people5+" "+people6+" "+people7+" "+people9);
					
				}else if((sum - people4 - people9) == 100){
					System.out.println("Sum = "+people1+" "+people2+" "+people3+" "+people5+" "+people6+" "+people7+" "+people8);
					
				}else if((sum - people5 - people6) == 100){					
					System.out.println("Sum = "+people1+" "+people2+" "+people3+" "+people4+" "+people7+" "+people8+" "+people9);
					
				}else if((sum - people5 - people7) == 100){
					System.out.println("Sum = "+people1+" "+people2+" "+people3+" "+people4+" "+people6+" "+people8+" "+people9);
					
				}else if((sum - people5 - people8) == 100){
					System.out.println("Sum = "+people1+" "+people2+" "+people3+" "+people4+" "+people6+" "+people7+" "+people9);
					
				}else if((sum - people5 - people9) == 100){
					System.out.println("Sum = "+people1+" "+people2+" "+people3+" "+people4+" "+people6+" "+people7+" "+people8);
					
				}else if((sum - people6 - people7) == 100){
					System.out.println("Sum = "+people1+" "+people2+" "+people3+" "+people4+" "+people5+" "+people8+" "+people9);
					
				}else if((sum - people6 - people8) == 100){
					System.out.println("Sum = "+people1+" "+people2+" "+people3+" "+people4+" "+people5+" "+people7+" "+people9);
					
				}else if((sum - people6 - people9) == 100){
					System.out.println("Sum = "+people1+" "+people2+" "+people3+" "+people4+" "+people5+" "+people7+" "+people8);
					
				}else if((sum - people7 - people8) == 100){
					System.out.println("Sum = "+people1+" "+people2+" "+people3+" "+people4+" "+people5+" "+people6+" "+people9);
					
				}else if((sum - people7 - people9) == 100){
					System.out.println("Sum = "+people1+" "+people2+" "+people3+" "+people4+" "+people5+" "+people6+" "+people8);
					
				}else if((sum - people8 - people9) == 100){
					System.out.println("Sum = "+people1+" "+people2+" "+people3+" "+people4+" "+people5+" "+people6+" "+people7);
					
				}else{
					System.out.println("!!! >>> Error Score All <<< !!!");
				}			
		}
//	============================================================================================================================================================================
	}

