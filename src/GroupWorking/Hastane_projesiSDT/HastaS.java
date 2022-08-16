package GroupWorking.Hastane_projesiSDT;

public class HastaS {


private String isim;
private String soyIsim;
private int hastaID;
private DurumS hastaDurumu;

    public HastaS() {
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public int getHastaID() {
        return hastaID;
    }

    public void setHastaID(int hastaID) {
        this.hastaID = hastaID;
    }

    public DurumS getHastaDurumu() {
        return hastaDurumu;
    }

    public void setHastaDurumu(DurumS hastaDurumu) {
        this.hastaDurumu = hastaDurumu;
    }
}
