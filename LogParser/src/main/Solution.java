package main;

import java.nio.file.Paths;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
    	//C:\Users\Viachaslau_Amelin\workspace\LogParser\src\logs\example.log
    	//d:/logs/
        LogParser logParser = new LogParser(Paths.get("C:\\Users\\Viachaslau_Amelin\\workspace\\LogParser\\src\\logs\\"));
        System.out.println(logParser.getIPsForEvent(Event.SOLVE_TASK, null, new Date()));
    }
}