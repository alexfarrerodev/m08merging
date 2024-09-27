public class Calculadora {
   public int suma(int a, int b) { 
	if (!Utilidades.esNumeroValido(a) || !Utilidades.esNumeroValido(b)) { throw new IllegalArgumentException("Parámetros inválidos"); } return a + b; 
}
         

   public int resta(int a, int b) {
        return a - b;
    }
}
   public int multiplicacion(int a, int b) { 
   	return a * b; 
}

