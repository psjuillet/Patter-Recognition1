/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterrecognition2020;

import Clasificadores.Herramientas;
import Clasificadores.MinimaDistancia;
import Clasificadores.Patron;
import Clasificadores.PatronRepresentativo;
import java.util.ArrayList;

/**
 *
 * @author UPIIZ
 */
public class patterrecognition20201{

    public static void main(String[] args) {
       Patron pa=new Patron(new double[]{7,3.2,4.7,1.4},"");
        Herramientas.leerDatos();
        
        MinimaDistancia md = new MinimaDistancia();
        md.entrenar(Herramientas.instancias);
        md.clasificar(Herramientas.instancias);
        
        System.out.println();
    }
    
}