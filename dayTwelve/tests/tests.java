package dayTwelve.tests;

public class tests {
    public static void main(String[] args) {
        Programmer person = new Programmer();
        person.name = "Loug";
        person.age = 32;
        person.language = "Java";

        person.showProgrammer();
        person.showPerson();
    }
}


class Person {
    String name;
    int age;

    public void showPerson()
    {
        System.out.println(name + " is " + age + " years old.");
    }
}

class Programmer extends Person {
    String language;

    public void showProgrammer()
    {
        System.out.println(name + " codes in " + language);
    }
}