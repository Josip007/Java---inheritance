public class Person implements Displayable {

    @Override
    public void displayInfo() {
        System.out.println("displayInfo interface...");
    }

    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Hello " + this.name + ", your age is: " + age;
    }
}
