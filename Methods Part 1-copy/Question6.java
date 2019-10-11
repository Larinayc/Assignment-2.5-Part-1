
class Question6{
    public static void displayBox(int width, int height){
        int i = 0;
        

        while (i < height){
            int j = 0;
            while (j < width){
                System.out.print("$");
                j ++;
            }
            System.out.println("");
            System.out.println("");
            i ++;
        }

    }

    public static void main (String[] args){
        displayBox(6,3);

    }
}
