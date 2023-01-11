package quanlykhoahoc_n12;


import java.io.Serializable;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;


/**
 *
 * @author GT70 DOMINATOR
 */
public class KhoaHoc implements Serializable {

    private String MaKH;
    private String TenKH;
    private int Key;
    private String Email;
    private double Gia;
    private String anh;

    public KhoaHoc() {
    }
    public KhoaHoc(String MaKH, String TenKH, int Key, String Email, double Gia) {
        this.MaKH = MaKH;
        this.TenKH = TenKH;
        this.Key = Key;
        this.Email = Email;
        this.Gia = Gia;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public int getKey() {
        return Key;
    }

    public void setKey(int Key) {
        this.Key = Key;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public double getGia() {
    
        return Gia;
    }

    public void setGia(double Gia) {
       
        this.Gia = Gia;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }
    @Override
    public String toString() {
        return "KhoaHoc{" + "MaKH=" + this.MaKH + ", TenKH=" + this.TenKH + ", Key=" + this.Key + ", Email=" + this.Email + ", Gia=" + this.Gia + '}';
    }
        
}
