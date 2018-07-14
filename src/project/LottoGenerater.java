package project;

import java.util.Random;
import java.util.Arrays;
import java.util.*;

public class LottoGenerater {
    
    private Random random = new Random(System.nanoTime());
    
    
    public int[] generate(){
        int[] result = new int[6];
        int index = 0;
        Set<Integer> generated = new HashSet<>();
        
            
        while(generated.size() < 6){
            int num = random.nextInt(45)+1;
            // 생성된 목록에 포함되어 있지 않으면 추가
            if(!contains(generated, num)){
                result[index++] = num;
                generated.add(num);
                        
            }
        }
            
        return result;
    }
    
    public boolean contains(Set<Integer> generated, int num){
        return generated.contains(num);
    }
    public boolean contains2(Set<Integer> generated, int num){
        return generated.contains(num);
    }
    public boolean contains23(Set<Integer> generated, int num){
        return generated.contains(num);
    }
    public static void main(String[] args){
        int[] result = new LottoGenerater().generate();
        System.out.println(Arrays.toString(result));
    }
}
