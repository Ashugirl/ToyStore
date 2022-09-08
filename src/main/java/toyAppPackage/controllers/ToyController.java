package toyAppPackage.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import toyAppPackage.data.Toy;
import toyAppPackage.services.interfaces.ToyService;

@Controller
public class ToyController {

    @Autowired
    private ToyService toyService;


    @GetMapping("/hello")
    public String hello(){
        return "test";
    }


    @GetMapping("/hello2")
    public String hello2(Model model){

        String greeting = "Hi";
        model.addAttribute("message", greeting);
        return "test";
    }

    @GetMapping("/toy")
    public String oneToy(Model model, @PathVariable int id){
    Toy toy = new Toy();
        model.addAttribute("toy", toy);
        return "toy";
    }
    //TODO: using this method and a new html template, figure out how to add a toy from the front end
    @PostMapping
    public String addToy(Toy toy){
        toyService.createToy(toy);
        return "page";
    }
}
