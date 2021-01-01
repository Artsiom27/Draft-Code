import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Map;

public class Student {
    private String firstName;
    private String lastName;
    private String sex;
    private Integer age;
    private Map<String, Byte> results;

    public void setResults(Map<String, Byte> results) {
        this.results = results;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public String toString() {
        return new ToStringBuilder(this).append("firstName", firstName).append("lastName", lastName).append("sex", sex)
                .append("age", age).append("results", results).toString();

    }
}