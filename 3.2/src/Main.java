//�����ܲ��Ե�һ��
//����һ�����ݣ�-1��ʾ���������ż���������ĸ���
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
//��ʼ��		
		int num=0;
		int cnt=0;
		int doublecnt=0;
		int singlecnt=0;		
		
        
//��������һ���ж�һ����		
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