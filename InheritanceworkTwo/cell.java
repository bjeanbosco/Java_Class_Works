public class cell extends sector {
    int people[] = { 1000, 1500, 700, 700 };

    void cellDetails() {

        for (int i = 0; i < people.length; i++) {
            System.out.println("Cell_Name: " + sector.cells[i] + "   " + " Population: " + people[i]);
        }
    }
}