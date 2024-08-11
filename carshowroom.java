import java.util.*;

interface utility{
    public void get_details();

    public void set_details();
}
public class carshowroom{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        showroom s[]=new showroom[5];
        employee e[]=new employee[5];
        car c[]=new car[5];
        int showroom_counter=0;
        int car_counter=0;
        int employee_counter=0;
        int choice=100;
        while(choice!=0)
        {
            mainmenu();
            choice=sc.nextInt();
            while(choice!=9&&choice!=0)
            {
                switch(choice)
                {
                    case 1:
                    s[showroom_counter]=new showroom();
                    s[showroom_counter].set_details();
                    showroom_counter++;
                    System.out.println();
                    System.out.println("1].ADD NEW SHOWROOM");
                    System.out.println("9].GO BACK TO MAIN MENU");
                    choice = sc.nextInt();
                    break;
                    case 2:
                    e[employee_counter]=new employee();
                    e[employee_counter].set_details();
                    employee_counter++;
                    System.out.println();
                    System.out.println("2].ADD NEW EMPLOYEE");
                    System.out.println("9].GO BACK TO MAIN MENU");
                    choice = sc.nextInt();
                    break;
                    case 3:
                    c[car_counter]=new car();
                    c[car_counter].set_details();
                    car_counter++;
                    System.out.println("3].ADD NEW CAR");
                    System.out.println("9].GO BACK TO MAIN MENU");
                    choice = sc.nextInt();
                    break;
                    case 4:
                    for(int i=0;i<showroom_counter;i++)
                    {
                        s[i].get_details();
                        System.out.println();
                        System.out.println();
                    }
                    System.out.println();
                    System.out.println("9].GO BACK TO MAIN MENU");
                    System.out.println("0].EXIT");
                    choice = sc.nextInt();
                    break;
                    case 5:
                    for(int i=0;i<employee_counter;i++)
                    {
                        e[i].get_details();
                        System.out.println();
                        System.out.println();
                    }
                    System.out.println();
                    System.out.println("9].GO BACK TO MAIN MENU");
                    System.out.println("0].EXIT");
                    choice = sc.nextInt();
                    break;
                    case 6:
                    for(int i=0;i<car_counter;i++)
                    {
                        c[i].get_details();
                        System.out.println();
                        System.out.println();
                    }
                    System.out.println();
                    System.out.println("9].GO BACK TO MAIN MENU");
                    System.out.println("0].EXIT");
                    choice = sc.nextInt();
                    break;
                    default:
                    System.out.println("ENTER VALID CHOICE: ");
                    break;



                }
            }
        }
        
        
       sc.close();
    }
    public static void mainmenu()
    {
        System.out.println();
        System.out.println("======================= *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** =======================");
        System.out.println();
        System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
        System.out.println();
        System.out.println("1].ADD SHOWROOMS \t\t\t 2].ADD EMPLOYEES \t\t\t 3].ADD CARS");
        System.out.println();
        System.out.println("4].GET SHOWROOMS \t\t\t 5].GET EMPLOYEES \t\t\t 6].GET CARS");
        System.out.println();
        System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");
    }
}
class showroom implements utility{
  String showroom_name;
  String showroom_address;
  int total_employees;
  int total_cars_in_stock=0;
  String manager_name;
  @Override
  public void get_details()
  {
   System.out.println("Showroom name:"+showroom_name);
   System.out.println("Showroom address:"+showroom_address);
   System.out.println("Total employees:"+total_employees);
   System.out.println("Total cars in stock:"+total_cars_in_stock);
   System.out.println("Manager name:"+manager_name);

  }
  @Override
  public void set_details()
  {
    System.out.println("======================= *** ENTER SHOWROOM DETAILS *** =======================");
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Showroom name:");
    showroom_name=sc.nextLine();
    System.out.println("Enter Showroom address:");
    showroom_address=sc.nextLine();
    System.out.println("Enter total employees:");
    total_employees=sc.nextInt();
    System.out.println("Enter manager name:");
    manager_name=sc.next();
    System.out.println("Enter total cars in stock:");
    total_cars_in_stock=sc.nextInt();
    
   

  }
}
class employee extends showroom implements utility{
   String employee_name;
   int employee_id;
   int emp_age;
   String emp_depatment;

    @Override
  public void get_details()
  {
    System.out.println("employee name:"+employee_name);
    System.out.println("employee id:"+employee_id);
    System.out.println("Employee age:"+emp_age);
    System.out.println("Employee department:"+emp_depatment);
  }
  @Override
  public void set_details()
  {
    System.out.println("======================= *** ENTER Employee DETAILS *** =======================");
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter employee name:");
    employee_name=sc.nextLine();
    System.out.println("Enter employee id:");
    employee_id=sc.nextInt();
    System.out.println("Enter emp_age:");
    emp_age=sc.nextInt();
    System.out.println("Enter emp_department:");
    emp_depatment=sc.nextLine();
    sc.close();
  }
}
class car extends showroom implements utility
{
    String car_name;
    String car_color;
    String car_fueltype;
    int car_price;
    public void get_details()
    {
      System.out.println("Car name:"+car_name);
      System.out.println("Car color:"+car_color);
      System.out.println("Car fueltype:"+car_fueltype);
      System.out.println("car price");

    }
    public void set_details()
    {
        System.out.println("======================= *** ENTER Car DETAILS *** =======================");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter car name:");
        car_name=sc.nextLine();
        System.out.println("Enter car color:");
        car_color=sc.nextLine();
        System.out.println("Enter car fueltype:");
        car_fueltype=sc.nextLine();
        System.out.println("Enter car price:");
        car_price=sc.nextInt();
        total_cars_in_stock++;




    }


}