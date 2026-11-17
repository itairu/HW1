public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        // TODO: implement
        if (i == j) {
            return 0;
        }
        int len = m.length;
        int[] paths = new int[len];
        for(int k = 0; k < len; k++){
            paths[k] = -1;
        }
        paths[i] = 0;
        for(int t =0; t < len; t++){
            for(int k =0; k < len; k++){
                if(paths[k] == t){
                    for(int b = 0; b < len; b++){
                        if(m[k][b] == 1){
                            if(b == j){
                                return t+1;
                            }
                            if(paths[b] == -1){
                                paths[b] = t+1;
                            }
                        }
                    }
                }
            }
            

        }

        return paths[j];
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}