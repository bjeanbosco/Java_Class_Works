class Break {
    static public void main(String[] args) {
        int i = 100; // this is variable i that store interger value
        while (i > 0) {// condition to be fullfilled
            System.out.println(i); // whenever i is greater than zero i decrement by one
            if (i / 2 == 25) {
                break; // when i will be equal t 50 print will be stopped
            }
            i--;// i decrement by one wheneve condition is true
        }
    }
}
