package optional;

public class LambdaTest {
    public static class Something {
        String startsWith(String s) {
            return String.valueOf(s.charAt(0));
        }
    }

    public static class Person {
        String firstName;
        String lastName;

        Person() {
        }

        Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }

    @FunctionalInterface
    interface Creater<T> {
        T create(String firstName, String lastName);
    }


    @FunctionalInterface
    interface Converter<F, T> {
        T convert(F from);
    }

    public static void main(String[] args) {
        Something something = new Something();
        Converter<String, String> converter = something::startsWith;
        String converted = converter.convert("Java");
        System.out.println(converted);

        Creater<Person> creater = (firstName, lastName) -> new Person(firstName, lastName);
        Person person = creater.create("Yang", "Shi");
        System.out.println(person);
    }

}
