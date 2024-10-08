package EAM.Blogging.repository;

import EAM.Blogging.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryTag extends JpaRepository<Tag, Long> {
}
