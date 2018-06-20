import java.io.*;
 
 class Abc{
public static void main(String[] args) throws IOException
{
int c;
File f=new File("C:/java/abc.txt");
FileInputStream fis=new FileInputStream(f);

while((c=fis.read())!=-1){
System.out.print((char)c);
}
}

}