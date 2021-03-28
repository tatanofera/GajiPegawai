// inheritance
public abstract class Tunjangan extends GajiPokok {
    private int tunjangan;

    // constractor yang mengacu pada class supernya
    public Tunjangan(String nama, char golongan, String status) {
        super(nama, golongan, status);
    }

    // getter and setter
    public int getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    // abstract method
    public abstract void showTunjangan();
}
