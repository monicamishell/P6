class EComision extends Empleado
{
	static double salarioMinimo=750.0;
	private double salario;
	private double noClientes;
	private double montoxCliente;


    public EComision()
    {
    }

	public EComision(String noTrabajador, String nombre, String apellido, int yearIngreso,int noClientes, double montoxCliente)
	{
		super(noTrabajador, nombre, apellido, yearIngreso);
		obtenerSueldo(salario);
		setNoClientes(noClientes);
		setMontoxCliente(montoxCliente);
	}
	///////////////////////////////////////////////////
	public void setNoClientes(int noClientes)
	{
		this.noClientes = noClientes;
	}

	public void setMontoxCliente(double montoxCliente)
	{
		this.montoxCliente = montoxCliente;
	}

    ///////////////////////////////////////////////////
	public double getNoClientes()
	{
		return this.noClientes;
	}

	public double getMontoxCliente()
	{
		return this.montoxCliente;
	}

	public double getSueldo()
	{
		return this.salario;
	}

	////////////////////////////////////////////////////
	public void obtenerSueldo(double salarioMinimo)
	{
		double salarioReal=(this.noClientes*this.montoxCliente);
		
		if (salarioReal<salario)
		{
			this.salario=salarioMinimo;
		}

		this.salario=salarioReal;
	}

	public void imprimir()
	{

		System.out.println("\nNombre del empleado: " +nombre);
		System.out.println("Apellidos: " +apellido);
		System.out.println("Num. de empleado: " +noTrabajador);
		System.out.println("A\u00f1o de ingreso: " +yearIngreso);
		obtenerSueldo(salario);
		System.out.println("Salario: " +salario);

	}
}