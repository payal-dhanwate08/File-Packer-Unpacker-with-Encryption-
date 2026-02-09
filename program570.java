import java.io.*;
import java.util.*;

class program570s
{
    public static void main(String A[]) throws Exception
    {
        boolean bRet = false;
        String FileName = null;
        
       
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file :");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists())
        {
            FileOutputStream foobj = new FileOutputStream(fobj);
            String str = "Jay Ganesh...";

            byte Arr[] = str.getBytes();
            System.out.println("length of Arr is :"+Arr.length);
            foobj.write(Arr);      
        }
        else
        {
            System.out.println("there is no such file");
        }

    
        sobj.close();
    }
}
