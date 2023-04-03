package MakingADifference;

public class WorldPopulation {

    public void calculatePopulation(){

        long population =  7650816456L;
        int year = 2019;
        long oldPopulation = 7650816456L;
        long newPopulation;
        long increase;
        boolean isDouble = true;


        for (int i = 1; i < 76; ++i) {
            year++;
            newPopulation = (long) (population * Math.pow (( 2.71828) ,(.0109*i)));
            increase = newPopulation - oldPopulation;

            System.out.println(" " + year + "                 "+ newPopulation +"                   " + increase        );

            if (increase >= population & isDouble){
                System.out.println("The population doubles in this year : " + year);
                isDouble = false;
            }
            
        }
    }
}
