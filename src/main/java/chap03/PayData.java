package chap03;

import java.time.LocalDate;

public class PayData {

    LocalDate firstBillingDate;
    LocalDate billingDate;
    int paymentAmount;

    public LocalDate getFirstBillingDate() {
        return firstBillingDate;
    }

    public LocalDate getBillingDate() {
        return billingDate;
    }

    public int getPaymentAmount() {
        return paymentAmount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private PayData data = new PayData();

        public Builder firstBillingDate(LocalDate firstBillingDate) {
            data.firstBillingDate = firstBillingDate;
            return this;
        }

        public Builder billingDate(LocalDate billingDate) {
            data.billingDate = billingDate;
            return this;
        }

        public Builder paymentAmount(int paymentAmount) {
            data.paymentAmount = paymentAmount;
            return this;
        }

        public PayData build() {
            return data;
        }
    }
}
