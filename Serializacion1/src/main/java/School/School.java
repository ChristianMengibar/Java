package School;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

public class School {

    private String name;
    private List<Group>groups;

    @JsonCreator
    public School(
            @JsonProperty("name") String name,
            @JsonProperty("groups") List<Group> groups) {
        this.name = name;
        this.groups = groups;
    }

    public School(){


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(name, school.name) && Objects.equals(groups, school.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, groups);
    }

    @Override
    public String toString() {
        return "School.School{" +
                "name='" + name + '\'' +
                ", groups=" + groups +
                '}';
    }
}
