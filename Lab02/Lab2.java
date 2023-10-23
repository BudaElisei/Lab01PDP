package Lab02;

public class Lab2 {
    public static void main(String[] args){
        int[] dec = {5,7,26,93,81};
        int primul=1;
        for(int i = 0 ; i <= dec.length ; i++){
                for (int k = 2; k <= dec[i]/2; k++){
                    if(dec[i]%2==0){
                        if(primul)

                        System.out.println(dec[i]+" ");
                    }
                }
            }
        }
    }
}
