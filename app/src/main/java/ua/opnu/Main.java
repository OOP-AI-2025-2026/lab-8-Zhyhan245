package ua.opnu;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

                System.out.println("Завдання 1");

                MyOptional<String> middleName = new MyOptional<>();
                System.out.println(middleName);
                System.out.println("isPresent: " + middleName.isPresent());
                System.out.println("orElse: " + middleName.orElse("немає"));

                MyOptional<String> username = new MyOptional<>("admin");
                System.out.println(username);
                System.out.println("isPresent: " + username.isPresent());
                System.out.println("get(): " + username.get());
                System.out.println("orElse: " + username.orElse("guest"));

                try {
                    String test = middleName.get();
                    System.out.println("unexpected: " + test);
                } catch (IllegalStateException ex) {
                    System.out.println("Очікуваний виняток: " + ex.getMessage());
                }

                try {
                    MyOptional<String> broken = new MyOptional<>(null);
                    System.out.println("unexpected: " + broken);
                } catch (IllegalArgumentException ex) {
                    System.out.println("Правильно не дозволив null: " + ex.getMessage());
                }


                System.out.println("\nЗавдання 2");

                BookData b1 = new BookData("Clean Code", "Robert Martin", 100, 450);
                BookData b2 = new BookData("Effective Java", "Joshua Bloch", 80, 400);
                BookData b3 = new BookData("Java Concurrency", "Goetz", 0, 0);

                List<BookData> list = Arrays.asList(b1, b2, b3);

                Collections.sort(list);

                for (BookData b : list) {
                    System.out.println(b);
                }


                System.out.println("\nЗавдання 3");

                Printer myPrinter = new Printer();
                Integer[] intArray = {1, 2, 3};
                String[] stringArray = {"Hello", "World"};

                myPrinter.printArray(intArray);
                myPrinter.printArray(stringArray);


                System.out.println("\nЗавдання 4");

                Integer[] nums = {1, 4, 7, 2, 9, 12};
                String[] words = {"cat", "house", "sun", "elephant"};

                Integer[] greaterThanFive = Filter.filter(nums, n -> n > 5);
                System.out.println("Числа > 5: " + Arrays.toString(greaterThanFive));

                String[] longWords = Filter.filter(words, s -> s.length() > 3);
                System.out.println("Довгі слова: " + Arrays.toString(longWords));

                Integer[] evens = Filter.filter(nums, n -> n % 2 == 0);
                System.out.println("Парні числа: " + Arrays.toString(evens));


                System.out.println("\nЗавдання 5");

                Integer[] numbers = {1, 3, 5, 7};
                System.out.println(Contains.contains(numbers, 3));
                System.out.println(Contains.contains(numbers, 20));

                String[] wordsTask5 = {"cerulean", "vermillion", "ecru"};
                System.out.println(Contains.contains(wordsTask5, "cerulean"));
                System.out.println(Contains.contains(wordsTask5, "one"));


                System.out.println("\nЗавдання 6");

                GenericTwoTuple<String, Integer> studentRating =
                                new GenericTwoTuple<>("Жиган Дарина", 95);
                System.out.println("Студент + рейтинг: " + studentRating);

                GenericThreeTuple<String, Double, Integer> bookInfo =
                                new GenericThreeTuple<>("Федько-Халамидрик", 300.99, 5);
                System.out.println("Інформація про книгу: " + bookInfo);

                GenericThreeTuple<Integer, String, Boolean> mix =
                                new GenericThreeTuple<>(42, "answer", true);
                System.out.println("Змішаний кортеж: " + mix);

                GenericTwoTuple<String, String> pair =
                                new GenericTwoTuple<>("cerulean", "vermillion");
                System.out.println("Два слова: " + pair);


    }
}