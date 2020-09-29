package files;

import java.io.Serializable;

public class Trapano implements Serializable{
	
	
	public static final boolean FORWARD = true;
	public static final boolean REVERSE = false;
	private static final int SPEED_LIMIT = 10000;
	private static final int STEP = 500;

	
	private int numeroGiri = 0;
	private boolean direction = Trapano.FORWARD;
	
	public void incrementaVelocità() {
		numeroGiri += STEP;
		if(numeroGiri > SPEED_LIMIT) {
			numeroGiri = SPEED_LIMIT;
		}
	}
	
	public void decrementaVelocita() {
		numeroGiri -= STEP;
		//if(n);
	}
	
	public boolean isActive() {
		return numeroGiri >0 ;
	}
	
    public boolean isStopped() {
    	return !isActive();
    }

	@Override
	public String toString() {
		return "Trapano [numeroGiri=" + numeroGiri + ", direction=" + direction + "]";
	}
	
	
	
	
	
}
