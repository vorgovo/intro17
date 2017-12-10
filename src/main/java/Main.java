public class Main {
  public static int my_or (int[] arg) {
    ans = 0;
    for (int i = 0; i < arg.length; i++) {
      ans = (ans | arg[i]);
    }
    return ans;
  }
}
