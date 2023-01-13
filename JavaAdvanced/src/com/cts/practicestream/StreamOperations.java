package com.cts.practicestream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamOperations {

	public static void main(String[] args) {

		// Initialize customers
		Customer c1 = new Customer(101L, "John", 1);
		Customer c2 = new Customer(102L, "Mark", 2);
		Customer c3 = new Customer(103L, "Smith", 3);
		Customer c4 = new Customer(104L, "Robert", 1);
		Customer c5 = new Customer(105L, "Mark", 2);
		Customer c6 = new Customer(106L, "Smith", 3);
		List<Customer> customerList = new ArrayList<Customer>();
		customerList.add(c1);
		customerList.add(c2);
		customerList.add(c3);
		customerList.add(c4);
		customerList.add(c5);
		customerList.add(c6);

		// Initialize products
		Product product1 = new Product(1L, "Baby Formula", "Baby", 10.99);
		Product product2 = new Product(2L, "Diapers", "Baby", 15.99);
		Product product3 = new Product(3L, "Fiction", "Books", 79.99);
		Product product4 = new Product(4L, "Horror", "Books", 109.99);
		Product product5 = new Product(5L, "Bear", "Toys", 109.99);
		Product product6 = new Product(6L, "Doll", "Toys", 50.99);
		// Initialize orders
		Order order1 = new Order(1L, LocalDate.of(2022, 1, 1), LocalDate.of(2022, 1, 5), "Delivered", c1);
		order1.products.add(product1);
		order1.products.add(product2);
		order1.products.add(product4);

		Order order2 = new Order(2L, LocalDate.of(2021, 2, 5), LocalDate.of(2021, 2, 5), "Delivered", c2);
		order2.products.add(product3);
		order2.products.add(product4);

		Order order3 = new Order(3L, LocalDate.of(2022, 3, 1), LocalDate.of(2022, 3, 5), "Delivered", c1);
		order3.products.add(product1);
		order3.products.add(product3);

		Order order4 = new Order(4L, LocalDate.of(2022, 4, 10), LocalDate.of(2022, 4, 15), "Delivered", c3);
		order4.products.add(product5);
		order4.products.add(product6);

		Order order5 = new Order(5L, LocalDate.of(2022, 1, 1), LocalDate.of(2022, 3, 5), "Delivered", c2);
		order5.products.add(product2);
		order5.products.add(product4);

		// Add orders to products
		product1.orders.add(order1);
		product1.orders.add(order3);
		product2.orders.add(order1);
		product2.orders.add(order5);
		product3.orders.add(order2);
		product3.orders.add(order3);
		product4.orders.add(order2);
		product4.orders.add(order5);
		product5.orders.add(order4);
		product6.orders.add(order4);

		List<Product> productList = new ArrayList<Product>();
		productList.add(product1);
		productList.add(product2);
		productList.add(product3);
		productList.add(product4);
		productList.add(product5);
		productList.add(product6);

		List<Order> orderList = new ArrayList<Order>();
		orderList.add(order1);
		orderList.add(order2);
		orderList.add(order3);
		orderList.add(order4);
		orderList.add(order5);

		// Obtain a list of products belongs to category “Books” with price > 100

		List<Product> list1 = productList.stream().filter(p -> (p.getCategory().equals("Books") && p.getPrice() > 100))
				.collect(Collectors.toList());
		System.out.println(" Obtain a list of products belongs to category “Books” with price > 100::");
		list1.forEach(i -> System.out.println(i.getName()));

		System.out.println("======================================================================");

		// Obtain a list of order with products belong to category “Baby”
		List<Order> list2 = orderList.stream()
				.filter(o -> o.getProducts().stream().anyMatch(p -> p.getCategory().equals("Baby")))
				.collect(Collectors.toList());
		System.out.println("Obtain a list of order with products belong to category “Baby”::");
		list2.forEach(i -> System.out.println(i.getId()));

		System.out.println("======================================================================");

		// Obtain a list of product with category = “Toys” and then apply 10% discount

		List<Product> list3 = productList.stream().filter(p -> p.getCategory().equals("Toys"))
				.peek(p -> p.setPrice(p.getPrice() * 0.9)).collect(Collectors.toList());
		System.out.println("Obtain a list of product with category = “Toys” and then apply 10% discount");
		list3.forEach(i -> System.out.println(i.getName() + "::" + i.getPrice()));
		System.out.println("======================================================================");

		// Obtain a list of products ordered by customer of tier 2 between 01-Feb-2021
		// and 01-Apr-2021

		List<Product> list4 = orderList.stream().filter(o -> o.getCustomer().getTier() == 2)
				.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
				.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 4, 1)) <= 0)
				.flatMap(o -> o.getProducts().stream()).distinct().collect(Collectors.toList());
		System.out.println(
				" Obtain a list of products ordered by customer of tier 2 between 01-Feb-2021 and 01-Apr-2021");
		list4.forEach(i -> System.out.println(i.getName()));
		System.out.println("======================================================================");

		// Get the cheapest products of “Books” category

		Optional<Product> list5 = productList.stream().filter(p -> p.getCategory().equals("Books"))
				.min(Comparator.comparing(Product::getPrice));
		System.out.println("Get the cheapest products of “Books” category");
		Product p = list5.get();
		System.out.println(p.getName());
		System.out.println("======================================================================");

		// Get the 3 most recent placed order
		List<Order> list6 = orderList.stream().sorted(Comparator.comparing(Order::getOrderDate).reversed()).limit(3)
				.collect(Collectors.toList());
		System.out.println("Get the 3 most recent placed order");
		list6.forEach(i -> System.out.println(i.getId()));
		System.out.println("======================================================================");

		// Calculate total lump sum of all orders placed in Feb 2021

		Double result = orderList.stream().filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
				.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 3, 1)) < 0)
				.flatMap(o -> o.getProducts().stream()).mapToDouble(i -> i.getPrice()).sum();
		System.out.println("Calculate total lump sum of all orders placed in Feb 2021");
		System.out.println(result);
		System.out.println("======================================================================");
		// Obtain a collection of statistic figures (i.e. sum, average, max, min, count)
		// for all products of category “Books”

		DoubleSummaryStatistics dss = productList.stream().filter(p2 -> p2.getCategory().equals("Books"))
				.mapToDouble(p1 -> p1.getPrice()).summaryStatistics();
		System.out.println(
				"Obtain a collection of statistic figures (i.e. sum, average, max, min, count) for all products of category “Books”");

		System.out.println(String.format("count = %1$d, average = %2$f, max = %3$f, min = %4$f, sum = %5$f",
				dss.getCount(), dss.getAverage(), dss.getMax(), dss.getMin(), dss.getSum()));
		System.out.println("======================================================================");

		// Obtain a data map with order id and order’s product count

		Map<Long, Integer> orderMap = orderList.stream()
				.collect(Collectors.toMap(o1 -> o1.getId(), o1 -> o1.getProducts().size()));
		System.out.println("Obtain a data map with order id and order’s product count");
		orderMap.forEach((k, v) -> System.out.println("Key::" + k + ", Value::" + v));
		/*
		 * for (Map.Entry<String, Integer> entry : map.entrySet()) {
		 * System.out.println("Key : " + entry.getKey() + ", Value : " +
		 * entry.getValue()); }
		 */

		System.out.println("======================================================================");
		// Produce a data map with order records grouped by customer

		Map<Customer, List<Order>> custMap = orderList.stream().collect(Collectors.groupingBy(Order::getCustomer));
		System.out.println("Produce a data map with order records grouped by customer");
		custMap.forEach((k, v) -> System.out.println("Key::" + k.getName() + ", Value::" + v.size()));

		System.out.println("======================================================================");

		// Produce a data map with order record and product total sum

		Map<Order, Double> orderPriceMap = orderList.stream().collect(Collectors.toMap(Function.identity(),
				o -> o.getProducts().stream().mapToDouble(p1 -> p1.getPrice()).sum()));
		System.out.println("Produce a data map with order record and product total sum");
		orderPriceMap.forEach((k, v) -> System.out.println("Key::" + k.getId() + ", Value::" + v));

		System.out.println("======================================================================");

		// Obtain a data map with list of product name by category
		Map<String, List<String>> productMap = productList.stream().collect(
				Collectors.groupingBy(Product::getCategory, Collectors.mapping(o -> o.getName(), Collectors.toList())));
		System.out.println("Obtain a data map with list of product name by category");
		productMap.forEach((k, v) -> System.out.println("Key::" + k + ", Value::" + v));

		System.out.println("======================================================================");

		//Get the most expensive product by category
		Map<String, Optional<Product>> productCat= productList.stream().collect(Collectors.groupingBy(Product::getCategory, Collectors.maxBy(Comparator.comparing(Product::getPrice))));
		System.out.println("Get the most expensive product by category");
		productCat.forEach((k, v) -> System.out.println("Key::" + k + ", Value::" + v.get().getName()));

		System.out.println("======================================================================");
		
	}

}
