public class DivisionConRestas {

        // Método recursivo para la división
        public static int divisionRecursiva(int dividendo, int divisor) {
            if (dividendo < divisor) {
                return 0;
            } else {
                return 1+divisionRecursiva(dividendo - divisor, divisor);
            }
        }

        // Método iterativo para la división
        public static int divisionIterativa(int dividendo, int divisor) {
            int cociente = 0;
            while (dividendo >= divisor) {
                dividendo -= divisor;
                cociente++;
            }
            return cociente;
        }

        public static void main(String[] args) {
            int dividendo = 42;
            int divisor = 5;

            // Prueba del enfoque recursivo
            int cocienteRecursivo = divisionRecursiva(dividendo, divisor);
            System.out.println("Enfoque Recursivo: " + dividendo + " / " + divisor + " = " + cocienteRecursivo);

            // Prueba del enfoque iterativo
            int cocienteIterativo = divisionIterativa(dividendo, divisor);
            System.out.println("Enfoque Iterativo: " + dividendo + " / " + divisor + " = " + cocienteIterativo);
        }
    }
