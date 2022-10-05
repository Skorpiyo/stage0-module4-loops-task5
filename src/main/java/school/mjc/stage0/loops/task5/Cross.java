package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        for (int y = 1; y <= sideLength; y++) {
            for (int x = 1; x <= sideLength; x++) {
                int sum=(sideLength+1)/2;
                if (x == 0 || x == sum || y==0 || y==sum) {
                    System.out.print("8");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

