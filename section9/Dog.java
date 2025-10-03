public class Dog {
    ///private String name;

    public Dog() {};

    public Dog(Dog dog) {

    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || o.getClass() != this.getClass()) return false;
        return true;

///        Dog otherDog = (Dog) o;
///        return otherDog.equals(this.name);

    }
}
