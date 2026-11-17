public class Assignment01Q01 {
    public static void main(String[] args) {
        // TODO: Implement Q01

        for(int i = 0; i < args.length; i++){
            char ch = args[i].charAt(0);
            int value = (int) ch;
            if(value % 5 == 0){
                System.out.println(ch);
            }
        }



    }
}
