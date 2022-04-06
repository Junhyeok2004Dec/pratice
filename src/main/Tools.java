package main;

import java.lang.management.OperatingSystemMXBean;

public class Tools {

    public static void ClearConsole() {


        try{

            String  osCheck = System.getProperty("os.name");

            if (osCheck.contains("Windows")) {
                ProcessBuilder builder = new ProcessBuilder("cmd" , "/c", "cls");
                Process processStart = builder.inheritIO().start();

                processStart.waitFor();



            } else {

                ProcessBuilder builder = new ProcessBuilder("clear"); // clear command to clear cli
                Process processStart = builder.inheritIO().start();


                processStart.waitFor();
            }

        } catch (Exception e) {
            System.out.println(e);

        }

    }
    public static float time = System.nanoTime();

    public static float getTime() {
        return (float) ((System.nanoTime() - time) * 1E-9);
        // 초 변환
    }
}
