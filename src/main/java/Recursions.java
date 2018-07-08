public class Recursions {

    //naive 1 or 2 steps
    int numWays(int n) {

        int[] steps = {1, 2};
        return numWays(n, steps);


        //return numWays(n,0,0);
    }

//    private int recWays(int n, int curr, int ways) {
//        if (curr < n - 1) return recWays(n, curr + 1, ways + 1) + recWays(n, curr + 2, ways + 1);
//        else return 1;
//    }


    //TODO: add map to reduce num of steps
    int numWays(int n, int[] steps) {
        return recWays(n, 0, 0, steps);
    }

    private int recWays(int n, int curr, int ways, int[] steps) {

        if (curr < n - 1) {
            int total = 0;
            for (int i = 0; i < steps.length; i++) {
                total += recWays(n, curr + steps[i], ways + 1, steps);
            }
            return total;
        } else return 1;
    }


}
