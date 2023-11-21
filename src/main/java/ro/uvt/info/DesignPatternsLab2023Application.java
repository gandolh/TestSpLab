package ro.uvt.info;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ro.uvt.info.models.Message;

import javax.print.DocFlavor;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

@SpringBootApplication
public class DesignPatternsLab2023Application {

    public static void main(String[] args) throws IOException {
//		SpringApplication.run(DesignPatternsLab2023Application.class, args);
        var messages = new ObjectMapper().readValue(
                new URL("file:src/messages.json"),
                new TypeReference<List<Message>>(){});


        for (Message message: messages) {
            message.print();
        }
        System.out.println(messages);
    }
}
