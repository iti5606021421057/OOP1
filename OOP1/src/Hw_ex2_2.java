import java.io.*;
import javax.swing.JOptionPane;
//----------------------------------------------------------------------------------------------------------------------------------
public class Hw_ex2_2{
	boolean n1= true,n2=false,n3=false,b=false;
	public void getData(String round){
		for(int i=0;i<round.length();i++){
			char a;
			a = round.charAt(i);
			if((a != 'A') && (a != 'B') && (a != 'C')){
				JOptionPane.showMessageDialog(null,"!!! >>> Error score <<< !!!","Message",JOptionPane.ERROR_MESSAGE);
				round = " ";
			}
		}
	}
//----------------------------------------------------------------------------------------------------------------------------------
	public void Calc(String round){
		for(int i=0;i<round.length();i++){
			char a;
			a = round.charAt(i);
			if(a == 'A'){
				b = n2;
				n2 = n1;
				n1 = b;
			}else if(a == 'B'){
				b = n3;
				n3 = n2;
				n2 = b;
			}else if(a == 'C'){
				b = n3;
				n3 = n1;
				n1 = b;
			}
		}
	}
//----------------------------------------------------------------------------------------------------------------------------------	
	public void Print(String round){
		if(round.equals(" ")){
		}else if(n1){
			JOptionPane.showMessageDialog(null,"1","Message",JOptionPane.INFORMATION_MESSAGE);
		}else if(n2){
			JOptionPane.showMessageDialog(null,"2","Message",JOptionPane.INFORMATION_MESSAGE);
		}else if(n3){
			JOptionPane.showMessageDialog(null,"3","Message",JOptionPane.INFORMATION_MESSAGE);
		}
	}
//----------------------------------------------------------------------------------------------------------------------------------
	public static void main(String[] args){
		String round;
		round = JOptionPane.showInputDialog(null,"Enter Input :___?","Input",JOptionPane.QUESTION_MESSAGE);
		Hw_ex2_2 TK = new Hw_ex2_2();
		TK.getData(round);
		TK.Calc(round);
		TK.Print(round);
	}
}