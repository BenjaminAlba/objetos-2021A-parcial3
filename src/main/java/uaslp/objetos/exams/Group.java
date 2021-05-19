package uaslp.objetos.exams;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Group {
    private int capacity;

    List<Student> students;

    public Group(int Capacity)
    {
        this.capacity=Capacity;
        students = new LinkedList<>();
    }

    public int getCapacity()
    {
        return capacity;
    }

    public int getAvailability()
    {
        return capacity-students.size();
    }

    public List<Student> getStudents()
    {
        return students;
    }

    public void addStudent(Student student) throws GroupIsFullException
    {
        if(students.size()==capacity)
        {
            throw new GroupIsFullException();
        }

        students.add(student);
    }

    public double getAverage()
    {
        double GroupAverage=0;
        for(int i=0;i<students.size();i++)
        {
            GroupAverage=GroupAverage+students.get(i).getAverage();
        }
        return GroupAverage/students.size();
    }
}
