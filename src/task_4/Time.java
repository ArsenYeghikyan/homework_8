package task_4;

public class Time {

    private int second ;
    private int minute ;
    private int hour ;

    public Time(int hour, int minute, int second) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public void increaseBySecond() {


        String t7 = second == 59 && minute == 59 && hour == 24 ? "00:00:00" :

                second == 59 && minute == 59 && hour < 24 ? ++hour + ":" + "00:00" :

                        second == 59 && minute < 59 && hour == 24 ? "00" + ":" + ++minute + ":" + "00" :

                                second < 59 && minute == 59 && hour == 24 ? "00" + ":" + "00" + ":" + ++second :

                                        second < 59 && minute < 59 && hour < 24 ? hour + ":" + minute + ":" + ++second :

                                                second == 59 && minute < 59 && hour < 24 ? hour + ":" + ++minute + ":" + "00" :

                                                        hour == 0 && minute == 0 ? "00" + ":" + "00" + ":" + ++second :

                                                                hour <= 59 && minute <= 59 && second < 59 ? hour + ":" + minute + ":" + ++second : "";



        System.out.println(t7);

    }


}







