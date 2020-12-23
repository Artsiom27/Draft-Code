import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        try {

            ObjectMapper objectMapper = new ObjectMapper();

            String jsonStudentArray = "[{\"firstName\":\"Eugen\",\"lastName\":\"Borisik\",\"sex\":\"MALE\",\"age\":28,\"results\":{\"english\":8,\"maths\":10}}," +
                    "{\"firstName\":\"Viktoria\",\"lastName\":\"Mikulich\",\"sex\":\"FEMALE\",\"age\":26}," +
                    "{\"firstName\":\"Artem\",\"lastName\":\"Tsvikevich\",\"sex\":\"MALE\",\"age\":27,\"results\":{\"russian\":9,\"english\":9}}]";

            List<Student> listStusents = objectMapper.readValue(jsonStudentArray, new TypeReference<List<Student>>() { });

            System.out.println(listStusents);

        } catch (FileNotFoundException e) {
            System.out.println("no file");
        }
    }
}

