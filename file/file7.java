import java.io.*;
class file7
{
    public static void main(String[] args)
    {
        try{
            File fr=new File("not.txt");
            if(fr.exists())
            {
                System.out.println("File exists");
            }
            else
            {
                fr.createNewFile();
                FileWriter fw=new FileWriter(fr);
                fw.write("Welcome to java\n");
                fw.close();
                System.out.println("File created successfully");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}