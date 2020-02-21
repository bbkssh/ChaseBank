package Banking.ChaseBank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/Chasebank")
@RestController
public class Controller {

    @Autowired
    private Service service;

    @PostMapping("/deposit1") //first deposit
    public int adda1(@RequestBody DTO depositItems){
        service.a1.add(depositItems.getAmount());
        return service.a1.stream().mapToInt(a -> a).sum();
    }

    @PostMapping("/deposit2") //second deposit
    public int adda2(@RequestBody DTO depositItems){
        service.a2.add(depositItems.getAmount());
        return service.a2.stream().mapToInt(a -> a).sum();
    }

    @GetMapping("/deposit/{depositNumber1}/{depositNumber2}")
    public int deposit(@PathVariable("depositNumber1") int depositNumber1,
                       @PathVariable("depositNumber2") int depositNumber2){
        return service.aList.get(depositNumber1 - 1).get(depositNumber2 - 1);
    }

    @GetMapping("/history")
    public List history(){
        service.aList.add(0,service.a1);
        service.aList.add(1,service.a2);
        return service.aList;
    }

    @GetMapping("/history1")
    public List history1(){
        return service.a1;
    }

    @GetMapping("/history2")
    public List history2(){
        return service.a2;
    }
}
