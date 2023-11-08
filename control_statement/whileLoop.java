public class whileLoop {
    public static void main(String args[]) {
        // below in an array of names
        String names[] = { "Alice", "Aline", "Eric", "Jane", "DIvine", "Jeremie", "Jose", "Mark",
                "Yvete", "Sandrine", "Jack", "Bosco", "Steven", "Peter", "John" };
        int i = 0;// integer value
        while (i < names.length) {// condition
            System.out.println("Hello " + names[i] + "!");
            i++;// increment
        }
    }
}
