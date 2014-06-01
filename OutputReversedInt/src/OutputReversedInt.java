
class OutputReversedInt {
    public static void main(String[] args) {
        int x = 658713894;
        while (x > 10) {
            System.out.print(x % 10);
            x = x / 10;
        }
        System.out.print(x);
    }
}
