
public class Question5 {

	public static void main(String[] args) {
		int rows = 7;
		   
	   for (int i = rows*2; i >= 1; i--) {
	       System.out.print("*");
        }
        System.out.println();
        for (int i = rows-1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 2; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = rows*2; i >= 1; i--) {
	       System.out.print("*");
        }
	}

}
