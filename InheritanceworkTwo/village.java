public class village extends cell implements propertes {
    public void printProperties(String wealth[]) {
        for (String prop : wealth) {
            System.out.println("Some of properties that Nyamagabe hold is " + prop);
        }
    }

    void intro() {
        System.out.println("Let's say little bit about this district properties");
    }

    static public void main(String[] args) {
        village Data = new village();
        Data.districtDetails(Data.Name);
        Data.printCells(Data.people);
        Data.cellDetails();
        Data.intro();
        Data.printProperties(propertes.properties);
    }
}
