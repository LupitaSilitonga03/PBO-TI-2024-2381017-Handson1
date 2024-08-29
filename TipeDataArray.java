public class TipeDataArray {
    public static void main(String[] args) {
        //array adalah sekumpulan data yang memiliki tipe data yang sama
        int [] kumpulanNumber; //deklarasi
        //cara 1
        kumpulanNumber = new int [3]; //inisialisasi

        //cara 2
        //int [] kumpulanNumber2 = new int[3];

        //cara 3
        //int[] kumpulanNumber3 = new int[] {1, 3, 4, 5};
        kumpulanNumber[0] = 100;
        kumpulanNumber[1] = 200;
        kumpulanNumber[2] = 300;

        //cara mengakses
        System.out.println(kumpulanNumber[2]);

        //length memang 3
        //System.out.println();
    }
}
