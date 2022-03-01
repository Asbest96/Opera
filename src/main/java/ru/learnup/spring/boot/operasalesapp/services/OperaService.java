package ru.learnup.spring.boot.operasalesapp.services;

import org.springframework.stereotype.Service;
import ru.learnup.spring.boot.operasalesapp.annotations.Notifiable;
import ru.learnup.spring.boot.operasalesapp.entity.Opera;
import ru.learnup.spring.boot.operasalesapp.repositories.OperaRepository;

@Service
public class OperaService {


    private final OperaRepository operaRepository;

    public OperaService(OperaRepository operaRepository) {
        this.operaRepository = operaRepository;
    }

    public void addOpera(Opera opera) {
        operaRepository.save(opera);
    }

    public void deleteOpera(Opera opera) {
        operaRepository.delete(opera);
    }

    public void printAll() {
        operaRepository.findAll();
    }

    public void printOpera(int id) {
        operaRepository.findById((long) id);
    }

    @Notifiable
    public void buyTicket(String name) {
        System.out.println("Билет на " + name + "куплен");
    }

    public void sellTicket(String name) {
        System.out.println("Билет на " + name + "сдан");
    }
}
