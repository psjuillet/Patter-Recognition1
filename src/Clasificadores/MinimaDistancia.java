/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clasificadores;

import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class MinimaDistancia implements ClasificadorSupervisado {
    

    @Override
    public void entrenar(ArrayList<Patron> instancias) {
        ArrayList<PatronRepresentativo> representativos = new ArrayList<PatronRepresentativo>();
        // agregamos el primer representativo 
        representativos.add(new PatronRepresentativo(instancias.get(0)));
        // recorrer todas las instancias 
        for (int x=1; x<instancias.size();x++){
            Patron aux = instancias.get(x);
            // es verificar la existencia o no el representativo
            int pos = representativos.indexOf(aux);
            if(pos!=-1){
                
                 // ACUMULAR AL REPRESENTATIVO QUE LE CORRESPONDA
                
                representativos.get(pos).acumular(aux);
              
                
            }else {
           // crear un nuevo patron representativo
                // agregamos el primer representativo 
                representativos.add(new PatronRepresentativo(aux));
            }
        }
        for(PatronRepresentativo aux: representativos){
            aux.actualizar();
        }
        
    }

    public void clasificar(Patron patron) {
       double iMenor=0;
       double dMenor=Herramientas.calcularDistanciaEucladiana(patron, this.representativos.get(0));
       for(int i = 1;i<this.representativos.size();i=1){
           double dN=Herramientas.calcularDistanciaEucladiana(patron, patron)
       }
    }
    public void clasificar(ArrayList<Patron> patrones){
        
    }

    @Override
    public void clasificar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}  

