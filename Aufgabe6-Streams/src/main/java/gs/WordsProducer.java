package gs;

import java.util.Properties;
import java.util.UUID;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

public class WordsProducer extends Thread {

    private final Properties props = new Properties();
    private final KafkaProducer<String, String> producer;

    public WordsProducer(){
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "broker-1.k.anderscore.com:9092");
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        producer= new KafkaProducer<String, String>(props);
    }

    public void run() {
        String [] words = {"Wer", "Wie", "Was", "Wieso", "Weshalb", "Warum"};
        while(true){
            for(String word:words) {
                if (Math.random() >= 0.5) {
                    ProducerRecord<String,String> helloMsg
                            = new ProducerRecord<String, String>("gsWorte", UUID.randomUUID().toString(), word);
                    producer.send(helloMsg);
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //producer.close();
    }
}
