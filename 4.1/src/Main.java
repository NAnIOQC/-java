import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

					Scanner in = new Scanner(System.in);

					int n = in.nextInt();

					int m = in.nextInt();

					int a,b,cnt=0,sum=0;

					loop:

					for(a=2; ;a++) {

						int isprime=1;

						for(b=2;b<a;b++){

							if(a%b==0) {

								isprime=0;

								break;

							}

						}

						if (isprime==1) {

							cnt++;

							if (cnt>=n&&cnt<=m) {

								sum+=a;

							}

							else if(cnt>m) {

								break loop ;

							}
							

						}
					

					}
				

					

					System.out.println(sum);

			}

		

	{
}
}
