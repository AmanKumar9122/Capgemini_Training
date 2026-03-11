package StreamAPI;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        List<String> immutableList = Stream.of("red","green",null,null).toList();
//        immutableList.add("yellow");
        System.out.println(immutableList);
        System.out.println("------------------------------------");
        List<String> mutableList = Stream.of("red","green",null,null).collect(Collectors.toList());
        mutableList.add("yellow");
        System.out.println(mutableList);
        System.out.println("------------------------------------");
        record Product(String name, String category, int price){
        }
        Stream<Product> products = Stream.of(
                new Product("bat","sportsitem",400),
                new Product("bells","sportsitem",4000),
                new Product("ball","sportsitem",2000),
                new Product("mobile","item",14000)
        );

        // Grouping By Category
//        Map<String,List<Product>> categoryMap = products.collect(Collectors.groupingBy(Product::category));
//        System.out.println(categoryMap);

        // Aggregation based group by
//        Map<String,Integer> pricing=
//              products.collect(
//                      Collectors.groupingBy(
//                              Product::category,
//                              Collectors.summingInt(Product::price)
//                       )
//              );
//        System.out.println(pricing);

//        Map<String, Double> pricing =
//                products.collect(
//                        Collectors.groupingBy(
//                                Product::category,
//                                Collectors.averagingInt(Product::price)
//                        )
//                );
//        System.out.println(pricing);

//        List<Product> filtered = products.filter(Product-> Product.price>2500).collect(Collectors.toList());
//        System.out.println(filtered);

//        var extractfields = products.map(Product::price).toList();
//        System.out.println(extractfields);
//        Map<Boolean,List<Product>> part = products.collect(Collectors.partitioningBy(Product->Product.price>1000));
//        System.out.println(part);

        System.out.println(products.collect(Collectors.summarizingInt(Product::price)));






    }
}
