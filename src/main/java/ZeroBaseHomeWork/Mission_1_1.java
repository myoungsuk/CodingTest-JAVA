package ZeroBaseHomeWork;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Mission_1_1 {
    public static void main(String[] args){
        try{
            File file = new File("property.html");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

            writer.write("<!DOCTYPE html>");
            writer.write("<html lang=\"en\">");
            writer.write("<head>");
            writer.write("<meta charset=\"UTF-8\">");
            writer.write("<style>");
            writer.write("table {border-collapse: collapse; width: 100%;}");
            writer.write("th, td {border:solid 1px #000;}");
            writer.write("</style>");
            writer.write("<h1>자바 환경정보</h1>");
            writer.write("</head>");
            writer.write("<body>");
            writer.write("<table>");

            writer.write("<tr>");
            writer.write("<th>키</th>");
            writer.write("<th></th>");
            writer.write("</tr>");

            for(Object k : System.getProperties().keySet()) {
                String key = k.toString();
                String value = System.getProperty(key);

                writer.write("<tr>");
                writer.write("<td>" + key + "</td>");
                writer.write("<td>" + value + "</td>");
                writer.write("</tr>");
            }

            writer.write("</table>");
            writer.write("</body>");
            writer.write("</html>");

            writer.close();

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
