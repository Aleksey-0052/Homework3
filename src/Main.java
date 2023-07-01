public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1() {
        System.out.println("Задача 1");

        byte age = 8;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");

        short airTemperature = -1;
        if (airTemperature < 5) {
            System.out.println("На улице " + airTemperature + ", нужно надеть шапку");
        } else {
            System.out.println("На улице " + airTemperature + ", можно идти без шапки");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");

        int carsSpeed = 72;
        if (carsSpeed > 60) {
            System.out.println("Если скорость " + carsSpeed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + carsSpeed + ", то можно ездить спокойно");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");

        int age = 35;
        if (age < 2) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора спать");
        } else if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age > 6 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете");
        } else if (age > 24 && age <= 60) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он может отдохнуть");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");

        int childAge = 14;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе");
        } else if (childAge >= 5 && childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }
    public static void task6() {
        System.out.println("Задача 6");

        int CarTrainPassengersNumber = 102;
        if (CarTrainPassengersNumber >= 0 && CarTrainPassengersNumber < 60) {
            System.out.println("Если в вагоне количество пассажиров равно " + CarTrainPassengersNumber + ", то в вагоне есть сидячее место");
        } else if (CarTrainPassengersNumber >= 60 && CarTrainPassengersNumber <=101) {
            System.out.println("Если в вагоне количество пассажиров равно " + CarTrainPassengersNumber + ", то в вагоне есть стоячее место");
        } else {
            System.out.println("В вагоне мест нет");
        }
    }
    public static void task7() {
        System.out.println("Задача 7");

        int one = 3;
        int two = 1;
        int three = 2;
        if (one > two && one > three) {
            System.out.println("Максимальное число: " + one);
        } else if (two > one && two > three) {
            System.out.println("Максимальное число: " + two);
        } else {
            System.out.println("Максимальное число: " + three);
        }
    }
}
