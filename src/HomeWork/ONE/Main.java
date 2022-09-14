package HomeWork.ONE;

import java.util.HashMap;

public class Main {
    public static void main(String[]args){
        HashMap<Car, InformationAboutCar> hashMap = new HashMap<>();
        hashMap.put(new Car(1,"8584A"),new InformationAboutCar(2000,"Lexus",1524695,"White"));
        hashMap.put(new Car(2,"B83754"),new InformationAboutCar(1958,"Honda",5356252,"Black"));
        hashMap.put(new Car(3,"S65854D"),new InformationAboutCar(1547,"Odyssey",52682346,"White-black"));
        for (Car i: hashMap.keySet()) {
            System.out.println(i+"\n"+hashMap.get(i));
            System.out.println("---------------------------");
        }
    }
}
