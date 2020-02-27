public class Pyramid1 {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4-i;j++) {
				System.out.print("  ");
			}for(int k=0;k<2*i-1;k++) {
				if(k%2==0) {
					System.out.print("* ");
				}else {
					System.out.print("A ");
				}
			}
			System.out.println();
		}
	}
}
/*
      * 
    * A * 
  * A * A * 
* A * A * A *

*/
