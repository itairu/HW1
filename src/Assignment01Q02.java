public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;

        /////////////////////////////////////////////
        // TODO: Fill in the Pi approxiamtion here
        /////////////////////////////////////////////
        /// ...
        
        int num = Integer.parseInt(args[0]);
        for(int i = 1; i <= num; i++){
            double n = 1/(double)(2*i-1);
            if(i%2 == 0){
                approxPi -= n;
            } else {
                approxPi += n;
            }
        }
        approxPi = 4*approxPi;
        
        /////////////////////////////////////////////
        
        System.out.println(approxPi + " " + actualPi);
    }
}
