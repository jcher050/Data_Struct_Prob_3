package data_struct_prob_3;

/************************************************************** 
Purpose/Description: < Implement a sublinear running time complexity recursive 
function in Java public static long exponentiation(long x, int n)

Author’s Panther ID: <xxxxxxx>
Certification: I hereby certify that this work is my own and none of it is 
the work of any other person.
**************************************************************/
public class Data_Struct_Prob_3 {

     public static long exponentiation(long x, int n) 
        {
            // The exponent i.e n >= 0
            // Assuming multiplication of two long data types takes O(1) time,
            // time complexity of the algorithm is O(log(n))

            //any # to the power of 0 = 1
            if (n == 0) 
             {
                return 1;
              } 
            //all #s are to the power of 1 already
            else if (n == 1) 
             {
                return x;
             } 
            else 
             {
               // if exponent is an even integer
                if (n % 2 == 0) 
                   {
                    return exponentiation(x*x, n/2);
                   } 
                else // if exponent is an odd integer
                   {
                    return x * exponentiation(x, n-1);
                   }
            }
        }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        // Some Sample test cases for (b.1)
            System.out.println("2 raised to the power of 2 is " + exponentiation(2, 2));
            System.out.println("2 raised to the power of 3 is " + exponentiation(2, 3));
            System.out.println("2 raised to the power of 63 is " + exponentiation(2, 63));
            
        
        
    }
    
}
