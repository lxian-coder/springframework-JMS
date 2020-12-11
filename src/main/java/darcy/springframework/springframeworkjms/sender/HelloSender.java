package darcy.springframework.springframeworkjms.sender;

import darcy.springframework.springframeworkjms.config.JmsConfig;
import darcy.springframework.springframeworkjms.model.HelloWorldMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * Darcy Xian  11/12/20  11:53 am      springframework-jms
 */
@RequiredArgsConstructor
@Component
public class HelloSender {

    private final JmsTemplate jmsTemplate; // pre-configured JMS template

    @Scheduled(fixedRate = 2000) // 2000 million seconds
    public void sendMessage(){

        System.out.println("I'm Sending a message");
        HelloWorldMessage message = HelloWorldMessage
                .builder()
                .id(UUID.randomUUID())
                .message("Hello World")
                .build();

        jmsTemplate.convertAndSend(JmsConfig.MY_QUEUE,message);
        System.out.println("Message Sent!");

    }
}
