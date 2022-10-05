package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < height; x++) {
                int sum=height/2;
                if (y<sum && x>=y && x<height-y) {
                    System.out.print("8");
                }else if(y>=sum && x<=y && x>=height-y-1) {
                    System.out.print("8");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}