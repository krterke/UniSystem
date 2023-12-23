package course;

import java.util.Vector;

import additional.*;
import enums.*;


public class Lesson {
	public Vector<Lesson> Lesson;
    private LessonType lessonType;
    private Course course;
    private Time time;
    
    private Time getTime() {
        return this.time;
    }
    private void setTime(Time time) {
        this.time = time;
    }

    public LessonType getLessonType() {
        return this.lessonType;
    }
    public void setLessonType(LessonType lessonType) {
        this.lessonType = lessonType;
    }
    public Course getCourse() {
        return this.course;
    }
    public void setCourse(Course course) {
        this.course = course;
    }
    
    public String toString() {
		return "Name"++"\n"+"Lesson: "+lesson+"\n"+"Time: "+hour+":"+minutes;
	}
    
    
    
}
