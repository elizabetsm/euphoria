package com.school21.euphoria.controllers;

import com.school21.euphoria.entity.CarEntity;
import com.school21.euphoria.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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

        //Путь до странички на фронте
        String pathView = "";
        return pathView;
    }

    @PostMapping
    public String createCar(Model model, CarEntity car){
        carRepository.save(car);

        //Путь до странички на фронте
        String pathView = "";
        return pathView;
    }
}
