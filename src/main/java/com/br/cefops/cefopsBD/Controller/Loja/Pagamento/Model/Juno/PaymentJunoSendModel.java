package com.br.cefops.cefopsBD.Controller.Loja.Pagamento.Model.Juno;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentJunoSendModel {
    private Charge charge;
    private Billing billing;


// Billing.java
@Getter
@Setter
    public class Billing {
        private String name;
        private String document;
        private String email;
        private Address address;
        private String secondaryEmail;
        private String phone;
        private String birthDate;
        private boolean notify;
    }

// Address.java

    @Getter
    @Setter
    public class Address {
        private String street;
        private String number;
        private String complement;
        private String neighborhood;
        private String city;
        private String state;
        private String postCode;
    }

// Charge.java

    @Getter
    @Setter
    public class Charge {
        private String pixKey;
        private boolean pixIncludeImage;
        private String description;
        private String[] references;
        private double totalAmount;
        private double amount;
        private String dueDate;
        private long installments;
        private long maxOverdueDays;
        private long fine;
        private String interest;
        private String discountAmount;
        private long discountDays;
        private String[] paymentTypes;
        private boolean paymentAdvance;
        private String feeSchemaToken;
        private Split[] split;
    }

// Split.java

    @Getter
    @Setter
    public class Split {
        private String recipientToken;
        private long amount;
        private long percentage;
        private boolean amountRemainder;
        private boolean chargeFee;
    }
}
