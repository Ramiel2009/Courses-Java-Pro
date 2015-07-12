package ua.mm.courses;

import java.io.IOException;

public class Main {
    static int c=0;
  public static void main (String []args) throws IOException{
      String [] numbers = ReadFile.getText("D:/InputData.txt"); //path to input file
      float [] numbersInt = new float [numbers.length];
      float totalPrice=0;
      Output.outputPath = "D:/OutputData.txt";                  //path to output file
      Output.startOutput();                                     //open brackets in the text file

      for(int a = 0; a< numbers.length; a++){
        numbersInt[a]= Float.parseFloat(numbers[a]);}
      for(int a = 0; a< numbersInt.length; a++){
          if((numbersInt[a]%2)==0 && (numbersInt[a]%3)!=0){     //number can be divided by 2
              c++;
              System.out.println("White car (" + numbersInt[a] + ")");
              Car sedan = new Car();
              sedan.setType("Car");
              sedan.setColor("White");
              sedan.setPrice(numbersInt[a] / 2);
              totalPrice+=sedan.getPrice();
              System.out.println("Created: " + sedan.getType() + ", Color: "
                      + sedan.getColor() + ", Price: " + sedan.getPrice() + "\n");
              Output.outputToFile(sedan.getType(), sedan.getColor(), sedan.getPrice());
          }

          else if ((numbersInt[a]%3)==0 && (numbersInt[a]%2)!=0){   //can be divided by 3
              c++;
              System.out.println("White truck (" + numbersInt[a] + ")");
              Car truck = new Car();
              truck.setType("Truck");
              truck.setColor("White");
              truck.setPrice(numbersInt[a] / (float) 2.5);
              totalPrice+=truck.getPrice();
              System.out.println("Created: " + truck.getType() + ", Color: "
                      + truck.getColor() + ", Price: " + truck.getPrice() + "\n");
              Output.outputToFile(truck.getType(), truck.getColor(), truck.getPrice());
          }

          else if ((numbersInt[a]%3)==0 && (numbersInt[a]%2)==0){   //can be divided by 2 and 3
              c++;
              System.out.println("Red bike (" + numbersInt[a] + ")");
              Car bike = new Car();
              bike.setType("Bike");
              bike.setColor("Red");
                  if(numbersInt[a] == 0) {                      //if first number
                      bike.setPrice(numbersInt[a+1] / 2);
                  }
                  else if (numbersInt[a] == numbersInt.length){ //if last number
                      bike.setPrice(numbersInt[a-1] /2 );
                  }
              else{
                  bike.setPrice((numbersInt[a - 1] + numbersInt[a+1]) / 2); //average number
              }
              totalPrice+=bike.getPrice();
              System.out.println("Created: " + bike.getType() + ", Color: "
                      + bike.getColor() + ", Price: " + bike.getPrice() + "\n");
              c++;
              Output.outputToFile(bike.getType(), bike.getColor(), bike.getPrice());
          }
      }
      Output.outPrice(totalPrice);  //EOF
      System.out.println("Total amount: " + totalPrice);
  }
}


