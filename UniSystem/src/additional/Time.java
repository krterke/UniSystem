package additional;

import Enums.WeekDays;
import course.Lesson;

public class Time {
    private WeekDays day;
    private Integer hour;
    private Integer minutes;
    private Lesson lesson;

    public Time(){

    }
    public Time(WeekDays day, Integer hour,Integer minutes, Lesson lesson;){
        this.day = day;
        this.hour = hour;
        this.minutes = minutes;
        this.lesson = lesson;
    }

    public WeekDays getDay() {
        return this.day;
    }
    public WeekDays setDay(WeekDays day) {
        this.day = day;
    }
    public Integer getHour() {
        return this.hour;
    }
    public Integer setHour(Integer hour) {
        this.hour = hour;
    }
    public Integer getMinutes() {
        return this.minutes;
    }
    public Integer setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public Integer getTime(Lesson l){
        for(Lesson cur:lesson){
            if(cur.equals(l)){
                return "Time: "+l.getHour()+":"+l.getMinutes();
            }
        }
    }


    public String toString() {
		return "Day: "+day+"\n"+"Lesson: "+lesson+"\n"+"Time: "+hour+":"+minutes;
	}


    
}
