/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

/**
 *
 * @author lizet
 */
public class Controlador {
    private Lienzo objLienzo; //VISTA
    private Nodo objArbol; //MODELO

    public Controlador(Lienzo objLienzo, Nodo objArbol) {
        this.objLienzo = objLienzo;
        this.objArbol = objArbol;
    }
    
    public void iniciar() {
        objLienzo.setObjArbol(objArbol);
    }
}