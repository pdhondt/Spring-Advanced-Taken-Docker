package be.vdab.renners.services;

import be.vdab.renners.domain.Renner;
import be.vdab.renners.repositories.RennerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class RennerService {
    private final RennerRepository rennerRepository;

    public RennerService(RennerRepository rennerRepository) {
        this.rennerRepository = rennerRepository;
    }
    public Optional<Renner> findById(long id) {
        return rennerRepository.findById(id);
    }
}
