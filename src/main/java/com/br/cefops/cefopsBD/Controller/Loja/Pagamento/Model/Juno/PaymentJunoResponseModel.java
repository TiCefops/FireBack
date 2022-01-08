package com.br.cefops.cefopsBD.Controller.Loja.Pagamento.Model.Juno;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentJunoResponseModel {
    private Embedded embedded;
    private Link[] links;


// Embedded.java
@Getter
@Setter
public class Embedded {
    private Charge[] charges;
}

// Charge.java

    @Getter
    @Setter
public class Charge {
    private String id;
    private long code;
    private String reference;
    private String dueDate;
    private String link;
    private String checkoutURL;
    private String installmentLink;
    private String payNumber;
    private long amount;
    private String status;
    private BilletDetails billetDetails;
    private Payment[] payments;
    private Pix pix;
    private Link[] links;
}

// BilletDetails.java


    @Getter
    @Setter
public class BilletDetails {
    private String bankAccount;
    private String ourNumber;
    private String barcodeNumber;
    private String portfolio;
}

// Link.java


    @Getter
    @Setter
public class Link {
    private Self self;
}

// Self.java


    @Getter
    @Setter
public class Self {
    private String href;
}

// Payment.java


    @Getter
    @Setter
public class Payment {
    private String id;
    private String chargeID;
    private String date;
    private String releaseDate;
    private long amount;
    private long fee;
    private String type;
    private String status;
    private String transactionID;
    private String failReason;
}

// Pix.java

    @Getter
    @Setter
public class Pix {
    private String id;
    private String payloadInBase64;
    private String imageInBase64;
}

}
