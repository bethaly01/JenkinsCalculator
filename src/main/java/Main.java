import java.util.*;

import static java.lang.Integer.valueOf;

public class Main {

    public static void main(String[] args) {
        Calculator newCalculator = new Calculator();
        System.out.println("Enter command:");
        Scanner sc =  new Scanner(System.in);
        String str = sc.nextLine();
        int value = 0;
        //String [] commands = new ArrayList<String>();
        while (!str.equals("exit")){
            String [] commands=str.split(" ");

            if(commands[0].equals("add")){
                System.out.println(newCalculator.add(valueOf( commands[1]),valueOf(commands[2])));
            }else if(commands[0].equals("subtract")){
                System.out.println(newCalculator.subtract(valueOf( commands[1]),valueOf(commands[2])));
            }else if(commands[0].equals("multiply")){
                System.out.println(newCalculator.multiply(valueOf( commands[1]),valueOf(commands[2])));
            }else if (commands[0].equals("divide")){
                System.out.println(newCalculator.divide(valueOf( commands[1]),valueOf(commands[2])));
            }else if (commands[0].equals("fibonacci")){
                System.out.println(newCalculator.fibonacciNumberFinder(valueOf( commands[1])));
            }else if (commands[0].equals("binary")){
                System.out.println(newCalculator.intToBinaryNumber(valueOf(commands[1])));
            }else if (commands[0].equals("exit")){
                break;
            }
            System.out.println();
            str = sc.nextLine();
        }
    }
}
