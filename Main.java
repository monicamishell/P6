import java.util.*;

public class Main
{
	public static void main(String args[])
	{
		Empleado empleados[]= new Empleado[4];
		Gestion ges = new Gestion();

		empleados[0]=new EAsalariado("569587","Javier","Gomez",2008,1225.00);
		empleados[1]=new EComision("695235","Eva","Nieto",2010,179,8.10);
		empleados[2]=new EComision();
		empleados[3]=new EAsalariado();

		empleados[2].setNombre("Jose");
		empleados[2].setApellido("Ruiz");
		empleados[2].setNoTrabajador("741258");
		empleados[2].setYearIngreso(2012);
		empleados[2].setNoClientes(81);
		empleados[2].setMontoxCliente(7.90);

		empleados[3].setNombre("Maria");
		empleados[3].setApellido("Nunez");
		empleados[3].setNoTrabajador("896325");
		empleados[3].setYearIngreso(2013);
		empleados[3].obtenerSueldo(1155.00);

		ges.mostrarTodos(empleados);
		ges.sueldoMayor(empleados);

	}
}