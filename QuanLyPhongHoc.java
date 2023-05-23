/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi5;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author vanti
 */
public class QuanLyPhongHoc {
    private List<PhongHoc> danhSachPhongHoc;
    public QuanLyPhongHoc(){
        
    }
    public void themPhongHoc(PhongHoc phongHoc){
        if(!timPhongHoc(phongHoc.getMaPhong())){
            System.out.println("Ma Phong Da TOn Tai.");
        }else{
            danhSachPhongHoc.add(phongHoc);
            System.out.println("Them Thanh COng!");
        }
    }
    public boolean timPhongHoc(){
        System.out.println("Phong Hoc Dat Chuan");
        for(PhongHoc phongHoc : danhSachPhongHoc){
          return true;
        }
        return false;
        
    }
    public void inDanhSachPhongHoc(){
        System.out.println("Danh Sach Phong Hoc: ");
        for(PhongHoc phongHoc : danhSachPhongHoc){
            System.out.println(phongHoc.toString());
        }
    }
    public void inDanhSachPhongHocDatChuan() {
        System.out.println("Danh sách các phòng học đạt chuẩn:");
        for (PhongHoc phongHoc : danhSachPhongHoc) {
            if (phongHoc instanceof PhongLyThuyet) {
                PhongLyThuyet phongLyThuyet = (PhongLyThuyet) phongHoc;
                if (phongLyThuyet.getCoMayChieu()) {
                    System.out.println(phongLyThuyet.toString());
                }
            } else if (phongHoc instanceof PhongMayTinh) {
                PhongMayTinh phongMayTinh = (PhongMayTinh) phongHoc;
                if (phongMayTinh.getDienTich() / phongMayTinh.getSoMayTinh() >= 1.5) {
                    System.out.println(phongMayTinh.toString());
                }
            } else if (phongHoc instanceof PhongThiNghiem) {
                PhongThiNghiem phongThiNghiem = (PhongThiNghiem) phongHoc;
                if (phongThiNghiem.getCoBonRua()) {
                    System.out.println(phongThiNghiem.toString());
                }
            }
        }
    }
   public void sapXepTheoDayNha() {
        Collections.sort(danhSachPhongHoc, Comparator.comparing(PhongHoc::getDayNha));
        System.out.println("Danh sách phòng học đã được sắp xếp tăng dần theo dãy nhà:");
        for (PhongHoc phongHoc : danhSachPhongHoc) {
            System.out.println(phongHoc.toString());
        }
    }

    public void sapXepTheoDienTich() {
        Collections.sort(danhSachPhongHoc, Comparator.comparingDouble(PhongHoc::getDienTich));
        System.out.println("Danh sách phòng học đã được sắp xếp tăng dần theo diện tích:");
        for (PhongHoc phongHoc : danhSachPhongHoc) {
            System.out.println(phongHoc.toString());
        }
    }

    public void sapXepTheoSoBongDen() {
        Collections.sort(danhSachPhongHoc, Comparator.comparingInt(PhongHoc::getSoBongDen));
        System.out.println("Danh sách phòng học đã được sắp xếp tăng dần theo số bóng đèn:");
        for (PhongHoc phongHoc : danhSachPhongHoc) {
            System.out.println(phongHoc.toString());
        }
    }

    public void capNhatSoMayTinh(String maPhong, int soMayTinh) {
        for (PhongHoc phongHoc : danhSachPhongHoc) {
            if (phongHoc instanceof PhongMayTinh && phongHoc.getMaPhong().equals(maPhong)) {
                PhongMayTinh phongMayTinh = (PhongMayTinh) phongHoc;
                phongMayTinh.setSoMayTinh(soMayTinh);
                System.out.println("Cập nhật số máy tính thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy phòng học có mã phòng " + maPhong + ".");
    }

    public void xoaPhongHoc(String maPhong) {
        for (PhongHoc phongHoc : danhSachPhongHoc) {
            if (phongHoc.getMaPhong().equals(maPhong)) {
                danhSachPhongHoc.remove(phongHoc);
                System.out.println("Xóa phòng học thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy phòng học có mã phòng " + maPhong + ".");
    }

    public int tongSoPhongHoc() {
        return danhSachPhongHoc.size();
    }

    public void inDanhSachPhongMayTinh60May() {
        System.out.println("Danh sách các phòng máy tính có 60 máy:");
        for (PhongHoc phongHoc : danhSachPhongHoc) {
            if (phongHoc instanceof PhongMayTinh) {
                PhongMayTinh phongMayTinh = (PhongMayTinh) phongHoc;
                if (phongMayTinh.getSoMayTinh() == 60) {
                    System.out.println(phongMayTinh.toString());
                }
            }
        }
    }

    private boolean timPhongHoc(String maPhong) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    boolean timPhongHoc(String maPhongTimKiem) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
}
