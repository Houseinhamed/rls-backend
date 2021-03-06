package nl.rls.composer.rest.dto.mapper;

import nl.rls.composer.controller.TractionModeController;
import nl.rls.composer.domain.code.TractionMode;
import nl.rls.composer.rest.dto.TractionModeDto;
import org.dozer.DozerBeanMapper;
import org.dozer.loader.api.BeanMappingBuilder;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

public class TractionModeDtoMapper {
    public static TractionModeDto map(TractionMode tractionMode) {
        DozerBeanMapper mapper = new DozerBeanMapper();
        BeanMappingBuilder mappingBuilder = new BeanMappingBuilder() {
            protected void configure() {
            }
        };
        mapper.addMapping(mappingBuilder);
        TractionModeDto tractionModeDto = mapper.map(tractionMode, TractionModeDto.class);
        tractionModeDto.add(linkTo(methodOn(TractionModeController.class).getTractionMode(tractionMode.getId())).withSelfRel());
        return tractionModeDto;
    }
}
