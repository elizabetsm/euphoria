package com.school21.euphoria.controllers;

import com.school21.euphoria.entity.Driver;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/drivers")
public class DriverController {

    @GetMapping
    public String getAllDrivers(Model model){
        //Sql запрос на получение всех водителей
        String sqlRequest = "";
        model.addAttribute("allDrivers", sqlRequest);

        //Путь до странички на фронте
        String pathView = "";
        return pathView;
    }

    @PostMapping
    public String createDriver(Model model, Driver driver){
        //Путь до странички на фронте
        String pathView = "";
        return pathView;
    }
}
