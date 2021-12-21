public class Lasagna {

    public int expectedMinutesInOven(){
        return 40;
    }

    public int remainingMinutesInOven(int timePassed){
        return expectedMinutesInOven() - timePassed;
    }

    public int preparationTimeInMinutes(int numbersOfLayers){
        return numbersOfLayers * 2;
    }

    public int totalTimeInMinutes(int numbersOfLayers, int timePassed){
        return preparationTimeInMinutes(numbersOfLayers) + timePassed;
    }



}
