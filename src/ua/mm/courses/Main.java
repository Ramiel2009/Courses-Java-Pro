package ua.mm.courses;

import java.io.*;

public class Main implements Serializable{
    static int calculatePosition =0;
    static float totalPrice=0;

      public static void main (String []args) throws IOException {
      String [] numbers = ReadFile.getText("D:/InputData.txt"); //path to input file
      float [] numbersInt = new float [numbers.length];

      Output.outputPath = "D:/OutputData.txt";                  //path to output file
      Output.startOutput();                                     //open brackets in the text file



      for(int a = 0; a< numbers.length; a++){
        numbersInt[a]= Float.parseFloat(numbers[a]);
      }
          Factory factory = new Factory();
      for(int a = 0; a< numbersInt.length; a++){


          if((numbersInt[a]%2)==0 && (numbersInt[a]%3)!=0){     //number can be divided by 2
              Controller controller = factory.getCar("sedan");
              controller.getCar(numbersInt[a] / 2);
              calculatePosition++;
              System.out.println("White sedan (" + numbersInt[a] + ")");
          }

          else if ((numbersInt[a]%3)==0 && (numbersInt[a]%2)!=0){   //can be divided by 3
              Controller controller = factory.getCar("truck");
              controller.getCar(numbersInt[a] / (float) 2.5);
              calculatePosition++;
              System.out.println("White truck (" + numbersInt[a] + ")");
          }

          else if ((numbersInt[a]%3)==0 && (numbersInt[a]%2)==0){   //can be divided by 2 and 3
              Controller controller = factory.getCar("bike");
              if(numbersInt[a] == 0) {
                  controller.getCar(numbersInt[a+1] / 2);//if first number
              }
              else if (numbersInt[a] == numbersInt.length){ //if last number
                  controller.getCar(numbersInt[a - 1] / 2 );
              }
              else{
                  controller.getCar((numbersInt[a - 1] + numbersInt[a+1]) / 2); //average number
              }
              calculatePosition++;
              System.out.println("Red bike (" + numbersInt[a] + ")");
          }
      }
      Output.outPrice(totalPrice);  //EOF
      System.out.println("Total amount: " + totalPrice);



      ///Cloning and serializing
      Car batcar = new Car();
      File fw = new File("d:/bc.dat");
      try {
          Car clone;
          clone=batcar.clone();
          clone.setType("BatCar");
          clone.setColor("black");
          clone.setPrice(69);

          ObjectOutputStream ostream = new ObjectOutputStream(new FileOutputStream(fw));
          ostream.writeObject(batcar);
          ostream.close();
          System.out.println("Here's a brand new model for you! "+clone.getType() + " in brutal "+
          clone.getColor() + ". And now it's only for $"+clone.getPrice()+"00!");
      }
      catch (Exception ex){
          System.out.println(ex.getMessage());
      }
  }
}


