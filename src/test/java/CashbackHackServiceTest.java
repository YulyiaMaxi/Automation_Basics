import org.junit.Test;
import org.junit.Assert;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {
        CashbackHackService service = new CashbackHackService();
        @Test
        public void shouldReturn0IfAmountLessThan1000() {
            int actual = service.remain(900);
            int expected = 100;
            Assert.assertEquals(expected, actual);
        }
        @Test
        public void shouldReturn0IfAmount1000() {
            int actual = service.remain(1000);
            int expected = 0;
            Assert.assertEquals(expected, actual);
        }
        @Test
        public void shouldReturn0IfAmount0() {
            int actual = service.remain(0);
            int expected = 1000;
            Assert.assertEquals(expected, actual);
        }
    }


