package be.vdab.renners.controllers;

import be.vdab.renners.domain.Renner;
import be.vdab.renners.exceptions.RennerNietGevondenException;
import be.vdab.renners.services.RennerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("renners")
public class RennerController {
    private final RennerService rennerService;

    public RennerController(RennerService rennerService) {
        this.rennerService = rennerService;
    }
    @GetMapping("{id}")
    Renner findById(@PathVariable long id) {
        return rennerService.findById(id)
                .orElseThrow(RennerNietGevondenException::new);
    }
}
