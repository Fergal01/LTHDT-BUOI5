/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi5;

/**
 *
 * @author vanti
 */
public class PhongMayTinh extends PhongHoc{
    private int soMaytinh;

    public PhongMayTinh(int soMaytinh, String maPhong, String dayNha, double dienTich, int soBongDen) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.soMaytinh = soMaytinh;
    }

   

    

    public int getSoMaytinh() {
        return soMaytinh;
    }

    public void setSoMaytinh(int soMaytinh) {
        this.soMaytinh = soMaytinh;
    }

    

    @Override
    public String toString() {
        return "PhongMayTinh{" + "soMaytinh=" + soMaytinh + '}';
    }

    double getSoMayTinh() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setSoMayTinh(int soMayTinh) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
