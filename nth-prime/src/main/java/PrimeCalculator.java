import java.util.List;
class PrimeCalculator {

    private boolean isPrime(int num) {
    
       for(int i=2;i*i <= num ; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    int nth(int nth) {
        int number = 3;
        if(nth==0)
        {
            throw new IllegalArgumentException();
        }
        if(nth==1)
        {
            return 2;
        }
       int prime = 2;
        nth--;
        while(nth>0)
            {
                if(isPrime(number))
                {
                    prime = number;
                    nth--;
                }
                
                number++;
                
            }
        
        return prime;
    }

}
