package itExerciciRockets;

import java.util.ArrayList;
import java.util.List;

public class Rocket{
	
	private String code;
	private List<Thruster> thrusters = new ArrayList<Thruster>();	

	public Rocket(String code, List<Thruster> thrusters) {
		super();
		this.code = code;
		this.thrusters = thrusters;
	}

	public Rocket() {
		super();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) throws Exception {
		if (code.length() < 8) {
			throw new Exception();
		}
		this.code = code;
	}

	public List<Thruster> getThrusters() {
		return thrusters;
	}

	public void setThrusters(List<Thruster> thrusters) {
		this.thrusters = thrusters;
	}
	
	public void accelerar(int targetPower) {
		for (Thruster thruster : thrusters) {
			thruster.setTargetPower(targetPower);
			Thread t = new Thread (thruster);
			t.start();
		}
	}
	
	public void frenar(int targetPower) {
		for (Thruster thruster : thrusters) {
			thruster.setTargetPower(targetPower);
			Thread t = new Thread (thruster);
			t.start();
		}
	}
	
	
}
