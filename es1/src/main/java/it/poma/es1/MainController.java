package it.poma.es1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping(value = "/{operazione}")
    public String calcola(
            @PathVariable String operazione,
            @RequestParam int num1,
            @RequestParam int num2,
            Model model) {

        double res = 0;

        switch (operazione) {
            case "somma":
            default: // in caso il percorso inserito non esistesse
                operazione = "somma"; // per non visualizzare un testo sbagliato nell'HTML
                res = num1 + num2;
                break;
            case "sottrazione":
                res = num1 - num2;
                break;
            case "moltiplicazione":
                res = num1 * num2;
                break;
            case "divisione":
                res = (double) num1 / num2;
                break;
            case "potenza":
                res = Math.pow(num1, num2);
                break;
        }

        model.addAttribute("operazione", operazione.toUpperCase());
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("risultato", res);

        return "index";
    }
}
