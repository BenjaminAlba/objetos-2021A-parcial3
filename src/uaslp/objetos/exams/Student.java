package uaslp.objetos.exams;

import java.util.List;

public class Student {

    private String name;
    private int code;
    private double average;

    List<Integer> scores;

    public Student(String Name, int Code)
    {
        this.name=Name;
        this.code=Code;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public void setScore(int index, int score) throws InvalidPartialException
    {
        if(index<1 || index>3) {
            throw new InvalidPartialException();
        }
            scores.add(index,score);
    }

    public double getAverage() throws MissingScoreException
    {
        if(scores.get(1)==null || scores.get(2)==null || scores.get(3)==null)
        {
            throw new MissingScoreException();
        }

        average=scores.get(1)+scores.get(2)+scores.get(3);
        average=average/3;
        return average;
    }
}
