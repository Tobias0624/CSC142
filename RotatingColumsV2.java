
public class RotatingColumsV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int REPITITIONS = 15; 
		final int RANGE= 3;
		
		for (int i = 1; i <= REPITITIONS; i++) {
			for (int j = 1; j <= RANGE; j++) {
				System.out.print(" ");
				
			}
			System.out.print("|");
		}
		System.out.println();
		for (int i = 1; i <= REPITITIONS; i++) {
			for (int j = 1; j <= RANGE; j++) {
				System.out.print(j);
			}
			System.out.print(0);
		}
	}

}
