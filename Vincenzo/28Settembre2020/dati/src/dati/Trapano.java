package dati;

import java.io.Serializable;

public class Trapano implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8643011587423706169L;
	public static boolean FORWARD = true;
	public static boolean REVERSE = false;
	public static int SPEED_LIMIT = 10000;
	public static int STEP = 500;
	
	private int numeroGiri = 0;
	private boolean direction = Trapano.FORWARD;
	
	public void incrementaVelocita() {
		numeroGiri += STEP;
		if(numeroGiri > SPEED_LIMIT) {
			numeroGiri = SPEED_LIMIT;
		}
	}

	public void decrementaVelocita() {
		numeroGiri -= STEP;
		if(numeroGiri<0)
			numeroGiri = 0;
	}
	
	public boolean isActive() {
		return numeroGiri>0;
	}
	
	public boolean isStopped() {
		return !isActive();
	}
	
	public void stop() {
		numeroGiri = 0;
	}
	
	public String toString() {
		return "Trapano [numeroGiri="+numeroGiri+", direction="+decodeDirection()+"]";
	}

	public void setDirection(boolean direction) {
		this.direction = direction;
		
	}
	
    private String decodeDirection() {
    	//(condizione) ? risultato per vero : risultato per falso
        return this.direction ? "FORWARD(true)" : "REVERSE(false)";
    }

}
