import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Float;
/*Seneca Meeks
 * ACSL2
 */

public class ACSL2_STRING15_SM {

	public static StringBuilder rounding(StringBuilder s, float val, int dec, int req_length) //Rounding method
	{
		double div = (Math.pow(10, (double) dec)); 
		float round = Math.round(val * (Math.pow(10, (double) dec)));
		double fin_round = (round)/(div);  
		String fin_num = Double.toString(fin_round);
		s.append(fin_num); 
		viable(s, req_length, dec);
		return s;
	}  
	
	public static StringBuilder viable(StringBuilder a, int req_length, int dec)
	{
		char[] space = new char[req_length];
		Arrays.fill(space, '#');
		String r = a.toString();
		char[] nums = r.toCharArray(); 
		
		if((req_length) == a.length()){ //if no padding is required
			System.out.println(a);
			return a; 
		}
		
		else if((req_length) > a.length()){ //if left padding is required
			String output = new String(space);
			String output1 = new String(a); 
			String final_output = output.substring(output1.length()) + output1;
			StringBuilder b = new StringBuilder("");
			b.append(final_output); 
			System.out.println(b);
			return b;
		}
		
		else{ //if new format is required 
			space[(req_length)-(dec)-1] = '.'; 
			StringBuilder c = new StringBuilder("");
			String output = new String(space);
			c.append(output);
			System.out.println(c);
			return c; 
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		while(scan.hasNext()) { 	
			//Declarations
			String[] input = scan.nextLine().split(", "); //stores input
			String num = input[0]; 
			int req_length = Integer.parseInt(input[1]); 
			int dec_num = Integer.parseInt(input[2]);
			StringBuilder sign = new StringBuilder("");
			if(Character.isDigit(num.charAt(0))){
				Float val = Float.parseFloat(num);
				rounding(sign, val, dec_num, req_length);	
			}
			else{
				sign = sign.append(num.charAt(0));  
				String num1 = num.substring(1); 
				Float val = Float.parseFloat(num1);
				rounding(sign, val, dec_num, req_length);	
			}
		}
	}
}
