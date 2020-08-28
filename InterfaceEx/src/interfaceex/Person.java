
package interfaceex;

public class Person implements CommonPerson {
    String name="Chamod";
    int age=23;
    String password="ABC";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }
}
