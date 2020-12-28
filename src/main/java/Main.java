import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;


public class Main extends JsonDeserializer<Map<String, Results>> {


    public static void main(String[] args) throws IOException {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Student[] student = objectMapper.readValue(new File("src/test/example.json"), Student[].class);

            List<Student> sudentList = Arrays.asList(student);
            System.out.println(sudentList);

            //String jsonStudentArray = "[{\"firstName\":\"Eugen\",\"lastName\":\"Borisik\",\"sex\":\"MALE\",\"age\":28,\"results\":{\"english\":8,\"maths\":10}}," +
            //        "{\"firstName\":\"Viktoria\",\"lastName\":\"Mikulich\",\"sex\":\"FEMALE\",\"age\":26}," +
            //       "{\"firstName\":\"Artem\",\"lastName\":\"Tsvikevich\",\"sex\":\"MALE\",\"age\":27,\"results\":{\"russian\":9,\"english\":9}}]";

        } catch (FileNotFoundException e) {
            System.out.println("no file");
        }
    }

    @Override
    public Map<String, Results> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        return null;
    }
}
