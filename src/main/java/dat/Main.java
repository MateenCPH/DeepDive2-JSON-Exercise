package dat;

import com.fasterxml.jackson.databind.ObjectMapper;
import dat.config.HibernateConfig;
import dat.entities.User;
import dat.services.JsonFileReader;
import jakarta.persistence.EntityManagerFactory;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();

            // JSON string
            String jsonString = JsonFileReader.readJsonFromFile("account.json");

            // Convert JSON string to Java object
            List<User> users = Collections.singletonList(objectMapper.readValue(jsonString, User.class));

            // Print Java object
            System.out.println("Name: " + user.getFirstName() + " " + user.getLastName());
            System.out.println("Birthdate: " + user.getBirthDate());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
