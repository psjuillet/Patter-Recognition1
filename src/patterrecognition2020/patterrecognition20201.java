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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Patron a = new Patron(new double[]{11.5,5.7,4.8},"");
        Patron b = new Patron(new double[]{1,1,1},"");
        Patron c = new Patron(new double[]{12,113,14},"");
        PatronRepresentativo aux = new PatronRepresentativo(a);
        
        /**ArrayList<Patron>aux=new ArrayList<>();
        aux.add(c);
        aux.add(a);
        aux.add(b);
        MinimaDistancia aux=new MinimaDistancia();
        System.out.println(Herramientas.calcularDistanciaEucladiana(a, b));*/
    }
    
}