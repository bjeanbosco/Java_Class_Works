class option {
    public static void main(String[] args) {
        int capital = 1000;// variable

        switch (capital) {
            case 10000000:// if this is true or match the messahge below will be printed
                System.out.println("You are allowed to aquire any loan you want");
                break;
            case 200000:// if this is true or match the messahge below will be printed
                System.out.println("You are allowed to aquire 100000 of loan ");
                break;
            case 500000:// if this is true or match the messahge below will be printed
                System.out.println("you are allowed to aquire 400000 of loan ");
            case 1000000:// if this is true or match the messahge below will be printed
                System.out.println("you are allowed to aquire 1000000 of loan ");
            default:// if no match of above cases the messahge below will be printed
                System.out.println("You are not allowed to aquire any amount of loan ");
        }
    }
}
