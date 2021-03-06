package nl.rls.ci.repository;

import nl.rls.ci.domain.CiMessage;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CiRepository extends CrudRepository<CiMessage, Integer> {
    Optional<CiMessage> findByIdAndOwnerId(int id, int ownerId);

    List<CiMessage> findByOwnerId(int ownerId);
}
