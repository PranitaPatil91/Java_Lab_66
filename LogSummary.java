import java.io.*;

public class LogSummary {
    public static void main(String[] args) {
        int info = 0, warn = 0, error = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("app.log"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("INFO")) info++;
                else if (line.startsWith("WARN")) warn++;
                else if (line.startsWith("ERROR")) error++;
            }
        } catch (Exception e) { System.out.println(e); }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("log_summary.txt"))) {
            bw.write("Log File Summary Report\n-----------------------\n");
            bw.write("INFO messages: " + info + "\n");
            bw.write("WARN messages: " + warn + "\n");
            bw.write("ERROR messages: " + error + "\n");
            System.out.println("Summary created successfully!");
        } catch (Exception e) { System.out.println(e); }
    }
}
