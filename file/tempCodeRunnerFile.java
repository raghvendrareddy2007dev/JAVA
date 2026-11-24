import java.io.*;
class file6
{
    public static void main(String[] args)
    {
        try{
            File fr=new File("notes.txt");
            if(fr.exists())
            {
                System.out.println("File exists");
            }
            else
            {
                System.out.println("File does not exist");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}