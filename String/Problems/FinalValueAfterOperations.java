public class FinalValueAfterOperations {
    static int finalValueAfterOperations(String[] op) {
        int X = 0;
        for (int i = 0; i < op.length; i++) {
            if (op[i].equals("X++") || op[i].equals("++X")) {
                X = X + 1;
            } else if (op[i].equals("--X")  || op[i].equals("X--")) {
                X = X - 1;
            }
        }
        return X;
    }

    public static void main(String[] args) {
        String op[] =  { "--X","X++","X++" };
        System.out.println(finalValueAfterOperations(op));
    }
}
