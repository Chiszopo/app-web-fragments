package cibertec.edu.pe.appwebfragments.Controller.almacen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/almacen/compras")
public class ComprasController {
    @GetMapping("/listar")
    public String index(){
        return "almacen/compras";

    }
}
