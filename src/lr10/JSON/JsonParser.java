package lr10.JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class JsonParser {
    public static void main(String[] args) {
        try{
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("G:\\Labs\\labs\\src\\lr10\\JSON\\JSON-example.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент: " + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("Employers");

            for (Object o : jsonArray){
                JSONObject employer = (JSONObject) o;
                System.out.println("\nТекущий элемент: Employer ");
                System.out.println("Фамилия: " + employer.get("surname"));
                System.out.println("Должность: " + employer.get("post"));
                System.out.println("Зарплата: " + employer.get("salary"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
