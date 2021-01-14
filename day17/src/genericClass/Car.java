package genericClass;

public class Car {
    private String manufacture;
    private int year;
    private int month;

    public Car(){}
    public Car(String manufacture, int year, int month){
        this.manufacture = manufacture;
        this.year = year;
        this.month = month;
    }

    public void setManufacture(String manufacture){
        this.manufacture = manufacture;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setMonth(int month){
        this.month = month;
    }

    public String getManufacture(){
        return this.manufacture;
    }
    public int getYear(){
        return this.year;
    }
    public int getMonth(){
        return this.month;
    }
}
