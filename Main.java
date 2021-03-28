public class Main {
    public static void main(String[] args) {

        // memanggil Tampilkan class yang menjadi object
        Tampilkan print = new Tampilkan("Tata", '2', "Belum");

        // memanggil abstract method
        print.printdata();
        print.showGajiPokok();
        print.showTunjangan();
        print.showPotongan();
        print.showGajiBersih();
    }
}
