package be.vdab.renners.repositories;

import be.vdab.renners.domain.Renner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RennerRepository extends JpaRepository<Renner, Long> {
}
