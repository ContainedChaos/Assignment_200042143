package Assignment2.DataCoupling;

public class Student
{
    public String name;
    public String id;
    public String dept;
    public int semester;
    public float cgpa;
    private Instructor advisor;

    public Student (String name, String id, String dept, int semester, float cgpa)
    {
        this.name = name;
        this.id = id;
        this.dept = dept;
        this.semester = semester;
        this.cgpa = cgpa;
    }

    public void setAdvisor(Instructor instructor) //data passed from Instructor class to Student class resulting in Data Coupling
    {
        this.advisor = instructor;
    }

    public Instructor getAdvisor()
    {
        return this.advisor;
    }
}
