import java.util.Arrays;

public class Assignment01Q04 {

    public static int[] shiftArrayCyclic(int[] array, int move, char direction) {
        // TODO: implement
        int length = array.length;
        if(length == 0){
            return array;
        }
        if (move >= length) {
            return shiftArrayCyclic(array, move-length, direction);
        }
        if(direction == 'L'){
            return shiftArrayCyclic(array, -move, 'R');
        } else if(direction == 'R'){
            if(move < 0){
                return shiftArrayCyclic(array,length + move, direction);
            } else if (move > 0) {
                int i = 0;
                int j = move;
                int tmp = array[0];
                int tmp2;
                int start = 0;
                while (i < length) {
                    if(j >= length){
                        j -= length;
                    } else if(j == start ){
                        array[j] = tmp;
                        start += 1;
                        j +=1;
                        tmp = array[j];
                        j += move;
                        i++;
                    } else {
                        tmp2 = array[j];
                        array[j] = tmp;
                        tmp = tmp2;
                        j += move;
                        i++;
                    }
                    
                }

            }
        }


        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -1, 'R'))); // [2, 3, 4, 5, 1]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'R'))); // [5, 1, 2, 3, 4]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'r'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -2, 'g'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 3, 'L'))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -3, 'L'))); // [3, 4, 5, 1, 2]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{0, 8, 9, 5, 6}, 6, 'L'))); // [8, 9, 5, 6, 0]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{}, 3, 'R'))); // []
    }
}