package com.cybersoft.PhanTichJson.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
public class ProductDetailDTO {
    private String id;
    private String tenSanPham;
    private double danhGia;
    private long giaBan;
    private long giaGoc;
    private List<String> danhSachAnh;
    private List<Map<String, Object>> danhSachPhienBan;
    private List<String> khuyenMai;
    private String chinhSachBaoHanh;
    private List<String> diaChiCuaHang;
}
