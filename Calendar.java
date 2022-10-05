public class Calendar {
    public static void main(String[] args) {
        Model model = new Model();
        ViewOut viewOut = new ViewOut();
        Controller con = new Controller();

        con.control(model, viewOut);
    }
}
