public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        byte x = 0;

        vytiskni2(x);
        x = zmenBit(x, 3);
        vytiskni2(x);
    }

    static void vytiskni2(byte b){
        String s1 = String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0');
        System.out.println(s1);
    }


    static Byte zmenBit(byte aktualni, int x){

        return (byte) (aktualni | (1<<x));

        /*
        byte og = aktualni;

        aktualni = (byte) (aktualni << x-1);
        aktualni = (byte) (aktualni | 1);



        // 1 << aktuali

        return aktualni;

         */

    }

}