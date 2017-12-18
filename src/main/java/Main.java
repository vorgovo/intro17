public class Main {
    public static void main(String[] args) {
        int[] input = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            try {
                input[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException error) {
                System.out.println(String.format("Infernal error: wrong input: %s.", error.getMessage()));
                return;
            }
        }
        System.out.println(rangeOr(input));
    }
    public static int rangeOr(int[] arg) {
        int ans = 0;
        for (int i = 0; i < arg.length; i++) {
            ans = (ans | arg[i]);
        }
        return ans;
    }
}
