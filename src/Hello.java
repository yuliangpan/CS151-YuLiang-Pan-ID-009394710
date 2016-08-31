import java.io.PrintWriter;
import java.util.Scanner;




//YuLiang Pan
//009394710
//CS151 Homework 1
public class Hello {
	
	private static void uniqueLetters(String st) {
	 int stLen = st.length();
	 char c;
	 for (int i = 0; i < stLen; i++) {
		c=st.charAt(i);
		if (st.indexOf(c)==st.lastIndexOf(c)) {
			//do nothing
		}
		else {
			System.out.println(st.charAt(i));
		}
	}
	 
}




	public static void main(String[] args){
		Scanner fileIn = new Scanner(new File("Macintosh HD/Users/yuliangpan/Desktop/HW1 text.txt"));
		
	}

}
