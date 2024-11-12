import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SnackAutomatTest {

    @Test
    void køb() {
        ///arrange
        int pris = 10;
        int betalt = 5;
        int expected = 5;
        SnackAutomat snackAutomat = new SnackAutomat();
        //act
        int actual = snackAutomat.køb(pris, betalt);

        //assert
        assertEquals(expected,actual);

    }
}