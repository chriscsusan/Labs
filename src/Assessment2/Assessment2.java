package Assessment2;

import java.util.ArrayList;

public class Assessment2 {
	public static void main(String[] args){
		
		
		reverse("Eenie meenie minie moe");
		
		System.out.println(reverse2("Reverse this text."));
		
	}
	
	public static String reverse(String in){
		String out = "";
		ArrayList<Character> chars = new ArrayList<>();
		for(int i = in.length()-1; i >= 0 ; i--){
			chars.add(in.charAt(i));
		}
		
		for (char c : chars){
			out += c;
		}
		
		System.out.println(out);
		
		return out;
	}
	
	public static String reverse2(String in){
		String out = "";
		
		for (int i = in.length()-1; i >=0; i--){
			out += in.charAt(i);
		}
		return out;
	}
	

	
}
