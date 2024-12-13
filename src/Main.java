//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

public class Main {
//    public static void main(String[] args) {
//        //Приветствовать любого пользователя при вводе его имени через командную строку
//        System.out.println("Enter name and press <Enter>:");
//        Scanner scan = new Scanner(System.in);
//        String name = scan.next();
//        System.out.println("hello, " + name);
//        scan.close();
//    }
//
//    public static void main(String[] args) {
//        //Отобразить в окне консоли аргументы командной строки в обратном порядке
//        System.out.println("Enter <Enter>:");
//        Scanner scan = new Scanner(System.in);
//        String arguments = scan.nextLine();
//        String newarguments = "";
//        String[] argumentsArray = arguments.split(" ");
//        for(int i = argumentsArray.length - 1; i >= 0; i--) {
//            String lastword = argumentsArray[i];
//            newarguments = newarguments + lastword + ' ';
//            System.out.println(lastword);
//        }
//        System.out.println(newarguments);
//    }
//
//    public static void main(String[] args) {
//        //Вывести заданное количество случайных чисел с переходом и без перехода
//        //на новую строку.
//        System.out.println("Enter <Enter>:");
//        Scanner scan = new Scanner(System.in);
//        int N = scan.nextInt();
//        String out = "";
//        for(int i = 0; i < N; i++) {
//            System.out.println(i);
//            out = out + i + ' ';
//        }
//        System.out.println(out);
//    }
//
//    public static void main(String[] args) {
//        //Ввести пароль из командной строки и сравнить его со строкой-образцом
//        System.out.println("Enter <Enter>:");
//        Scanner scan = new Scanner(System.in);
//        String pass = scan.nextLine();
//        String origin = "hello world";
//        if (pass.equals(origin))
//        {
//            System.out.println("rigth");
//        }
//        else
//        {
//            System.out.println("wrong");
//        }
//    }
//
//    public static void main(String[] args) {
//        //Ввести целые числа как аргументы командной строки, подсчитать их суммы и произведения.
//        // Вывести результат на консоль.
//        System.out.println("Enter <Enter>:");
//        Scanner scan = new Scanner(System.in);
//        String arguments = scan.nextLine();
//        String[] argumentsArray = arguments.split(" ");
//        int sum = 0;
//        int mult = 1;
//        for(int i = argumentsArray.length - 1; i >= 0; i--) {
//            sum = sum + Integer.parseInt(argumentsArray[i]);
//            mult = mult * Integer.parseInt(argumentsArray[i]);
//        }
//        System.out.println("sum = " + sum + " multiplication = " + mult);
//    }
//
//    public static void main(String[] args) {
////        Вывести фамилию разработчика, дату и время получения задания, а также
////        дату и время сдачи задания.
//        System.out.println("Ushakova");
//        System.out.println("2024-09-13T22:06:15.717088300");
//        java.time.LocalDateTime currentDateTime = java.time.LocalDateTime.now();
//        System.out.println(currentDateTime);
//    }

//    Ввести с консоли n целых чисел. На консоль вывести:
//            1. Четные и нечетные числа.
//            2. Наибольшее и наименьшее число.
//            3. Числа, которые делятся на 3 или на 9.
//            4. Числа, которые делятся на 5 и на 7.
//            5. Все трехзначные числа, в десятичной записи которых нет одинаковых
//              цифр.
//            6. Простые числа.
//            7. Отсортированные числа в порядке возрастания и убывания.
//            8. Числа в порядке убывания частоты встречаемости чисел.
//            9. «Счастливые» числа.
//            10. Числа-палиндромы, значения которых в прямом и обратном порядке совпадают.
//            11. Элементы, которые равны полусумме соседних элементов.

//        public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String arguments = scan.nextLine();
//        String[] argumentsArray = arguments.split(" ");
//        //1
//        System.out.println("1. Четные и нечетные числа");
//        String even = "";
//        String odd = "";
//        for(int i = 0; i < argumentsArray.length; i++) {
//            if (Integer.parseInt(argumentsArray[i]) % 2 == 0) {
//                even = even + argumentsArray[i] + " ";
//            } else {
//                odd = odd + argumentsArray[i] + " ";
//            }
//        }
//        System.out.println("even numbers = " + even + ", odd numbers = " + odd);
//        //2
//        System.out.println("2. Наибольшее и наименьшее число");
//        int min = Integer.parseInt(argumentsArray[0]);
//        int max = Integer.parseInt(argumentsArray[0]);
//        for(int i = 0; i < argumentsArray.length; i++) {
//            if (min > Integer.parseInt(argumentsArray[i]))
//            {
//                min = Integer.parseInt(argumentsArray[i]);
//            }
//            if (max < Integer.parseInt(argumentsArray[i]))
//            {
//                max = Integer.parseInt(argumentsArray[i]);
//            }
//        }
//        System.out.println("min = " + min + ", max = " + max);
//        //3
//        System.out.println("3. Числа, которые делятся на 3 или на 9.");
//        String three = "";
//        for(int i = 0; i < argumentsArray.length; i++) {
//            if ((Integer.parseInt(argumentsArray[i]) % 3 == 0) || (Integer.parseInt(argumentsArray[i]) % 9 == 0 ))
//            {
//                three = three + Integer.parseInt(argumentsArray[i]) + " ";
//            }
//        }
//        System.out.println(three);
//
//        //4
//        System.out.println("Числа, которые делятся на 5 и на 7.");
//        String fiveseven = "";
//        for(int i = 0; i < argumentsArray.length; i++) {
//            if ((Integer.parseInt(argumentsArray[i]) % 5 == 0) & (Integer.parseInt(argumentsArray[i]) % 7 == 0 ))
//            {
//                fiveseven = fiveseven + Integer.parseInt(argumentsArray[i]) + " ";
//            }
//        }
//        System.out.println(fiveseven);
//
//        //5
//        System.out.println("5. Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.");
//        String threedigit = "";
//        for(int i = 0; i < argumentsArray.length; i++) {
//            String check = argumentsArray[i];
//            if (check.length() == 3)
//            {
//                threedigit = threedigit + check + " ";
//            }
//        }
//        if (threedigit != "") {
//            String[] threedigitArray = threedigit.split(" ");
//            String threedi = "";
//            for (int i = 0; i < threedigitArray.length; i++) {
//                if ((Integer.parseInt(threedigitArray[i]) % 10 != (Integer.parseInt(threedigitArray[i]) % 100 / 10))
//                        & (Integer.parseInt(threedigitArray[i]) % 100 / 10 != Integer.parseInt(threedigitArray[i]) / 100)
//                        & (Integer.parseInt(threedigitArray[i]) % 10 != Integer.parseInt(threedigitArray[i]) / 100)) {
//                    threedi = threedi + threedigitArray[i] + " ";
//                }
//            }
//
//            System.out.println(threedi);
//        }
//
//        //6. Простые числа.
//        System.out.println("6. Простые числа.");
//        String prime = "";
//        for(int i = 0; i < argumentsArray.length; i++) {
//            BigInteger bigInteger = BigInteger.valueOf(Integer.parseInt(argumentsArray[i]));
//            boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(Integer.parseInt(argumentsArray[i])));
//            if (probablePrime)
//            {
//                prime = prime + argumentsArray[i] + " ";
//            }
//        }
//        System.out.println(prime);
//
//        //7. Отсортированные числа в порядке возрастания и убывания.
//        System.out.println("Отсортированные числа в порядке возрастания и убывания");
//
//        String[] increace = argumentsArray;
//        Arrays.sort(increace);
//        System.out.println("По возрастанию: ");
//        for (String num : increace) {
//            System.out.println(num + " ");
//        }
//        System.out.println("По убыванию: ");
//        for (int i = increace.length - 1; i >= 0; i--)
//        {
//            System.out.println(increace[i] + " ");
//        }
//
//        //8 Числа в порядке убывания частоты встречаемости чисел
//        System.out.println("8 Числа в порядке убывания частоты встречаемости чисел");
//        Map<String, Integer> dictionary = new HashMap<String, Integer>();
//        int count = 0;
//        for(int i = 0; i < argumentsArray.length; i++) {
//            for(int j = 0; j < argumentsArray.length; j++) {
//                if (argumentsArray[i].equals(argumentsArray[j])) {
//                    count = count + 1;
//                }
//            }
//            if (dictionary.get(argumentsArray[i]) == null)
//            {
//                dictionary.put(argumentsArray[i], count);
//            }
//            count = 0;
//        }
//
//        dictionary.entrySet().stream().sorted
//                (Map.Entry.<String, Integer>comparingByValue().reversed()).forEach(System.out::println);
//
//
//        //9. «Счастливые» числа.
//        System.out.println("9. «Счастливые» числа.");
//        String sixdigit = "";
//        for(int i = 0; i < argumentsArray.length; i++) {
//            String check = argumentsArray[i];
//            if (check.length() == 6)
//            {
//                sixdigit = sixdigit + check + " ";
//            }
//        }
//        if (sixdigit != "") {
//            String[] sixdigitArray = sixdigit.split(" ");
//            String lucky= "";
//            for (int i = 0; i < sixdigitArray.length; i++) {
//                int sum1 = 0;
//                int firsthalf = (Integer.parseInt(sixdigitArray[i]) % 1000);
//                for(int j = 0; j < 3; j++)
//                {
//                    sum1 = sum1 + (firsthalf % 10);
//                    firsthalf = firsthalf / 10;
//                }
//                int sum2 = 0;
//                int secondhalf = (Integer.parseInt(sixdigitArray[i]) / 1000);
//                for(int j = 0; j < 3; j++) {
//                    sum2 = sum2 + (secondhalf % 10);
//                    secondhalf = secondhalf / 10;
//                }
//                if (sum1 == sum2)
//                {
//                    lucky = lucky + sixdigitArray[i] + " ";
//                }
//            }
//
//            System.out.println(lucky);
//        }
//
//        //10. Числа-палиндромы, значения которых в прямом и обратном порядке совпадают.
//        System.out.println("10. Числа-палиндромы, значения которых в прямом и обратном порядке совпадают.");
//        String palindromes = "";
//        for(int i = 0; i < argumentsArray.length; i++)
//        {
//            char[] c = argumentsArray[i].toCharArray();
//            boolean f = true;
//
//            for(int j = 0; j > c.length ; j++)
//            {
//                for(int k = c.length; k > 0 ; k--)
//                {
//                    if (c[j] == c[k])
//                    {
//                        continue;
//                    }
//                    else
//                    {
//                        f = false;
//                        break;
//                    }
//                }
//                if (f == false)
//                {
//                    break;
//                }
//            }
//            if (f == true)
//            {
//                palindromes = palindromes + argumentsArray[i] + " ";
//            }
//        }
//        System.out.println(palindromes);
//
//        // 11. Элементы, которые равны полусумме соседних элементов.
//        System.out.println("11. Элементы, которые равны полусумме соседних элементов.");
//        String halfsum = "";
//        for(int i = 1; i < argumentsArray.length - 1; i++) {
//            if (Integer.parseInt(argumentsArray[i]) ==
//                    (Integer.parseInt(argumentsArray[i-1]) + Integer.parseInt(argumentsArray[i+1]) /2 ) )
//            {
//                halfsum = halfsum + argumentsArray[i] + " ";
//            }
//        }
//        System.out.println(halfsum);
//
//        int[][] lab = new int[10][10];
//        for(int i = 0; i < 10; i++)
//        {
//            for(int j = 0; j < 10; j++) {
//                lab[i][j] = (int)Math.round(Math.random());
//                System.out.println((lab[i][j]));
//            }
//        }
//    }


}

