package PersonelUse;

public class Kisi {
    private String adi;
    private String soyadi;
    private int no;

    public Kisi() {
    }
    public Kisi(String adi, String soyadi, int no) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.no = no;
    }

    @Override
    public String toString() {
        return adi + " " + soyadi + " " + no ;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
}
