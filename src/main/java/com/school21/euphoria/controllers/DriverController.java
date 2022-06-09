package com.school21.euphoria.controllers;

import com.school21.euphoria.entity.DriverEntity;
import com.school21.euphoria.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/drivers")
public class DriverController {

    private final DriverRepository driverRepository;

    @Autowired
    public DriverController(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    @GetMapping
    public String getAllDrivers(Model model){
        //Sql запрос на получение всех водителей
        List<DriverEntity> allDrivers = driverRepository.findAll();
        model.addAttribute("allDrivers", allDrivers);

        //Путь до странички на фронте
        String pathView = "";
        return pathView;
    }

    @PostMapping
    public String createDriver(Model model, DriverEntity driver){
        driverRepository.save(driver);

        //Путь до странички на фронте
        String pathView = "";
        return pathView;
    }
}
