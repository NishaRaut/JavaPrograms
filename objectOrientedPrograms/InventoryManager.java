package com.bridgelabz.objectOrientedPrograms;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.bridgelabz.utility.Utility;


public class InventoryManager {
	public static void main(String[] args) {
		try {
			
		
			// to map json to pojo obj and vice-versa
			/*ObjectMapper objectMapper = new ObjectMapper();

			// Reading from a file as json string
			File file = new File("/home/admin1/eclipse-workspace/nisha/bridgelabz/src/com/bridgelabz/objectOrientedPrograms/InventoryManagement.json");
			InventoryFactory inventoryFactory = objectMapper.readValue(file, InventoryFactory.class);
			List<Product> products = inventoryFactory.getInventoryFactory();
			System.out.println("Enter the name of the product ");
			String inputProductName = Utility.getString();
			boolean productFlag = products.stream().filter(prd -> prd.getProductName().equals(inputProductName))
					.findFirst().isPresent();
			Product product;
			List<ProductProperty> properties = new ArrayList<ProductProperty>();
			if (!productFlag) {
				product = new Product();
				product.setProductName(inputProductName);
				ProductProperty productProperty = input();
				properties.add(productProperty);
				// add properties to the product
				product.setProperties(properties);
				// adding every product to list
				products.add(product);
				// setting product list to file
				inventoryFactory.setInventoryFactory(products);
			} else {
				product = products.stream().filter(prd -> prd.getProductName().equals(inputProductName)).findFirst()
						.get();
				// To Set the product properties
				properties = product.getProperties();
				ProductProperty productProperty = input();
				// Adding properties to list
				properties.add(productProperty);

			}
			// To print Each Inventory Price
			int count = 0;
			System.out.println(" Inventory Price");
			System.out.println();
			System.out.println("Price of each Inventory : ");
			while (count != inventoryFactory.getInventoryFactory().size()) {
				Product prod = products.get(count);
				for (ProductProperty produproperty : prod.getProperties()) {
					System.out.print(produproperty.getName() + " - ");
					double eachinventory = (produproperty.getPrice());
					System.out.println(eachinventory);
				}
				count++;
			}

			// Writtting to a file
			objectMapper.writeValue(file, inventoryFactory);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Input Incorrect");
		}*/

	}

	/*
	 * To take input from user for product properties
	 * 
	 * @return is class type of productproperty
	 */
//	public static ProductProperty input() {
//
//		ProductProperty productProperty = new ProductProperty();
//
//		System.out.println("Enter the name of product type ");
//		String inputPropertyName = Utility.getString();
//		productProperty.setName(inputPropertyName);
//		System.out.println("Enter the Weight ");
//		double inputPropertyWeight = Utility.getDouble();
//		productProperty.setWeight(inputPropertyWeight);
//		System.out.println("Enter the Price ");
//		double inputPropertyprice = Utility.getDouble();
//		productProperty.setPrice(inputPropertyprice);
//
//		return productProperty;
//
//	}

}