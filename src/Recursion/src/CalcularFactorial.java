public class CalcularFactorial {
    //metodo recursivo factorial
    public static int calcFactorial(int n){
        if(n == 0 || n == 1 ){
            return 1;
        }else {
            return n* calcFactorial(n-1);
        }
    }
    //metodo interactivo
    public static int calcFactorialIn(int n){
        int factorial=1;
        for (int i=1;i<=n;i++){
            factorial*=i;
        }
        return factorial;
    }

    public static void main(String[] args){
        int numero=5;
        //calcular el factorial con el metodo recursivo
        int factorialrecu=calcFactorial(numero);

        System.out.println("factorial de "+numero+" el resultado es:"+factorialrecu);
        int factorialitera=calcFactorialIn(numero);
        System.out.println("factorial de "+numero+" el resultado es:"+factorialitera);

    }
}
