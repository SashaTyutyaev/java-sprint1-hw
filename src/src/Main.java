import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);
        while (true) {
            printMenu();
            int i = scanner.nextInt();
            if (i == 1) {
                stepTracker.addNewNumberStepsPerDay();
            } else if(i == 2) {
                stepTracker.changeStepGoal();
            } else if(i == 3) {
                stepTracker.printStatistic();
            } else if(i == 4) {
                System.out.println("Пока");
                break;
            } else {
                System.out.println("Такой команды нет");
            }
        }
    }
    public static void printMenu(){
        System.out.println("Что вы хотите сделать?");
        System.out.println("1 - Добавить количество шагов за день");
        System.out.println("2 - Изменить цель шагов за день");
        System.out.println("3 - Подробная статистика за месяц");
        System.out.println("4 - Выход");
    }
}