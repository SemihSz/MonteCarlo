public class MonteCarlo {

    public static void main(String[] args) {
        for (int i = 0; i<100000000; i++){
            System.out.println(pi(i));
        }
//        System.out.println(pi(1000));
//        System.out.println(pi(10000));
//        System.out.println(pi(100000));
//        System.out.println(pi(1000000));
//        System.out.println(pi(100000000));
    }

    public static double pi(int number_of_term){
        int inside_in_circle = 0;

        for(int i = 0; i<number_of_term; i++){
            double x = (Math.random())*2-1.0;
            double y = (Math.random())*2-1.0;
            double distance = Math.sqrt(x*x + y*y);

            if( distance < 1){
                inside_in_circle++;
            }
        }
        return  4.0 * inside_in_circle/number_of_term;
    }


}
