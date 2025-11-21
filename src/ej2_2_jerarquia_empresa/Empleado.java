package ej2_2_jerarquia_empresa;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
	
	private String nombre;
	private double salario;
	private List<Empleado> subordinados; // Lista de empleados a su cargo
	
	public Empleado (String nombre, double salario) { 
		this.nombre=nombre;
		this.salario=salario;
		this.subordinados= new ArrayList<Empleado>();
	}
	public double getSalario () { 
		return this.salario; 
	}
	public List<Empleado> getSubordinados () { 
		return this.subordinados; 
	}
	
	public static double presupuestoEquipo (Empleado jefe) {
		//calculamos el salario del empleado actual
		double salario=jefe.getSalario();
		//ahora recursivamente calculas el de los subordinados
		for(Empleado a: jefe.getSubordinados()) {
			salario += presupuestoEquipo(a);
		}
		
		return salario;
	}
	
	public static void main(String[] args) {

	    // Crear empleados sueltos
	    Empleado jefe   = new Empleado("Jefe", 5000);
	    Empleado sub1   = new Empleado("Alicia", 3000);
	    Empleado sub2   = new Empleado("Pedro", 2800);
	    Empleado sub11  = new Empleado("Luis", 1500);
	    Empleado sub12  = new Empleado("Eva", 1600);
	    Empleado sub21  = new Empleado("Sara", 1400);

	    jefe.getSubordinados().add(sub1);
	    jefe.getSubordinados().add(sub2);

	    sub1.getSubordinados().add(sub11);
	    sub1.getSubordinados().add(sub12);

	    sub2.getSubordinados().add(sub21);

	    // Calcular presupuesto total
	    double total = presupuestoEquipo(jefe);

	    System.out.println("Presupuesto total del equipo: " + total + " €");
	}

}
