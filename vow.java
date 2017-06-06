package vow;
import java.util.Scanner;
public class vow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("enter letter");
	Scanner s=new Scanner(System.in);
char  b=s.next().charAt(0);
	if(b=='a'||b=='e'||b=='o'||b=='i'||b=='u')
		System.out.println("vowels");
	else
		System.out.print("consont");
	

	}

}
