import enstabretagne.simulation.basics.SortedList;

public class Person implements Comparable<Person> {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        // Comparer par âge
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    public static void main(String[] args) {
        SortedList <Person> liste = new SortedList<>();

        // Ajouter des objets dans le désordre
        liste.add(new Person("Alice", 30));
        liste.add(new Person("Bob", 25));
        liste.add(new Person("Charlie", 35));

        // Parcourir la liste triée
        for (Person p : liste) {
            System.out.println(p);
        }
    }
}
