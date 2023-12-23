package additional;

import java.util.Objects;

import course.*;

import enums.*;


public class Time {
    
    private WeekDays day;
    private Integer hour;
    private Integer minutes;
    private Lesson lesson;
    
    public Time(){}
    public Time(WeekDays day, Integer hour,Integer minutes, Lesson lesson){
        this.day = day;
        this.hour = hour;
        this.minutes = minutes;
        this.lesson = lesson;
    }
    
    public WeekDays getDay() {
        return this.day;
    }
    
    public void setDay(WeekDays day) {
        this.day = day;
    }
    
    public Integer getHour() {
        return this.hour;
    }
    
    public void setHour(Integer hour) {
        this.hour = hour;
    }
    public Integer getMinutes() {
        return this.minutes;
    }
    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }


    
    public String getTime(Lesson l) {
        if (this.lesson.equals(l)) {
            return "Time: " + l.getHour() + ":" + l.getMinutes();
        }
        return null;  // Return something meaningful in case the lesson is not found
    }

    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Lesson other = (Lesson) obj;
        return Objects.equals(hour, other.hour) && Objects.equals(minutes, other.minutes);
    }

    
    
    public String toString() {
		return "Day: "+day+"\n"+"Lesson: "+lesson+"\n"+"Time: "+hour+":"+minutes;
	}

    
}
