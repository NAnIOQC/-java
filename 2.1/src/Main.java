import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner in = new Scanner(System.in);
    int utc;
    int bjt;
    int a;
    bjt = in.nextInt();
    if(bjt/100>8) {
    	utc=bjt-800;
    	System.out.println(utc);
    }
    else if(bjt>10){
    	utc=(24-(8-bjt/100));
    	a=bjt%100;
    	System.out.println(utc+""+a);
    	
    }else if(bjt<=10) {
    	System.out.println((24-(8-bjt/100))+"0"+bjt%100);
    }
	}

}
//第二周java编程练习 1
