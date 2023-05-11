package lr12;

// Напишите функцию, которая принимает на вход список строк и возвращает новый список,
// содержащий только те строки, которые содержат только буквы (без цифр и символов).

import java.util.List;
import java.util.stream.Collectors;

public class Task9 {
    public static void main(String[] args) {
        String string = "Напиш1ите функцию, которая прини2мает на вход списо3к строк и возвра4щает" +
                " новый спи5сок, содержащий толь6ко те строки, ко7торые начинаются с боль8шой буквы.";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Строка после сплитования: " + "\n");

        for(String e : strings){
            System.out.println(e);
        }

        List<String> stringsAfter = filterLengthString(strings);

        System.out.println("\n" + "Строка после преобразования: " + "\n");
        for(String e: stringsAfter){
            System.out.println(e);
        }
    }

    public static List<String> filterLengthString(List<String> list){
        return list.stream()
                .filter(s -> s.chars().allMatch(Character::isLetter))
                .collect(Collectors.toList());
    }
}
