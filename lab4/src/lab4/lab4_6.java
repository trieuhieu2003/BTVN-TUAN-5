package lab4;

import java.util.Scanner;

abstract class CongNhan{
    String hoTen,diaChi,loaiCongNhan;
    public void nhapThongTin(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoTen=sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi=sc.nextLine();
        System.out.println("Nhap loai cong nhan: ");
        loaiCongNhan=sc.nextLine();
    }
    CongNhan(){

    }
    public abstract void tinhLuong();
    public void inThongTin(){
        System.out.println("Ho ten: "+hoTen);
        System.out.println("Dia chi: "+diaChi);
        System.out.println("Loai cong nhan: "+loaiCongNhan);
    }
}
class CNKSP extends CongNhan{
    int soSP;
    double luongThang,donGia,thuong;
    CNKSP(){

    }
    public void nhapThongTin(){
        System.out.println("\tCONG NHAN KHOAN SAN PHAM");
        super.nhapThongTin();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao so san pham: ");
        soSP=sc.nextInt();
        System.out.println("Nhap vao don gia: ");
        donGia=sc.nextDouble();
    }
    public void tinhLuong(){
        if(soSP>=1150){
            thuong=1500;        
        }else if(soSP>=1100){
            thuong=1000;
        }else{
            thuong=0;
        };
        luongThang=soSP*donGia+thuong;
        System.out.println("Luong cua cong nhan: "+luongThang);
        }
    }
    
class CNTCN extends CongNhan{
    int soNgayCong;
    double luongThang,luongCoBan,thuong;
    CNTCN(){

    }
    public void nhapThongTin(){
        System.out.println("\tCONG NHAN TINH CONG NHAT");
        super.nhapThongTin();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap luong co ban: ");
        luongCoBan=sc.nextDouble();
        System.out.println("Nhap so ngay cong: ");
        soNgayCong=sc.nextInt();
    }
    public void tinhLuong(){
        if(soNgayCong<20){
            thuong=0;
        }else{
            thuong=1.2*luongCoBan;
        };
        luongThang=luongCoBan*soNgayCong+thuong;
        System.out.println("Luong cua cong nhan: "+luongThang);
    }
    
}
public class lab4_6 {
	public static void main(String[] args) {
        CNKSP cn1=new CNKSP();
        CNTCN cn2=new CNTCN();
        int luachon;
        String chon;
        do{
        Scanner sc=new Scanner(System.in);
        System.out.println("\tMENU");
        System.out.println("1.Nhap thong tin cong nhan khoan san pham.");
        System.out.println("2.Xuat thong tin cong nhan khoan san pham.");
        System.out.println("3.Nhap thong tin cong nhan tinh cong nhat.");
        System.out.println("4.Xuat thong tin cong nhan tinh cong nhat.");
        System.out.println("Moi ban nhap lua chon: ");
        luachon=sc.nextInt();
        switch(luachon){
        case 1:
        cn1.nhapThongTin();
        break;
        case 2:
        cn1.inThongTin();
        cn1.tinhLuong();
        break;
        case 3:
        cn2.nhapThongTin();
        break;
        case 4:
        cn2.inThongTin();
        cn2.tinhLuong();
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