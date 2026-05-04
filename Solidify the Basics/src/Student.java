import java.util.ArrayList;

public class Student {

    String name;
    ArrayList<Double> grades;

    Student(String name){
        this.name = name;
        this.grades = new  ArrayList<>();
    }

    void addGrade(double grade){
        grades.add(grade);
    }

    double getAverage(){
        double total = 0;

        for (double grade : grades){
            total += grade;
        }
        return total / grades.size();

    }

    String getName(){
        this.name = name;
        return name;
    }

}
