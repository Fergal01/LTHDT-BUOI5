/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi5;

/**
 *
 * @author vanti
 */
public class PhongLyThuyet extends PhongHoc{
    private boolean coMayChieu;

    public PhongLyThuyet(boolean coMayChieu, String maPhong, String dayNha, double dienTich, int soBongDen) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.coMayChieu = coMayChieu;
    }

   
    public boolean getCoMayChieu() {
        return coMayChieu;
    }


    @Override
    public String toString() {
        return "PhongLyThuyet{" + "coMayChieu=" + coMayChieu + '}';
    }
    
}
