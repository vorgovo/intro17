import org.junit.Assert;
import org.junit.Test;

public class MainTest {
  @Test
  public void test1_empty() {
    int[] arr = {};
    Assert.assertEquals(0, (new Main()).myOr(arr));
  }
}
