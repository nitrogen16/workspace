package whySetDoesNotContainelement;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/* 
Почему сет не содержит элемент?
*/
public class Solution {
    private Set<Date> dates;
    private Date lastDate;

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.initializeDates();
        solution.updateLastDate(3_600_000L);
        System.out.println("///////////////////////////////////");
        System.out.println(solution.isLastDateContainsInDates());
        
        /*for(Date item : dates){
        	System.out.println(item);
        }*/
        
    }

    public boolean isLastDateContainsInDates() {
        return dates.contains(lastDate);
    }

    private void initializeDates() {
        dates = new HashSet<>();
        lastDate = new Date(9999999L);
        dates.add(lastDate);
        dates.add(new Date(2222222L));
        dates.add(new Date(3333333L));
        dates.add(new Date(4444444L));
        dates.add(new Date(5555555L));
        dates.add(new Date(5555555L));
    }

    protected void updateLastDate(long delta) {
    		dates.remove(lastDate);
    		lastDate.setTime(lastDate.getTime() + delta);
    		dates.add(lastDate);
        System.out.println(lastDate);
    }
}