//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "Ivanov " + "Ivan " + "Ivanovich ";
        System.out.println("Ф.И.О сотрудника - " + fullName);

        System.out.println("Задача 2");

        String fullNameS = ("Ivanov Ivan Ivanovich");
        String fullNamesTrue = fullNameS.replace("Ivanov Ivan Ivanovich",
                "IVANOV IVAN IVANOVICH");
        System.out.println(fullNamesTrue);

        System.out.println("Задача 3");

        String fullNameOne = "Иванов Семён Семёнович";
        String fullNameOneTrue = fullNameOne.replace("ё","е");
        System.out.println("Данные Ф.И.О. сотрудника-" + fullNameOneTrue);
    }
}