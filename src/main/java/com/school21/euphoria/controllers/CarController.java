package com.school21.euphoria.controllers;

import com.school21.euphoria.entity.CarEntity;
import com.school21.euphoria.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarRepository carRepository;

    @Autowired
    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @GetMapping
    public String getAllCars(Model model){
        //Sql запрос на получение всех машин
        List<CarEntity> allCars = carRepository.findAll();
        model.addAttribute("allCars", allCars);
        return "helloWorld";
    }

    @GetMapping("/new")
    public String newCar(@ModelAttribute("carEntity") CarEntity carEntity) {
        return "addCar";
    }

    @PostMapping
    public String createCar(@ModelAttribute("carEntity") CarEntity carEntity){
        carRepository.save(carEntity);
        return "redirect:/cars";
    }
}
