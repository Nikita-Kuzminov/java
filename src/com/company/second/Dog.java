public class Dog {
    String name;

    public static void main(String[] args) {
        Dog dog1 = new Dog();
//        dog1.bark();
        dog1.name = "Bart";

        Dog[] myDogs = new Dog[3];

        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        myDogs[0].name = "Fred";
        myDogs[1].name = "George";

        System.out.print("The name of last dog - ");
        System.out.println(myDogs[2].name);

        int x;

        for (x = 0; x < myDogs.length; x++) {
            myDogs[x].bark();
        }


    }

    public void bark() {
        System.out.println(name + " says Gav");
    }

    public void eat() {
    }

    public void chaseCat() {
    }
}