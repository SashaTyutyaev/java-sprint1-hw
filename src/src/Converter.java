public class Converter {

    int distance = 75;
    int calories = 50;
    int convertToKm(int steps){
        int sumKm = (distance * steps) / 100000;
        return sumKm;
    }
    int convertStepsToKilocalories(int steps) {
        int sumCal = (steps * calories) / 1000;
        return sumCal;
    }
}
