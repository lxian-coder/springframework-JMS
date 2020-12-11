package darcy.springframework.springframeworkjms.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;


/**
 * Darcy Xian  11/12/20  11:29 am      springframework-jms
 */
@Configuration
public class JmsConfig {

    public static final String MY_QUEUE = "my-hello-world";

    @Bean
    public MessageConverter messageConverter(){
        // MappingJackson2MessageConverter specifically for working with the
        // Jackson JSON library. Spring is doing when we send a message to JMS
        // Spring is gonna convert that message that we send to a JMS text message
        // and the payload is gonna be taking that Java object and converting that over to JSON payload.
         MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
        converter.setTargetType(MessageType.TEXT);
        converter.setTypeIdPropertyName("_type");


          return converter;
    }

}
