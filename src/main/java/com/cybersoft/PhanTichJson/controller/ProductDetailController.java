package com.cybersoft.PhanTichJson.controller;

import com.cybersoft.PhanTichJson.dto.ProductDetailDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product-detail")
public class ProductDetailController {
    @Autowired
    private ProductDetailDTO chiTietSanPham;

    // Bai 2
    @GetMapping("/Pova6")
    public ResponseEntity<ProductDetailDTO> layChiTietSanPham()
    {
        return ResponseEntity.ok(chiTietSanPham);
    }
    /*
    {
  "maSanPham": "tecno-pova-6",
  "tenSanPham": "Điện thoại TECNO Pova 6 - RAM 8+8GB - 256GB",
  "danhGia": 5.0,
  "giaBan": 5250000,
  "giaGoc": 5490000,
  "danhSachHinhAnh": [
    "https://example.com/images/tecno-pova-6-main.jpg",
    "https://example.com/images/tecno-pova-6-green.jpg",
    "https://example.com/images/tecno-pova-6-gray.jpg",
    "https://example.com/images/tecno-pova-6-blue.jpg"
  ],
  "danhSachPhienBan": [
    {
      "tenMau": "Gray",
      "gia": 5250000,
      "hinhAnh": "https://example.com/images/gray.jpg"
    },
    {
      "tenMau": "Blue",
      "gia": 5250000,
      "hinhAnh": "https://example.com/images/blue.jpg"
    },
    {
      "tenMau": "Green",
      "gia": 5250000,
      "hinhAnh": "https://example.com/images/green.jpg"
    }
  ],
  "thongTinLienHe": {
    "hotline": "0246 681 9779",
    "thoiGianLamViec": "08h30 - 22h30"
  },
  "chinhSachBaoHanh": "Bảo hành 12 tháng chính hãng.",
  "danhSachKhuyenMai": [
    "Hỗ trợ chuyển đổi Esim ngay tại shop.",
    "Ưu đãi tới 1.050.000Đ cho Khách hàng thân thiết của ONEWAY (xem chi tiết)",
    "Thu cũ đổi mới trợ giá 2.500.000Đ (xem chi tiết)",
    "Hỗ trợ Trả góp 0% qua Thẻ Tín Dụng (xem chi tiết)"
  ],
  "danhSachShowroom": [
    {
      "khuVuc": "Hà Nội",
      "diaChi": "199 Quang Trung - P.Quang Trung - Q.Hà Đông - TP.Hà Nội"
    },
    {
      "khuVuc": "Hà Nội",
      "diaChi": "117 Xã Đàn - P.Phương Liên - Q.Đống Đa - TP.Hà Nội"
    }
                      ]
}
     */
}
