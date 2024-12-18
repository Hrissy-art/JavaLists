import java.util.*;
import java.util.Collections;


public class Temperatures{
    public static void main(String[] args) {

        ArrayList<Integer> temperatures = new ArrayList<>();

        int min = 10;
        int max = 35;
        for (int i = 0; i < 30; i++){
            int temperature = (int) (Math.random()* (max - min + 1)) + min;
            temperatures.add(temperature);
        }
        System.out.println(temperatures);

        Collections.sort(temperatures);
        System.out.println(temperatures);

        int listSomme = 0;
        for (int i = 0; i < temperatures.size(); i++){
            listSomme += temperatures.get(i);
        }

        float moyenne = listSomme / temperatures.size();
    }
}