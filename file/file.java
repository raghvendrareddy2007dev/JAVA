import java.io.*;
class file
{
    public static void main(String[] args)
    {
        try
        {
            File f=new File("notes.txt");
            System.out.println(f.createNewFile());
            System.out.println(f.exists());
            System.out.println(f.getName());
            System.out.println(f.length());
            System.out.println(f.delete());
            System.out.println(f.exists());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}