package cibertec.edu.pe.appwebfragments.Controller.almacen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/almacen/guiaremi")
public class GuiaRemisionController {

    @GetMapping("/listar")
    public String index(){
        return "almacen/guiaremision";

    }
}
