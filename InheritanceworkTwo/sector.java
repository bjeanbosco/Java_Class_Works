public class sector extends district {
    String Name = "Buruhukiro";
    static String cells[] = { "Munini", "Gifurwe", "Rambya", "Kizimyamuriro" };

    void printCells(int tatal[]) {
        System.out.println(Name + " is one of 16 of sector in Nyamage district.");
        int x = 0;
        for (int i = 0; i < tatal.length; i++) {
            x += tatal[i];

        }
        System.out.println("total population of " + Name + " sector is " + x);
        for (String cell : cells) {
            System.out.println(cell + " is one of " + Name + "'s cells");
        }
    }
}
