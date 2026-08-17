import java.util.Scanner;

class LinearSearch{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter Array Size:");
    int arrSize=scanner.nextInt();//Array Size of user's.

    int array[] = new int[arrSize];//Size allocation for variable array[].

    System.out.printf("Enter %d Elements:\n",arrSize);
    for(int i=0;i<array.length;i++){//Getting array for size of users input.
        array[i]=scanner.nextInt();
    }
    
    System.out.println(search(array, arrSize));//Method call.
       scanner.close();
    }
//End of main() method.
 
    static int search(int arr[], int target){//To find the Target elment.
        if(arr.length==0){//return the -1 index if is on false size.
            System.out.println("Invalid Array Size Allocation,\n Please Enter Valid one");
            return 0;
        }
        for(int ar : arr){//for each ar present in arr to find targert.
            if(ar == target){// indexing if the element presents.
                System.out.println("Key found");//If key found then print it out.
                return 0;
            }
        }
        System.out.println("Key not found");
        return 0;//Returns if none of element was found in array
        }//End of method search() method by returns 0 in either way of case.
}//End of class SelectionSort.
