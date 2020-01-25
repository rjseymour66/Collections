import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Collections {

    public static final List<String> friends =
            Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
    public static final List<String> editors =
            Arrays.asList("Brian", "Jackie", "John", "Mike");
    public static final List<String> comrades =
            Arrays.asList("Kate", "Ken", "Nick", "Paula", "Zach");

    public static Predicate<String> checkIfStartsWith(final String letter) {
        return name -> name.startsWith(letter);
    }

//    final Function<String, Predicate<String>> startsWithLetter =
//            (String letter) -> {
//        Predicate<String> checkStarts = (String name) -> name.startsWith(letter);
//        return checkStarts;
//    };


    public static final Function<String, Predicate<String>> startsWithLetter =
            letter -> name -> name.startsWith(letter);

    public static void pickName(
            final List<String> names, final String startingLetter) {

        final Optional<String> foundName =
                names.stream()
                        .filter(name -> name.startsWith(startingLetter))
                        .findFirst();

        System.out.println(String.format("A name starting with %s: %s",
                startingLetter, foundName.orElse("No name found")));

    }




    public static void main(String[] args) {

        for(String name : friends) {
            System.out.print(name + ", ");
        }
        System.out.println();
        System.out.println();
        System.out.println("1*********************");

        for(int i = 0; i < friends.size() -1; i++) {
            System.out.print(friends.get(i) + ", ");
        }

        if(friends.size() > 0)
            System.out.print(friends.get(friends.size() - 1));

        System.out.println();
        System.out.println("2*********************");

        System.out.println(String.join(", ", friends));

        System.out.println();
        System.out.println("3*********************");

        System.out.println(
                friends.stream()
                        .map(String::toUpperCase)
                        .collect(Collectors.joining(", "))
        );

        /*
        final Optional<String> aLongName =
                friends.stream()
                        .reduce((name1, name2) -> name1.length() >= name2.length() ? name1 : name2);
        aLongName.ifPresent(name -> System.out.println(String.format("A longest name: %s", name)));

        final String steveOrLonger =
                friends.stream()
                        .reduce("Steve", (name1, name2) ->
                                name1.length() >= name2.length() ? name1 : name2);


        System.out.println("Total number of characters in all names: " +

        friends.stream()
                .mapToInt(name -> name.length())
                .sum()
        );

        pickName(friends, "N");
        pickName(friends, "Z");





        final Predicate<String> startsWithN = name -> name.startsWith("N");
        final Predicate<String> startsWithB = name -> name.startsWith("B");

        final long countFriendsStartN =
                friends.stream()
                        .filter(startsWithLetter.apply("N"))
                        .count();

        final long countFriendsStartB =
                friends.stream()
                        .filter(startsWithLetter.apply("B"))
                        .count();

        System.out.println(countFriendsStartN);


        final long countFriendsStartN =
                friends.stream()
                        .filter(startsWithN)
                        .count();

        final long countFriendsStartB =
                friends.stream()
                        .filter(startsWithB)
                        .count();
        */

        /*
        for(String name : friends) {
            System.out.println(name);
        }
        System.out.println("************************");

        // forEach w/o lambdas
        friends.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("************************");


        // forEach w lambdas
        friends.forEach((final String name) -> System.out.println(name));
        System.out.println("************************");


        friends.forEach(name -> System.out.println(name));

        friends.forEach(System.out::println);
        */

        final List<String> uppercaseNames = new ArrayList<>();

        /*
        for (String name : uppercaseNames) {
            uppercaseNames.add(name.toUpperCase());
        }


        friends.forEach(name -> uppercaseNames.add(name.toUpperCase()));
        System.out.println(uppercaseNames);

        System.out.println("************************");

        friends.stream()
                .map(String::toUpperCase)
                .forEach(name -> System.out.print(name + " "));
        System.out.println();

        friends.stream()
                .map(String::length)
                .forEach(count -> System.out.print(count + " "));
        System.out.println();

        friends.stream()
                .map(String::toUpperCase)
                .forEach(name -> System.out.print(name + " "));



        final List<String> startsWithN =
                friends.stream()
                .filter(name -> name.startsWith("N"))
                .collect(Collectors.toList());

        System.out.println(String.format("Found %d names",startsWithN.size()));



        final Predicate<String> startsWithN = name -> name.startsWith("N");

        final long countFriendsStartN =
                friends.stream()
                        .filter(startsWithN)
                        .count();

        final long countEditorsStartN =
                friends.stream()
                        .filter(startsWithN)
                        .count();

        final long countComradesStartN =
                friends.stream()
                        .filter(startsWithN)
                        .count();

        */




    }
}
