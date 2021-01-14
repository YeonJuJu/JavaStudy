package genericClass;

public class Tv {
    private int year;
    private int month;

    public Tv(){}
    public Tv(int year, int month){
        this.year = year;
        this.month = month;
    }

    public void setYear(int year){
        this.year = year;
    }
    public void setMonth(int month){
        this.month = month;
    }

    public int getYear(){
        return this.year;
    }
    public int getMonth(){
        return this.month;
    }
}

