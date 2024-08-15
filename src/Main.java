public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int loan = 1_000_000;

        int term1 = 1 * 12; // срок в месецах для 1-го года
        int term2 = 2 * 12; // срок в месецах для 2-лет лет
        int term3 = 3 * 12; // срок в месецах для 3-х лет

        double interest = 9.99; // процентаня ставка

        int payment1 = service.calculate(loan, term1, interest); // должно получиться 87_911
        System.out.println("При кредите на 1 год ежемесячный платёж составит: " + payment1);

        int payment2 = service.calculate(loan, term2, interest); // должно получиться 46_140
        System.out.println("При кредите на 2 года ежемесячный платёж составит: " + payment2);

        int payment3 = service.calculate(loan, term3, interest); // должно получиться 32_262
        System.out.println("При кредите на 3 года ежемесячный платёж составит: " + payment3);
    }
}