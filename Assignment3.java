public class Assignment3 {
    public static void main(String args[]) {
        short a = 10; // this is variable that store short data type value
        short b = 10;
        a += b;// a=a+b internally so fine
        a = a + b;// Compile time error because 10+10=20 now int
        System.out.println(a);
    }
}
