import java.util.Scanner;

public class Console {

    private static Scanner sc = new Scanner(System.in);
  
    public static void displayLine() {
        System.out.println();
    }

    public static void displayLine(String s) {
        System.out.println(s);
    }

    public static String getString(String prompt) {
       System.out.print(prompt);
       String input = "";
       boolean isValid = false;

       while (!isValid) {
           input = sc.nextLine();
           if (input.equals("")) {
               System.out.println("Error! This entry is required. Try again.");              
           } else {          
               isValid = true;              
           }          
       }      
       return input;
    }
  
   public static String getString(String prompt, String s1, String s2) {
       System.out.print(prompt);
       boolean isValid = false;
       String input = "";

       while (!isValid) {  
           input = sc.nextLine();
           if (input.equals("")) {              
               System.out.println("Error! This entry is required. Try again.");              
           } else {
               if(input.equalsIgnoreCase(s1) || input.equalsIgnoreCase(s2)) {
                   isValid = true;
               } else {
                   System.out.println("Error! This entry is required. Try again.");
               }
           }          
       }
       return input;
   }

    public static int getInt(String prompt) {
        int value = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                value = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("Error! Invalid integer value. Try again.");
            }
            sc.nextLine();
        }
        return value;
    }

    public static int getInt(String prompt,int min, int max) {
        int value = 0;
        boolean isValid = false;

        while (!isValid) {
            value = getInt(prompt);
            if (value < min) {
                System.out.println("Error! Number must be greater than " + min + ".");
            } else if (value > max) {
                System.out.println("Error! Number must be less than " + max + ".");
            } else {
                isValid = true;
            }
        }
        return value;
    }
  
    public static double getDouble(String prompt) {
        double value = 0.0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                value = sc.nextDouble();
                isValid = true;
            } else {
                System.out.println("Error! Invalid decimal value. Try again.");
            }
            sc.nextLine();
        }
        return value;
    }

    public static double getDouble(String prompt,double min, double max) {
        double value = 0.0;
        boolean isValid = false;

        while (!isValid) {
            value = getDouble(prompt);
            if (value < min) {
                System.out.println("Error! Number must be greater than " + min + ".");
            } else if (value > max) {
                System.out.println("Error! Number must be less than " + max + ".");
            } else {
                isValid = true;
            }
        }
        return value;
    }

    public static String getChoice(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return sc.nextLine();
            } catch (NumberFormatException e) {
                System.out.println("Error! This entry is required. Try again.");
            }
        }
    }

    public static String getChoice(String prompt, 
                String s1, String s2) {
        while (true) {
            String input = getChoice(sc, prompt);

            if (input.equalsIgnoreCase(s1) || input.equalsIgnoreCase(s2)) {
                return input;
            } else {
                System.out.println("Error! Entry must be " + s1 +  " or " + s2 + ". Try again.");
            }
        }
        
    }

    public static String getChoice(String prompt, 
                    String s1, String s2, String s3) {
        while (true) {
            String input = getChoice(sc, prompt);

            if (input.equalsIgnoreCase(s1) || input.equalsIgnoreCase(s2) || input.equalsIgnoreCase(s3)) {
                return input;
            } else {
                System.out.println("Error! Entry must be " + s1 +  " or " + s2 + " or " + s3 + ". Try again.");
            }
        }
        
    }
    
    public static void createSpinners() {
        System.out.println("-------------------------------------------------------------------------------------------");    
        System.out.println("                   (@)                 " + "    " + "                   (@)                  ");                 
        System.out.println("           @        |        @         " +  "    " +"           @        |        @          ");          
        System.out.println("       @            |            @      " + "    " +"       @            |            @      ");      
        System.out.println("     %        1     |     7        &    "+  "    " +"     @              |              @    ");    
        System.out.println("   @  _             |              _ @  "+  "    " +"   @        1       |       2        @  ");  
        System.out.println("  ,    - _          |          _ -    ( "+  "    " +"  @                 |                 @ "); 
        System.out.println(" @         - _      |      _ -         @" + "    " +" @                  |                  @");
        System.out.println("               - _  |  _ -              "+  "    " +"                    |                   ");
        System.out.println("@       4          -|-          2      @" + "    " +"@ ------------------|----------------- @");
        System.out.println("                  _-|-_                 "+  "    " +"                    |                   ");
        System.out.println(" @            _ -   |   - _            @"+  "    " +" @                  |                  @");
        System.out.println("  .       _ -       |       - _       % "+  "    " +"  @         6       |       4         @ ");
        System.out.println("   @  _ -      5    |    6     - _   @  "+  "    " +"   @                |                @  ");  
        System.out.println("     #              |              @    " + "    " +"     @              |              @    ");    
        System.out.println("       @            |            @      "+  "    " +"       @            |            @      ");      
        System.out.println("           @        |        @        "  +  "    " +"           @          |        @          ");
        System.out.println("                   (@)                 " +  "    " +"                    (@)                  ");
        System.out.println("-------------------------------------------------------------------------------------------");            

    }
}
