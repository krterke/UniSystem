package course;


import additional.*;
import enums.*;



public class Lesson {
  
    private Time time;
    private LessonType lessonType;
    public Integer hour;
    public Integer minutes;
    
    
    public Time getTime() {
        return this.time;
    }
    
    public void setTime(Time time) {
        this.time = time;
    }
    
    public LessonType getLessonType() {
        return this.lessonType;
    }
    
    public void setLessonType(LessonType lessonType) {
        this.lessonType = lessonType;
    }
    public int getHour() {
        return this.hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
}
