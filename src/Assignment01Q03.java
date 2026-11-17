public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = 21; // TODO: Read the first string argument (replace this line)
        System.out.println("The first " + x + " Fibonacci numbers are:");

        ////////////////////////////////////////////////////////////////
        // TODO: Replace this code with the correct Fibonacci sequence
        ////////////////////////////////////////////////////////////////
        /// ...
        int prevn = 1;
        int currentn = 1;
        int numOdd = 2*(x/3) + x%3;//if we take the numbers of the sequence in triplets in order
        //in each triplet we will have the first 2 nums odd and the third even
        System.out.print("1 1 ");
        for (int i = 2; i < x; i++) {
            currentn = currentn + prevn;//calculate the current num in the sequence
            prevn = currentn - prevn;//the new num in place n-2 is currentn - the num in place n-2
            System.out.print(currentn);
            if (i < x - 1) 
                System.out.print(" "); // Make sure we don't print a trailing space
        }
        System.out.println();
        
        ////////////////////////////////////////////////////////////////
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
