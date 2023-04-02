import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CharacterCount {
   public static void main(String[] args) {
      String fileName = "D:\\HeroVired.txt";
      int charCount = 0;

      try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
         String line;
         while ((line = br.readLine()) != null) {
            charCount += line.length();
         }
         System.out.println("Total number of characters in file are: " + charCount);
      } catch (IOException e) {
         System.out.println("An error occurred while reading the file.");
         e.printStackTrace();
      }
   }
}
