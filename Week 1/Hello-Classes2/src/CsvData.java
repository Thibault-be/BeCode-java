public class CsvData {
    private String reference;
    private String period;
    private double value;
    private String status;
    private String currency;
    private int magnitude;
    private String group;
    private String type;
    private String industry;

    public CsvData(
            String reference,
            String period,
            double value,
            String status,
            String currency,
            int magnitude,
            String group,
            String type,
            String industry
    ) {
        this.reference = reference;
        this.period = period;
        this.value = value;
        this.status = status;
        this.currency = currency;
        this.magnitude = magnitude;
        this.group = group;
        this.type = type;
        this.industry = industry;
    }

    public String getReference() {
        return this.reference;
    }

    public int getYear() {
        String[] period = this.period.split("\\.");
        return Integer.parseInt(period[0]);
    }

    public int getMonth() {
        String[] period = this.period.split("\\.");
        return Integer.parseInt(period[1]);
    }

    public double getValue() {
        return this.value;
    }

    public String getStatus() {
        return this.status;
    }

    public String getIndustry() {
        return this.industry;
    }

    public String type() {
        return this.type;
    }
}