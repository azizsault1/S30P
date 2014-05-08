/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author koonjshah
 */
public enum Selecao {
    Proprietario, Cliente, Parceiro, Fornecedor, PServico, Impostos;

    public static Selecao parser(String toString) {

        switch(toString){
            case "":
                return Selecao.Proprietario;
                    
            
        }
    }
}
