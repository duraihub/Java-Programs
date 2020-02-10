
public class D {

	public static void main(String[] args) {
		int n=9;
		for(int i=0;i<9;i++) {
			for(int j=0;j<7;j++) {
				if(j==0 || (j==6 && i!=0 && i!=8) || ((i==0 || i==8) && (j>0 && j<6))) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
