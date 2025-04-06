package dayEleven;


public class MoreAboutEquals {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Haejoon";

        Person person2 = new Person();
        person2.name = "Haejoon";

        boolean result = person1.equals(person2);
        System.out.println(result);
    }
}

class Person {
    String name;
    int age;

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
}