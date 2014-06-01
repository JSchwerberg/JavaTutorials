
class Triangle {
    public static void main(String[] args) {
        int stars = 1;
        for (int i = 0; i < 10; i++) {
            int spaces = 20 - i;
            for (int blank = 0; blank < spaces; blank++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            stars = stars + 2;
            System.out.print("\n");
        }
    }
}
