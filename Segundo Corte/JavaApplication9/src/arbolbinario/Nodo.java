/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author lizet
 */
public class Nodo {
    
    private Nodo temp;
    
    private int cod;
    private String nombre;
    private boolean v1,v2;
    private Date fecha1 = null, fecha2 = null;
    
    private Nodo izq;
    private Nodo der;

    public Nodo(int cod, String nombre) {
        this.cod = cod;
        this.nombre = nombre;
    }
 
    public Nodo getIzq() {
        return izq;
    }
 
    public void setIzq(Nodo left) {
        this.izq = left;
    }
 
    public Nodo getDer() {
        return der;
    }
 
    public void setDer(Nodo der) {
        this.der = der;
    }
 
    public void agregar(int cod, String nombre) {
        if (cod < this.cod) {
            if (izq != null) {
                izq.agregar(cod, nombre);
            } else {
                izq = new Nodo(cod, nombre);
            }
        } else {
            if (der != null) {
                der.agregar(cod,nombre);
            } else {
                der = new Nodo(cod,nombre);
            }
        }
    }
    
     public int nodosCompletos(Nodo n) {
        if (n == null)
            return 0;
        else {
            if (n.getIzq() != null && n.getDer() != null)
                return nodosCompletos(n.getIzq()) + nodosCompletos(n.getDer()) + 1;
            return nodosCompletos(n.getIzq()) + nodosCompletos(n.getDer());
        }
    }
    public boolean vacuna1(int cod, Date fecha){
        if(cod < this.cod){
            return izq.vacuna1(cod, fecha);
        }else if (cod > this.cod){
            return der.vacuna1(cod, fecha);
        }else if(cod == this.cod && this.v1 == false){
            v1 = true;
            fecha1 = fecha;
            return true;
        }
        return false;
    }
    
    public boolean vacuna2(int cod, Date fecha){
        Calendar cal1 = new GregorianCalendar();
        Calendar cal2 = new GregorianCalendar();
        
        cal1.setTime(fecha1);
        cal2.setTime(fecha);
        
        if(cod < this.cod){
            return izq.vacuna2(cod, fecha);
        }else if (cod > this.cod){
            return der.vacuna2(cod, fecha);
        }else if(cod == this.cod && this.v2 == false && daysBetween(cal1.getTime(),cal2.getTime()) >= 30){
            v2 = true;
            fecha2 = fecha;
            return true;
        }
        return false;
    }
 
    public String inorden() {
        String in = "";
        if (izq != null) {
            in = in + ", "+izq.inorden();
        }
        if(izq != null && der != null){
            in = in + ","+String.valueOf(cod);
        }
        if (der != null) {
            in = in + ", "+der.inorden();
        }
        return in;
    }
 
    public String preorden() {
        String pre = "";
        if(izq != null && der != null){
            pre =  pre + String.valueOf(cod);
        }
        if (izq != null) {
            pre = pre +", "+ izq.preorden();
        }
        if (der != null) {
            pre = pre +", "+ der.preorden();
        }
        return pre;
    }
 
    public String posorden() {
        String pos = "";
        
        if (izq != null) {
            pos = pos + izq.posorden() + ", ";
        }
        if (der != null) {
            pos = pos +der.posorden() + ", ";
        }
        if(izq != null && der != null){
            pos +=  String.valueOf(cod);
        }

        return pos;
    }
 
    public Nodo anterior() {
        if (this.getDer() == null) {
            return this;
        } else {
            return this.getDer().anterior();
        }
    }
 
    public Nodo siguiente() {
        if (this.getIzq() == null) {
            return this;
        } else {
            return this.getIzq().siguiente();
        }
    }
 
    public Nodo borrar(int cod) {
        Nodo response = this;
        if (cod < this.cod) {  
            this.izq = this.izq.borrar(cod);
        } else if (cod > this.cod) {
            this.der = this.der.borrar(cod);
        } else {
            if (this.izq != null && this.der != null) {
                Nodo temp = this;
                Nodo mayIzq = this.izq.anterior();
                this.cod= mayIzq.getCod();
                temp.izq = temp.izq.borrar(mayIzq.getCod());
            } else if (this.izq != null) {
                response = this.izq;
            } else if (this.der != null) {
                response = this.der;
            } else {
                response = null;
            }
        }
        return response;
    }
    
    public String infoPaciente(int cod) {
        String tex = "";
            if(buscarIz(cod, null) || buscarDe(cod, null)) {
                tex = tex + "Codigo: " +temp.getCod() + "\n Nombre: " + temp.getNombre();
			System.out.println(temp.getCod() + " " + temp.getNombre());
			if(temp.getV1()) {
				
                                tex = tex + " \n Primera dosis: " + temp.getFecha1();
				if(temp.getV2()){
					
                                        tex = tex + " \n Segunda dosis: " + temp.getFecha2();
                                }else{
                                    tex = tex + "\n El paciente no tiene segunda dosis";
                                }
			}else{
                            tex = tex + "\n El paciente no ha sido vacunado";
                }
            }
        return tex;
    }
    
    public boolean buscarIz(int cod, Nodo aux) {
		
		if(aux == null)
			aux = this;
			
		if(aux.getCod() == cod) {
			temp = aux;
			return true;
		}else {
			if(aux.getIzq() != null) {
				return buscarIz(cod, aux.getIzq());
			}
			if(aux.getDer() != null) {
				return buscarDe(cod, aux.getDer());
			}
		}
		return false;
	}
    
    public boolean buscarDe(int cod, Nodo aux) {
		boolean encontrado = false;
		if(aux == null)
			aux = this;
			
		if(aux.getCod() == cod) {
			temp = aux;
			//System.out.println("Padre encontrado");
			return true;
		}else {
			if(aux.getDer() != null) {
				return buscarDe(cod, aux.getDer());
			}
		}
		return false;
}

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getV1() {
        return v1;
    }

    public void setV1(boolean v1) {
        this.v1 = v1;
    }

    public boolean getV2() {
        return v2;
    }

    public void setV2(boolean v2) {
        this.v2 = v2;
    }
    
    public Date getFecha1(){
        return fecha1;
    }
    
    public Date getFecha2(){
        return fecha2;
    }
    
     public int daysBetween(Date d1, Date d2){
             return (int)( (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
     }
}
