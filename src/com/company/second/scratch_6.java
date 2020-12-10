//class Scratch {
//    public static void main(String[] args) {

//        Dog dog = new Dog("Abisova", true);
//        System.out.println(dog.getName());
//        Dog dog2 = new Dog(true);
//        System.out.println("Dog2 is " + dog2.isRight());


        // here we only created the reference of type Dog,
        // it doesn't points to any point, dogReference value is equal to null
//        Dog dogReference;

        // new Dog() executes creating new object of type Dog in java memory,
        // then we connect dogReference (which is only a reference) with this new object
        // so from now on dogReference points to Dog object with name 'Серёга' in java memory
//        dogReference = new Dog("Serega");
//        System.out.println("Dog " + dogReference.getName());

        // here we created a new Dog object with name 'Абисова' in java memory
        // and connected dogReference with this new Dog object
        // so from now on dogReference points to Dog object with name 'Абисова', not 'Серёга'
//        dogReference = new Dog("Abisova");
//        System.out.println("Dog " + dogReference.getName());


//    }
//
//
//}
//
//class Dog {
//    private String name;
//    private boolean isRight;
//
//    public Dog(String name, boolean isRight) {
//        this.name = name;
//        this.isRight = isRight;
//        if (isRight) {
//            name += " is cool";
//        } else {
//            name += " is not cool";
//        }
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public boolean isRight() {
//        return isRight;
//    }
//
//    public Dog(boolean isRight) {
//        this.isRight = isRight;
//    }
//}