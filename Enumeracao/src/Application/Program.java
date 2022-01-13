package Application;

import java.util.Date;

import entities.Pedido;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {

		Pedido pedido = new Pedido(1, new Date(), OrderStatus.PENDING_PAYMENT);

		OrderStatus a01 = OrderStatus.DELIVERED;
		OrderStatus a02 = OrderStatus.PENDING_PAYMENT;
		OrderStatus a03 = OrderStatus.PROCESSING;
		OrderStatus a04 = OrderStatus.SHIPPED;

		System.out.println(pedido);
		System.out.println(a01);
		System.out.println(a02);
		System.out.println(a03);
		System.out.println(a04);

	}

}
