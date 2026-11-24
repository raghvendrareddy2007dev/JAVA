import java.io.*;
class file2
{
    //pyarrow
    public static void main(String[] args)
    {
        try
        {
            FileWriter fw=new FileWriter("marks.txt",true);
            fw.write("Maths:85\n");
            fw.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        try
        {
            FileWriter fw=new FileWriter("marks.txt",true);
            fw.write("Science:90\n");
            fw.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}