public class Cash implements IPay{
    private Double amount;

    public Cash(Double amount) {
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;
    }

    public String pay(){
        return "Cash payment completed";
    }
}
