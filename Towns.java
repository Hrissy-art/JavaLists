import java.util.ArrayList;

public class Towns {
    public static void main(String[] args) {

        ArrayList<String> towns = new ArrayList<>();

        towns.add("Paris");
        towns.add("Berlin");
        towns.add("Londres");
        towns.add("New York");

        System.out.println(towns);

        towns.remove("Berlin");
        towns.add("Tokyo");

        System.out.println(towns.get(1));

    }
}