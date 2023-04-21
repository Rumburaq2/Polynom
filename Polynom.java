public class Polynom {

    static double spocitejHodnotu(double x){
        //4x*4 + 10x*3 + 25x*2 + 50x + 24
        //x(4x*3 + 10x*2 + 25x + 50) + 24
        //
        int[] arr = new int[]{4, 10, 35, 50, 24};

        int n = 4;
        double v = 0;

        for (int p = n; p >=0 ; p--) {
            v = v * x + arr[p];
        }

        return v;
    }

    public static void main(String[] args) {
        for (double i = -1; i < 1; i=i+0.1) {
            System.out.println(i +" " + spocitejHodnotu(i));
        }
    }



}
