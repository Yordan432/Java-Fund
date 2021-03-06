package person;

public class Person implements Comparable<Person>  {
    private String name;
    private int age;

    public Person() {
        this.name = "No name";
        this.age = 1;
    }
    public Person(int age) {
        this.name = "No name";
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    @Override
    public int compareTo(Person person){
        return this.name.compareTo(person.getName());
    }
}
