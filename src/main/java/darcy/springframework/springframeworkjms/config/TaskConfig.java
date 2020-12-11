package darcy.springframework.springframeworkjms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Darcy Xian  11/12/20  11:19 am      springframework-jms
 */
@EnableScheduling // enable a task scheduler
@EnableAsync  // gibve us the ability to do async task
@Configuration
public class TaskConfig {

    @Bean
    TaskExecutor taskExecutor(){
        return new SimpleAsyncTaskExecutor();

    }
}
