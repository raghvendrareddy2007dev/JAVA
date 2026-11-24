import java.io.*;
class file6
{
    public static void main(String[] args)
    {
        try{
            FileReader fr=new FileReader("notes.txt");
            FileWriter fw=new FileWriter("notes1.txt");
            BufferedReader br=new BufferedReader(fr);
            BufferedWriter bw=new BufferedWriter(fw);
            String s=br.readLine();
            while(s!=null)  
            {
                bw.write(s);
                bw.newLine();
                s=br.readLine();
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}