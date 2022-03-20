import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根


		String  pinyin = new String();

		Scanner in = new Scanner(System.in);

		int num = in.nextInt();

		String inText = Integer.toString(num);

		for (char c : inText.toCharArray())

		{

		switch(c){

		case '-': pinyin +="fu ";

		break;

		case '1': pinyin +="yi ";

		break;

		case '2': pinyin +="er ";

		break;

		case '3': pinyin +="san ";

		break;

		case '4': pinyin +="si ";

		break;

		case '5': pinyin +="wu ";

		break;

		case '6': pinyin +="liu ";

		break;

		case '7': pinyin +="qi ";

		break;

		case '8': pinyin +="ba ";

		break;

		case '9': pinyin +="jiu ";

		break;

		case '0': pinyin +="ling ";

		break;

		}

		}

		if(pinyin!=null) System.out.println(pinyin.substring(0, pinyin.length()-1));

		in.close();

		
}
}

