package acceptance;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class AcceptanceCriteria {
    
    @Test public void
    account_should_be_able_to_print_out_a_bank_statement_with_the_transactions_in_reverse_chronological_order() {
        clock.setToday("01/04/2014");
        account.deposit(1000);

        clock.setToday("02/04/2014");
        account.withdraw(100);

        clock.setToday("01/05/2014");
        account.deposit(500);
        
        account.printStatement();
        
        verify(printer).printLine("DATE | AMOUNT | BALANCE");
        verify(printer).printLine("01/05/2014 | 500 | 1400");
        verify(printer).printLine("02/04/2014 | -100 | 900");
        verify(printer).printLine("01/04/2014 | 1000 | 1000");

    }
}
