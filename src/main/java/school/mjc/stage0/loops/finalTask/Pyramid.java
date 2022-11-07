package school.mjc.stage0.loops.finalTask;


public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int rowCount = 1;
        /* Code for displaying the pyramid */

        for (int i = cathetusLength; i >= 1; i--)
        {
            /* Print i*2 spaces at the beginning of each row */

            for (int j = 1; j <= i*2; j++)
            {
                System.out.print(" ");
            }

            /* Print j where j value will be from i to nrows */

            for (int j = i; j <= cathetusLength; j++)
            {
                System.out.print(" "+j);
            }

            /* Print j where j value will be from nrows-1 to i */

            for (int j = cathetusLength-1; j >= i; j--)
            {
                System.out.print(" "+j);
            }

            System.out.println();

            /* Increment the rowCount */

            rowCount++;
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
