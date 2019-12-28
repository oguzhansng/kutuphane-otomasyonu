
import java.sql.Connection;


public class Kitaplar {
    private String kitapAdi;
    private String kitapNo;
    private String yazar;
    private String yayinevi;
    private String sayfaSayisi;

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getKitapNo() {
        return kitapNo;
    }

    public void setKitapNo(String kitapNo) {
        this.kitapNo = kitapNo;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public String getYayinevi() {
        return yayinevi;
    }

    public void setYayinevi(String yayinevi) {
        this.yayinevi = yayinevi;
    }

    public String getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(String sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }

    public Kitaplar(String kitapAdi, String yazar, String yayinevi, String kitapNo, String sayfaSayisi) {
        this.kitapAdi = kitapAdi;
        this.kitapNo = kitapNo;
        this.yazar = yazar;
        this.yayinevi = yayinevi;
        this.sayfaSayisi = sayfaSayisi;
    }
            
    
    
    
    
    
}
