public class Question1 {
	public static void main(String[] args) {
		for(int i=0;i<9;i++){
		    //letter I
		    for(int j=0;j<9;j++){
		        if(i==0 || i==8){
		            System.out.print("*");
		        }else {
                    if (j == 4) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
		        }
		    }
		    System.out.print("  ");
		
            //letter N		
		    for(int j=0;j<9;j++){
		        if(j==0 || j==8){
		            System.out.print("*");
		        }else{
    		        if(i==j) {
                        System.out.print("*");
    		        }else{
    		            System.out.print(" ");
    		        }
		        }
		    }
		    System.out.print("  ");
		    
		    //letter E
		    for(int j=0;j<9;j++){
		        if(i==0 || i==8 || i==4 || j==0){
		            System.out.print("*");
		        }else{
		            System.out.print(" ");
		        }
		    }
		    System.out.print("  ");
		    
		    //letter U
		    for(int j=0;j<9;j++){ 
		        if((j==0 || j==8) && i<8){
		            System.out.print("*");
		        }else{
		            if(i == 8 && j > 0 && j < 8){
		                System.out.print("*");
		            }
		            else{
		                System.out.print(" ");
		            }
		        }
		      
		    }
		    System.out.print("  ");
		    
		    //letter R
		    for(int j=0;j<9;j++){ 
		        if(j==0 || i==0 || i==4 ||(j==8 && i<4)){
		            System.out.print("*");
		        }
		        else if (i > 4) {
                    int diagonalPosition =  (i - 5);
                    if (j == diagonalPosition * 2 + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print(" ");
                }
		    }
		    System.out.print("  ");
		    
		    //letter O
		    for(int j=0;j<9;j++){ 
		        if((i == 0 || i == 8) && (j > 0 && j < 8)){
		            System.out.print("*");
		        }else if ((j == 0 || j == 8) && (i > 0 && i < 8)) { 
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }     
		    }
		    System.out.print("  ");
		    
		    //letter N
		    for(int j=0;j<9;j++){
		        if(j==0 || j==8){
		            System.out.print("*");
		        }else{
    		        if(i==j) {
                        System.out.print("*");
    		        }else{
    		            System.out.print(" ");
    		        }
		        }
		    }
		    System.out.println();
		}
	}
}
