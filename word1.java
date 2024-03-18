import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
class word1
{
  public static void main(String[] args) {

    System.out.println("Welcome to the WORD COUNTER GAME game");
    System.out.println("Enter Text or Filename");
    Scanner scan =new Scanner(System.in);
    String d= scan.nextLine();
    String store;
    if(d.endsWith("txt"))
    {
      store=word1.ReadFile(d);
    }
    else{
      store=d;
    }

    String[] x = store.split("[\\s\\p{Punct}]+");
    int c= x.length;
    System.out.println("Total number of words are = "+c);


  }

   public static String  ReadFile(String filepath)
   {
    StringBuilder co = new StringBuilder();

        try
         {
            File file = new File(filepath);
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String l;

            while ((l = reader.readLine()) != null) {
                co.append(l).append("\n");
            }

            reader.close();
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        return co.toString();

  }
}