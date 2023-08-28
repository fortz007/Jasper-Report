package com.imalipay.jasperreport;

import lombok.*;
import java.sql.Time;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReceiptData {
    private String recipientName;
    private String receiptNumber;
    private LocalDate receiptDate;
    private Time receiptTime;
    private String phoneNumber;
    private String description;
    private List<ReceiptItem> items; // List of receipt items
    private Double total;
    private Double amountPaid;
    private Double outstandingBalance;
}

