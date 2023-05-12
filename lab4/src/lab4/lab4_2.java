package lab4;
class Nguoi {
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
class Truong{
    String ten,diaChi,hieuTruong;
    public Truong(String ten,String diaChi,String hieuTruong){
        this.ten=ten;
        this.diaChi=diaChi;
        this.hieuTruong=hieuTruong;
    }
    public String getten(){
        return ten;
    }
    public void setten(String ten){
        this.ten=ten;
    }
    public String getdiaChi(){
        return diaChi;
    }
    public void setdiaChi(String diaChi){
        this.diaChi=diaChi;
    }
    public String gethieuTruong(){
        return hieuTruong;
    }
    public void sethieuTruong(String hieuTruong){
        this.hieuTruong=hieuTruong;
    }
    public String toString(){
        return "\nTen truong: "+ten+"\nDia chi: "+diaChi+"\nHieu truong: "+hieuTruong;
    }
}
class SinhVien extends Nguoi{
    String lop,nganh;
    Truong trg;
    public SinhVien(String ten,int tuoi,String gioiTinh,String lop,String nganh,Truong trg){
        super(ten,tuoi,gioiTinh);
        this.lop=lop;
        this.nganh=nganh;
        this.trg=trg;
    }
    public String getlop(){
        return lop;
    }
    public void setlop(String lop){
        this.lop=lop;
    }
    public String getnganhString(){
        return nganh;
    }
    public void setnagnh(String nganh){
        this.nganh=nganh;
    }
    public String toString(){
        return super.toString()+"\nLop: "+lop+"\nNganh: "+nganh+trg;
    }
}

public class lab4_2 {
	public static void main(String[] args) {
	    Truong trg=new Truong("Dai hoc mo dia chat", "18 pho vien", "Trieu Minh Hieu");
	    SinhVien sv=new SinhVien("minh hieu", 20, "nam", "G1", "CNTT",trg);
	    System.out.println(sv);
	}
	}