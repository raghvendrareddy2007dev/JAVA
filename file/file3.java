import java.io
.*;
class file3
{
    public static void main(String[] args)
    {
        try
        {
            FileReader f=new FileReader("marks.txt");
            int ch;
            while((ch=f.read())!=-1)
            {
                System.out.print((char)ch);
        }
        f.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}