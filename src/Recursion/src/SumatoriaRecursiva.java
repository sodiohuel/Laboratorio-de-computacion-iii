public class SumatoriaRecursiva {
    // Función recursiva para calcular la sumatoria
  public static int calcularSumatoria(int n){
    if(n==1){
      return 1;
    }else{
      return n+calcularSumatoria(n-1);
    }
  }

  public static void main (String[] arg){
    int numero= 6; //cambiamos el valor para probar diferentes numeros y es mas facil que pedir que ingresen
    int sumatoria = calcularSumatoria(numero);
    System.out.println("La sumatoria de los numeros desde 1 hasta "+numero+" es: "+sumatoria);


  }

}
