public abstract class Empleado
{
		String noTrabajador;
		String nombre;
		String apellido;
		int yearIngreso;

		public Empleado()
		{
		}

		public Empleado(String noTrabajador, String nombre, String apellido, int yearIngreso)
		{
			setNoTrabajador(noTrabajador);
			setNombre(nombre);
			setApellido(apellido);
			setYearIngreso(yearIngreso);
		}
		/////////////////////////////////////////////
		public void setNoTrabajador(String noTrabajador)
		{
		this.noTrabajador = noTrabajador;
		}

		public void setNombre(String nombre)
		{
		this.nombre = nombre;
		}

		public void setApellido(String apellido)
		{
		this.apellido = apellido;
		}

		public void setYearIngreso(int yearIngreso)
		{
		this.yearIngreso = yearIngreso;
		}
		////////////////////////////////////////////////////
		public String getNoTrabajador()
		{
			return this.noTrabajador;
		}

		public String getNombre()
		{
			return this.nombre;
		}

		public String getApellido()
		{
			return this.apellido;
		}

		public int getYearIngreso()
		{
			return this.yearIngreso;
		}
		////////////////////////////////////////////////////////
		public abstract void imprimir();
		public abstract void obtenerSueldo(double salarioFijo);
		public abstract double getSueldo();
		public abstract void setNoClientes(int numCliente);
		public abstract void setMontoxCliente(double numMonto);

}