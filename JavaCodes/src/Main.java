import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<String> countrynames = Arrays.asList("America","Canada","Ireland","Finland","India");

        //Creating the stream of all names
        Stream<String> countryname = countrynames.stream();

        //Creating another stream by filtering long names using filter()
        Stream<String> longCountrynames = countryname.filter(str -> str.length() > 6);

        //displaying the long names
        longCountrynames.forEach(str->System.out.print(str+" "));
    }
}