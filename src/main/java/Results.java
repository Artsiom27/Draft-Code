import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;
import java.util.Map;

public class Results {
    private List<Student> student;
    private Integer english;
    private Integer maths;
    private Integer russian;
    private Map<String, Results> results;

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public Integer getEnglish() {
        return english;
    }

    public void setEnglish(Integer english) {
        this.english = english;
    }

    public Integer getMaths() {
        return maths;
    }

    public void setMaths(Integer maths) {
        this.maths = maths;
    }

    public Integer getRussian() {
        return russian;
    }

    public void setRussian(Integer russian) {
        this.russian = russian;
    }

    public Map<String, Results> getResults() {
        return results;
    }

    public void setResults(Results results) {
        this.results = (Map<String, Results>) results;
    }

    public String toString() {
        return new ToStringBuilder(this).append("english", english).append("maths", maths)
                .append("russian", russian).append(results).toString();


    }
}






