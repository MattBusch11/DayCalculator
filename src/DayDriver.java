public class DayDriver {
    /**
     * Test methods from Day class
     * @param args
     */
    public static void main(String [] args) {
        Day day = new Day("Sun");
        System.out.println(day);
        System.out.println(day.nextDay());
        System.out.println(day.prevDay());
        System.out.println(day.calculateDay(-20));
    }
}
