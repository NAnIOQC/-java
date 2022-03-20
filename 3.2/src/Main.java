//第三周测试第一题
//输入一串数据，-1表示结束，输出偶数和奇数的个数
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
//初始化		
		int num=0;
		int cnt=0;
		int doublecnt=0;
		int singlecnt=0;		
		
        
//读数，读一个判断一个；		
		num=in.nextInt();
		if(num<100000&&num>0) {
        
			while(num!= -1) {
    	   if(num%2==0) {
    		  doublecnt++;
    		  num=in.nextInt();
    	  }else if(num%2!=0) {
    		  singlecnt++;
    		  num=in.nextInt();
    	  }
    	  }
			
		System.out.println(singlecnt+" "+doublecnt);
		
		
		
}
                               }
}