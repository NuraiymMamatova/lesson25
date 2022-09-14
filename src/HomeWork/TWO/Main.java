package HomeWork.TWO;

import java.util.*;

public class Main {
    public static void main(String[]args){
        List<City> list = Arrays.asList(new City(5,"Name3"),
                new City(3,"Name1"),
                new City(2,"Name2"),
                new City(4,"Name5"),
                new City(1,"Name4"));
        Collections.sort(list);
        System.out.println(list);

    }
}
