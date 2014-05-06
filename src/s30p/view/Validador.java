/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package s30p.view;

import org.jdesktop.beansbinding.Validator;

/**
 *
 * @author koonjshah
 */
public class ProprietarioValidator extends Validator{

    @Override
    public Result validate(String value) {        
        if((value == null) || value.isEmpty()){
            return new Result(null, "Nome não pode ser vazio");
        }
    }
    
}
