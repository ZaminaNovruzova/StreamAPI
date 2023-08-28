package Market;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Market {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        //Qiymeti 100-den cox olan (filter1) ve "Book" kateqoriyasina aid mehsullarin(products) (filter 2) siyahisini getirin.
        products.add(new Product(1L, "product1", "book", 150));
        products.add(new Product(4L, "product2", "book", 120));
        products.add(new Product(2L, "product2", "game", 25));
        products.add(new Product(3L, "product3", "toys", 50));
        products.add(new Product(6L, "product4", "toys", 90));
        List<Product> productList = products.stream().filter(book -> book.getPrice() > 100)
                .filter(product -> product.getCategory().equalsIgnoreCase("book")).collect(Collectors.toList());
        System.out.println(productList);

        //"Toys"kateqoriyasina uygun mehsullara 10% endirim tetbiq edin
        List<Product> productList1 = products.stream().filter(product -> product.getCategory().equalsIgnoreCase("toys")).map(product -> new Product(product.getId(), product.getName(), product.getCategory(), product.getPrice() * 0.9)).collect(Collectors.toList());
        System.out.println(productList1);
        Optional<Product> minPrice = products.stream().filter(product -> product.getCategory().equalsIgnoreCase("book")).min(Comparator.comparing(Product::getPrice));
        System.out.println(minPrice);
        List<Order> orders = new ArrayList<>();
        // Order-lerin tarixlerine gore artan sira ile siralayin
        orders.add(new Order(1L, "delivered", LocalDate.of(2022, 07, 21)));
        orders.add(new Order(2L, "delivered", LocalDate.of(2022, 06, 10)));
        orders.add(new Order(3L, "not delivered", LocalDate.of(2023, 01, 01)));
        orders.add(new Order(4L, "not delivered", LocalDate.of(2023, 02, 01)));
        orders.add(new Order(5L, "delivered", LocalDate.of(2023, 01, 10)));
        orders.add(new Order(6L, "not delivered", LocalDate.of(2023, 5, 15)));
        List<Order> orderList = orders.stream().sorted(Comparator.comparing(order -> (order.getOrderDate()))).collect(Collectors.toList());
        orderList.stream().forEach(System.out::println);
        //Butun musterilerin(Customer) adini boyuk heriflere cevirin
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer(1l, "zamina", 124));
        customerList.add(new Customer(2l, "aytac", 125));
        customerList.add(new Customer(3l, "emin", 126));
        customerList.add(new Customer(4l, "Qismet", 127));
        customerList.add(new Customer(5l, "Nuray", 128));
        List<String> uppercase = customerList.stream().map(Customer::getName).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(uppercase);
        //Butun mehsullarin(Product) orta qiymetini tapin(avarage)
        OptionalDouble average = products.stream().mapToDouble(Product::getPrice).average();
        System.out.println(average);

//        "Delivered" statuslu sifarislerin sayini tapin
        Long count = orders.stream().filter(order -> order.getStatus().equalsIgnoreCase("delivered")).count();
        System.out.println("Catdirilimis sifarisin sayi: " + count);
        //max price-li productu tapin
        Optional<Product> maxPriceProduct = products.stream().max(Comparator.comparing(Product::getPrice));

        System.out.println(maxPriceProduct);
    }
}
