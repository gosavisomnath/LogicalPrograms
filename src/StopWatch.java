import java.util.Scanner;

public class StopWatch
{
    public long startTimer=0;
    public long stopTimer=0;
    public long elapsed;

    public void start()
    {
        startTimer=System.currentTimeMillis();
        System.out.println("Start Time is: "+startTimer);
    }

    public void stop()
    {
        stopTimer=System.currentTimeMillis();
        System.out.println("Stop Time is: "+stopTimer);
    }

    public long getElapsedTime()
    {
        elapsed=stopTimer-startTimer;
        return elapsed;
    }

    public static void main(String[] args)
    {
        int num;
        StopWatch sw=new StopWatch();
        Scanner sc=new Scanner(System.in);
        System.out.println("Press '1' to Start Time: ");
        num= sc.nextInt();
        sw.start();
        System.out.println("Press '2' to Stop Time: ");
        num=sc.nextInt();
        sw.stop();
        long l=sw.getElapsedTime();
        System.out.println("Total Time Elapsed(in millisec) is:"+l);

    }
}