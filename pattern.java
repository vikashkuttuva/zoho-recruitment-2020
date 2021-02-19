public class pattern {
	
	public static void main(String args[]) {
		String ch="welcome";
		int i,j,space=ch.length()-1,spaceCount;
		for(i=1;i<=ch.length();i++) {
			for(spaceCount=space;spaceCount>=1;spaceCount--) {
				System.out.print(" ");
			}
			int len = ch.length();
			int middle =len/2;
			for (j=1;j<=i;j++) {
				System.out.print(ch.charAt(middle));
				middle++;
				if(middle==len) {
					middle=0;
				}
			}
			
			System.out.println();
			space--;
		}
		
	}

}