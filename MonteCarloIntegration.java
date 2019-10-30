public class MonteCarloIntegration {

    public static void main(String[] args) {
        System.out.println("The estimate value is : " + MonteCarloIntegration(0,1,1000000));
    }
    public static double f(double x){
        return Math.sin(x);
    }

    public static  double MonteCarloIntegration(double a, double b, long iterations){
        if( a > b){
            MonteCarloIntegration(b,a, iterations);
        }
        double sum = 0;
        double x = 0;

        for(long i = 1; i<=iterations; i++){
            x = Math.random();
            sum = sum + f(a + ((b-a)*x));
        }
        sum = ((b-a)/iterations)*sum;
        return  sum;
    }
}
