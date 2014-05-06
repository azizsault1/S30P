/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package s30p.view;

import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author koonjshah
 */
public class CPFConversor extends Converter<String,Integer>{

    @Override
    public Integer convertForward(String value) {
        System.out.println("convertForward: "+ value);
        return 82193983534;
    }

    @Override
    public String convertReverse(Integer value) {
        System.out.println("convertReverse: "+ value);
        return "821.939.835-34";
    }

    
}
