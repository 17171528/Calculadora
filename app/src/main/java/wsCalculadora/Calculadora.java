package wsCalculadora;

public class Calculadora {
    public double suma(double x, double y)
    {
        return x + y;
    }

    public double multiplica(double x, double y) {
        return x * y;
    }

    public double seno(double x) {
        return Math.sin(x);
    }
        //Division
        public double divide(double x, double y) {
            double resultado = 0;
            try {
                resultado = x / y;
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            return resultado;
        }
    

    public double coseno(double x) {
        return Math.cos(x);
    }

    public double tangente(double x) {
        return Math.tan(x);
    }
}
