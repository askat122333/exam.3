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

    public static void delete(List<Student> students){
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getRating() < 3) {
                System.out.println(students.get(i).getName()+ " Не проходит на следующий курс");
                students.remove(students.get(i));
            }
        }
    }
    public static Student add(){
        Random random = new Random();
        int u = random.nextInt(1,15);
        String name = "Student" + u;
        int r = random.nextInt(1,3);
        int t = random.nextInt(1,5);
        int y = random.nextInt(2,5);
        Student student = new Student(name,r,t,y);
        return student;
    }
    public static void printStudents (List<Student> students,int course) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getCourse() == course) {
                System.out.println(students.get(i).getName());
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", course=" + course +
                ", rating=" + rating +
                '}'+"\n";
    }
}
