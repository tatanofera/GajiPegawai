// inheritance
public abstract class Potongan extends Tunjangan {
    private float potongan;

    // constractor yang mengacu pada class supernya
    public Potongan(String nama, char golongan, String status) {
        super(nama, golongan, status);
    }

    // getter and setter
    public float getPotongan() {
        return potongan;
    }

    public void setPotongan(float potongan) {
        this.potongan = potongan;
    }

    // abstract method
    public abstract void showPotongan();
}
