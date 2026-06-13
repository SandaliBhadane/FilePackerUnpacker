import java.io.*;
import java.util.*;
public class program569
{
  public static void main(String A[]) throws Exception
  {
    boolean bRet = false;
    String FileName = null;
    

    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter the name of File :");
    FileName = sobj.nextLine();

    File fobj = new File(FileName);

    if(fobj.exists())
    {
       FileOutputStream foobj = new FileOutputStream(fobj);
       String str =" JAY GANESH...";
       
       foobj.write(str);       //Error
    }
    else 
    {
      System.out.println("There is no such file. ");
    }
   
    sobj.close();
   
  }
}
