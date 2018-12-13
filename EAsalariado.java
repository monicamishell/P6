class EAsalariado extends Empleado
{
	private double salarioFijo;
	//////////////////////////////////////

	public EAsalariado()
	{
	}

	public EAsalariado(String noTrabajador, String nombre, String apellido, int yearIngreso, double salarioFijo)
	{
		super(noTrabajador, nombre, apellido, yearIngreso);
		obtenerSueldo(salarioFijo);
	}

	public void setNoClientes(int numClientes){

      numClientes=0;
    }

    public void setMontoxCliente(double numMonto){

      numMonto=0;
    }

	public double getSueldo()
	{
		return this.salarioFijo;
	}

	///////////////////////////////////////
	public void obtenerSueldo(double salarioFijo)
	{
		int yearTrabajados=2018-this.yearIngreso;

		if (yearTrabajados<2)
		{
			this.salarioFijo=salarioFijo;
		}

			if(yearTrabajados<=3 && yearTrabajados>=2)
			{
				this.salarioFijo=(salarioFijo*0.05)+salarioFijo;
			}

				if(yearTrabajados<=7 && yearTrabajados>=4)
				{
					this.salarioFijo=(salarioFijo*0.10)+salarioFijo;
				}

					if(yearTrabajados<=15 && yearTrabajados>=8)
					{
						this.salarioFijo=(salarioFijo*0.15)+salarioFijo;
					}

						if(yearTrabajados>15)
						{
							this.salarioFijo=(salarioFijo*0.20)+salarioFijo;
						}

	}

	public void imprimir()
	{
		System.out.println("\nNombre del empleado: " +nombre);
		System.out.println("Apellidos: " +apellido);
		System.out.println("Num. de empleado: " +noTrabajador);
		System.out.println("A\u00f1o de ingreso: " +yearIngreso);
		obtenerSueldo(salarioFijo);
		System.out.println("Salario: " +salarioFijo);

	}
}