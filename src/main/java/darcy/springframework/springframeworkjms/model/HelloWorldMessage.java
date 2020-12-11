package darcy.springframework.springframeworkjms.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

/**
 * Darcy Xian  11/12/20  10:39 am      springframework-jms
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HelloWorldMessage implements Serializable {
    static final long serialVersionUID = 6175945808640277234L;
    private UUID id;
    private String message;

}
