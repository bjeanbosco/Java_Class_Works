class Child extends Parent implements Main {

    public void history(String name) {
        System.out.println("Hello name is  Kagabo and I'm step father of " + name);
    }

    static public void main(String[] args) {
        Child obj = new Child();
        String NAME = "John Doe";
        obj.add(obj.Fname);
        obj.printAble(obj.Lname);
        obj.parent(NAME);
        obj.history(NAME);
        System.out.println(
                "My name is " + NAME + " my father called " + obj.Lname + " and his father called " + obj.Fname + "\n" +
                        " and father father's name called " + obj.Name);

    }
}
