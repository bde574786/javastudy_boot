package ch15;

public class MainTest4 {

	public static void main(String[] args) {

		 char[] alphabets = new char[26];
		 char ch = 'A';
		 
		 for(int i = 0; i < alphabets.length; i++) {
			 alphabets[i] = ch++;
		 }

		 for(int i = 0; i < alphabets.length; i++) {
			 System.out.println(alphabets[i] + "," + (int)alphabets[i]);
		 }
		 
	}

}
