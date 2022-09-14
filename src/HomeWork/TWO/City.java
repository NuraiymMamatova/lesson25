package HomeWork.TWO;


import java.util.TreeSet;

public class City implements Comparable <City>{
    private int code;
    private String name;

    public City(int code, String name) {
        TreeSet <Integer> treeSet = new TreeSet<>();
        this.code = code;
        this.name = name;
        if(code%2==0){
            treeSet.add(code);
            System.out.print(treeSet);
        }
    }





    @Override
    public String toString() {
        return "\nCity: " +
                "\ncode: " + code +
                "\nname: " + name ;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(City o) {
        return name.compareTo(o.name);
    }
}
