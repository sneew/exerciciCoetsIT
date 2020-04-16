package itExerciciRockets;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r1A, r2A, r1F, r2F;
		String intro;
		//Fase1
		/*Rocket r1 = new Rocket("x", 3);
		Rocket r2 = new Rocket("LDSFJA32", 6);
		
		System.out.println("1r coet: codi " + r1.getCode() + ", nº propulsors: " + r1.getThrusters() + ", 2n coet: codi " + r2.getCode()  + ", nº propulsors: " + r2.getThrusters());*/
		
		//Fase2
		String nr1, nr2;
		List <Thruster> ts1 = new ArrayList<Thruster>();
		Thruster t1 = new Thruster (10);
		Thruster t2 = new Thruster (30);
		Thruster t3 = new Thruster (80);
		ts1.add(t1);
		ts1.add(t2);
		ts1.add(t3);
		
		Rocket r1 = new Rocket ();
		try {
			r1.setCode("32WESSDS");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		r1.setThrusters(ts1);
		
		nr1 = r1.getCode();
		
		List <Thruster> ts2 = new ArrayList<Thruster>();
		Thruster t4 = new Thruster (30);
		Thruster t5 = new Thruster (40);
		Thruster t6 = new Thruster (50);
		Thruster t7 = new Thruster (50);
		Thruster t8 = new Thruster (30);
		Thruster t9 = new Thruster (10);
		ts2.add(t4);
		ts2.add(t5);
		ts2.add(t6);
		ts2.add(t7);
		ts2.add(t8);
		ts2.add(t9);
		
		Rocket r2 = new Rocket ("LDSFJA32", ts2);
		
		nr2 = r2.getCode();
		
		System.out.println(nr1 + ": " + r1.getThrusters().get(0).getMaxPower() + ", " + r1.getThrusters().get(1).getMaxPower() + ", " + r1.getThrusters().get(2).getMaxPower());
		
		System.out.println(nr2 + ": " + r2.getThrusters().get(0).getMaxPower() + ", " + r2.getThrusters().get(1).getMaxPower() + ", " + r2.getThrusters().get(2).getMaxPower()+ ", " + r2.getThrusters().get(3).getMaxPower() + ", " + r2.getThrusters().get(4).getMaxPower() + ", " + r2.getThrusters().get(5).getMaxPower());

		
		//Fase3
		System.out.println("A quina potencia vols fer arribar els propulsors del coet 1?");
		r1A = sc.nextInt();
		System.out.println("A quina potencia vols fer arribar els propulsors del coet 2?");
		r2A = sc.nextInt();
		r1.accelerar(r1A);
		r2.accelerar(r2A);
		
		intro = sc.next();
		
		if (!intro.equals(null)) {
			System.out.println("A quina potencia vols fer arribar els propulsors del coet 1?");
			r1F = sc.nextInt();
			System.out.println("A quina potencia vols fer arribar els propulsors del coet 2?");
			r2F = sc.nextInt();
			r1.frenar(r1F);
			r2.frenar(r2F);
		}	
		sc.close();
	}

}
