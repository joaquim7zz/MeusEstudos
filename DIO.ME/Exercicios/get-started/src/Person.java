import java.time.OffsetDateTime;

public class Person {
    private final String name;

    private int age;

    private  int lastYearAgeInc = OffsetDateTime.now().getYear();

    public Person(String name) {
        this.name = name;
        this.age = 1;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public void incAge() {
        if (this.lastYearAgeInc >= OffsetDateTime.now().getYear()) return;

        this.age++;
        this.lastYearAgeInc = OffsetDateTime.now().getYear();
    }
}
