import java.io.*;
import javax.swing.JOptionPane;
public class Hw_ex1_2{
	int people1,people2,people3,people4,people5,people6,people7,people8,people9,sum;
	
// ==========================================================================================================================================================
	
	public void getData(){
		
// คนที่ 1 ==========================================================================================================================================================	
		people1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter People number [ 1 ] : ","!!! >>> Input <<< !!!",JOptionPane.QUESTION_MESSAGE));
		while(people1 >= 100){
			JOptionPane.showMessageDialog(null,"!!! >>> Error score <<< !!!","Message",JOptionPane.ERROR_MESSAGE);
			people1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Agin Enter People number [ 1 ] : ","!!! >>> Input <<< !!!",JOptionPane.QUESTION_MESSAGE));
			System.out.println();
		}
// คนที่ 2 ==========================================================================================================================================================			
		people2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter People number [ 2 ] : ","!!! >>> Input <<< !!!",JOptionPane.QUESTION_MESSAGE));
		while(people2 >= 100 || people2 == people2){
			JOptionPane.showMessageDialog(null,"!!! >>> Error score <<< !!!","Message",JOptionPane.ERROR_MESSAGE);
			people2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Agin Enter People number [ 2 ] : ","!!! >>> Input <<< !!!",JOptionPane.QUESTION_MESSAGE));
			System.out.println();
		}
// คนที่ 3 ==========================================================================================================================================================	
		people3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter People number [ 3 ] : ","!!! >>> Input <<< !!!",JOptionPane.QUESTION_MESSAGE));
		while(people3 >= 100 || people3 == people2 || people3 == people1){
			JOptionPane.showMessageDialog(null,"!!! >>> Error score <<< !!!","Message",JOptionPane.ERROR_MESSAGE);
			people3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Agin Enter People number [ 3 ] : ","!!! >>> Input <<< !!!",JOptionPane.QUESTION_MESSAGE));
			System.out.println();
		}
// คนที่ 4 ==========================================================================================================================================================	
		people4 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter People number [ 4 ] : ","!!! >>> Input <<< !!!",JOptionPane.QUESTION_MESSAGE));
		while(people4 >= 100 || people4 == people3 || people4 == people2 || people4 == people1){
			JOptionPane.showMessageDialog(null,"!!! >>> Error score <<< !!!","Message",JOptionPane.ERROR_MESSAGE);
			people4 = Integer.parseInt(JOptionPane.showInputDialog(null,"Agin Enter People number [ 4 ] : ","!!! >>> Input <<< !!!",JOptionPane.QUESTION_MESSAGE));
			System.out.println();
		}
// คนที่ 5 ==========================================================================================================================================================	
		people5 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter People number [ 5 ] : ","!!! >>> Input <<< !!!",JOptionPane.QUESTION_MESSAGE));
		while(people5 >= 100 || people5 == people4 || people5 == people3 || people5 == people2 || people5 == people1){
			JOptionPane.showMessageDialog(null,"!!! >>> Error score <<< !!!","Message",JOptionPane.ERROR_MESSAGE);
			people5 = Integer.parseInt(JOptionPane.showInputDialog(null,"Agin Enter People number [ 5 ] : ","!!! >>> Input <<< !!!",JOptionPane.QUESTION_MESSAGE));
			System.out.println();
		}
// คนที่ 6 ==========================================================================================================================================================	
		people6 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter People number [ 6 ] : ","!!! >>> Input <<< !!!",JOptionPane.QUESTION_MESSAGE));
		while(people6 >= 100 || people6 == people5 || people6 == people4 || people6 == people3 || people6 == people2 || people6 == people1){
			JOptionPane.showMessageDialog(null,"!!! >>> Error score <<< !!!","Message",JOptionPane.ERROR_MESSAGE);
			people6 = Integer.parseInt(JOptionPane.showInputDialog(null,"Agin Enter People number [ 6 ] : ","!!! >>> Input <<< !!!",JOptionPane.QUESTION_MESSAGE));
			System.out.println();
		}
// คนที่ 7 ==========================================================================================================================================================			
		people7 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter People number [ 7 ] : ","!!! >>> Input <<< !!!",JOptionPane.QUESTION_MESSAGE));
		while(people7 >= 100 || people7 == people6 || people7 == people5 || people7 == people4 || people7 == people3 || people7 == people2 || people7 == people1){
			JOptionPane.showMessageDialog(null,"!!! >>> Error score <<< !!!","Message",JOptionPane.ERROR_MESSAGE);
			people7 = Integer.parseInt(JOptionPane.showInputDialog(null,"Agin Enter People number [ 7 ] : ","!!! >>> Input <<< !!!",JOptionPane.QUESTION_MESSAGE));
			System.out.println();
		}
// คนที่ 8 ==========================================================================================================================================================	
		people8 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter People number [ 8 ] : ","!!! >>> Input <<< !!!",JOptionPane.QUESTION_MESSAGE));
		while(people8 >= 100 || people8 == people7 || people8 == people6 || people8 == people5 || people8 == people4 || people8 == people3 || people8 == people2 || people8 == people1){
			JOptionPane.showMessageDialog(null,"!!! >>> Error score <<< !!!","Message",JOptionPane.ERROR_MESSAGE);
			people8 = Integer.parseInt(JOptionPane.showInputDialog(null,"Agin Enter People number [ 8 ] : ","!!! >>> Input <<< !!!",JOptionPane.QUESTION_MESSAGE));
			System.out.println();
		}
// คนที่ 9 ==========================================================================================================================================================		
		people9 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter People number [ 9 ] : ","!!! >>> Input <<< !!!",JOptionPane.QUESTION_MESSAGE));
		while(people9 >= 100 || people9 == people8 || people9 == people7 || people9 == people6 || people9 == people5 || people9 == people4 || people9 == people3 || people9 == people2 || people9 == people1){
			JOptionPane.showMessageDialog(null,"!!! >>> Error score <<< !!!","Message",JOptionPane.ERROR_MESSAGE);
			people9 = Integer.parseInt(JOptionPane.showInputDialog(null,"Agin Enter People number [ 9 ] : ","!!! >>> Input <<< !!!",JOptionPane.QUESTION_MESSAGE));
			System.out.println();
		}	
		sum = people1+people2+people3+people4+people5+people6+people7+people8+people9;
	}

//  ============================================================================================================================================================
	public void Print()	{
		if((sum - people1 - people2) == 100){
			JOptionPane.showMessageDialog(null,"Sum = "+people3+" "+people4+" "+people5+" "+people6+" "+people7+" "+people8+" "+people9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}else if((sum - people1 - people3) == 100){
			JOptionPane.showMessageDialog(null,"Sum = "+people2+" "+people4+" "+people5+" "+people6+" "+people7+" "+people8+" "+people9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}else if((sum - people1 - people4) == 100){
			JOptionPane.showMessageDialog(null,"Sum = "+people2+" "+people3+" "+people5+" "+people6+" "+people7+" "+people8+" "+people9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}else if((sum - people1 - people5) == 100){
			JOptionPane.showMessageDialog(null,"Sum = "+people2+" "+people3+" "+people4+" "+people6+" "+people7+" "+people8+" "+people9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}else if((sum - people1 - people6) == 100){
			JOptionPane.showMessageDialog(null,"Sum = "+people2+" "+people3+" "+people4+" "+people5+" "+people7+" "+people8+" "+people9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}else if((sum - people1 - people7) == 100){
			JOptionPane.showMessageDialog(null,"Sum = "+people2+" "+people3+" "+people4+" "+people5+" "+people6+" "+people8+" "+people9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}else if((sum - people1 - people8) == 100){
			JOptionPane.showMessageDialog(null,"Sum = "+people2+" "+people3+" "+people4+" "+people5+" "+people6+" "+people7+" "+people9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}else if((sum - people1 - people9) == 100){
			JOptionPane.showMessageDialog(null,"Sum = "+people2+" "+people3+" "+people4+" "+people5+" "+people6+" "+people7+" "+people8,"Message",JOptionPane.INFORMATION_MESSAGE);
		}else if((sum - people2 - people3) == 100){
			JOptionPane.showMessageDialog(null,"Sum = "+people1+" "+people4+" "+people5+" "+people6+" "+people7+" "+people8+" "+people9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}else if((sum - people2 - people4) == 100){
			JOptionPane.showMessageDialog(null,"Sum = "+people1+" "+people3+" "+people5+" "+people6+" "+people7+" "+people8+" "+people9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}else if((sum - people2 - people5) == 100){
			JOptionPane.showMessageDialog(null,"Sum = "+people1+" "+people3+" "+people4+" "+people6+" "+people7+" "+people8+" "+people9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}else if((sum - people2 - people6) == 100){
			JOptionPane.showMessageDialog(null,"Sum = "+people1+" "+people3+" "+people4+" "+people5+" "+people7+" "+people8+" "+people9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}else if((sum - people2 - people7) == 100){
			JOptionPane.showMessageDialog(null,"Sum = "+people1+" "+people3+" "+people4+" "+people5+" "+people6+" "+people8+" "+people9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}else if((sum - people2 - people8) == 100){
			JOptionPane.showMessageDialog(null,"Sum = "+people1+" "+people3+" "+people4+" "+people5+" "+people6+" "+people7+" "+people9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}else if((sum - people2 - people9) == 100){
			JOptionPane.showMessageDialog(null,"Sum = "+people1+" "+people3+" "+people4+" "+people5+" "+people6+" "+people7+" "+people8,"Message",JOptionPane.INFORMATION_MESSAGE);
		}else if((sum - people3 - people4) == 100){
			JOptionPane.showMessageDialog(null,"Sum = "+people1+" "+people2+" "+people5+" "+people6+" "+people7+" "+people8+" "+people9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}else if((sum - people3 - people5) == 100){
			JOptionPane.showMessageDialog(null,"Sum = "+people1+" "+people2+" "+people4+" "+people6+" "+people7+" "+people8+" "+people9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}else if((sum - people3 - people6) == 100){
			JOptionPane.showMessageDialog(null,"Sum = "+people1+" "+people2+" "+people4+" "+people5+" "+people7+" "+people8+" "+people9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}else if((sum - people3 - people7) == 100){
			JOptionPane.showMessageDialog(null,"Sum = "+people1+" "+people2+" "+people4+" "+people5+" "+people6+" "+people8+" "+people9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}else if((sum - people3 - people8) == 100){
			JOptionPane.showMessageDialog(null,"Sum = "+people1+" "+people2+" "+people4+" "+people5+" "+people6+" "+people7+" "+people9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}else if((sum - people3 - people9) == 100){
			JOptionPane.showMessageDialog(null,"Sum = "+people1+" "+people2+" "+people4+" "+people5+" "+people6+" "+people7+" "+people8,"Message",JOptionPane.INFORMATION_MESSAGE);
		}else if((sum - people4 - people5) == 100){
			JOptionPane.showMessageDialog(null,"Sum = "+people1+" "+people2+" "+people3+" "+people6+" "+people7+" "+people8+" "+people9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}else if((sum - people4 - people6) == 100){
			JOptionPane.showMessageDialog(null,"Sum = "+people1+" "+people2+" "+people3+" "+people5+" "+people7+" "+people8+" "+people9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}else if((sum - people4 - people7) == 100){
			JOptionPane.showMessageDialog(null,"Sum = "+people1+" "+people2+" "+people3+" "+people5+" "+people6+" "+people8+" "+people9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}else if((sum - people4 - people8) == 100){
			JOptionPane.showMessageDialog(null,"Sum = "+people1+" "+people2+" "+people3+" "+people5+" "+people6+" "+people7+" "+people9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}else if((sum - people4 - people9) == 100){
			JOptionPane.showMessageDialog(null,"Sum = "+people1+" "+people2+" "+people3+" "+people5+" "+people6+" "+people7+" "+people8,"Message",JOptionPane.INFORMATION_MESSAGE);
		}else if((sum - people5 - people6) == 100){
			JOptionPane.showMessageDialog(null,"Sum = "+people1+" "+people2+" "+people3+" "+people4+" "+people7+" "+people8+" "+people9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}else if((sum - people5 - people7) == 100){
			JOptionPane.showMessageDialog(null,"Sum = "+people1+" "+people2+" "+people3+" "+people4+" "+people6+" "+people8+" "+people9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}else if((sum - people5 - people8) == 100){
			JOptionPane.showMessageDialog(null,"Sum = "+people1+" "+people2+" "+people3+" "+people4+" "+people6+" "+people7+" "+people9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}else if((sum - people5 - people9) == 100){
			JOptionPane.showMessageDialog(null,"Sum = "+people1+" "+people2+" "+people3+" "+people4+" "+people6+" "+people7+" "+people8,"Message",JOptionPane.INFORMATION_MESSAGE);
		}else if((sum - people6 - people7) == 100){
			JOptionPane.showMessageDialog(null,"Sum = "+people1+" "+people2+" "+people3+" "+people4+" "+people5+" "+people8+" "+people9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}else if((sum - people6 - people8) == 100){
			JOptionPane.showMessageDialog(null,"Sum = "+people1+" "+people2+" "+people3+" "+people4+" "+people5+" "+people7+" "+people9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}else if((sum - people6 - people9) == 100){
			JOptionPane.showMessageDialog(null,"Sum = "+people1+" "+people2+" "+people3+" "+people4+" "+people5+" "+people7+" "+people8,"Message",JOptionPane.INFORMATION_MESSAGE);
		}else if((sum - people7 - people8) == 100){
			JOptionPane.showMessageDialog(null,"Sum = "+people1+" "+people2+" "+people3+" "+people4+" "+people5+" "+people6+" "+people9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}else if((sum - people7 - people9) == 100){
			JOptionPane.showMessageDialog(null,"Sum = "+people1+" "+people2+" "+people3+" "+people4+" "+people5+" "+people6+" "+people8,"Message",JOptionPane.INFORMATION_MESSAGE);
		}else if((sum - people8 - people9) == 100){
			JOptionPane.showMessageDialog(null,"Sum = "+people1+" "+people2+" "+people3+" "+people4+" "+people5+" "+people6+" "+people7,"Message",JOptionPane.INFORMATION_MESSAGE);
		}else{
			JOptionPane.showMessageDialog(null,"!!! >>> Error Score All <<< !!!","Message",JOptionPane.ERROR_MESSAGE);
		}
	}
	
//	============================================================================================================================================================================
	public static void main(String[] args) {		
		Hw_ex1_2 SD = new Hw_ex1_2();
		SD.getData();
		SD.Print();
	}
}