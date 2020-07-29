public class SortAlgo {
    public static void main(String[] args) {
        int[] array = new int[]{23,56,1,77,188};
        for(int i=0; i<array.length; i++){
            for (int j = i+1; j<array.length; j++){
                if(array[j]<array[i]){
                    int temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                    }
                }
            }
    for(int a=0; a<array.length; a++){
        System.out.println(array[a]+"");
    }
    }
}