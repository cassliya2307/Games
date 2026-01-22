import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Factors {

    public static int lowest(int[] numbers){
        int lowest = numbers[0];
        for(int count = 0; count < numbers.length; count++){
            if(numbers[count] < lowest){
                lowest = numbers[count];
            }
        }
        return lowest;
    }


    public static ArrayList<Integer> factorsOfNumbers(int[] numbers, int lowest){
        ArrayList<Integer> factors = new ArrayList<>();
            for(int index = 2; index <= lowest; index++){
                int checker = 0;
                for(int count = 0; count < numbers.length; count++){
                if(numbers[count] % index == 0) {
                    checker++;
                    if (checker == 3) factors.add(index);
                }
            }

        }
        return factors;
    }

    public static int[] changeArray(int[] number, int divisor){
        for(int count = 0; count < number.length; count++){
            number[count] = number[count] / divisor;
        }
        return number;
    }

    public static ArrayList<Integer> numberFactors(int[] numbers){
        ArrayList<Integer> factors = new ArrayList<>();
        int smallest = lowest(numbers);
            for(int count = 2; count <= smallest; count++){
                int check = 0;

                for(int index = 0; index < numbers.length; index++){
                    if(numbers[index] % count == 0) check++;
                }

                if(check == 3){
                    factors.add(count);
                    numbers = changeArray(numbers, count);
                    count = 1;
                    smallest = lowest(numbers);
                }
            }

            return factors;
    }




    public static void main(String[] args) {
        int[] num = {24, 12, 8};
        int high = Factors.lowest(num);
        ArrayList<Integer> factors = Factors.factorsOfNumbers(num,high);
//        System.out.println(factors);
        ArrayList<Integer> factors2 = Factors.numberFactors(num);
        System.out.println(factors2);

    }
}
