public class Main {
        public static void main(String[] args) {

            boolean[][] array = new boolean[5][5];

            drawRow(array,3);

        }

    private static void drawRow(boolean[][] array,int row) {
        array = new boolean[5][5];
        array[row][0] = array[row][1] = array[row][2] = array[row][3] = array[row][4] = true;
        drawPoints(array);
    }

    private static void drawPoints(boolean[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j]){
                    System.out.print("@" + "\t");
                }else{
                    System.out.print("." + "\t");
                }
            }
            System.out.println();
        }
    }
}