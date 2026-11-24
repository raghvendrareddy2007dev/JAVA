import java.io.*;
class file5
{
    public static void main(String[] args)
    {
        try{
            FileReader fr=new FileReader("notes.txt");
            BufferedReader br=new BufferedReader(fr);
            String s=br.readLine();
            int count=0;
            int linecount=0;
            int charcount=0;
            while(s!=null)
            {
                String[] words=s.split("\\s+");
                count+=words.length;
                linecount++;
                charcount+=s.length();
                s=br.readLine();
            }
            System.out.println("Total words: "+count);
            System.out.println("Total lines: "+linecount);
            System.out.println("Total characters: "+charcount);
            br.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
        
    
