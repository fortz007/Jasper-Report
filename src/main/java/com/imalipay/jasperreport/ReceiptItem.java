package com.imalipay.jasperreport;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReceiptItem {
    private String itemName;
    private Integer quantity;
    private Double unitPrice;
    private Double itemTotal;
}
