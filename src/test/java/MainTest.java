import org.junit.Assert;
import org.junit.Test;

public class MainTest {
  @Test
  public void test1_empty() {
    int[] arr = {};
    Assert.assertEquals(0, (new Main()).rangeOr(arr));
  }
  public void test2_oneNumber() {
    int[] arr = {1};
    Assert.assertEquals(1, (new Main()).rangeOr(arr));
  }
  public void test3_allBitIsOne() {
    int[] arr = {-2, 1};
    Assert.assertEquals(-1, (new Main()).rangeOr(arr));
  }
  public void test4_or() {
    int [] arr = {1, 3};
    Assert.assertEquals(3, (new Main()).rangeOr(arr));
  }
  public void testEmptyInput() {
    string[] arr = {};
    Assert.assertEquals(0, (new Main()).consoleOr(arr));
  }
  public void testNoIntegerInput_1 {
    string[] arr = {"1", "2", "a"};
    Assert.assertEquals("Cannot parse string at position 2", (new Main()).consoleOr(arr));
  }
  public void testNoIntegerInput_2 {
    string[] arr = {"1", "2", "1a"};
    Assert.assertEquals("Cannot parse string at position 2", (new Main()).consoleOr(arr));
  }
  public void testConsoleInput {
    string[] arr = {"1", "2", "1"};
    Assert.assertEquals("3", (new Main()).consoleOr(arr));
  }
}
