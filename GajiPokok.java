// inheritance
public abstract class GajiPokok extends Penggajian {
    private int gajipokok;

    // constractor yang mengacu pada super class-nya
    public GajiPokok(String nama, char golongan, String status) {
        super(nama, golongan, status);
    }

    // getter and setter
    public int getGajiPokok() {
        return gajipokok;
    }

    public void setGajiPokok(int gajipokok) {
        this.gajipokok = gajipokok;
    }

    // abstract method
    public abstract void showGajiPokok();
}
