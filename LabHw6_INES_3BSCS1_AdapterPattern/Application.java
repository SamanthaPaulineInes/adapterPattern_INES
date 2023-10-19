package LabHw6_INES_3BSCS1_AdapterPattern;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Application
{
    public static void main(String[] args) throws InterruptedException
    {
        Scanner app = new Scanner(System.in);

        System.out.print("\nWELCOME TO ELECTRONIC DEVICES");
        System.out.print("\nINES, SAMANTHA PAULINE | 3 BSCS 1 | LAB 6: ADAPTER PATTERN");

        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();

        boolean a = true;

        while (a)
        {
            System.out.print("\n======================================================================");
            System.out.print("\n\n                            Appliances");
            System.out.print("\n----------------------------------------------------------------------");
            System.out.print("\n|[1]Laptop  |  [2]Refrigerator  |  [3]SmartphoneCharger   |   [4]Exit|");
            System.out.print("\n----------------------------------------------------------------------");
            System.out.print("\nChoose your appliance number: ");
            Integer choice = app.nextInt();

            if(choice.equals(1))
            {
                System.out.print("\n=====");
                TimeUnit.SECONDS.sleep(1);
                System.out.print(" Laptop plugging into power source ");
                TimeUnit.SECONDS.sleep(1);
                System.out.print("=====");
                TimeUnit.SECONDS.sleep(1);
            }
            else if(choice.equals(2))
            {
                System.out.print("\n=====");
                TimeUnit.SECONDS.sleep(1);
                System.out.print(" Refrigerator plugging into power source ");
                TimeUnit.SECONDS.sleep(1);
                System.out.print("=====");
                TimeUnit.SECONDS.sleep(1);
            }
            else if(choice.equals(3))
            {
                System.out.print("\n=====");
                TimeUnit.SECONDS.sleep(1);
                System.out.print(" Smartphone plugging into power source ");
                TimeUnit.SECONDS.sleep(1);
                System.out.print("=====");
                TimeUnit.SECONDS.sleep(1);
            }
            else if(choice.equals(4))
            {
                System.out.print("\n=====");
                TimeUnit.SECONDS.sleep(1);
                System.out.print(" Loading");
                TimeUnit.SECONDS.sleep(1);
                System.out.print(" =====");
                TimeUnit.SECONDS.sleep(1);
            }

            switch(choice)
            {
                case 1:
                    PowerOutlet laptopPo = new LaptopAdapter(laptop);
                    System.out.print(laptopPo.plugIn());
                    break;
                case 2:
                    PowerOutlet refrigeratorPo = new RefrigeratorAdapter(refrigerator);
                    System.out.print(refrigeratorPo.plugIn());
                    break;
                case 3:
                    PowerOutlet smartphoneChargerPo = new SmartphoneChargerAdapter(smartphoneCharger);
                    System.out.print(smartphoneChargerPo.plugIn());
                    break;
                case 4:
                    a = false;
                    System.out.print("\n\nTHANK YOU!\n");
                    break;
                default:
                    System.out.print("\n\nInvalid input. Please try again.");
                    break;
            }
        }
    }
}