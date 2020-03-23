package nl.rls.composer.rest.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@NoArgsConstructor
@Getter
@Setter
public class TractionInTrainPostDto extends RepresentationModel {
    private int position;
    @Min(0)
    @Max(1)
    private int driverIndication;
    private String tractionUrl;
}
