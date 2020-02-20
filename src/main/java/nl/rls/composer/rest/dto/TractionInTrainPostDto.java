package nl.rls.composer.rest.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.hateoas.ResourceSupport;

@NoArgsConstructor
@Getter
@Setter
public class TractionInTrainPostDto extends ResourceSupport {
    private int position;
    private int driverIndication;
    private String tractionUrl;
}