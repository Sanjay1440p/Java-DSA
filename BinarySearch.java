import java.util.Scanner;//Importing Scanner class
class BinarySearch{
 static void search(){//method that calculates BinarySearch
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the size of array(i):");//Getting size of array
    int x =scanner.nextInt();
    
    int array[] = new int[x];//Creates an integer array of size x
    System.out.printf("Enter array of %d:\n",x);//Array input by loop

    for(int i = 0;i<array.length;i++){
        array[i] = scanner.nextInt();
    }
    System.out.println("Enter the target element to find:");//The target element to be find in array
    int target = scanner.nextInt();

    int start = 0;//Begging of search range
    int end = array.length - 1;//End of search range
    /*Example:
    array size = 6;
    end = 6-1;=>5
    because its index that starts from 0                 */

while(start <= end){//Loop iterates by checking condition
    int mid = start + (end - start) / 2; //finds mid by enhanced formula 
    /*For ex:
    if start = 4;
    end = 6;
    mid 4 + (6 - 4)/2 --> i.e mid =5*/

   if(target == array[mid]){//Checks if element found
    System.out.println("Element  found:\n" + array[mid]);
    return;//Re
   }
    if(target > array[mid]){//Finds out target is greater than mid ,skips elments before mid and continues through right side
        start = mid + 1;
        
    }else{//Finds out target is less than mid ,skips elments after mid and continues through left side
        end = mid - 1;
        
      
    }

}

    System.out.println("Element not foound!");//if the element isn't present prints the statement not found!

        }
    
    
 public static void main(String[] args){//Main method
    search();//Method call (Method was static no object required to invoked)
 }
}

