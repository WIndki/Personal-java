public class GreekAlphabet {

	public static void main(String arg[]){
		int startPostion=0,endPostion=0;
		char cStart='α',cEnd='ω';
		startPostion=(int)cStart;
		endPostion=(int)cEnd;
		System.out.println("希腊字母α在Unicode表中的位置："+startPostion);
		System.out.println("希腊字母表");
		for(int i=startPostion;i<=endPostion;i++){
			char c='\0';
			c=(char)i;
			System.out.print(" "+c);
			if((i-startPostion+1)%10==0)
				System.out.println(" ");	
		}
	}
}
