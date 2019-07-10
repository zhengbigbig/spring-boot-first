package optional;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,3,5,9,7);
        Optional<Integer> result = find(numbers);

        // 第一种用法
        if (result.isPresent()) {
            System.out.println("找到了！");
            System.out.println(result.get());
        }else  {
            System.out.println("没找到");
        }

        // 第二种用法
        final Integer def = 0;
        System.out.println(result.orElse(def)); // 没找到返回默认值

        // 防止依赖的代码可能返回的null值污染你的无null环境！
        Optional<Integer> nullalbleResult = Optional.ofNullable(findNullable(numbers));
        System.out.println(nullalbleResult);
        System.out.println(nullalbleResult.orElse(def));
        /*
            1.返回null - - > 转换成Optional.empty();
            2.返回正常值 - - > 转换成Optional.of(value);
         */
        Optional<String> value = Optional.ofNullable(cache.get("test"));
        String val = value.orElseGet(()->db.get("test"));
        System.out.println(val);

    }
    static Map<String,String> db = new HashMap<>();
    static Map<String,String> cache = new HashMap<>();
    // 查找List里的第一个偶数
    private static Optional<Integer> find(List<Integer> numbers) {
        for(Integer item: numbers){
            if(item % 2 ==0){
                System.out.println(Optional.of(item));
                return Optional.of(item);
            }
        }

        // 没找到
        return Optional.empty();
    }

    // 别人实现的方法 来自于框架或者库
    private static Integer findNullable(List<Integer> numbers) {
        for(Integer item: numbers){
            if(item % 2 ==0){
                return item;
            }
        }
        return null;
    }
}
