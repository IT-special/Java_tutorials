package MultiDim_Array;

public class Main {
    public static void main(String[] args){
        System.out.println("First Section of Code");
        int[][] a = {{1,2,3,4,6,7},
                     {8,9,1,5}};
        System.out.println("a's length " + a.length);
        System.out.println("a[0]'s length " + a[0].length);
        System.out.println("a[0]'s length " + a[1].length);



        System.out.println("Second Section of Code");
        System.out.println("\nCoordinates");
        int[][] coordinates = {{3,5}, {13,1}, {6,4}};

        int[] coordinates1 = coordinates[0]; // {3,7}
        int[] coordinates2 = coordinates[1]; // {3,7}
        int[] coordinates3 = coordinates[2]; // {8,5}

        System.out.println("coordinates[0][0]: " + coordinates[0][0]); // 3
        System.out.println("coordinates[0][1]: " + coordinates[0][1]); // 7

        System.out.println("coordinates[0][0]: " + coordinates[1][0]); //
        System.out.println("coordinates[0][1]: " + coordinates[1][1]); //

        System.out.println("coordinates[0][0]: " + coordinates[2][0]); //
        System.out.println("coordinates[0][1]: " + coordinates[2][1]); //
        // print(coordinates);





        // We can also write seperately and finally merge in one matrix
        int[] a1 = {2,7,4,6,6};
        int[] a2 = {2,7,4,6,6};
        int[] a3 = {2,7,4,6,6};
        int[] a4 = {2,7,4,6,6};
        int[][] new_matrix = {a1, a2, a3, a4};









        //Another Example
        int[][] b = new int[2][]; // everytime we have to initialize first matrix elements
        b[0] = new int[3];
        b[1] = new int[5];

        for (int i = 0; i < b.length; i++)
            for (int j = 0; j < b[i].length; j++)
                b[i][j] = (i+1)*(j+1)*((int)(Math.random()*100));

        //print(b);








        //Another Example
// 3-D array with fixed length:
        int[][][] x = new int[2][4][6];
/*        int[][][] y = new int[323][][];

        // Can't do that!
//		int[][][] z = new int[][][11];

        // Lengths
        System.out.println("\nx.length is " + x.length);
        System.out.println("x[0].length is " + x[0].length);
        System.out.println("x[1].length is " + x[1].length);
        System.out.println("x[0][0].length is " + x[0][0].length);
        System.out.println("x[0][1].length is " + x[0][1].length);
        System.out.println("x[1][0].length is " + x[1][0].length);
        System.out.println("x[1][1].length is " + x[1][1].length);



*/



        //3-dim Array

        int counter = 0;
        for (int i = 0; i < x.length; i++ ){
            for (int j = 0; j < x[i].length; j++) {
                for (int k = 0; k < x[i][j].length; k++) {
                    x[i][j][k] = ++counter;
                }
            }
        }

        print(x);
    }

    public static void print(int[][] array) { // Nurik tut array inside the constuctor
        System.out.println("\nPrinting the 2-dim array");
        for (int i = 0; i < array.length; i++ ) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("x[i][j] is " + array[i][j]);
            }

        }
    }

    public static void print(int[][][] array) { // Nurik tut array inside the constuctor
        System.out.println("\nPrinting the 2-dim array");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[j].length; k++) {
                    System.out.println("x[i][j] is " + array[i][j][k]);
                }

            }
        }
    }
}
