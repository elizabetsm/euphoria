package com.school21.euphoria.controllers;

import com.school21.euphoria.entity.Car;
import com.school21.euphoria.entity.Driver;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cars")
public class CarController {

    @GetMapping
    public String getAllCars(Model model){
        //Sql запрос на получение всех машин
        String sqlRequest = "";
        model.addAttribute("allCars", sqlRequest);

        //Путь до странички на фронте
        String pathView = "";
        return pathView;
    }

    @PostMapping
    public String createCar(Model model, Car car){
        //Путь до странички на фронте
        String pathView = "";
        return pathView;
    }
}
