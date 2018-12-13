class Gestion
{
	
  public void mostrarTodos(Empleado [] empleados)
  {
 	for(int i=0; i<empleados.length; i++){

 		
 		empleados[i].imprimir();
 		System.out.print("\n");
 	}
  }

   public void sueldoMayor(Empleado [] empleados)
   {
 	double sueldoMayor=empleados[0].getSueldo();

 	for(int i=0; i<empleados.length; i++)
 	{
      if(empleados[i].getSueldo()>sueldoMayor)
      {
        
        sueldoMayor=empleados[i].getSueldo();

      } 
 	}

    for(int i=0; i<empleados.length; i++)
    {
 		if(sueldoMayor==empleados[i].getSueldo())
 		{
 			System.out.println("====Empleado con mayor sueldo====");
 			System.out.println("Nombre: "+empleados[i].getNombre());
 			System.out.println("Apellido: "+empleados[i].getApellido());
 			System.out.println("Salario: "+sueldoMayor);
 	   }
    }
 }

}