package gs;

import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;

import gs.model.Person;
import gs.model.PersonKey;
import gs.model.PersonValue;
import io.confluent.kafka.serializers.KafkaAvroDeserializer;
import io.confluent.kafka.serializers.KafkaAvroSerializer;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

public class HelloConsumer {

    private final Properties props = new Properties();
    private final KafkaConsumer<PersonKey, Person> consumer;

    public HelloConsumer(){
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "broker-2.k.anderscore.com:9092");
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, KafkaAvroDeserializer.class);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, KafkaAvroDeserializer.class);
        props.put("schema.registry.url", "http://broker-2.k.anderscore.com:8081");
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        props.put(ConsumerConfig.GROUP_ID_CONFIG, "gsDemoCode");
        props.put("schema.registry.url", "http://broker-2.k.anderscore.com:8081");
        props.put("specific.avro.reader", "true");

        consumer= new KafkaConsumer<>(props);
    }

    public void consume() {
        consumer.subscribe(Arrays.asList("avro_personen"));
        while (true) {
            ConsumerRecords<PersonKey, Person> records = consumer.poll(Duration.ofMillis(200));
            records.forEach(r -> System.out.println("Got Person" + r.value()));

        }
    }


}
