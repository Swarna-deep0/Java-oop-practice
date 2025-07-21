class sort{
    int[]arr = {5,3,4,7,1};
    int temp;
    int[]ori;
    void original() {
        for (int Original : ori) {
            System.out.print(Original + " ");
        }
        System.out.println();
    }
    public sort(){
        ori =  arr.clone();
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public void display(){
        for (int array : arr){
            System.out.print(array + " ");
        }
        System.out.println();
    }
}
public class sorting {
    public static void main(String[] args) {
        sort bubble = new sort();
        System.out.print("array before sorting : ");
        bubble.original();
        System.out.print("sorted array : ");
        bubble.display(); //bubblesort
    }
}
