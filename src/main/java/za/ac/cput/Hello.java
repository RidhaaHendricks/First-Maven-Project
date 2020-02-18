package za.ac.cput;

/**
 * Hello world!
 *
 */

public class Hello
{
    private String name;
    private String Surname;
    private int age;
    private String number;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return Surname;
    }

    public int getAge() {
        return age;
    }

    public String getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "name='" + name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", age=" + age +
                ", number='" + number + '\'' +
                '}';
    }
}
