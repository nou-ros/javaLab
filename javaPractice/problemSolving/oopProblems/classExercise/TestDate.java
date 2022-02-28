class Date{
    private int day;
    private int month;
    private int year;
   
    Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
   
    public int getDay(){
        return day;
    }
   
    public int getYear(){
        return year;
    }
   
    public int getMonth(){
        return month;
    }
   
    public void setDay(int day){
        this.day=day;
    }
   
    public void setMonth(int month){
        this.month=month;
    }
   
    public void setYear(int year){
        this.year=year;
    }
   
    public void setDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
   
    public String toString(){
        String newDay, newMonth;
        if(day < 10){
            newDay = "0"+day;
        }else{
            newDay = String.valueOf(day);
        }
        if(month < 10){
            newMonth = "0"+month;
        }else{
            newMonth = String.valueOf(month);
        }
        return newDay+"/"+newMonth+"/"+year;
    }
}

public class TestDate{
    public static void main(String args[]){
        Date d1 = new Date(1, 2, 2016);
        System.out.println(d1);
       
        //Test setters and getters
        d1.setMonth(12);
        d1.setDay(9);
        d1.setYear(2019);
        System.out.println(d1);
        System.out.println("Month: " + d1.getMonth());
        System.out.println("Day: " + d1.getDay());
        System.out.println("Year: " + d1.getYear());
        d1.setDate(10, 4, 2016);
        System.out.println(d1);
    }
}
