package springbootkafkaconsumerexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
 
    @KafkaListener(topics = "kafkatopicstring", groupId= "group_id1")
    public void consume(String message) {
        System.out.println("Consumed String message: " + message);
    }
 
 
    @KafkaListener(topics = "kafkatopicjsonconsumer", groupId= "group_id2",
            containerFactory = "userKafkaListenerFactory")
    public void consumeJson(Employee employee) {
        System.out.println("Consumed JSON Message: " + employee);
    }
}
