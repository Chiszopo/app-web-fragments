package cibertec.edu.pe.appwebfragments.Controller.almacen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/almacen/reporte")
public class ReporteController {
    @GetMapping("/listar")
    public String reporte(){
        return "almacen/reporte";

    }
}
