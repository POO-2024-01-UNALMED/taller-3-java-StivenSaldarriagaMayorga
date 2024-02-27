package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal;
    private int precio;
    private boolean estado;
    private int volumen;
    private Control control;
    private static int numTV = 0;

    public TV(Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
        this.canal = 1;
        this.volumen = 1;
        this.precio = 500;

        TV.numTV++;
    }
///Metodos get
    public Marca getMarca(){
        return this.marca;
    }
    public int getCanal(){
        return this.canal;
    }
    public int getPrecio(){
        return this.precio;
    }
    public int getVolumen(){
        return this.volumen;
    }
    public Control getControl(){
        return this.control;
    }
    public boolean getEstado(){
        return this.estado;
    }
    public static int getNumTV(){
        return TV.numTV;
    }



///Metodos set
    public void setMarca(Marca marca){
        this.marca = marca;
    }
    public void setCanal(int canal){
        if (this.estado){
            if(canal >= 1 && canal <= 120){
                this.canal = canal;
            }
        }
    }   
    public void setPrecio(int precio){
        this.precio = precio;
    }   
    public void setVolumen(int volumen){
        this.volumen = volumen;
    } 
    public void setControl(Control control){
        this.control = control;
    }
    public static void setNumTV(int numTV){
        TV.numTV = numTV;
    }
//Metodos controladores
    public void turnOff(){
        this.estado = false;
    }
    public void turnOn(){
        this.estado = true;
    }

    public void canalUp(){
        if (this.estado){
            if(this.canal < 120){
                this.canal ++;
            }
        }
    }
    public void canalDown(){
        if (this.estado){
            if(this.canal > 1){
                this.canal --;
            }
        }
    }
    public void volumenDown(){
        if(this.estado){
            if (this.volumen > 0){
                this.volumen --;
            }
        }
    }

    public void volumenUp(){
        if(this.estado){
            if (this.volumen < 7){
                this.volumen ++;
            }
        }
    }


}
