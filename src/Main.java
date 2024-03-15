//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hey, let's start!");

        Person jole = new Person("Josip", 30);
        Student joka = new Student("barbara", 20, 5, "Mechanical engineering");

        System.out.println(jole);
        System.out.println(joka);
        jole.displayInfo();
        joka.displayInfo();

        }
    }
