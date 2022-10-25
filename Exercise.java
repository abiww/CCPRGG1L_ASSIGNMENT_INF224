public class Exercise {
    public static void main(String[] args) throws Exception {
      
        char [][] mdArray = {
            {'P','R','E','Y'}, 
            {'L','A','V','A'}, 
            {'O','V','E','R'}, 
            {'T','E','N','D'}
        };
        
        // WORD 1
        System.out.println("1. WORD 1");
        for (int rows = 0; rows < 1; rows ++) {

            for (int columns = 0; columns < 4; columns ++) {
                if (rows == 0) {
                    System.out.print(mdArray[rows][columns]);
                }
                else {
                    System.out.println(""); 
                }
            }
        }
            
        // WORD 2
        System.out.println("");
        System.out.println("2. WORD 2");
        
        for (int rows = 1; rows < 2; rows ++) {

            for (int columns = 0; columns < 4; columns ++) {
                if (rows == 1) {
                    System.out.print(mdArray[rows][columns]);
                }
                else {
                    System.out.println("");  
                }
            }
        }
            
        // WORD 3
        System.out.println("");
        System.out.println("3. WORD 3");

        for (int rows = 2; rows < 3; rows ++) {

            for (int columns = 0; columns < 4; columns ++) {
                if (rows == 2) {
                    System.out.print(mdArray[rows][columns]);
                }
                else {
                    System.out.println("");  
                }
            }
        }
            
        // WORD 4
        System.out.println("");
        System.out.println("4. WORD 4");

        for (int rows = 3; rows < 4; rows ++) {

            for (int columns = 0; columns < 4; columns ++) {
                if (rows == 3) {
                    System.out.print(mdArray[rows][columns]);
                }
                else {
                    System.out.println("");  
                }
            }
        }
            
        // WORD 5
        System.out.println("");
        System.out.println("5. WORD 5");

        for (int columns = 0; columns < 1; columns ++) {

            for (int rows = 0; rows < 4; rows ++) {
                if (columns == 0) {
                    System.out.print(mdArray[rows][columns]);
                }
                else {
                    System.out.println("");  
                }
            }
        }
          
        // WORD 6
        System.out.println("");
        System.out.println("6. WORD 6");

        for (int columns = 1; columns < 2; columns ++) {

            for (int rows = 0; rows < 4; rows ++) {
                if (columns == 1) {
                    System.out.print(mdArray[rows][columns]);
                }
                else {
                    System.out.println("");  
                }
            }
        }
            
        // WORD 7
        System.out.println("");
        System.out.println("7. WORD 7");

        for (int columns = 2; columns < 3; columns ++) {

            for (int rows = 0; rows < 4; rows ++) {
                if (columns == 2) {
                    System.out.print(mdArray[rows][columns]);
                }
                else {
                    System.out.println("");  
                }
            }
        }
            
        // WORD 8
        System.out.println("");
        System.out.println("8. WORD 8");

        for (int columns = 3; columns < 4; columns ++) {

            for (int rows = 0; rows < 4; rows ++) {
                if (columns == 3) {
                    System.out.print(mdArray[rows][columns]);
                }
                else {
                    System.out.println("");  
                }
            }
        }

        
    }
}
