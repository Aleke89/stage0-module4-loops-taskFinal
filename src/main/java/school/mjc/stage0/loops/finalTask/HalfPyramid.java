package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        String ff = "";
        StringBuffer stringBuffer = new StringBuffer(ff);
        for(int i = 0;i<cathetusLength;i++) {
            stringBuffer.append("*");
        }



    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
