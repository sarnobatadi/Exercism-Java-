public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        int expected_minutes = 40;
        return expected_minutes;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actual_minutes){
        int expected_minutes = expectedMinutesInOven();
        return expected_minutes - actual_minutes ;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int number_of_layers){
        return number_of_layers*2 ;
        
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int number_of_layers, int time_in_oven){
        int preparation_time = preparationTimeInMinutes(number_of_layers) ;
          

        return  (preparation_time + time_in_oven) ;
        
    }
}
