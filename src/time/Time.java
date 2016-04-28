package time;

public class Time {
    private int hour;
    private int minute;
    public void putHour(int h){
        hour = h;
    }
    public void putMinute(int m){
        minute = m;
    }
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    /*Time(int h, int m){
        hour = h;
        minute = m;
    };*/
    Time(){};
    public static void main(String[] args) {
        //Time T = new Time(3,25);
        Time T = new Time();
        T.putHour(3);
        T.putMinute(25);
        System.out.println("The time now is "+T.getHour()+":"+T.getMinute());
    }
    
}
