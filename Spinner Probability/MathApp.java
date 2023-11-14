public class MathApp {
    public static void main(String args[]) {
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println("Spinner A is divided into 6 equal sectors, \n" +
        "and spinner B is divided into 4 equal sectors.\nIf the needle " +
        "on each spinner is spun once,\nwhat is the probability that \n" +
        "the sum of the resulting numbers is even?");
        System.out.println("-------------------------------------------------");
        System.out.println();
        System.out.println();
        Console.createSpinners();
        System.out.println();
        System.out.println();

        int evenSolutions = 0;
        int numDivisions = 0;

        //Create lists containing the numbers from each spinner
        int[] spinnerA = {1,2,3,4,5,7};
        int[] spinnerB = {1,2,4,6};

        //For each number in array one add each number from array two
        for (Integer int1 : spinnerA) {
            for (Integer int2 : spinnerB) {
                //Divide each resulting solution by two and check if the remainder is 0
                //If the remainder is 0 the solution is even and we increment the evenSolutions counter by one
                if ((int1 + int2) % 2 == 0)
                evenSolutions++;
            }
        }

        //Gets the total number of spaces by multplying the length of the two arrays
        numDivisions = spinnerA.length * spinnerB.length;
        
        //To get the probablity we divide the number of even solitons(10) by the possible spaces
        //The (double) inside the math operation ensures that the program uses floating point arithmatic
        double probablity = ((double)evenSolutions / numDivisions) * 100;

        //prints the solution as a decimal and percentage
        System.out.println("--------------------------------------------");
        System.out.println("The probability is " + probablity + " or " + Math.round(probablity) + "%");
        System.out.println("--------------------------------------------");
    }
}

