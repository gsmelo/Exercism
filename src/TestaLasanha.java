public class TestaLasanha {

    public static void main(String[] args)
    {
        Lasagna lasagna = new Lasagna();

        System.out.println("The expected minutes in Oven is " + lasagna.expectedMinutesInOven());

        System.out.println("The remaining time for a lasagna that is 5 minutes in oven is " + lasagna.remainingMinutesInOven(5));

        System.out.println("The preparation time for 3 layers is " + lasagna.preparationTimeInMinutes(3));

        System.out.println("The total time passed is " + lasagna.totalTimeInMinutes(3, 5));
    }

}
