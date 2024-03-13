
public class Question3 {

	public static void main(String[] args) {
		int size = 14;
	    int count = 0; 
         for (int i = 0; i < size / 2; i++) {
            for (int j = 0; j < (size/2) - i ; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * i-1; j++) {
                
                System.out.print(" ");
                
            }
            if(count>0)
            System.out.print("*");
            count++;
            for (int j = 0; j < (size/2) - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = 0; i < size / 2; i++) {
            for (int j = 0; j < size ; j++) {
                if(j==0 || j==size-1 || i== (size/2) -1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
	}

}
