import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*; 


public class ACSL4_REGEX15_SM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder out = new StringBuilder("");
		Pattern p = null;
		String[] input = null;
		ArrayList<String> text = new ArrayList<String>();
		Matcher m = null;
		Scanner scan = new Scanner(System.in); 
		input = scan.nextLine().split(", ");

		for (int i = 0; i < 6; i++) {
			p = Pattern.compile(scan.nextLine());
			for (int j = 0; j < input.length; j++) {
				m = p.matcher(input[j]);
				boolean b = m.matches();
				if(b == true){
					//String output = "";
					text.add(input[j]);
					out.append(input[j] + ", ");
				}
			}
			String str = out.substring(0, out.length()-2);
			System.out.println(str);
			out.delete(0, out.length());
		}
	}		
}





