package sobrecarga;

public class Calcapp {
     public static void main(String[] args) {
		Calculadora calc = new Calculadora();
       System.out.println("Suma");	 
	  calc.MostrarResultado(calc.Suma("1.3","32.1","4.0","77.9","31.3"));
     
	  calc.MostrarResultado(calc.Suma(2, 2));
     
      calc.MostrarResultado(calc.Suma(2.3, 3.2));
     
      calc.MostrarResultado(calc.Suma(2.3, 14.35, 5.8));
       
      calc.MostrarResultado(calc.Suma(2, 3, 4));
     
     
     }
	
	
	
}
