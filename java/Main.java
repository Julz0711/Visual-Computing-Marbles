package Marbels;
//awesome
import java.util.Arrays;

class Main {

    //Kevin stinkt
    public static void main(String[] args) {
        double[] v = new double[] { 20, 10 };
        double[] s = new double[] { 0, 0 };
        double[] a = new double[] { 0, 9.81 };
        Ball ball = new Ball(a, v, s);

        for (int i = 0; i <= 29; i++) {
            ball.nextFrame();
            System.out.println("V: " + Arrays.toString(ball.getV()) +
                    ", S: " + Arrays.toString(ball.getS()) +
                    ", A: " + Arrays.toString(ball.getA()));
        }
    }
}