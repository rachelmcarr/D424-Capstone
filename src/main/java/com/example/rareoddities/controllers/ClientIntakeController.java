package com.example.rareoddities.controllers;

import com.example.rareoddities.entities.ClientIntake;
import com.example.rareoddities.services.ClientIntakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/client-intakes")
public class ClientIntakeController {

    @Autowired
    private ClientIntakeService intakeService;

    @GetMapping
    public List<ClientIntake> getAllIntakes() {
        return intakeService.getAll();
    }

    @PostMapping
    public ClientIntake addIntake(@RequestBody ClientIntake intake) {
        return intakeService.save(intake);
    }
}
