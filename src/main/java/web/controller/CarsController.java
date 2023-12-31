package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarsController {

    private final String MAX_COUNT_CAR = "5";

    private final CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String getCars(Model model, @RequestParam(value = "count", defaultValue = MAX_COUNT_CAR) String quantity) {

        model.addAttribute("listCars", carService.getCars(Integer.parseInt(quantity)));

        return "cars";
    }
}
