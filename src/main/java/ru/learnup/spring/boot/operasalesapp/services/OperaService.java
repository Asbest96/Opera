package ru.learnup.spring.boot.operasalesapp.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.learnup.spring.boot.operasalesapp.annotations.Notifiable;
import ru.learnup.spring.boot.operasalesapp.entity.Opera;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class OperaService {


    private List<Opera> operaList = new ArrayList<>();

    public void addOpera (Opera opera) {
        operaList.add(opera);
    }

    public void deleteOpera (Opera opera) {
        operaList.remove(opera);
    }

    public void printAll () {
        System.out.println(operaList);
    }

    public void printOpera (Opera opera) {
        for (Opera concert : operaList ){
            if(concert.getName().equals(opera.getName())){
                System.out.println(concert);
            }
        }
    }
    @Notifiable
    public void buyTicket(String name) {
        System.out.println("Билет на " + name + "куплен");
    }

    public void sellTicket(String name) {
        System.out.println("Билет на " + name + "сдан");
    }
}
