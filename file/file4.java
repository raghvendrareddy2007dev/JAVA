import java.io.*;
class file4
{
    public static void main(String[] args)
    {
        try{
            FileWriter  f= new FileWriter("employee.txt");
            BufferedWriter bw=new BufferedWriter(f);
            bw.write("EmpName:Ravi\n");
            bw.write("EmpId:123\n");
            bw.write("EmpSalary:10000\n");
            bw.close();
            System.out.println("File created successfully");
            

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}