import java.io.*;
 public class Copycharacters 
{
  public static void main(String[] args)
 {
  File infile = new File("input.dat");
  File outfFile = new File("output.dat");
  FileReader ins = null;
  FileWriter outs = null;

  try{
    ins = new FileReader((infile));
    outs = new FileWriter(outfFile);
    int ch;
    while((ch=ins.read())!= -1)
    {
      outs.write(ch);
    }
  }
  
catch(IOException e){
  System.out.println(e);
  System.exit(-1);
}

finally{
  try {
    ins.close();
    outs.close();
  }
  catch(IOException e){}
}
}
}