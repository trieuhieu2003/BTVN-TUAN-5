package lab4;

class Nguoi{
    String ten,gioiTinh;
    int tuoi;
    public Nguoi(){
    }
    public Nguoi(String ten,int tuoi,String gioiTinh){
        this.ten=ten;
        this.tuoi=tuoi;
        this.gioiTinh=gioiTinh;
    }
    public String getten(){
        return ten;
    }
    public void setten(String ten){
        this.ten=ten;
    }
    public int gettuoi(){
        return tuoi;
    }
    public void settuoi(int tuoi){
        this.tuoi=tuoi;
    }
    public String getgioiTinh(){
        return gioiTinh;
    }
    public void setgioiTinh(String gioiTinh){
        this.gioiTinh=gioiTinh;
    }
    public String toString(){
        return "Ten : "+ten+"\nTuoi : "+tuoi+"\nGioi tinh : "+gioiTinh;
    }
}
class BenhVien{
    String tenbv,diaChi,giamDoc;
    public BenhVien(String tenbv,String diaChi,String giamDoc){
        this.tenbv=tenbv;
        this.diaChi=diaChi;
        this.giamDoc=giamDoc;
    }
    public String gettenbv(){
        return tenbv;
    }
    public void setten(String tenbv){
        this.tenbv=tenbv;
    }
    public String getdiaChi(){
        return diaChi;
    }
    public void setdiaChi(String diaChi){
        this.diaChi=diaChi;
    }
    public String getgiamDoc(){
        return giamDoc;
    }
    public void setgiamDoc(String giamDoc){
        this.giamDoc=giamDoc;
    }
    public String toString(){
        return "\nTen benh vien: "+tenbv+"\nDia chi: "+diaChi+"\nGiam doc: "+giamDoc;
    }
}
class BenhNhan extends Nguoi{
    String tienSu,chanDoan;
    BenhVien bv;;
    public BenhNhan(String ten,int tuoi,String gioiTinh,String tienSu,String chanDoan,BenhVien bv){
        super(ten,tuoi,gioiTinh);
        this.chanDoan=chanDoan;
        this.tienSu=tienSu;
        this.bv=bv;
    }
    public String gettienSu(){
        return tienSu;
    }
    public void settienSu(String tienSu){
        this.tienSu=tienSu;
    }
    public String getchanDoan(){
        return chanDoan;
    }
    public void setchanDoan(String chanDoan){
        this.chanDoan=chanDoan;
    }
    public String toString(){
        return super.toString()+"\nTien su benh: "+tienSu+"\nChan doan benh: "+chanDoan+bv;
    }
}
public class lab4_1 {
	public static void main(String[] args) {
	    BenhVien bv=new BenhVien("Da khoa Ha Noi", "Ha Noi", "Khong");
	    BenhNhan bn=new BenhNhan("minh hieu", 20, "nam", "khong", "khong",bv);
	    System.out.println(bn);
	}
	}