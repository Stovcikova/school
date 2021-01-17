package sk.kosickaakademia.stovcikova.rodnecislo;

public class Transport {

    public double priceForTransport(int distance, double consumption, double petrolPrice){
        if(distance <= 0 || consumption <= 0){
            return 0;
        }

        if(petrolPrice == 0){
            return 0;
        }

        double result;
        result = (distance / 100) * consumption * petrolPrice;
        result = result * 100;
        result = Math.round(result);
        result = result/100;
        return result;
    }

}
