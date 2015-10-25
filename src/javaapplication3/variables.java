/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.awt.Toolkit;

public class variables {
    
    public double number1;
    public double number2;
    public double finalValue;
    public String operation;
    private String finalString;

    
    public variables()
    {
        number1=0;
        number2=0;
        finalValue=0;
    }

    public  String getFinalNumber()
    {
        if (operation=="+")
        {
            finalValue=number1+number2;
            finalString=String.valueOf(finalValue);
            return(finalString);
        }
        else if(operation=="√") 
        {
            finalValue=Math.sqrt(number1);
            finalString=String.valueOf(finalValue);
            return(finalString);
        }
        else if (operation=="*")
        {
            finalValue=number1*number2;
            finalString=String.valueOf(finalValue);
            return(finalString);
        }
        else
            return("error");
    }
    
}
