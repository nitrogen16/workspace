package third_deserialization;
import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
/* 
Десериализация JSON объекта
*/
public class Solution {
    public static <T> T convertFromJsonToNormal(String fileName, Class<T> clazz) throws IOException {
    	ObjectMapper mapper = new ObjectMapper();
    	File file = new File(fileName);
    	
    	return mapper.readValue(file, clazz);
    }

    public static void main(String[] args) {
    	
    }
}
