//�����ܲ���ڶ���
//��������ֵ
/*˼·�� ��һ����,����ÿһλ����������Աȣ��������/2=0 ��
   ��/2��=0 �����1���������0��*/
 
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
        int  num=0;
        int digit=0; 
        int cnt=0; //λ��
        int x=0;//������ֵ��ʼֵ
        int t=0; //��żһ���б��
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
