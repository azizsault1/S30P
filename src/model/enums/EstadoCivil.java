/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.enums;



/**
 *
 * @author koonjshah
 */
public enum EstadoCivil {
    Solteiro, Casado, Viuvo, Dequitado, UniaoEstavel;

    @Override
    public String toString() {
        switch(this){
            case Viuvo:
                return "Viúvo";
            case UniaoEstavel:
                return "União Estável";
            default:
                return this.name();
        }
    
    }
    
    public static EstadoCivil fromString(String value){
        switch(value){
        
            case "Viúvo":
                return Viuvo;
            case "União Estável":
                return UniaoEstavel;
            default: return EstadoCivil.valueOf(value);
        }
    }
    
}
