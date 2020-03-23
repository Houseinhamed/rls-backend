package nl.rls.composer.rest.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.hateoas.RepresentationModel;

/**
 * @author berend.wilkens
 * All codes of Transport restrictions for Freight Traffic (cf. UIC 920-13) and Passengers Traffic are in the same list.
 * F = Freight
 * P = Passenger
 * T = Technical
 * D = Damage
 * L = Load
 */
@ToString
@NoArgsConstructor
@Getter
@Setter
public class RestrictionCodeDto extends RepresentationModel {
    private String code;
    private String forp;
    private String description;

}
