import java.io.*;
class ja
{
    public static void main(String[] args)throws Exception
    {
        File f=new File("notes.txt");
        FileReader fr=new FileReader(f);
        BufferedReader br=new BufferedReader(fr);
        String s=br.readLine();
        int line=0;
        int word=0;
        int cha=0;
        while(s!=null)
        {
            line++;
            String[] words=s.split(" ");
            word+=words.length;
            cha+=s.length();
            s=br.readLine();    
        }
        System.out.println(line);
        System.out.println(word);
        System.out.println(cha);
        fr.close();
    }
}