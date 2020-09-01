package streams;



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;



public class Main {

    public int i;

    public static void main(String[] args) throws IOException {

       // Files.lines(Paths.get("saveMes1.txt")).forEach(lines -> System.out.println(lines)); //Не могу понять или не вижу в чем ошибка, использован метод lines, от функции к телу лямда тоже указана вроде верно


        //Files.lines(Paths.get("saveMes.txt")).forEach(System.out::println); //идея предложила такой вариант записи


        // я создал новый класс с объектами и в этом классе решил запихнуть их в лист

        HeroesPersons heroesPersons0 = new HeroesPersons("SpiderMan",5, true);
        HeroesPersons heroesPersons1 = new HeroesPersons("Batman",15, true);
        HeroesPersons heroesPersons2 = new HeroesPersons("SuperMan",25, true);
        HeroesPersons heroesPersons3 = new HeroesPersons("IronMan",5, true);


        /*List <HeroesPersons> heroes = new ArrayList();

        heroes.add(heroesPersons0);
        heroes.add(heroesPersons1);
        heroes.add(heroesPersons2);
        heroes.add(heroesPersons3);

         */


        List<HeroesPersons>heroes = List.of(heroesPersons1, heroesPersons0, heroesPersons3, heroesPersons2);


        System.out.println(heroes.isEmpty());

        List<HeroesPersons> heroesPersonsStream = heroes.stream()
                .filter(Predicate.isEqual(heroesPersons0))
                .sorted(Comparator.comparing(HeroesPersons::getAge))
                .collect(Collectors.toList());

        System.out.println(heroes.stream().count());

        heroes.stream().forEach(HeroesPersons -> System.out.println(HeroesPersons.getAge()));

          //пока применил эти методы


        System.out.println("_______________________");


        /*List<Integer>elements = new ArrayList<>();
        elements.add(10);
        int fel = elements.get(1);
        System.out.println(fel);

         */


        /*List<String>items = new ArrayList<>();
        items.add("Pen");
        items.add("Pencil");
        items.add("Box");
         */
        List <String> items = List.of("Pen","Pencil","Box");
        for (String i: items) {
            if(i.indexOf("P")==0){
            }else {
                System.out.println(i+" ");
            }
        }









        Main sc = new Main();
        System.out.println(sc.i);


        Double array[] = {3453d, 1224523d, 999000d};
        Double first = 1224523d;
        System.out.println(array[0]==first);

























    }
}




