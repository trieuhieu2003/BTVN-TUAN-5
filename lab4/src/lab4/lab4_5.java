package lab4;

import java.util.Scanner;

abstract class GiangVien{
    String hoTen,diaChi,loaiGiangVien;
    public void nhapThongTin(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoTen=sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi=sc.nextLine();
        System.out.println("Nhap loai giang vien: ");
        loaiGiangVien=sc.nextLine();
    }
    GiangVien(){

    }
    public abstract void tinhLuong();
    public void inThongTin(){
        System.out.println("Ho ten: "+hoTen);
        System.out.println("Dia chi: "+diaChi);
        System.out.println("Loai giang vien: "+loaiGiangVien);
    }
}
class GVCoHuu extends GiangVien{
    int heSoLuong;
    double luongThang,phuCap,luongCoBan,thamNien;
    GVCoHuu(){

    }
    public void nhapThongTin(){
        System.out.println("\tGIANG VIEN CO HUU");
        super.nhapThongTin();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao luong co ban: ");
        luongCoBan=sc.nextDouble();
        System.out.println("Nhap vao he so luong:: ");
        heSoLuong=sc.nextInt();
        System.out.println("Nhap vao tham nien: ");
        thamNien=sc.nextDouble();
    }
    public void tinhLuong(){
        if(thamNien<5){
            phuCap=0;        
        }else if(thamNien==5){
            phuCap=0.05*luongCoBan;
        }else{
            phuCap=(thamNien*luongCoBan)/100;
        };
        luongThang=luongCoBan*heSoLuong+phuCap;
        System.out.println("Luong cua giao vien: "+luongThang);
        }
    }
    
class GVThinhGiang extends GiangVien{
    int soTietDay,donGia;
    double luongThang,thuNhap;
    GVThinhGiang(){

    }
    public void nhapThongTin(){
        System.out.println("\tGIANG VIEN THINH");
        super.nhapThongTin();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so tiet day: ");
        soTietDay=sc.nextInt();
        System.out.println("Nhap don gia: ");
        donGia=sc.nextInt();
    }
    public void tinhLuong(){
        thuNhap=0.15*soTietDay*donGia;
        luongThang=soTietDay*donGia-thuNhap;
        System.out.println("Luong cua giao vien: "+luongThang);
    }
    
}

public class lab4_5 {
	public static void main(String[] args) {
        GVCoHuu gvch=new GVCoHuu();
        GVThinhGiang gvtg=new GVThinhGiang();
        int luachon;
        String chon;
        do{
        Scanner sc=new Scanner(System.in);
        System.out.println("\tMENU");
        System.out.println("1.Nhap thong tin giang vien co huu.");
        System.out.println("2.Xuat thong tin giang vien co huu.");
        System.out.println("3.Nhap thong tin giang vien thinh giang.");
        System.out.println("4.Xuat thong tin giang vien thinh giang.");
        System.out.println("Moi ban nhap lua chon: ");
        luachon=sc.nextInt();
        switch(luachon){
        case 1:
        gvch.nhapThongTin();
        break;
        case 2:
        gvch.inThongTin();
        gvch.tinhLuong();
        break;
        case 3:
        gvtg.nhapThongTin();
        break;
        case 4:
        gvtg.inThongTin();
        gvtg.tinhLuong();
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