package uaslp.objetos.exams;

import java.util.List;

public class Student {

    private String name;
    private int code;
    private double average;

    private Integer scores[];

    public Student(String Name, int Code)
    {
        this.name=Name;
        this.code=Code;
        scores = new Integer[3];
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
            scores[index-1]=score;
    }

    public double getAverage() throws MissingScoreException
    {
        for(int i=0;i<3;i++)
        {
            if(scores[i]==null)
            {
                throw new MissingScoreException("Missing partial " + (i+1));
            }
        }

        average=scores[0]+scores[1]+scores[2];
        average=average/3;
        return average;
    }
}
