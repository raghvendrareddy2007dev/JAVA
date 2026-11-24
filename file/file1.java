import java.io.*;
class file1
{
    public static void main(String[] args)
    {
        try
        {
            FileWriter fw=new FileWriter("Student.txt");
            fw.write("Name:One who wins the game of unfairness\n");
            fw.close();
            System.out.println("File created successfully");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}