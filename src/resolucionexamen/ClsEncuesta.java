
package resolucionexamen;

import java.util.ArrayList;


public class ClsEncuesta {
    
   static ArrayList<String> nombre  = new ArrayList<>();
   static ArrayList<Boolean> carro  = new ArrayList<>();
   static ArrayList<Integer> edad  = new ArrayList<>();
   static ArrayList<String> correo  = new ArrayList<>();
   static int ConVehiculo, SinVehiculo;
   static int consecutivo;
   
    public ClsEncuesta() {
          consecutivo = 10;
          ConVehiculo = 0;
          SinVehiculo = 0;
    }

    // Get para ver el siguiente numero de la encuesta
    public  int getConsecutivo() {
        return consecutivo;
    }
   
    // Set para asignar un nuevo numero de encuesta
    public   void setConsecutivo() {
        ClsEncuesta.consecutivo ++;
    }
    
     public   void setConVehiculo() {
        ClsEncuesta.ConVehiculo ++;
    }
    
      public   void setSinVehiculo() {
        ClsEncuesta.SinVehiculo ++;
    }
      
       public  int getConVehiculo() {
        return ConVehiculo;
    }

public  int getSinVehiculo() {
        return SinVehiculo;
    }
    
    public void SetSalvarDatos(String Nombre, Boolean Carro, int Edad, String Correo )
    {
        nombre.add(Nombre);
        carro.add(Carro);
        edad.add(Edad);
        correo.add(Correo);
    }
    
    
    
}
