/*
 * 5. 
 * Туристические путевки. 
 * Сформировать набор предложений клиенту по выбору туристической путевки различного типа 
 * (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. 
 * Учитывать возможность выбора транспорта, питания и числа дней. 
 * Реализовать выбор и сортировку путевок. 
 */
package by.epam.classes.aggregation_and_composition.task5;

public class Main {
    
    public static void main(String[] args) {
              
        TourAgency tourAgency = new TourAgency();
        
        int choice, from, to;
        
        while (true) {
            menuText();
            choice = TourAgency.numInput();
            if (choice == 0)
                break;
            if (choice < 0 || choice > 4) {
                System.out.println("Incorrect choose!");
                continue;
            }
                      
            switch (choice) {
                case 1:
                    System.out.println("List of clients:");
                    tourAgency.showClients();
                    break; 
                case 2:
                    System.out.println("List of tours:");
                    tourAgency.showTours();
                    break;
                case 3:
                    System.out.println("List of tours by cost: ");
                    System.out.print("From: ");
                    from = TourAgency.numInput();
                    System.out.print("To: ");
                    to = TourAgency.numInput();
                    tourAgency.toursByCost(from, to);
                    break; 
                case 4:
                    System.out.println("List of tours by transport, food, days: ");
                    System.out.print("Transport: ");
                    String transport = TourAgency.strInput();
                    System.out.print("Food (1 - true, 0 - false): ");
                    int food = TourAgency.numInput();
                    System.out.println("Number of days: ");
                    System.out.print("From: ");
                    from = TourAgency.numInput();
                    System.out.print("To: ");
                    to = TourAgency.numInput();
                    tourAgency.toursByTransportFoodDays(transport, food, from, to);
                    break;
            }     
            
        }
        
    }
    
    private static void menuText() { 
        System.out.print(
            "\n" + 
            "0 - Exit\n" +
            "1 - List of clients\n" +   
            "2 - List of tours\n" +   
            "3 - List of tours by value\n" + 
            "4 - List of tours by transport, food, number of days\n" + 
            "\n"
        );   
    } 
    
}
