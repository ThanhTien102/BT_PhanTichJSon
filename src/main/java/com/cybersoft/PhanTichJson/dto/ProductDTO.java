package com.cybersoft.PhanTichJson.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ProductDTO {
    private int id;
    private String thuongHieu;
    private String tenSanPham;
    private String hinhAnh;
    private long giaBan;
    private long giaGoc;
    private int phanTramGiam;
    private double danhGia;
    private String soLuongDaBan;
    private List<String> tinhNangNoiBat;
}
