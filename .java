import java.util.Scanner;
public class Continents {
/*This Code will result in the largest city by population in each 
continent with user input */
  int continent;

  public Continents(){
  }

	public static void main(String[] args) {
    Continents run = new Continents();
    run.switchContinent();
	}

  public void switchContinent(){
    Scanner scanContinent = new Scanner(System.in);

    System.out.println("Please input the following number to see the top city by population for each continent:");

    System.out.println("For North America type 1");
    System.out.println("For South America type 2");
    System.out.println("For Europe type 3");
    System.out.println("For Africa type 4");
    System.out.println("For Asia type 5");
    System.out.println("For Australia type 6");
    System.out.println("For Antarctica type 7");

    String input = scanContinent.nextLine();
    int continent = Integer.parseInt(input);

      switch (continent){

        case 1:
          System.out.println("North America: Mexico City, Mexico");
          break;

        case 2:
          System.out.println("South America: Sao Paulo, Brazil");
          break;

        case 3:
          System.out.println("Europe: Moscow, Russia");
          break;

        case 4:
          System.out.println("Africa: Lagos, Nigeria");
          break;

        case 5:
          System.out.println("Asia: Shanghai, China");
          break;

        case 6:
          System.out.println("Australia: Sydney, Australia");
          break;

        case 7:
          System.out.println("Antarctica: McMurdo Station, US");
          break;

        default:
          System.out.println("Undefined continent! Did you enter a number 1-7?");
      }
  }
}
