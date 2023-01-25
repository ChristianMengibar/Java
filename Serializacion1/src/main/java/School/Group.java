package School;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

public class Group {

    private String title;
    private int classRoomNumber;
    private String classRoomLetter;
    private List<Student>students;

    @JsonCreator
    public Group(
            @JsonProperty("title") String title,
            @JsonProperty("classRoomNumber") int classRoomNumber,
            @JsonProperty("classRoomLetter") String classRoomLetter,
            @JsonProperty("students") List<Student> students) {
        this.title = title;
        this.classRoomNumber = classRoomNumber;
        this.classRoomLetter = classRoomLetter;
        this.students = students;
    }

    public Group(){


    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getClassRoomNumber() {
        return classRoomNumber;
    }

    public void setClassRoomNumber(int classRoomNumber) {
        this.classRoomNumber = classRoomNumber;
    }

    public String getClassRoomLetter() {
        return classRoomLetter;
    }

    public void setClassRoomLetter(String classRoomLetter) {
        this.classRoomLetter = classRoomLetter;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return classRoomNumber == group.classRoomNumber && Objects.equals(title, group.title) && Objects.equals(classRoomLetter, group.classRoomLetter) && Objects.equals(students, group.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, classRoomNumber, classRoomLetter, students);
    }

    @Override
    public String toString() {
        return "School.Group{" +
                "title='" + title + '\'' +
                ", classRoomNumber=" + classRoomNumber +
                ", classRoomLetter='" + classRoomLetter + '\'' +
                ", students=" + students +
                '}';
    }
}
