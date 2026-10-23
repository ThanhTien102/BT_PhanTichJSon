package com.cybersoft.PhanTichJson.controller;

import com.cybersoft.PhanTichJson.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private List<ProductDTO> productDTOList;
    // API bai 1
    @GetMapping("/cameras")
    public ResponseEntity<List<ProductDTO>> layDanhSachCamera()
    {
        return ResponseEntity.ok(productDTOList);
    }

}
/* JSON
[
{
    "id": 1,
    "thuongHieu": "imou",
    "tenSanPham": "Camera IP 360 Độ 3MP IMOU TA32CP-L",
    "hinhAnh": "https://example.com/imou-ta32cp-l.png",
    "giaBan": 470000,
    "giaGoc": 650000,
    "phanTramGiam": 27,
    "danhGia": 4.9,
    "soLuongDaBan": "142,9k",
    "tinhNangNoiBat": [
      "Độ phân giải 3MP (1296p)",
      "Còi báo động",
      "Phát hiện chuyển động"
    ]
  },
  {
  ...
  }
]
 */
