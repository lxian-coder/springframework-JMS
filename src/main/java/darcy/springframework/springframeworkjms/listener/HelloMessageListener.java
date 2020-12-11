package darcy.springframework.springframeworkjms.listener;

import darcy.springframework.springframeworkjms.config.JmsConfig;
import darcy.springframework.springframeworkjms.model.HelloWorldMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import javax.jms.Message;

/**
 * Darcy Xian  11/12/20  2:01 pm      springframework-jms
 */
@Component
public class HelloMessageListener {
    // @Payload tells Spring Framework to go head and deserialize up component.
    // @Headers tells Spring Framework to get the MessageHeaders.
    @JmsListener(destination = JmsConfig.MY_QUEUE)
    public void listen(@Payload HelloWorldMessage helloWorldMessage, MessageHeaders headers,
                       @Headers Message message){

        System.out.println("I got a message!!!");

        System.out.println(helloWorldMessage);


    }

}
