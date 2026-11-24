import java.io.*;           
class file8
{
    public static void main(String[] args)
    {
        try{
        FileReader fr=new FileReader("input.txt");
        BufferedReader br=new BufferedReader(fr);
        String s=br.readLine();
        FileWriter fw=new FileWriter("output.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        while(s!=null && !s.trim().isEmpty())
        {
            bw.write(s.toUpperCase());
            bw.newLine();
            s=br.readLine();
        }
        bw.close();
        br.close();
    }
    catch(Exception e)
        {
            System.out.println(e);
        }
    }

}