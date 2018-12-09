import com.wizard.ChracterCreation;
import com.wizard.Wizard;
import com.wizard.WizardShop;

import java.util.Scanner;

public class WizardWars {


    public static void main(String[] args) {



        ChracterCreation chracterCreation = new ChracterCreation();
        System.out.println("**  Welcome to Wizard Wars. Lets create character   **");
        Wizard createdWizard = new Wizard();

        while (createdWizard.getName() == null || createdWizard.getName().isEmpty()){
            System.out.print("Please enter your characters first name: ");
            Scanner scanner = new Scanner(System.in);
            String incomingName = scanner.nextLine();
            if(chracterCreation.validateName(incomingName)){
                createdWizard.setName(incomingName);
            }
        }
        while (createdWizard.getSurename() == null || createdWizard.getSurename().isEmpty()){
            System.out.print("Please enter your characters last name: ");
            Scanner scanner = new Scanner(System.in);
            String incomingName = scanner.nextLine();
            if(chracterCreation.validateSurename(incomingName)){
                createdWizard.setSurename(incomingName);
            }
        }

        /**
         * Task 3:
         * Start character creation.
         * We want to get name and surname and then we will set it in wizard field surname and name.
         * But do not forget to validate first the name and surname then save it surname and name.
         */

        System.out.println("                Welcome "+createdWizard.getName()+" "+createdWizard.getSurename());
        System.out.println("**     Your soul has been taken, no way back.     **");
        System.out.println();
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        WizardShop wizardShop = new WizardShop();
        System.out.println("**     Welcome to Wizard shop     **");
        System.out.println("Please choose a spell you would like to puy: ");
        System.out.println();
        wizardShop.printAllSpells();
        String incomingSpell="";
        incomingSpell = scanner.nextLine() ;
        while(!incomingSpell.equalsIgnoreCase("done")){
            wizardShop.puy(incomingSpell,createdWizard);
            System.out.println();
            System.out.println("* Would you like to spend more of your precious money? *");
            incomingSpell = scanner.nextLine();
        }
    }

}
