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
        int age = 16;
        if(age>=18) {
            System.out.println("Если возраст человека равен " + age + ", то он - совершеннолетний");
        }
        if(age<18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int outTemperature = -10;
        if(outTemperature>=5) {
            System.out.println("На улице " + outTemperature + " градусов, можно идти без шапки");
        }
        if(outTemperature<5) {
            System.out.println("На улице " + outTemperature + " градусов, нужно надеть шапку");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int speedLimit = 60;
        if(speedLimit > 60 ) {
            System.out.println("Если скорость " + speedLimit + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speedLimit + ", то можно ездить спокойно");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int age = 25;
        boolean toKindergarten = age >= 2 && age <= 6;
        boolean toSchool = age >=7 && age <=18;
        boolean toUniversity = age > 18 && age <= 24;
        boolean toWork = age > 24;
        if(age < 2) {
            System.out.println("Если возраст человека равен " + age + ", то ему никуда не нужно ходить");
        } else if(toKindergarten) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
                } else if(toSchool) {
                    System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
                    } else if(toUniversity) {
                        System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
                        } else if(toWork) {
                            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
                            }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int age = 15;
        boolean adult = false;
        boolean ageIsNotAllowed = age < 5;
        boolean ageOnlyWithAdult = age >=5 && age <=14;
        boolean ageWithoutAdult = age > 14;
        if(ageIsNotAllowed) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else if(ageOnlyWithAdult) {
                    if(adult) {
                    System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
                    } else {
                    System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе без сопровожения взрослого");
                    }
                } else if(ageWithoutAdult) {
                        System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
                        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        short placesInCarriageTotal = 102;
        short placesToSeatTotal = 60;
        int placesToStayTotal = placesInCarriageTotal - placesToSeatTotal;
        short placesToSeatSold = 60;
        int placesToSeatVacant = placesToSeatTotal - placesToSeatSold;
        short placesToStaySold = 42;
        int placesToStayVacant = placesToStayTotal - placesToStaySold;
        if(placesToSeatVacant > 0 || placesToStayVacant > 0) {
            System.out.println("В вагоне сидячих мест: " + placesToSeatVacant);
            System.out.println("В вагоне стоячих мест: " + placesToStayVacant);
        } else {
            System.out.println("В вагоне свободных мест нет");
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int one = 4;
        int two = 5;
        int three = 5;
        if(one > two && one > three) {
            System.out.println("Число one " + one + " - самое большое");
        } else {
            if(one == two && one == three && two == three) {
                System.out.println("Все три числа равны");
                } else {
                    if(one <= two) {
                        if(one == two && one > three) {
                        System.out.println("Число one " + one + " равно числу two " + two + " и они вместе самые большие");
                        } else {
                            if(two > three) {
                                System.out.println("Число two " + two + " - самое большое");
                            }
                        }
                    }
                    if(one <= three) {
                        if(one == three && one > two) {
                        System.out.println("Число one " + one + " равно числу three " + three + " и они вместе самые большие");
                        } else {
                                if(three > two) {
                                System.out.println("Число three " + three + " - самое большое");
                                }
                            }
                    }
                    if(two <= three) {
                        if(two == three && two > one) {
                        System.out.println("Число two " + two + " равно числу three " + three + " и они вместе самые большие");
                        }
                    }
                }
            }
    }
}