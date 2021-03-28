// inheritance
public abstract class GajiBersih extends Potongan {
    private int gajibersih;

    // constractor yang mengacu pada class supernya
    public GajiBersih(String nama, char golongan, String status) {
        super(nama, golongan, status);
    }

    // getter dan setter
    public int getGajiBersih() {
        return gajibersih;
    }

    public void setGajiBersih(int gajibersih) {
        this.gajibersih = gajibersih;
    }

    // abstract method
    public abstract void showGajiBersih();
}
