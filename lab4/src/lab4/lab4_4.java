package lab4;
import java.util.Scanner;

abstract class Hocvien{
    String hoTen,diaChi,loaiChuongTrinh;
    int loaiUuTien;
    public void nhapThongTin(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoTen=sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi=sc.nextLine();
        System.out.println("Nhap loai uu tien: ");
        loaiUuTien=sc.nextInt();
        System.out.println("Nhap loai chuong trinh: ");
        sc.nextLine();
        loaiChuongTrinh=sc.nextLine();
    }
    Hocvien(){

    }
    public abstract void hocPhi();
    public void inThongTin(){
        System.out.println("Ho ten: "+hoTen);
        System.out.println("Dia chi: "+diaChi);
        System.out.println("Loai uu tien: "+loaiUuTien);
        System.out.println("Loai chuong trinh: "+loaiChuongTrinh);
    }
}
class HocvienDH extends Hocvien{
    int soBuoi,donGiaDH,hocPhi;
    HocvienDH(){

    }
    public void nhapThongTin(){
        System.out.println("\tDO HOA");
        super.nhapThongTin();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao so buoi: ");
        soBuoi=sc.nextInt();
        System.out.println("Nhap vao gia: ");
        donGiaDH=sc.nextInt();
    }
    public void hocPhi(){
         if(loaiUuTien==1){
             hocPhi=(soBuoi*donGiaDH)-1000000;
        }else if(loaiUuTien==2){
             hocPhi=(soBuoi*donGiaDH)-500000;
        }else{
             hocPhi=soBuoi*donGiaDH;
        };
        System.out.println("Hoc phi: "+hocPhi);
    }
    
}
class HocvienLT extends Hocvien{
    int soBuoi,donGiaLT, hocPhi;
    HocvienLT(){

    }
    public void nhapThongTin(){
        System.out.println("\tLAP TRINH");
        super.nhapThongTin();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so buoi: ");
        soBuoi=sc.nextInt();
        System.out.println("Nhap don gia: ");
        donGiaLT=sc.nextInt();
    }
    public void hocPhi(){
        if(loaiUuTien==1){
              hocPhi=(soBuoi*donGiaLT)-10000000;
        }else if(loaiUuTien==2){
              hocPhi=(soBuoi*donGiaLT)-800000;
        }else{
              hocPhi=soBuoi*donGiaLT;
        };
        System.out.println("Hoc phi: "+hocPhi);
    }
    
}

public class lab4_4 {
	public static void main(String[] args) {
        HocvienDH hvdh=new HocvienDH();
        HocvienLT hvlt=new HocvienLT();
        int luachon;
        String chon;
        do{
        Scanner sc=new Scanner(System.in);
        System.out.println("\tMENU");
        System.out.println("1.Nhap thong tin sinh vien do hoa.");
        System.out.println("2.Xuat thong tin sinh vien do hoa.");
        System.out.println("3.Nhap thong tin sinh vien lap trinh.");
        System.out.println("4.Xuat thong tin sinh vien lap trinh.");
        System.out.println("Moi ban nhap lua chon: ");
        luachon=sc.nextInt();
        switch(luachon){
        case 1:
        hvdh.nhapThongTin();
        break;
        case 2:
        hvdh.inThongTin();
        hvdh.hocPhi();
        break;
        case 3:
        hvlt.nhapThongTin();
        break;
        case 4:
        hvlt.inThongTin();
        hvlt.hocPhi();
        break;
        default:
         System.out.println("Ban da nhap sai.");
        };
        System.out.println("Ban co muon lua chon tiep khong(yes/no): ");
        sc.nextLine();
        chon=sc.nextLine();
    }while(chon!="yes");
    }
}