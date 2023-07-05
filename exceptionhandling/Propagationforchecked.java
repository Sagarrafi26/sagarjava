package exceptionhandling;

import java.io.IOException;

public class Propagationforchecked {
    public void m1() throws IOException{
        throw new IOException("Device not ready");
    }
    public void m2() throws IOException{
        m1();

    }
    public void m3(){
        try{
            m2();
        }catch(IOException e){
            System.out.println(e);
        }
    }
    public static void main(String[]args){
        Propagationforchecked c=new Propagationforchecked();
        c.m3();
    }
}
