public class Day {
    private String day;
    private String [] days = {"Mon", "Tues", "Wed", "Thurs", "Fri", "Sat", "Sun"};

    /**
     * Constructor with param
     * @param day
     */
    public Day(String day) {
        super();
        this.day = day;
    }

    /**
     * Constructor without param
     */
    public Day() {
        this.day = "Mon";
    }

    /**
     * Get the day
     * @return
     */
    public String getDay() {
        return day;
    }

    /**
     * Set the day
     * @param day
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * Calculate day after adding number of days
     * @param numOfDays
     * @return
     */
    public String calculateDay(int numOfDays) {
        String message = "";
        int dayIndex = getDayIndex(this.day);
        if (dayIndex != -1) {
            message = days[Math.abs(dayIndex + (numOfDays % 7)) % 7];
        } else {
            message = "Invalid Day!";
        }
        return message;
    }

    /**
     * Find previous day
     * @return
     */
    public String prevDay() {
        String message = "";
        int dayIndex = getDayIndex(this.day);
        if (dayIndex != -1) {
            message = days[Math.abs((dayIndex - 1)+7) % 7];
        } else {
            message = "Invalid Day!";
        }
        return message;
    }

    /**
     * Find next day
     * @return
     */
    public String nextDay() {
        String message = "";
        int dayIndex = getDayIndex(this.day);
        if (dayIndex!=-1) {
            message = days[(dayIndex+1)%7];
        } else {
            message = "Invalid Day!";
        }
        return message;
    }

    /**
     * Match Days to index of numbers 0-6
     * @param day
     * @return
     */
    private int getDayIndex(String day) {
        for(int i=0; i<days.length; i++) {
            if (days[i] == this.day) {
                return i;
            }
        }
        return -1;
    }

    /**
     * String output
     * @return
     */
    @Override
   public String toString() {
        return "Day [day=" + day + "]";
    }


}
