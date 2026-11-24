import java.io.*;
class file9
{
    public static void main(String[] args)
    {
        try{
            FileReader fr=new FileReader("notes.txt");
            BufferedReader br=new BufferedReader(fr);
            String s=br.readLine();
            int count=0;
            int line=0;
            while(s!=null)
            {
                line++;
                if(s.contains("Java")&& s.toLowerCase().contains("java"))
                { 
                    count++;
                    System.out.println("Line " + line + ": " + count);
                }
                s=br.readLine();
            }
            System.out.println("Total lines containing 'Java': "+ count );
            br.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}