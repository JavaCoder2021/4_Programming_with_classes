package by.epam.strings.strings_as_chars_array;

/*
1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 */
public class Task1 {
    public static void main(String[] args) {
        String[] arr;

        arr = new String[]{"numbersSum", "numOfDigits", "mainTaskR"};

        printArray(arr);
        toSnakeCase(arr);
        printArray(arr);

    }

    static void toSnakeCase(String[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length(); j++) {

                if (Character.isUpperCase(arr[i].charAt(j))) {
                    arr[i] = newString(arr[i], j);
                }

            }

        }
    }

    static String newString(String a, int index) {
        return a.substring(0, index).concat("_").concat(a.substring(index, index + 1).toLowerCase().concat(a.substring(index + 1)));
    }

    static void printArray(String[] arr) {
        for (String variable : arr) {
            System.out.print(variable + "\t\t");
        }
        System.out.println("\n");
    }
}
