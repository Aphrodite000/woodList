import java.util.*;
public class Solution {
    public static void main(String[] args){
        //构成多边形的条件是任意n-1条边加起来大于另一条边，那么只要大于最长一条就可以
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        List<Integer>  list=new ArrayList<>();
        for(int i=0;i<n;i++){
            int I=sc.nextInt();
            int L=sc.nextInt();
            if(I==1){
                int j=0;
                //插入的时候直接把最大的放到最后一个
                for(;j<list.size();j++){
                    if(list.get(j)>=L){
                        list.add(j,L);//此处插入元素，其他往后移动
                        break;
                    }
                }//说明前面的元素都比L小，直接尾插就行
                if(list.size()==j){
                    list.add(L);
                }
                sum+=L;
            }else{
                list.remove(list.indexOf(L));
                sum-=L;
            }
            int max=list.get(list.size()-1);
            if(sum-max>max){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
