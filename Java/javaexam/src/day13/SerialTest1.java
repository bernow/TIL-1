﻿package day13;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
public class SerialTest1 {
   public static void main(String[] args) throws Exception{ 
      FileOutputStream fos = 
    		          new FileOutputStream("c:/iotest/test1.ser"); // 확장자가 정해진 것은 아님
      ObjectOutputStream oos = 
    		          new ObjectOutputStream(fos);
      oos.writeObject(new Date());
      Thread.sleep(3000);
      oos.writeObject(new Date());      
      oos.close();
      fos.close();
      System.out.println("직렬화 출력 완료");      
   }
}






