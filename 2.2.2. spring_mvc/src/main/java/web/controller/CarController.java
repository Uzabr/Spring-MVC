package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "5")
                          Integer count, ModelMap map) {
        map.addAttribute("cars", new CarServiceImpl().carTake(count));
        return "cars";
    }



}
