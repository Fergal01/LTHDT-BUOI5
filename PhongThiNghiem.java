/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi5;

/**
 *
 * @author vanti
 */
public class PhongThiNghiem extends PhongHoc{
    private String chuyenNghanh;
    private int sucChua;
    private boolean coBonRua;

    public PhongThiNghiem(String chuyenNghanh, int sucChua, boolean coBonRua, String maPhong, String dayNha, double dienTich, int soBongDen) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.chuyenNghanh = chuyenNghanh;
        this.sucChua = sucChua;
        this.coBonRua = coBonRua;
    }

   

    public String getChuyenNghanh() {
        return chuyenNghanh;
    }

    public int getSucChua() {
        return sucChua;
    }

    public boolean isCoBonRua() {
        return coBonRua;
    }

    @Override
    public String toString() {
        return "PhongThiNghiem{" + "chuyenNghanh=" + chuyenNghanh + ", sucChua=" + sucChua + ", coBonRua=" + coBonRua + '}';
    }

    boolean getCoBonRua() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
