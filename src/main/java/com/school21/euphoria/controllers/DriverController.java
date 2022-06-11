package com.school21.euphoria.controllers;

import com.school21.euphoria.entity.DriverEntity;
import com.school21.euphoria.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/driver")
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

    @GetMapping({"/{id}"})
    public String getOneDriver(@PathVariable Long id, Model model){
        DriverEntity driver = driverRepository.getById(id);
        model.addAttribute("driver", driver);
        return "";
    }

    @DeleteMapping("/{id}")
    public String deleteDriver(@PathVariable Long id, Model  model){
        driverRepository.deleteById(id);
        return "";
    }

    @GetMapping("/new")
    public String createNewDriver(@ModelAttribute("Driver") DriverEntity driver){
        return "";
    }

    @PostMapping
    public String createDriver(Model model, DriverEntity driver){
        driverRepository.save(driver);

        //Путь до странички на фронте
        String pathView = "redirect:";
        return pathView;
    }
}
