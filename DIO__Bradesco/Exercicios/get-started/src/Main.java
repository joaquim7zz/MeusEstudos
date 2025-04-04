import javax.xml.namespace.QName;

public class Main {
    public static void main(String[] args) {
        var male = new Person("joão");
        male.incAge();

        var female = new Person("Maria");
        female.incAge();

        System.out.println(male.getName() + " " + male.getAge());
        System.out.println(female.getName() + " " + female.getAge());
    }
}