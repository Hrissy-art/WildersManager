public class Classroom {
    public static void main(String[] args) {
        Wilder student = new Wilder("Murielle", true);
        Wilder student2 = new Wilder("Christina", false);

        System.out.println(student.whoAmI());
        System.out.println(student2.whoAmI());
    }
}