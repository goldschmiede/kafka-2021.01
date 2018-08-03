package gs;

import java.util.Properties;

import gs.model.Person;
import gs.model.PersonKey;
import io.confluent.kafka.serializers.KafkaAvroSerializer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

public class HelloProducer {

    private final Properties props = new Properties();
    private final KafkaProducer<PersonKey, Person> producer;

    public HelloProducer(){
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "broker-2.k.anderscore.com:9092");
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, KafkaAvroSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaAvroSerializer.class);
        props.put("schema.registry.url", "http://broker-2.k.anderscore.com:8081");

        producer= new KafkaProducer<>(props);
    }

    public void produce() {
        Person[] personen = {
            new Person("Hans","Muster","123"),
            new Person("Hanna","Musterin","456"),
            new Person("Hasso","Musterhund","Hund-23"),
        };
        for(Person p: personen) {
            PersonKey key = new PersonKey(p.getSteuerId());
            ProducerRecord<PersonKey,Person> personMsg = new ProducerRecord<>("avro_personen",key, p);
            producer.send(personMsg);
        }
        producer.close();
    }


}
