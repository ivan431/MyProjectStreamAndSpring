package streams;



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {



        Files.lines(Paths.get("SaveMessages.txt")).forEach(line -> System.out.println(line)); //Не могу понять или не вижу в чем ошибка, использован метод lines, от функции к телу лямда тоже указана вроде верно


        Files.lines(Paths.get("Some.txt")).forEach(System.out::println); //идея предложила такой вариант записи


        // я создал новый класс с объектами и в этом классе решил запихнуть их в лист

        HeroesPersons heroesPersons0 = new HeroesPersons("SpiderMan",5, true);
        HeroesPersons heroesPersons1 = new HeroesPersons("Batman",5, true);
        HeroesPersons heroesPersons2 = new HeroesPersons("SuperMan",5, true);
        HeroesPersons heroesPersons3 = new HeroesPersons("IronMan",5, true);


        List <HeroesPersons> heroes = new ArrayList();

        heroes.add(heroesPersons0);
        heroes.add(heroesPersons1);
        heroes.add(heroesPersons2);
        heroes.add(heroesPersons3);

        System.out.println(heroes.isEmpty()); // просто по быстрому для себя проверил пустой ли он)

        List<HeroesPersons> heroesPersonsStream = heroes.stream()
                .sorted(Comparator.comparing(HeroesPersons::getAge))
                .collect(Collectors.toList()); //то, что мы использовали на занятии

        System.out.println(heroes.stream().count());
        heroes.stream().forEach(HeroesPersons -> System.out.println(HeroesPersons.getAge()));
        heroes.stream().collect(Collectors.toList());  //пока применил эти методы















    }
}




