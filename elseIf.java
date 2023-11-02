public class elseIf {
    public static void main(String args[]) {
        int a = 12, b = 20, c = 30, d = 9; // these are variables those stores integer values
        String answer; // this store message to be printed it has string data type
        if (a > b) {
            // this message will be printed if a is large than b
            answer = "a is max number";
        } else if (a < c) {
            // this message will be printed if a is smaller than c
            answer = "c is max number";
        } else if (d > c) {
            // this message will be printed if d is large than c
            answer = "d is max number";
        } else {
            // this message will be printed if no much of condition
            answer = "b is max number";
        }
        System.out.println(answer);
    }
}