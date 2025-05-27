package jdbc;

/*
* id,name,faculty , semester
* */
public class Student {
    private Integer id;
    private String name;
    private String faculty;
    private String semester;

    public Student(){}

    public Student(Integer id, String name, String faculty, String semester) {
        this.id = id;
        this.name = name;
        this.faculty = faculty;
        this.semester = semester;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
}
