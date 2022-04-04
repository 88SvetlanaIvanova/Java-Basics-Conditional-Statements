import java.util.*;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;


        class Predicate {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                long result = Stream.of(1, 2, 3, 4, 5).reduce(1, (x, y) -> x * y);
                System.out.println(result);
            }


            private static boolean isPrime(long number) {

                return LongStream.rangeClosed(2, (int) (Math.sqrt(number)))
                        .allMatch(n -> number % n != 0);
                // write your code here

            }

            public static String asciiArt(List<String> symbols) {
                // write your code here

                return symbols.stream().collect(Collectors.joining("","(",")"));
            }


            private static double calcAverageSalary(Collection<Integer> salaries) {

                return salaries.stream()
                        .mapToDouble(i -> i)
                        .average()
                        .getAsDouble();
            }

            private static Stream<String> omitLongStrings(List<String> strings) {
                return  strings.stream().filter(n -> n.length() < 4);
            }


            public static IntStream createFilteringStream(IntStream evenStream, IntStream oddStream) {

                return  IntStream.concat(evenStream, oddStream).filter(i -> i % 3 == 0 && i % 5 == 0)
                        .sorted().skip(2);//return ;list.stream().filter(text::contains).sorted();
             //   without distinct() is also a solution.
            }
            private static Stream<String> createBadWordsDetectingStream(String text,
                                                                        List<String> badWords) {


                String []textWords = text.split("\\s+");
                List<String> textByWords = Arrays.asList(textWords);

                boolean isAnyMatch = textByWords.stream().anyMatch(badWords::contains);
                boolean contWords = textByWords.stream().noneMatch(badWords::contains);
                return Stream.of(text).filter(i -> isAnyMatch).sorted();
                        //filter(textWords::contains);
            }

            private static List<LongStream> invertedStreams(List<LongStream> streams) {
                Stream <LongStream> str = streams.stream().filter(i-> i.isParallel()).sequential();

                return str.collect(Collectors.toList());
            }










}