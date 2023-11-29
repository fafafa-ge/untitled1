import java.util.*;
import java.util.stream.Collectors;

public class test {

    public static void main(String[] args){
        List<String> list = Arrays.asList("one","two","three","four","five");
        int size = list.size();
        for(int i=size-1; i>=0; i--){
            System.out.println(list.get(i));
        }

        List<String> newList = list.stream().filter(n -> !n.equals("one"))
                .filter(n -> n.contains("r"))
                .collect(Collectors.toList());
        System.out.println(newList);

    }

    public static String getMapToString(Map<String,Object> map){

        Set<String> keySet = map.keySet();
        //将set集合转换为数组
        String[] keyArray = keySet.toArray(new String[keySet.size()]);
        //给数组排序(升序)
        Arrays.sort(keyArray);
        //因为String拼接效率会很低的，所以转用StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < keyArray.length; i++) {
            // 参数值为空，则不参与签名 这个方法trim()是去空格
            if ((String.valueOf(map.get(keyArray[i]))).trim().length() > 0) {
                sb.append(keyArray[i]).append(":").append(String.valueOf(map.get(keyArray[i])).trim());
            }
            if(i != keyArray.length-1){
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
