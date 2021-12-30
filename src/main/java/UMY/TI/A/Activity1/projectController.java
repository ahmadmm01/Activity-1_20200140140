/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UMY.TI.A.Activity1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;

/**
 *
 * @author LENOVO
 */
@Controller
public class projectController {
    
    @RequestMapping("/input")
    public String getData(HttpServletRequest data, Model discountprocess){
        
        proses prosesdata = new proses();
        
        String name = prosesdata.dataName(data);
        String price = prosesdata.dataPrice(data);
        String quantity = prosesdata.dataQuantity(data);
        
        Double iprice = prosesdata.dataiPrice(price);
        Double itotal = prosesdata.dataiTotal(quantity);
        Double pricetotal = prosesdata.dataPriceTotal(iprice, itotal);
        Double gettotal = prosesdata.dataTotalPrice(pricetotal);
        String diskon = prosesdata.dataDiscount(pricetotal, gettotal);
        
        
        discountprocess.addAttribute("name", name);
        discountprocess.addAttribute("price", price);
        discountprocess.addAttribute("quantity", quantity);
        discountprocess.addAttribute("pricetotal", pricetotal);
        discountprocess.addAttribute("total", gettotal);
        discountprocess.addAttribute("diskone", diskon);
        
        return "AhmadMusthafaMasyhur";
    }    
}
