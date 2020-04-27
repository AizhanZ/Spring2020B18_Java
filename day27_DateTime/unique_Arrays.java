package day27_DateTime;

public class unique_Arrays {
    /*
    3. write a method that can print out the unique elements from an int array
					Ex: {1,1,2,3,3} ==> 2
						{6,6,7,7,8,9} ==> 8 9
		4. write a method that can print out the unique elements from a double array
					Note: Apply method overloading
     */

    public static void main(String[] args) {//this step is only finding me the frequency
        int[] arr = {1,1,1,1,1,2,3,3};//2
        //           0 1 2 3 4

        for(int each2 : arr){
            int count = 0;
            for( int each : arr ){
                if(each == each2){
                    count++;
                }
            }
            if(count == 1) {//this step is finding unique element
                System.out.println(each2);
            }

        }
        //arr[0] ==> 1
        int count = 0;
        for( int each : arr ){
            if(each == arr[2]){
                count++;
            }
        }
        if(count == 1) {//this step is finding unique element
            System.out.println(arr[2]);
        }

    }

}