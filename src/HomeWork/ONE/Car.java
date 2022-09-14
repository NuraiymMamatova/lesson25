package HomeWork.ONE;

public class Car {
    private long ID;
    private String numberAuto;
    Car(long ID,String numberAuto){
        this.ID = ID;
        this.numberAuto = numberAuto;
    }

    @Override
    public String toString() {
        return "Car: " +
                "\nID: " + ID +
                "\nnumberAuto: " + numberAuto;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getNumberAuto() {
        return numberAuto;
    }

    public void setNumberAuto(String numberAuto) {
        this.numberAuto = numberAuto;
    }
}
