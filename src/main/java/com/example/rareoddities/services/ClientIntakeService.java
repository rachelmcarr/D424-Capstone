package com.example.rareoddities.services;

import com.example.rareoddities.dao.ClientIntakeRepository;
import com.example.rareoddities.entities.ClientIntake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientIntakeService {
    @Autowired
    private ClientIntakeRepository intakeRepository;

    public List<ClientIntake> getAll() {
        return intakeRepository.findAll();
    }

    public ClientIntake save(ClientIntake intake) {
        return intakeRepository.save(intake);
    }
}
