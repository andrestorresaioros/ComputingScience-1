
import java.util.ArrayList;

public class Raices {
 
    public double Grado1(double a, double b){
        return -b/a;
    }
    
    public String[] Grado2(double a,double b, double c){
        String[] sol = new String[2];
        double raiz1, raiz2, discriminante = Math.pow(b, 2)-(4*a*c);
        if(discriminante<0){
            discriminante*=-1;
            if(((-b)/(2*a))==0){
                raiz1=(Math.sqrt(discriminante)-b)/(2*a);
                raiz2=(-Math.sqrt(discriminante)-b)/(2*a);
                sol[0]=raiz1+"*i";
                sol[1]=raiz2+"*i";
            }else{
                raiz1=(-b)/(2*a);
                sol[0]=raiz1+"+("+(Math.sqrt(discriminante)/(2*a))+")*i";
                sol[1]=raiz1+"+("+(-Math.sqrt(discriminante)/(2*a))+")*i";
            }
        }else{
            sol[0]=String.valueOf((Math.sqrt(discriminante)-b)/(2*a));
            sol[1]=String.valueOf((-Math.sqrt(discriminante)-b)/(2*a));
        }    
        return sol;
    }
    
    public ArrayList<String> GradoMayorA2(double[] coeficiente){
        ArrayList<Double> divisoresNum = new ArrayList<>();
        ArrayList<Double> divisoresDen = new ArrayList<>();
        ArrayList<String> raices = new ArrayList<>();
        
        //LLENAR DIVISORES
        for(int i=1;i<=Math.abs(coeficiente[0]);i++){
            if(coeficiente[0]%i ==0){
                divisoresDen.add((double)i);
            }   
        }
        for(int i=1;i<=Math.abs(coeficiente[coeficiente.length-1]);i++){
            if(coeficiente[coeficiente.length-1]%i == 0){
                divisoresNum.add((double)i);
                divisoresNum.add((double)-i);
            }
        }
        
        int cont =0;
        
        for(int i=0;i<divisoresNum.size();i++){
            for(int j=0;j<divisoresDen.size();j++){
                double result = coeficiente[0];
                double[] aux = new double[coeficiente.length];
                aux[0] = coeficiente[0];
                
                for(int w=1;w<coeficiente.length;w++){
                    result = coeficiente[w]+(result*divisoresNum.get(i)/divisoresDen.get(j));
                    aux[w] = result;
                }
                if(result==0){
                    raices.add(String.valueOf(divisoresNum.get(i)/divisoresDen.get(j)));
                    coeficiente = aux;
                    cont = 0;
                    for(int w=coeficiente.length-1;w>2;w--){
                        if(coeficiente[w]==0){
                            cont++;
                        }else{
                            break;
                        }
                    }
                    if(cont==coeficiente.length-3){
                        i=divisoresNum.size(); 
                    }else{
                        i=-1;
                    }
                    break;
                }
            }
        }
        
        String[] r = new String[2];

        if(cont==coeficiente.length-3){
            r = Grado2(coeficiente[0],coeficiente[1],coeficiente[2]);
            raices.add(r[0]);
            raices.add(r[1]);
        }
        
        return raices;
    }
    
    public double[] ordernarRaices(double[] r){
        double t;
        for(int i=0;i<(r.length-1);i++){
            for(int j=i+1;j<r.length;j++){
                if(r[i]<r[j]){
                    t=r[i];
                    r[i]=r[j];
                    r[j]=t;
                }
            }
        }
        return r;
    }
    
}