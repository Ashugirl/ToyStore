package toyAppPackage.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import toyAppPackage.data.CreateAddFormData;
import toyAppPackage.data.Toy;
import toyAppPackage.services.interfaces.ToyService;
//use VV this instead of @RestController if you work with html instead of JSON
@Controller
public class ToyController {


    private ToyService toyService;

    @Autowired
    public ToyController(ToyService toyService) {
        this.toyService = toyService;
    }

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

    @GetMapping("/toy/{id}")
    public String oneToy(Model model, @PathVariable int id){
    Toy toy = toyService.getOneById(id);
        model.addAttribute("toy", toy);
        return "toy";
    }

    @GetMapping("/toys")
    public String allToys(Model model){
        model.addAttribute("toys", toyService.getAllToys());
        return "toys";
    }
    @GetMapping("/addToy")
    public String showForm(Model model){
        Toy toy = new Toy();
        model.addAttribute("toy", toy);
       // model.addAttribute("addToys", new CreateAddFormData());

        System.out.println("This should return a form");
        return "addToy";
    }

    @PostMapping("/addToy")
    public String addToy(Toy toy){
        toyService.createToy(toy);
        //return "toy_added";
        return "redirect:/toys";
    }
    //TODO: using this method and a new html template, figure out how to add a toy from the front end
//    @PostMapping("toys/addToy")
//    public String addToy(@ModelAttribute("formData") CreateAddFormData formData, Model model, BindingResult bindingResult){
//        if(bindingResult.hasErrors()){
//            return "toys/addToy";
//        }
//        toyService.createToy(formData.toParameters());
//        return "redirect:/toys";
//    }
}
