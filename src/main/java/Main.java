import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();

        List<Employee> employees = new ArrayList<>();
        Type listType = new TypeToken<List<Employee>>() {}.getType();
        try {
            employees = gson.fromJson(new FileReader("data.json"), listType);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(employees);
    }
}