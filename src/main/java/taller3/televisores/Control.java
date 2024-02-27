package taller3.televisores;

public class Control {
    private TV tv;
    
    public void enlazar(TV tv){
        setTv(tv);
        tv.setControl(this);
    } 
//GET
    public TV getTv(){
        return this.tv;
    }
//Set

    public void setTv(TV tv){
        this.tv = tv;
    }
///metodos

    public void turnOff(){
        tv.turnOff();
    }
    public void turnOn(){
        tv.turnOn();
    }
    public void canalDown(){
        tv.canalDown();
    }
    public void canalUp(){
        tv.canalUp();
    }
    public void volumenDown(){
        tv.volumenDown();
    }
    public void volumenUp(){
        tv.volumenUp();
    }
    public void setCanal(int canal){
        tv.setCanal(canal);
    }

}
