import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mapping extends Student {
     Student[] students = Mapping.mapToObj("src/test/example.json", Student[].class);

    public  List<Student> mapToObj(Map<String, Byte> results) {
        List<Student> list = new ArrayList<Student>();
        for (Map.Entry<String, Byte> entry : results.entrySet()) {
            list.add(new results(entry.getKey(), entry.getValue()));
        }
        return list;
    }
}

