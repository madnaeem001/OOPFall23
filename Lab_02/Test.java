package Lab_02;

public class Test {

    public static void main(String[] args) {

        Product p1 = new Product("LCD", 4300, 32, new Date(15, 9, 2023));
        Product p2 = new Product("Mouse", 1500, 232, new Date(12, 3, 2022));

        System.out.println(p1);
        System.out.println(p2);

        System.out.println("Latest Product\n" + p1.isLatest(p1, p2));
    }
}
