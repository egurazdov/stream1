import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> products = Arrays.asList("Мясо","Мука","Морковь","Вода","Вино","Купаты","Кола","Крупа","Квас","Просо","Творог","Сметана");
        int count = (int) products.stream()
                .filter((s -> s.charAt(0) == 'К'))
                .count();
        System.out.println(count);


        Stream<Person> persons =  Stream.of(
                new Person("Вася",23),
                new Person("Петя",34),
                new Person("Миша",45),
                new Person("Гена",56),
                new Person("Эмма",67),
                new Person("Зина",78),
                new Person("Нина",89),
                new Person("Миша",12),
                new Person("Коля",13),
                new Person("Степан",14)
        );
        persons
                .filter(age -> age.age > 30)
                .forEach(name -> System.out.println(name.name));

    }
}