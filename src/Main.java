public class Main {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
    }

    public static void ex1() {
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
    }

    public static void ex2() {
        System.out.println();
        System.out.println("Задание 2");
        String fullName = "Ivanov Ivan Ivanovich";
        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + upperFullName);
    }

    public static void ex3() {
        System.out.println();
        System.out.println("Задание 3");
        String fullName = "Иванов Семён Семёнович";
        String fixedFullName = fullName.replace("ё", "e");
        System.out.println("Данные ФИО сотрудника — " + fixedFullName);

    }
}