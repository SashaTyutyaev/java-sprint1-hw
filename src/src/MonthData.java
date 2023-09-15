public class MonthData {
    int[] days = new int[30];
    void printDaysAndStepsFromMonth(){
        for (int i = 0; i < days.length; i++) {
            System.out.println( (i + 1) + " день: " + days[i] + " шагов.");
        }
    }
    int sumStepsFromMonth(){
        int sumSteps = 0;
        for (int i = 0; i < days.length; i++) {
            sumSteps = sumSteps + days[i];
        }
        return sumSteps;
    }
    int maxSteps() {
        int maxDaySteps = days[0];
        for (int i = 0; i < days.length; i++) {
            if (days[i] > maxDaySteps) {
                maxDaySteps = days[i];
            }
        }
        return maxDaySteps;
    }
    int bestSeries(int goalByStepsPerDay) {
        int currentSeries = 0;
        int maxSeries = 0;
        for (int i = 0;i < days.length; i++) {
            if (days[i] >= goalByStepsPerDay) {
                currentSeries += 1;
            } else if (currentSeries >= maxSeries) {
                maxSeries = currentSeries;
                currentSeries = 0;
            } else {
                currentSeries = 0;
            }
        }
        return maxSeries;
    }
}
