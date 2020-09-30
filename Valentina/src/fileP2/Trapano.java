package fileP2;

import java.io.FileInputStream;
import java.io.Serializable;

public class Trapano implements Serializable {
    public static final boolean FORWARD = true;
    public static final boolean REVERSE = true;
    public static final int SPEED_LIMIT = 10000;
    public static final int STEP = 500;

    private int numeroGiri = 0;
    private boolean direction = FORWARD;


    public void incrementaVelocita(){
        numeroGiri+= STEP;
        if(numeroGiri > SPEED_LIMIT){
            numeroGiri = SPEED_LIMIT;
        }
    }

    public void decrementaVelocita()
    {
        numeroGiri -= STEP;
        if(numeroGiri < 0){
            numeroGiri = 0;
        }
    }

    public void stop()    {
        numeroGiri = 0;
    }

    public boolean isActive() {
        return numeroGiri>0;
    }

    public boolean isStopped() {
        return !isActive();
    }

    public void setDirection(boolean direction) {
        this.direction = direction;
    }

//    public String getDirection() {
//        return decodeDirection(direction);
//    }

    @Override
    public String toString() {
        return "Trapano{" +
                "numeroGiri=" + numeroGiri +
                ", direction=" + decodeDirection(direction) +
                '}';
    }

    private String decodeDirection(boolean direction){
        return direction? "FORWARD":"REVERSE";
    }
}
