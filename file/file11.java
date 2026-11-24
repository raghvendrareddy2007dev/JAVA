import java.io.*;
class file11
{
    public static void main(String[] args)
    {
        try{
            File f=new File("file");
            File[] files=f.listFiles();
            if(f!=null)
            {
                for(File file: files)
                {
                    System.out.println(file.getName());
                }
            }
        
}
catch(Exception e)
        {
            System.out.println(e);
        }
    }

}