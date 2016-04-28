package time;

public class Time {
    private int hour;
    private int minute;
    public void putHourMinute(int h, int m){
        if(h>=0 && h<=24 && m>=10 && m<=59){
            hour = h;
            minute = m;
            System.out.println("The time now is "+h+":"+m);
        }
        else if(h>=0 && h<=24 && m>=0 && m<=9){
            hour = h;
            minute = m;
            System.out.println("The time now is "+h+":0"+m);
        }
        else System.out.println("Nao existe tal horario");
    }
    public int getMinute(){
        return minute;
    }
    Time(){};
    public static void main(String[] args) {
        Time T = new Time();
        T.putHourMinute(3,2);
    }
    
}
