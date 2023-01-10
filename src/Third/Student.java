package Third;

import java.util.List;
import java.util.Random;

public class Student {
  private  String name;
  private   int group;
  private   int course;
  private   int rating;

    public Student(String name, int group, int course, int rating) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.rating = rating;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void delete(List<Student> students){
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i) != null && students.get(i).getRating() < 3) {
                students.remove(students.get(i));
            }
        }
    }
    public void add(List<Student> students){
        Random random = new Random();
        int

//        Student student = new Student();

    }
}
