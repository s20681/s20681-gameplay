package pl.pjatk.gameplay.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.pjatk.gameplay.model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
