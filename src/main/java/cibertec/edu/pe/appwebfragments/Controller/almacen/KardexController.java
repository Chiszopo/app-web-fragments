package cibertec.edu.pe.appwebfragments.Controller.almacen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/almacen/kardex")
public class KardexController {
    @GetMapping("/listar")
    public String kardex(){
        return "almacen/kardex";

    }
}
