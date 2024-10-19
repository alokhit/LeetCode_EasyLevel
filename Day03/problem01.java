class Solution {
    public void reverseString(char[] s) {

        // // s = ["h","e","l","l","o"]   
        // int n = s.length; // 5 

        // // 2. loop
        // for(int i=0; i<n/2; i++){
        //  // 3. swap 
        //  char temp = s[i];
        //  s[i] = s[n-1-i];
        //  s[n-1-i] = temp;

        // }
        // // return nothing / void so just write retrun
        // return; 
       
    //    step 1 
       int n = s.length;
       int start = 0;
       int end = n-1;

       while(start<= end){
    //    step 2 
    char temp = s[start];
    s[start] = s[end];
    s[end] = temp;
    start++;
    end--;

       }
return;

    }
}