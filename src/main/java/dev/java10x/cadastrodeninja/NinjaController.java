package dev.java10x.cadastrodeninja;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/ola")
    public String boasVindas() {
        return "Ola primeira pagina";
    }

    @GetMapping("/teste")
    public int teste(@RequestParam int num) {
        return num + num;
    }
}
