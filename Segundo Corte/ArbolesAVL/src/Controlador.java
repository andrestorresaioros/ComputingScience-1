
public class Controlador {
    private Lienzo objLienzo; //VISTA
    private Arbol objArbol; //MODELO
    
    public Controlador(Lienzo objLienzo, Arbol objArbol) {
        this.objLienzo = objLienzo;
        this.objArbol = objArbol;
    }
    
    public void iniciar() {
        objLienzo.setObjArbol(objArbol);
    }
}