class Time{
    private int hour;
    private int minute;
    private int second;
   
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
   
    public int getHour(){
        return this.hour;
    }
   
    public int getMinute(){
        return this.minute;
    }
   
    public int getSecond(){
        return this.second;
    }
   
    public void setHour(int hour){
        this.hour = hour;
    }
   
    public void setMinute(int minute){
        this.minute = minute;
    }
   
    public void setSecond(int second){
        this.second = second;
    }
   
    public void setTime(int hour, int minute, int second){
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }
   
    public String exchangeValue(int value){
        if(value<=9){
            return "0" + value;
        }
        else {
            return "" + value;
        }
    }
   
    public String toString(){
       String hours = exchangeValue(this.hour);
       String minutes = exchangeValue(this.minute);
       String seconds = exchangeValue(this.second);
       return hours + ":" + minutes + ":" + seconds;
    }
   
    public Time nextSecond(){
        second += 1;
        if (second > 59){
           minute += 1;
           second = 0;
           if (minute > 59){
               hour += 1;
               minute = 0;                                                                                                                   
               if (hour > 23){
                   hour = 0;
               }
           }
        }
       return this;
    }
   
    public Time previousSecond(){
        second -= 1;
        if (second < 0){
           minute -= 1;
           second = 59;
           if (minute < 0){
               hour -= 1;
               minute = 59;                                                                                                                                                    ;
               if (hour < 0){
                   hour = 23;
               }
           }
        }
        return this;
    }
}

public class TestTime{
    public static void main(String args[]){
        Time t1 = new Time(1,2,3);
        System.out.println(t1);  // toString()
   
        // Test Setters and Getters
        t1.setHour(4);
        t1.setMinute(5);
        t1.setSecond(6);
        System.out.println(t1);  // toString()
        System.out.println("Hour: " + t1.getHour());
        System.out.println("Minute: " + t1.getMinute());
        System.out.println("Second: " + t1.getSecond());
   
        // Test setTime()
        t1.setTime(23, 59, 58);
        System.out.println(t1);  // toString()
       
        // Test nextSecond();
        System.out.println(t1.nextSecond());
        System.out.println(t1.nextSecond().nextSecond());
        System.out.println(t1);
       
        // Test previousSecond()
        System.out.println(t1.previousSecond());
        System.out.println(t1.previousSecond().previousSecond());
       
    }
}

