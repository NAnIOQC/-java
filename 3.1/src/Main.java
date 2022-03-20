//第三周测验第二题
//数字特征值
/*思路： 读一个数,拆解出每一位，与计数器对比，如果都是/2=0 或
   者/2！=0 就输出1，否则输出0；*/
 
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
        int  num=0;
        int digit=0; 
        int cnt=0; //位数
        int x=0;//二进制值初始值
        int t=0; //奇偶一致判别符
        int sum=0;
        num=in.nextInt();
       while(num>0) {
    	   digit=num%10;
    	   num=num/10;
    	   cnt++;
    	   x=(int) Math.pow(2, cnt-1);
    	  
    	   if((digit%2==0&&cnt%2==0)||(digit%2!=0&&cnt%2!=0)) {
    		   t=1;
    		   sum=sum+x;
    	   }else 
    		   t=0;
       }
        System.out.print(sum);
        
        
	}

}
