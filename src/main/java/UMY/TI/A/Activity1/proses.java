/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UMY.TI.A.Activity1;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author LENOVO
 */
public class proses {
    
    public String dataName(HttpServletRequest data){
        String inputname = data.getParameter("var_name");
        return inputname;
    }
    public String dataPrice(HttpServletRequest data){
        String inputprice = data.getParameter("var_price");
        return inputprice;
    }
    public String dataQuantity(HttpServletRequest data){
        String inputquantity = data.getParameter("var_quantity");
        return inputquantity;
    }
    public String dataDiscount(Double PriceTotal, Double getTotal){
        String diskone = "";
        if (PriceTotal < 16000)
        {
            return diskone = "0%";
        }
        else if (PriceTotal >= 16000 && PriceTotal < 25000)
        {
            return diskone = "10%";
        }
        else if (PriceTotal >= 25000)
        {
            return diskone = "15%";
        }
        return diskone;
    }
    public Double dataiPrice(String inputprice){
        Double iPrice = Double.valueOf(inputprice);
        return iPrice;
    }
    public Double dataiTotal(String inputquantity){
        Double iTotal = Double.valueOf(inputquantity);
        return iTotal;
    }
    public Double dataPriceTotal(Double iPrice, Double iTotal){
        Double PriceTotal = iPrice * iTotal;
        return PriceTotal;
    }
    public Double dataTotalPrice(Double PriceTotal){
        Double getTotal = null;
        if (PriceTotal < 16000)
        {
            getTotal = PriceTotal - (0 * PriceTotal/100);
            return getTotal;
        }
        else if (PriceTotal >= 16000 && PriceTotal < 25000)
        {
            getTotal = PriceTotal - (10 * PriceTotal/100);
            return getTotal;
        }
        else if (PriceTotal >= 25000)
        {
            getTotal = PriceTotal - (15 * PriceTotal/100);
            return getTotal;
        }
        return getTotal;
    }
}
