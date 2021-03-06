package nl.rls.composer.rest.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import nl.rls.composer.rest.dto.hateoas.IdentifiableRepresentationModel;

@ToString
@NoArgsConstructor
@Getter
@Setter
public class LocationDto extends IdentifiableRepresentationModel<LocationDto> {
    private int locationPrimaryCode;
    private String countryCodeIso;
    private String primaryLocationName;
    private String code;
    private String latitude;
    private String longitude;
}
