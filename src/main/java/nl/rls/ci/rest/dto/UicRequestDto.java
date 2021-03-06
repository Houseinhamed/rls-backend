package nl.rls.ci.rest.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import nl.rls.composer.rest.dto.hateoas.IdentifiableRepresentationModel;

@ToString
@NoArgsConstructor
@Getter
@Setter
public class UicRequestDto extends IdentifiableRepresentationModel<UicRequestDto> {
    private String signature;
    private String senderAlias;
    private String encoding;
    private String message;
}
