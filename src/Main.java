public class Main {
    public static void main(String args[]) {

    Test test1 = new Test(49.013799, 49.014485, 8.419293, 8.419349);
    Test test2 = new Test(49.014485, 49.013799, 8.419349, 8.419293);
    System.out.println("X Wert: " + test1.measureX() + "\n" + "Y Wert: " + test1.measureY()
    + "\n" + "Gesamtabstand: " + Math.sqrt((test1.measureX() * test1.measureX()) + (test1.measureY()* test1.measureY())));
    System.out.println("X Wert: " + test2.measureX() + "\n" + "Y Wert: " + test2.measureY()
            + "\n" + "Gesamtabstand: " + Math.sqrt((test2.measureX() * test2.measureX()) + (test2.measureY()* test2.measureY())));
    }
}
