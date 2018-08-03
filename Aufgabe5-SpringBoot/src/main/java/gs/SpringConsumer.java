package gs;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class SpringConsumer {

    @KafkaListener(topics = "gsHallo")
    public void processMessage(String content) {
        System.out.println("Got message: "+ content);
    }
}
