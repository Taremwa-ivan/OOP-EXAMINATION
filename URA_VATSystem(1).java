class TaxCategory {
    public double calculateVAT(double amount) {
        return amount * 0.18; // Default VAT
    }
}

class Retailer extends TaxCategory {
    @Override
    public double calculateVAT(double amount) {
        return amount * 0.18;
    }
}

class Wholesaler extends TaxCategory {
    @Override
    public double calculateVAT(double amount) {
        return amount * 0.15;
    }
}

class Importer extends TaxCategory {
    @Override
    public double calculateVAT(double amount) {
        return amount * 0.10;
    }
}

public class URA_VATSystem {
    public static void main(String[] args) {
        TaxCategory[] categories = {
            new Retailer(),
            new Wholesaler(),
            new Importer()
        };

        double[] amounts = {100000, 200000, 300000};

        for (int i = 0; i < categories.length; i++) {
            double vat = categories[i].calculateVAT(amounts[i]);
            System.out.println("Transaction Amount: " + amounts[i]);
            System.out.println("VAT Calculated: " + vat);
            System.out.println("-------------------------");
        }
    }
}
