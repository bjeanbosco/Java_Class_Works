public class doWhile {
    public static void main(String[] args) {
        int i = 0; // variable a of interger data type
        String[] names = { "Claude", "Joy", "Claver", "Luise", "Vestine", "Hodar", "Ange", "Clement", "Jane", "Simon" };
        // above names is an array of names of student of particular class in campus
        byte[] marks = { 12, 67, 89, 45, 67, 45, 67, 90, 59, 34 };
        // above is ana array of marks for the student mentioned above
        do {
            // below statement will be printed whenever conditio is true
            if (marks[i] > 50) {
                // if marks is greater than 50 the cerabration message will be printed
                System.out.println("My name is " + names[i] + ".I passed my exam with " + marks[i] + " marks.");
            } else {
                // the message below is for student who got marks under 50 or equal to it
                System.out.println("My name is " + names[i] + ".I'm sad I failed my exam with " + marks[i] + " marks.");
            }
            i++;// increment
        } while (i < 10); // condition
    }
}
