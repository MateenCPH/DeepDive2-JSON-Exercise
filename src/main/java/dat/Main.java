package dat;

import com.fasterxml.jackson.databind.ObjectMapper;
import dat.config.HibernateConfig;
import dat.dtos.UserDTO;
import dat.entities.User;
import dat.services.JsonFileReader;
import jakarta.persistence.EntityManagerFactory;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        try {
//            ObjectMapper objectMapper = new ObjectMapper();
//
//            // JSON string
//            String jsonString = JsonFileReader.readJsonFromFile("account.json");
//
//            // Convert JSON string to Java object
//            User[] user = objectMapper.readValue(jsonString, User[].class);
//
//            // Print Java object
//            for (User u : user) {
//                System.out.println(u);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        try {
            ObjectMapper objectMapper = new ObjectMapper();

            //JSON string
            String jsonString = JsonFileReader.readJsonFromFile("account.json");

            //Convert JSON string to Java object
            UserDTO[] userDTOS = objectMapper.readValue(jsonString, UserDTO[].class);

            //Print Java object
            for (UserDTO u : userDTOS) {
                System.out.println(u);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
