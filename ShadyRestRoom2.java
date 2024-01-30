import java.util.Scanner;
public class ShadyRestRoom2
{
   // Modify the code below
   public static void main (String args[])
   {
    int selection;
    int price;
    String result;
    final int QUEEN=1, KING=2, SUITE=3;
    final int QPRICE=125,KPRICE=139,SPRICE=165;
    final String QSTRING="Queen bed",KSTRING="King bed",SSTRING="Suite with a king bed and pull-out couch",INVALIDSTRING="an invalid option";
    int LakeView=15;

    Scanner in = new Scanner(System.in);

    //Printed the menu for the beds
    System.out.println("\t\n\nMenu\n");
    System.out.println("("+QUEEN+")"+QSTRING);
    System.out.println("("+KING+")"+KSTRING);
    System.out.println("("+SUITE+")"+SSTRING);
    System.out.print("Enter Selection (1, 2 or 3) >> ");

    selection = in.nextInt();

    if(selection==QUEEN){
      result = QSTRING;
      price = QPRICE;
    }

    else if(selection==KING){
      result = KSTRING;
      price = KPRICE;
    }

    else if(selection==SUITE){
      result = SSTRING;
      price = SPRICE;
    }

    else{
      result = INVALIDSTRING;
      price=0; 
    }

    if(result=="an invalid option"){
      System.out.println(result);
      return;
    }

    System.out.println("Please choose a view:");
    System.out.println("(1) a lake");
    System.out.println("(2) a park");
    System.out.print("Enter Selection (1, 2) >> ");

    int view;
    view = in.nextInt(); 
    String VSTRING;
    if(view==1){
      VSTRING=" a lake ";
      price+=LakeView; 
    }

    else if(view==2){
      VSTRING=" a park ";
    }

    else{
      VSTRING=INVALIDSTRING;
    }

    if(VSTRING == INVALIDSTRING){
      System.out.println("View value entered is invalid");
      VSTRING=" a lake "; //set view to lake view.
      price+=LakeView; //add the extra price 
    }

    System.out.println("You selected "+result+" with"+VSTRING+"view for $"+price);

  }
}
