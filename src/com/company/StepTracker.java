package com.company;

public class StepTracker {
    int day;
    int activeDay;
    double steps;
    int goal;

    public StepTracker(int num)
    {
        goal = num;
    }

    public void addDailySteps(int num)
    {
        if(num >= goal)
            activeDay++;
        day++;
        steps = steps + num;
    }

    public int activeDays()
    {
        return activeDay;
    }

    public double averageSteps()
    {
        if (day != 0)
            return steps/day;
        return 0.0;
    }
}
