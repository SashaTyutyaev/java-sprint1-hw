import java.util.Scanner;
public class StepTracker {
    Converter converter = new Converter();
    MonthData monthData = new MonthData();
    Scanner scanner;
    MonthData[] monthToData = new MonthData[13];
    int goalByStepsPerDay = 10000;

    StepTracker(Scanner scan) {
        scanner = scan;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }
    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца");
        int month = scanner.nextInt();
        if (month > 12 || month < 1){
            System.out.println("Ошибка");
            return;
        }
        System.out.println("Введите номер дня");
        int day = scanner.nextInt();
        if (day > 30 || day < 1) {
            System.out.println("Ошибка");
            return;
        }
        System.out.println("Введите количество шагов");
        int steps = scanner.nextInt();
        if (steps <= 0) {
            System.out.println("Ошибка");
            return;
        } else {
            System.out.println("Сохранено");
        }
        MonthData monthData = monthToData[month - 1];
        monthData.days[day - 1] = steps;
    }
    void changeStepGoal() {
        System.out.println("Введите цель шагов за день");
        int stepsGoal = scanner.nextInt();
        if (stepsGoal <= 0) {
            System.out.println("Ошибка");
            return;
        }
        goalByStepsPerDay = stepsGoal;
    }
    void printStatistic() {
        System.out.println("Введите номер месяца");
        int month = scanner.nextInt();
        if ( month < 0 || month > 12) {
            System.out.println("Ошибка");
        } else {
            System.out.println("Статистика за " + month + " месяц :");
        }
        monthData = monthToData[month - 1];
        int sumSteps = monthData.sumStepsFromMonth();
        monthData.printDaysAndStepsFromMonth();
        System.out.println("За этот месяц вы прошли " + sumSteps + " шагов.");
        int maxSteps = monthData.maxSteps();
        System.out.println("Максимальное количество шагов за месяц составило: " + maxSteps);
        int sumKm = converter.convertToKm(sumSteps);
        System.out.println("За этот месяц вы прошли " + sumKm + " километров.");
        int sumCal = converter.convertStepsToKilocalories(sumSteps);
        System.out.println("За этот месяц вы сожгли " + sumCal + " килокалорий.");
        int bestSeries = monthData.bestSeries(goalByStepsPerDay);
        System.out.println("Ваша лучшая серия за месяц: " + bestSeries);
        System.out.println();

    }

}
