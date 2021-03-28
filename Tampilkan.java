// inheritance
public class Tampilkan extends GajiBersih {

    // constractor yang mengacu pada class supernya
    public Tampilkan(String nama, char golongan, String status) {
        super(nama, golongan, status);
    }

    // dynamic polymorphism
    @Override
    public void printdata() {
        System.out.println("Nama Pegawai\t\t: "+getNama());
        System.out.println("Golongan (1/2)\t\t: "+getGolongan());
        System.out.println("Status (Nikah/Belum): "+getStatus());
    }

    @Override
    public void showGajiPokok() {
        if (getGolongan() == '1') {
            setGajiPokok(1000000);
            System.out.println("Gaji Pokok\t\t\t: Rp. "+getGajiPokok());
        } else if (getGolongan() == '2') {
            setGajiPokok(3000000);
            System.out.println("Gaji Pokok\t\t\t: Rp. "+getGajiPokok());
        } else {
            setGajiPokok(5000000);
            System.out.println("Gaji Pokok\t\t\t: Rp. "+getGajiPokok());
        }
    }

    @Override
    public void showTunjangan() {
        if (getGolongan() == '1' && getStatus().equals("Nikah")) {
            setTunjangan(100000);
            System.out.println("Tunjangan\t\t\t: Rp. "+getTunjangan());
        } else if (getGolongan() == '1' && getStatus().equals("Belum")) {
            setTunjangan(50000);
            System.out.println("Tunjangan\t\t\t: Rp. "+getTunjangan());
        } else if (getGolongan() == '2' && getStatus().equals("Nikah")) {
            setTunjangan(150000);
            System.out.println("Tunjangan\t\t\t: Rp. "+getTunjangan());
        } else if (getGolongan() == '2' && getStatus().equals("Belum")) {
            setTunjangan(125000);
            System.out.println("Tunjangan\t\t\t: Rp. "+getTunjangan());
        } else {
            setTunjangan(0);
            System.out.println("Tunjangan\t\t\t: Rp. "+getTunjangan());
        }
    }

    @Override
    public void showPotongan() {
        if (getGajiPokok() <= 1000000) {
            setPotongan ((getGajiPokok() + getTunjangan()) * (5F / 100));
            System.out.printf("Potongan\t\t\t: Rp. %.0f",getPotongan());
        } else if (getGajiPokok() > 1000000) {
            setPotongan ((getGajiPokok() + getTunjangan()) * (10F / 100));
            System.out.printf("Potongan\t\t\t: Rp. %.0f",getPotongan());
        }
    }

    @Override
    public void showGajiBersih() {
        setGajiBersih((int)(getGajiPokok() + getTunjangan() - getPotongan()));
        System.out.println("\nGaji Bersih\t\t\t: Rp. "+getGajiBersih());
    }
}
